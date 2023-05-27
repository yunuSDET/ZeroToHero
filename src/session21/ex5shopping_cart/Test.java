package session21.ex5shopping_cart;

public class Test {

    public static void main(String[] args) {

        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.addProduct("egg",3,30);
        shoppingCart.addProduct("apple",10,8);
        shoppingCart.addProduct("strawberry",2,13);
        shoppingCart.addProduct("tomatoes",2,5);

        shoppingCart.removeProduct("tomatoes");

        shoppingCart.getProducts().forEach(System.out::println);


        shoppingCart.getProduct("apple");

        System.out.println(shoppingCart.getTotalPrice());


    }
}
