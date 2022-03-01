package OOPExtraPractice;

public class Calculation extends OOPPracticeTwo {

    public long price;
    public long quantity;
    public long tax;



    public Calculation(String name, long quantity, long price, long total, long tax) {
        super(name, quantity, price, total, tax);
    }

    public long getPrice(){
        return (this.price * this.quantity + this.tax);

    }

    public static void main(String[] args) {

    }
}
