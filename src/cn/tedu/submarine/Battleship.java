package cn.tedu.submarine;
/**  战舰 */
public class Battleship extends SeaObject{

    private int life;//命，特有的
    /**构造方法-----做初始化*/
    public Battleship(){
        super(66,26,270,124,20);
        life=5;
    }
    /** 移动*/
    //派生类的访问权限要大于等于超类
    public void step(){
        //暂时不动
    }

}
