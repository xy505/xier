package xieyi.pet;

public class cat extends animal{
    public cat(String name, String sex, int age,double price) {
        super(name, sex, age,price);
        super.setVaprice(50);
    }

    @Override
    public void voice() {
        System.out.println("喵喵喵...");
    }

    @Override
    public void play() {
        System.out.println("玩毛线球");
    }
}
