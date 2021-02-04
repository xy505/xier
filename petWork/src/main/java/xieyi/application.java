package xieyi;

import xieyi.exception.myexception;
import xieyi.pet.animal;
import xieyi.pet.bird;
import xieyi.pet.cat;
import xieyi.pet.dog;
import xieyi.service.petShop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class application {
    static Scanner in =new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException, myexception {
        petShop petShop=new petShop();

        System.out.println("欢迎来到宠物店铺创业活动,在这里，你将获得5500块钱资金，请合理使用资金，经营你的店铺");
        Thread.sleep(1000);
        System.out.println("选择 1 购买   2 卖出 -1 退出");
        int i=in.nextInt();
        System.out.println("选择-1退出");
        while(i!=-1){
            if(i==1){
                buy(petShop);
                i=in.nextInt();
            }else if(i==2){
                sale(petShop);
                i=in.nextInt();
            }else{
                throw new myexception("error");
            }
        }
        System.out.println("今天您目前已经购买了这些宠物 剩余资金为"+petShop.getInitmoney());
        petShop.mylist();
//        for(int j=0;i<petShop.getList().size();j++){
//            System.out.println(petShop.getList().get(j).getName());
//        }
        Thread.sleep(1000);
//        System.out.println("这时候来了一笔生意，有人来寄养宠物,接过生意请选择 1，反之 2");
//        int choice1=in.nextInt();
//        if(choice1==1){
//            petShop.feed(new animal());
//        }else if(choice1==2){
//            System.out.println("您拒绝了");
//        }else{
//            throw new myexception("系统出错");
//        }


    }

    public static void buy(petShop petShop) throws myexception {

        System.out.println("您目前可以在这家宠物商店购买您的需要");
        System.out.println("有以下的宠物可以购买");
        petShop.list();
        System.out.println("请根据序号，选择你想买的宠物,选择-1，可以退出购买程序");
        int choice=in.nextInt();
        while(choice!=-1){
            if(choice>petShop.getAnimals().size()||choice<-2){
                throw new myexception("请认真对待购买，购买中断");
            }else{
                petShop.buy(choice);
                choice=in.nextInt();
            }

        }
        System.out.println("选择 1 购买   2 卖出");
    }

    public static void sale(petShop petShop) throws myexception {
        System.out.println("您的宠物列表");
        petShop.mylist();
        int choice=in.nextInt();
        while(choice!=-1){
            if(choice>petShop.getList().size()||choice<-2){
                throw new myexception("请认真对待卖出，购买中断");
            }else{
                petShop.sale(choice);
                choice=in.nextInt();
            }

        }
        System.out.println("选择 1 购买   2 卖出");
    }

}
