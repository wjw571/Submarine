package cn.tedu.submarine;
/** 整个游戏世界*/
public class World {
    Battleship s;
    ObserveSubmarine os1;
    ObserveSubmarine os2;
    ObserveSubmarine os3;
    ObserveSubmarine os4;
    MineSubmarine ms1;
    MineSubmarine ms2;
    TorpedoSubmarine ts1;
    TorpedoSubmarine ts2;
    Torpedo t1;
    Torpedo t2;
    Mine m1;
    Mine m2;
    Bomb b1;
    Bomb b2;

    void action(){//测试代码
        //...
        //先new对象，再访问，NullPointer空指针异常
        //上面声明的数据类型，在action（）中 new对象不能再去声明一个数据变量
        s=new Battleship();
        os1=new ObserveSubmarine();
        os2=new ObserveSubmarine();
        os3=new ObserveSubmarine();
        os4=new ObserveSubmarine();
        ts1=new TorpedoSubmarine();
        ts2=new TorpedoSubmarine();
        ms1=new MineSubmarine();
        ms2=new MineSubmarine();
        b1=new Bomb(1,1);
        b2=new Bomb(1,1);
        m1=new Mine(1,2);
        m2=new Mine(1,2);
        t1=new Torpedo(1,5);
        t2=new Torpedo(1,5);
        System.out.println(s.width+","+s.height+","+s.x+","+s.y+","+s.speed+","+s.life);
        System.out.println(os1.width+","+os1.height+","+os1.x+","+os1.y+","+os1.speed);
        System.out.println(os2.width+","+os2.height+","+os2.x+","+os2.y+","+os2.speed);
        System.out.println(os3.width+","+os3.height+","+os3.x+","+os3.y+","+os3.speed);
        System.out.println(os4.width+","+os4.height+","+os4.x+","+os4.y+","+os4.speed);
        System.out.println(t1.width+","+ t1.height+","+ t1.x+","+t1.y+","+t1.speed);
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