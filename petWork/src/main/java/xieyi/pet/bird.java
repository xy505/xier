package xieyi.pet;

public class bird extends animal{
    public bird(String name, String sex, int age,double price) {
        super(name, sex, age,price);
        super.setVaprice(30);
    }

    @Override
    public void voice() {
        System.out.println("叽叽喳喳");
    }

    @Override
    public void play() {
        System.out.println("扑腾翅膀");
    }
}
