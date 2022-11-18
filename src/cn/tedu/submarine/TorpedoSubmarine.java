package cn.tedu.submarine;

import java.util.Random;

/** 鱼雷潜艇*/
public class TorpedoSubmarine extends SeaObject{

    public TorpedoSubmarine(){
        super(64,20);
    }
    public void step(){
        x+=speed;//x向右
    }
}
