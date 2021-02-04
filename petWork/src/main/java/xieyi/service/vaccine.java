package xieyi.service;

import xieyi.pet.animal;

public class vaccine {
    //狗疫苗的数量
    private int dogv;
    //猫疫苗的数量
    private int catv;
    //鸟疫苗的数量
    private int birdv;

    private animal animal;

    public vaccine() {
        //初始时，店铺疫苗应该都为0
        this.dogv=0;
        this.catv=0;
        this.birdv=0;
    }



    public int getDogv() {
        return dogv;
    }

    public void setDogv(int dogv) {
        this.dogv = dogv;
    }

    public int getCatv() {
        return catv;
    }

    public void setCatv(int catv) {
        this.catv = catv;
    }

    public int getBirdv() {
        return birdv;
    }

    public void setBirdv(int birdv) {
        this.birdv = birdv;
    }

    @Override
    public String toString() {
        return "vaccine{" +
                "dogv=" + dogv +
                ", catv=" + catv +
                ", birdv=" + birdv +
                '}';
    }
}
