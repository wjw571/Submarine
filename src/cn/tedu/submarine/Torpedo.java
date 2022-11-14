package cn.tedu.submarine;
/** 鱼雷*/
public class Torpedo extends SeaObject {

    Torpedo(int x,int y){//每个鱼雷的初始坐标是不同，所以加参
        super(5,18,x,y,1);

    }
}
