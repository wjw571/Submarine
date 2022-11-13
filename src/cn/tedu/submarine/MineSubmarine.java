package cn.tedu.submarine;

import java.util.Random;

/** 水雷潜艇*/
public class MineSubmarine {

    int width;
    int height;
    int x;
    int y;
    int speed;
    MineSubmarine(){
        width=63;
        height=19;
        x=-width;//负的潜艇的宽
        Random rand=new Random();
        y= rand.nextInt(479-height-150+1)+150;//窗口的高为479，宽641
        //150到460的随机数
        speed= rand.nextInt(3)+1;//从1到3之间
    }
    void step(){
        System.out.println("水雷潜艇移动");
    }
}
