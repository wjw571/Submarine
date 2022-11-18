package cn.tedu.submarine;
import javax.swing.ImageIcon;//图片的数据类型
/** 图片类*/
public class Images {//数据公开给别人用的
 // 公开的  静态的    图片类型  变量名
   public static ImageIcon sea;            /***海洋图*/
   public static ImageIcon battleship;     /***战舰*/
   public static ImageIcon obsersubm;      /***侦擦潜艇*/
   public static ImageIcon torpesubm;      /***鱼雷潜艇*/
   public static ImageIcon minesubm;       /***水雷潜艇*/
   public static ImageIcon torpedo;        /***鱼雷*/
   public static ImageIcon mine;           /***水雷*/
   public static ImageIcon bomb;           /***深水炸弹*/
   static{//初始化静态资源
   //变量名                 路径名
      sea =new ImageIcon("img/sea.png");
      battleship =new ImageIcon("img/battleship.png");
      obsersubm=new ImageIcon("img/obsersubm.png");
      torpesubm=new ImageIcon("img/torpesubm.png");
      minesubm=new ImageIcon("img/minesubm.png");
      torpedo=new ImageIcon("img/torpedo.png");
      mine=new ImageIcon("img/mine.png");
      bomb=new ImageIcon("img/bomb.png");
   }

   public static void main(String[] args) {
       System.out.println(sea.getImageLoadStatus());//输出8表示加载成功
       System.out.println(battleship.getImageLoadStatus());
       System.out.println(obsersubm.getImageLoadStatus());
       System.out.println(torpesubm.getImageLoadStatus());
       System.out.println(minesubm.getImageLoadStatus());
       System.out.println(torpedo.getImageLoadStatus());
       System.out.println(mine.getImageLoadStatus());
       System.out.println(bomb.getImageLoadStatus());

   }
}
