package cn.tedu.submarine;

import java.util.Random;

/** 水雷潜艇*/
public class MineSubmarine extends SeaObject {

    public MineSubmarine(){
        super(63,19);
    }
    public void step(){
        x+=speed;//x向右
    }
}
