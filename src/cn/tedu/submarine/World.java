package cn.tedu.submarine;
/** 整个游戏世界*/
public class World {
    Battleship s;
    ObserveSubmarine[] oses;
    TorpedoSubmarine[] tses;
    MineSubmarine[] mses;
    Bomb[] bs;
    Torpedo[] ts;
    Mine[] ms;

    void action(){//测试代码
        //...
        //先new对象，再访问，NullPointer空指针异常
        //上面声明的数据类型，在action（）中 new对象不能再去声明一个数据变量
        oses=new ObserveSubmarine[3];
        oses[0]=new ObserveSubmarine();
        oses[1]=new ObserveSubmarine();
        oses[2]=new ObserveSubmarine();
        for(int i=0;i< oses.length;i++){
            System.out.println(oses[i].x+","+ oses[i].y);
            oses[i].step();
        }
        ts=new Torpedo[2];
        ts[0]=new Torpedo(5,6);
        ts[1]=new Torpedo(7,6);
        for (int i=0;i<ts.length;i++){
            System.out.println(ts[i].x+","+ts[i].y);
            ts[i].step();
        }
        ms=new Mine[2];
        ms[0]=new Mine(8,7);
        ms[1]=new Mine(5,5);
        for(int i=0;i< ms.length;i++){
            System.out.println(ms[i].x+","+ms[i].y);
            ms[i].step();
        }
    }

    public static/**静态，访问不了外面的引用*/ void main/**main一定是静态的*/(String[] args) {
        World w=new World();//通过打表的方式访问
        w.action();
    }
}
/*
1.  问：为什么把一堆引用设计在main的外面？
    答：若将引用设计在面中，意味着引用只能在main中访问
    若World类后期会设计很多方法，这些方法都需要曹祖一堆引用
    所以将引用设计在main外面，都能使用，扩大作用范围

2.  问：为什么要单独创建action（）方法做测试
    答：因为main是static的，在static的方法中是无法访问的那一堆引用的
    所以单独创建一个非static的方法action（）来测试
    ----static的内容在面向对象第五天
3.  问：在main中为什么要先创建World对象，再调用action（）方法？
    答：因为main中static的，在static的方法中是无法直接调用action（）方法
    所以先创建World对象，再调用action（）方法
    ----static的内容在面向对象第五天
*/