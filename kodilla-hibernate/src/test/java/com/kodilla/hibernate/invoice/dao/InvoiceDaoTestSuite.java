package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Dao.InvoiceDao;
import com.kodilla.hibernate.invoice.Dao.ItemDao;
import com.kodilla.hibernate.invoice.Dao.ProductDao;
import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {

    @Autowired
    ItemDao itemDao;
    @Autowired
    ProductDao productDao;
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testProductDao() {
        //Given
        Product product1 = new Product("Product 1");
        Product product2 = new Product("Product 2");
        Invoice invoice = new Invoice("Invoice 1");
        Item item1 = new Item(new BigDecimal(5), 1, new BigDecimal(5));
        Item item2 = new Item(new BigDecimal(10), 3, new BigDecimal(30));
        item1.setProduct(product1);
        item1.setInvoice(invoice);
        item2.setProduct(product2);
        item2.setInvoice(invoice);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);

        //When
        productDao.save(product1);
        productDao.save(product2);
        invoiceDao.save(invoice);
        itemDao.save(item1);
        itemDao.save(item2);

        //Then
        Assert.assertNotEquals(0, product1.getId());
        Assert.assertNotEquals(0, product2.getId());
        Assert.assertNotEquals(0, invoice.getId());
        Assert.assertNotEquals(0, item1.getId());
        Assert.assertNotEquals(0, item2.getId());
    }
}
