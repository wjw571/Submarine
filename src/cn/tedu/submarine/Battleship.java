package cn.tedu.submarine;
/**  战舰 */
public class Battleship {
    int width;//宽
    int height;//高
    int x;//x坐标
    int y;//y坐标
    int speed;//速度
    int life;//命
    /**构造方法-----做初始化*/
    Battleship(){
        width=66;
        height=26;
        x=270;
        y=124;
        speed=20;
        life=5;
    }
    /** 移动*/
    void step(){
        System.out.println("战舰移动");
    }
}
