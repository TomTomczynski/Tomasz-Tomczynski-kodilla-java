//package challenges;
//
//public class ProductOrderService {
//    private InformationService informationService;
//    private OrderSerwice ordersService;
//    private WarehousMenger warehousMenger;
//    private Object ordersInformation;
//
//    public ProductOrderService(InformationService informationService, OrderSerwice ordersService, WarehousMenger warehousMenger) {
//        this.informationService = informationService;
//        this.ordersService = ordersService;
//        this.warehousMenger = warehousMenger;
//    }
//
//    public OrderDto process(final OrdersCreator ordersCreator) {
//        boolean isRealizade = ordersInformation.orderStatus(ordersCreator.getCustomer(), ordersCreator.getOrderID());
//
//        if (isRealizade) {
//            InformationService.inform(ordersCreator.getOrderID());
//            warehousMenger.inventoryUpdate(ordersCreator.getOrderID());
//            return OrderDto(ordersCreator.getOrderID(), true);
//        } else {
//            return OrderDto(ordersCreator.getOrderID(), false);
//        }
//    }
//}
