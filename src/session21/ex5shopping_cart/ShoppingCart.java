package session21.ex5shopping_cart;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Product> products= new ArrayList<>();


  public void addProduct(String name,double price,int quantity){
      products.add(new Product(name,price,quantity));
  }

public void removeProduct(String name){
      products.removeIf(i->i.getName().equalsIgnoreCase(name));
}

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProduct(String name){
        for (Product each : products) {
            if (name.equals(each.getName())) return each;
        }
       return null;
    }

    public double getTotalPrice(){

      double total=0;
    for (Product each : products) {
        total+=each.getTotalPriceOfEachProduct();
    }
    return total;

    //return products.stream().mapToDouble(Product::getPrice).sum();
}

}
