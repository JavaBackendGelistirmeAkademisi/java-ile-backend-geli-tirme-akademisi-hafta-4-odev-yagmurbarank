import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class exception {
private static final String PRODUCT_FILE="products.txt";
private static final String CUSTOMER_FILE="customers.txt";
private static final String ORDER_FILE="ordeers.txt";

public void Exception(){
    try{
     Product product= new Product("1", "Laptop", 10);
     writeToFile(PRODUCT_FILE, product.toString());
        List<String> products= readFromFile(PRODUCT_FILE);
        for(String prod : products){
            System.out.println(prod);
        }
        Customer customer= new Customer("101", "Yagmur Baran", "1002");
        writeToFile(CUSTOMER_FILE, customer.toString());

        Order order= new Order("1002","1","101",1);
        writeToFile(ORDER_FILE,order.toString());
    }
    catch (IOException e){
        System.err.println("File operation error:"+ e.getMessage());
    }
    catch (Exception e){
        System.err.println("An error occured:"+e.getMessage());
    }
}
public static void writeToFile(String fileName, String data) throws IOException{
    try(BufferedWriter writer= new BufferedWriter(new FileWriter(fileName,true))){
        writer.write(data);
        writer.newLine();
    }
}
public static List<String > readFromFile(String fileName) throws IOException {
    List<String> lines = new ArrayList<>();
    try(BufferedReader reader= new BufferedReader(new FileReader(fileName))){
        String line;
        while ((line= reader.readLine()) != null){
            lines.add(line);
        }
    }
    return lines;
}

}
