package cn.tedu.submarine;

import java.util.Random;

/** 鱼雷潜艇*/
public class TorpedoSubmarine {
    int width;
    int height;
    int x;
    int y;
    int speed;
    TorpedoSubmarine(){
        width=64;
        height=20;
        x=-width;//负的潜艇的宽
        Random rand=new Random();
        y= rand.nextInt(479-height-150+1)+150;//窗口的高为479，宽641
        //150到460的随机数
        speed= rand.nextInt(3)+1;//从1到3之间
    }
    void step(){
        System.out.println("鱼雷潜艇移动");
    }
}
