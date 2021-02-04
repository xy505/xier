package xieyi.service;

import xieyi.pet.animal;

public class setMeal {


    public setMeal() {

    }
     //卖宠物，以及返回价格
    public static double salepet(animal animal){
        System.out.println("宠物购买店卖出这只叫"+animal.getName()+"的宠物");
        return animal.getPrice();
    }

    //卖疫苗
    public static double saleva(animal animal){
        System.out.println("宠物购买店卖疫苗");
        return animal.getVaprice();
    }
}
