package OOPPractice;

public class FrozenFoods {

    public long quantity;
    public String name;
    public String change;
    public long price;
    public long tax;
    public long totalCost;
    public String rice;


    //---Constructor---///
    public FrozenFoods(String name, long quantity) {
        this.quantity = quantity;
        this.name = name;

    }

    public FrozenFoods(String name, long quantity, long price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public FrozenFoods(long total) {
    }

    public String FrozenFoods(String total) {
        return this.name + this.quantity;
    }

    public String getTotal(){
        return this.change;
    }

    public long getTax() {
        return tax;
    }

    public long getPrice(long price, long quantity) {
        return price * quantity;
    }

    public long getTotalCost() {
        return this.price + this.tax;
    }

    public static void main(String[] args) {

    }
}
