package xieyi.pet;

public class animal {
    private String name;
    private String sex;
    private int age;
    private double price;
    //动物疫苗，种类是一样的，所以可以不用加进构造器中,由其子类去设置
    private double vaprice;
    public  animal(){

    }
    public animal(String name, String sex, int age,double price) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.price=price;
    }

    public double getVaprice() {
        return vaprice;
    }

    public void setVaprice(double vaprice) {
        this.vaprice = vaprice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "animal{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }

    //动物的叫声
    public void voice(){}

    //动物的动作
    public void play(){}
}
