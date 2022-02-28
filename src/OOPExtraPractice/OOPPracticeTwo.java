package OOPExtraPractice;

public class OOPPracticeTwo {

    protected String name;
    protected String rice;
    protected String beans;
    protected String ham;

    String[] Perishables = {rice, beans, ham};

    protected long price;
    protected long quantity;
    protected long tax;
    protected long total;

    double riceprice = 4.25;
    double beanprice = 3.75;
    double hamprice = 7.75;
    long tax1 = (long) 8.75;


    //--Constructor--//
    public OOPPracticeTwo(String name, long quantity, long price, long total, long tax) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.total = total;
        this.tax = tax;

    }

    public OOPPracticeTwo(String name, long quantity, long price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public long getPrice(){
        return this.quantity + this.price * this.tax;

    }



    public static void main(String[] args) {

    }
}
