package xieyi.pet;

public class dog extends animal{

    public dog(String name, String sex, int age,double price) {
        super(name, sex, age,price);
        super.setVaprice(100);
    }

    @Override
    public void voice() {
        System.out.println("bark...");
    }

    @Override
    public void play() {
        System.out.println("摇尾巴");
    }
}
