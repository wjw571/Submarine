package cn.tedu.submarine;
import javax.swing.JFrame;//1.
import javax.swing.JPanel;//1.
/** 整个游戏世界*/
public class World extends JPanel{//2.
    //在派生类里面都是私有的数据
    //方法公开
    private Battleship ship=new Battleship();//战舰
    private SeaObject[] submarines={};//潜艇数组（侦擦，鱼雷，水雷）
    private SeaObject[] thunders={};//雷数组（鱼雷，水雷）
    private Bomb[] bombs={};//深水炸弹数组
        //在声明时候赋值，可以避免发生空指针异常
    public void action(){//测试代码
        //...
        //先new对象，再访问，NullPointer空指针异常
        //上面声明的数据类型，在action（）中 new对象不能再去声明一个数据变量
        submarines=new SeaObject[5];
        submarines[0]=new ObserveSubmarine();
        submarines[1]=new ObserveSubmarine();
        submarines[2]=new TorpedoSubmarine();
        submarines[3]=new TorpedoSubmarine();
        submarines[4]=new MineSubmarine();
        for (int i=0;i<submarines.length;i++){
            SeaObject s=submarines[i];//获取每个潜艇
            System.out.println(s.x+","+s.y);
            s.step();
        }
        thunders=new SeaObject[2];
        thunders[0]=new Torpedo(100,200);
        thunders[1]=new Mine(300,500);
        for (int i=0;i<thunders.length;i++){
            SeaObject t=thunders[i];//获取每个潜艇
            System.out.println(t.x+","+t.y);
            t.step();
        }

    }

    public static/**静态，访问不了外面的引用*/ void main/**main一定是静态的*/(String[] args) {
        JFrame frame=new JFrame();
        World world=new World();
        world.setFocusable(true);
        frame.add(world);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(641+16,479+39);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        world.action();
    }
}
/*
1.  问：为什么把一堆引用设计在main的外面？
    答：若将引用设计在面中，意味着引用只能在main中访问
    若World类后期会设计很多方法，这些方法都需要曹祖一堆引用
    所以将引用设计在main外面，都能使用，扩大作用范围

2.  问：为什么要单独创建action（）方法做测试
    答：因为main是static的，在static的方法中是无法访问的那一堆引用的
        //静态方法没有隐式this传递
        //没有this就意味着没有对象（this表示当前对象）
        //而实例变量a必须通过对象点访问的
        //所以如下代码编译错误，哪怕自己加this也是报错，他不认识
        //而静态变量不依赖对象，他是靠类名点
    所以单独创建一个非static的方法action（）来测试
    ----static的内容在面向对象第五天
3.  问：在main中为什么要先创建World对象，再调用action（）方法？
    答：因为main中static的，在static的方法中是无法直接调用action（）方法
    所以先创建World对象，再调用action（）方法
    ----static的内容在面向对象第五天
*/