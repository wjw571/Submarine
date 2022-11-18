package cn.tedu.submarine;
import java.util.Random;
/** 侦察潜艇*/
public class ObserveSubmarine extends SeaObject{

    public ObserveSubmarine(){
      super(63,19);
    }
    public void step(){
        x+=speed;//x向右
    }
}
