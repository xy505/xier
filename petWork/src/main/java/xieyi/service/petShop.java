package xieyi.service;

import xieyi.pet.animal;
import xieyi.pet.bird;
import xieyi.pet.cat;
import xieyi.pet.dog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class petShop {

    //店铺里已有的宠物
    private  List<animal> list=new ArrayList<>();

    //店铺可以购买的所有的宠物
     public   List<animal> animals=this.init();

    double initmoney=5500;//初始资金

    public double getInitmoney() {
        return initmoney;
    }

    public void setInitmoney(double initmoney) {
        this.initmoney = initmoney;
    }

    public void setAnimals(List<animal> animals) {
        this.animals = animals;
    }

    public List<animal> getList() {
        return list;
    }

    public void setList(List<animal> list) {
        this.list = list;
    }

    //展示可购买的宠物列表
    public   void list(){
        for(int i=0;i<animals.size();i++){
            animal animal=animals.get(i);
            System.out.println(i+" "+animal.getName()+" 宠物价钱"+animal.getPrice()+" 疫苗价钱"+animal.getVaprice()+" ");
        }
    }
    //显示自己的宠物列表
    public   void mylist(){
        for(int i=0;i<list.size();i++){
            animal animal=list.get(i);
            System.out.println(i+" "+animal.getName()+" 宠物价钱"+animal.getPrice()+" 疫苗价钱"+animal.getVaprice()+" ");
        }
    }
    //购买宠物
    public  animal buy(int i){
       animal animal=animals.get(i);
        double price = setMeal.salepet(animal);
        list.add(animal);
        animals.set(i,new animal());
        this.initmoney-=animal.getVaprice();
        this.initmoney-=animal.getPrice();
        System.out.println("您在"+new Date()+"买入了"+animal.getName()+"  花了"+animal.getPrice()+" 余额："+this.getInitmoney());
        return animal;
    }
    //卖出宠物
    public  double sale(int i){
        animal animal=list.get(i);

        list.remove(i);
        //这里我们设置卖出一只宠物，利润是150%
        this.initmoney+=animal.getPrice()*1.5;
        System.out.println("您在"+new Date()+"卖出了"+animal.getName()+"   得到了"+animal.getPrice()*1.15+" 余额："+this.getInitmoney());
        return animal.getPrice()*1.5;
    }
    //寄养宠物
    public  double feed(animal animal){
        System.out.println("您在"+new Date()+"留养"+animal.getName());
        //设置寄养宠物获取30
        list.add(animal);
        return 30;
    }

    public List<animal> getAnimals() {
        return animals;
    }


    @Override
    public String toString() {
        return "petShop{" +
                "animals=" + animals +
                '}';
    }
    //初始化可购买的宠物
    public  List<animal> init(){
        List<animal> animals=new ArrayList();
        for(int i=0;i<5;i++){
            dog dog = new dog("dog" + i, "M", i + 1, 100 + i);
            animals.add(dog);
        }
        for(int i=0;i<5;i++){
            cat cat = new cat("cat" + i, "M", i + 1, 50 + i);
            animals.add(cat);
        }
        for(int i=0;i<5;i++){
            bird bird = new bird("bird" + i, "M", i + 1, 30 + i);
            animals.add(bird);
        }
        return animals;
    }
}
