package cn.tedu.submarine;
/** 水雷*/
public class Mine extends SeaObject{
   //构造方法
    public Mine(int x,int y){
        super(11,11,x,y,1);
    }
    public void step(){
        y-=speed;//y向上
    }
}
