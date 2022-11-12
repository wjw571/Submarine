package cn.tedu.submarine;
/** 整个游戏世界*/
public class World {
    Battleship s;
    ObserveSubmarine os1;
    ObserveSubmarine os2;
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
        s = new Battleship();
        s.width=60;
        s.height=20;
        s.x=150;
        s.y=200;
        s.speed=20;
        s.life=5;
        s.step();

        os1=new ObserveSubmarine();
        os1.width=20;
        os1.height=30;
        os1.x=160;
        os1.y=170;
        os1.speed=10;
        os1.step();

        os2 =new ObserveSubmarine();
        os2.width=40;
        os2.height=60;
        os2.x=180;
        os2.y=190;
        os2.speed=5;
        os2.step();

        ms1=new MineSubmarine();
        ms1.width=160;
        ms1.height=40;
        ms1.x=60;
        ms1.y=80;
        ms1.speed=23;
        ms1.step();

        ms2=new MineSubmarine();
        ms2.width=50;
        ms2.height=60;
        ms2.x=60;
        ms2.y=30;
        ms2.speed=6;
        ms2.step();

        ts1=new TorpedoSubmarine();
        ts1.width=60;
        ts1.height=40;
        ts1.x=30;
        ts1.y=55;
        ts1.speed=90;
        ts1.step();

        ts2=new TorpedoSubmarine();
        ts2.width=12;
        ts2.height=13;
        ts2.x=1;
        ts2.y=6;
        ts2.speed=55;
        ts2.step();

        b1=new Bomb();
        b1.width=2;
        b1.height=6;
        b1.x=5;
        b1.y=6;
        b1.speed=44;
        b1.step();

        b2=new Bomb();
        b2.width=5;
        b2.height=6;
        b2.x=5;
        b2.y=6;
        b2.speed=88;
        b2.step();

        m1=new Mine();
        m1.width=55;
        m1.height=77;
        m1.x=66;
        m1.y=66;
        m1.speed=99;
        m1.step();

        m2=new Mine();
        m2.width=55;
        m2.height=66;
        m2.x=8;
        m2.y=7;
        m2.speed=22;
        m2.step();

        t1=new Torpedo();
        t1.width=1;
        t1.height=9;
        t1.x=8;
        t1.y=9;
        t1.speed=88;
        t1.step();

        t2=new Torpedo();
        t2.width=44;
        t2.height=33;
        t2.x=3;
        t2.y=9;
        t2.speed=3;
        t2.step();


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