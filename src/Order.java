public class Order {
    private String orderId;
    private String productId;
    private  String customerId;
    private int piece;

    public Order(String orderId, String productId, String customerId, int piece){
        this.orderId = orderId;
        this.productId = productId;
        this.customerId = customerId;
        this.piece = piece;
    }
    //getter setter
    public String getOrderId(){
        return orderId;
    }
    public String getProductId(){
        return productId;
    }
    public String getCustomerId(){
        return productId;
    }
    public int getPiece(){
        return piece;
    }
    @Override
    public String toString(){

        return orderId+","+ productId+","+ customerId+","+piece;
    }
}
