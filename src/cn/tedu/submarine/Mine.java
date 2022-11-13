package cn.tedu.submarine;
/** 水雷*/
public class Mine {
    int width;
    int height;
    int x;
    int y;
    int speed;
    Mine(int x,int y){
        width=11;
        height=11;
        this.x=x;
        this.y=y;
        speed=1;
    }
    void step(){
        System.out.println("水雷移动");
    }
}
