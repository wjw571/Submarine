package cn.tedu.submarine;
/** 鱼雷*/
public class Torpedo {
    int width;
    int height;
    int x;
    int y;
    int speed;
    Torpedo(int x,int y){//每个鱼雷的初始坐标是不同，所以加参
        width=5;
        height=18;
        this.x=x;
        this.y=y;
        speed=1;

    }    void step(){
        System.out.println("鱼雷移动");
    }
}
