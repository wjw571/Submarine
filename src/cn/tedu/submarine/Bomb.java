package cn.tedu.submarine;
/** 深水炸弹*/
public class Bomb extends SeaObject {
    //构造方法          //例子Bomb b=new Bomb(100,200)
    Bomb(int x,int y){//y其实可以写实，这样子只是为了与其他雷一样
       super(9,12,x,y,3);
    }

}
