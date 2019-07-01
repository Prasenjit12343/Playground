//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price)
  {
    this.price = price;
  }
  public int getPrice()
  {
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setCustomerDetails(String product, int quantity)
  {
    this.product = product;
    this.quantity = quantity;
  }
  public String getProduct()
  {
    return this.product;
  }
  public int getQuantity()
  {
    return this.quantity;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public void calculateBill(int price, int quantity)
  {
    int total = price*quantity;
    System.out.println("Total Price is : " +total);
  }
  
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    String name = in.nextLine();
    int price = in.nextInt();
    int quantity = in.nextInt();
    i.setPrice(price);
    c.setCustomerDetails(name,quantity);
    //int foundPrice = i.getPrice;
//int foundQuantity = c.getQuantity;
    obj.calculateBill(price,quantity);
    
  }
}