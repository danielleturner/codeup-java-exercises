package OOPExtraPractice;

public class OOPPracticeTwo {

    protected String name;
    protected String rice;
    protected String beans;
    protected String ham;


    protected long price;
    protected long quantity;
    protected long tax;
    protected long total;

    double riceprice = 4.25;
    double beanprice = 3.75;
    double hamprice = 7.75;
    double tax1 =  8.75;


    //--Constructor--//
    public OOPPracticeTwo(String name, long quantity, long price, long total, long tax1) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.tax1 = tax1;

    }

    public OOPPracticeTwo(String name, long quantity, long price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getPrice(){
        return (long) (this.quantity * price + tax1);
    }


    public static void main(String[] args) {

    }
}
