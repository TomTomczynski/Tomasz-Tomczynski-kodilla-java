package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Library_1");
        IntStream.iterate(0, n -> n + 1)
                .limit(6)
                .forEach(n -> library.getBooks().add(new Book("Title " + n, "Author " + n, LocalDate.now().minusYears(n))));
        Library shallowCloneLibrary = null;
        try {
            shallowCloneLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //making a deep copy of library
        Library deepCloneLibrary = null;
        try {
            deepCloneLibrary = library.deepCopy();
            deepCloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Book theBook = new Book("Title 0", "Author 0 ", LocalDate.now());

        //When

        deepCloneLibrary.getBooks().remove(theBook);

        //Then
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, shallowCloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepCloneLibrary.getBooks().size());
    }
}
