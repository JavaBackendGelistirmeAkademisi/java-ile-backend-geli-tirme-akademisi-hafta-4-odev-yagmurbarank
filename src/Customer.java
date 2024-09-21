public class Customer {
public String id;
public String name;
public String orderId;

public Customer(String id, String  name, String orderId){
    this.id=id;
    this.name=name;
    this.orderId=orderId;
}
//getter setter
    public String getId(){
    return id;
    }
    public String getName(){
    return name;
    }
    public String  getOrderId(){
    return orderId;
    }
    public void setOrderId(String orderId){
    this.orderId=orderId;
    }
    @Override
    public String toString(){
    return id + ", Syn."+ name+ "order:"+ orderId;
    }
}
