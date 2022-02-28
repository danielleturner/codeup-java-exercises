package OOPPractice;

public class ShoppingCart {

    public static void main(String[] args) {

        FrozenFoods cart = new FrozenFoods("bacon",4);
        FrozenFoods cart1 = new FrozenFoods("rice",3);
        FrozenFoods cart2 = new FrozenFoods(cart1.getPrice((long) 5.00, 6));
        FrozenFoods cart3 = new Vegetables("5", 6);



        System.out.println("cart2.getPrice() = " + cart2.getPrice(5, 9));
        System.out.println("cart1.FrozenFoods(\"5\") = " + cart1.FrozenFoods("5"));
        System.out.println("cart.FrozenFoods(\"3\") = " + cart.FrozenFoods("3"));
    }
}
