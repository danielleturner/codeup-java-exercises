package OOPPractice;

//Sub-Class of FrozenFoods
public class Vegetables extends FrozenFoods{

    public String total;


    public Vegetables(String name, long quantity) {
        super(name, quantity);
    }

    public Vegetables(long total){
        super(total);
    }

    public static void main(String[] args) {

    }
}
