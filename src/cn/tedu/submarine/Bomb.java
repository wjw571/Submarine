package cn.tedu.submarine;
/** 深水炸弹*/
public class Bomb {
    int width;
    int height;
    int x;
    int y;
    int speed;
    Bomb(int x,int y){//y其实可以写实，这样子只是为了与其他雷一样
        width=9;
        height=12;
        this.x=x;
        this.y=y;
        speed=3;
    }
    void step(){
        System.out.println("深水炸弹移动");
    }
}
