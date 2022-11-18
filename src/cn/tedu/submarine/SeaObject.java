package cn.tedu.submarine;
import java.util.Random;
public class SeaObject {//超类的数据是受保护的，不能设置成私有的，因为这样子的话派生类访问不到
    protected int width;//宽
    protected int height;//高
    protected int x;//x坐标
    protected int y;//y坐标
    protected int speed;//移动速度
    /** 专门给侦擦潜艇，鱼雷潜艇，水雷潜艇的构造方法*/
    //三种潜艇的宽和高是不一样的，所以数据不能写斯，需传参写活
    //三种潜艇的x/y/speed是一样的，所以数据直接写死，不需要传参
    //构造方法也是公开的
    public SeaObject(int width,int height){
        this.width=width;
        this.height=height;
        x=-width;
        Random rand=new Random();//随机数对象
        y=rand.nextInt(479-height-150+1)+150;//150到460的随机数
        speed=rand.nextInt(3)+1;//1到3的随机数
    }
    /** 专门给战舰，水雷，鱼雷，深水炸弹构造的方法*/
    //因为x/y/speed/width/height都是不一样的，所以数据得写活，传参
    public SeaObject(int width,int height,int x,int y,int speed){
        this.width=width;
        this.height=height;
        this.x=x;
        this.y=y;
        this.speed=speed;
    }

    /** 移动*/
    public void step(){
        System.out.println("海洋对象移动");
    }
}
