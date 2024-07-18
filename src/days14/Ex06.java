package days14;

import days12.Tv;

/**
 * @author created by Seeker2250 on 7/18/24.
 * @Subject
 * @Contents
 */
public class Ex06 {
  public static void main(String[] args) {
//    Tv class 만들었어
//    day12에 있는 놈을 상속 받아서 자막 기능이 달린 새로운 Tv Class로 만들거야

    CaptionTv ctv = new CaptionTv();
    ctv.power();
    System.out.println(ctv.channel);
    ctv.channelUp();
    System.out.println(ctv.channel);
    ctv.caption = true;
    ctv.dispCaption("msg sample");
    ctv.dispCaption("msg sample2");
    ctv.power();
    System.out.println("끝");
  }//main
}//class

class CaptionTv extends Tv {
  boolean caption;//자막 기능 on off

  void dispCaption(String msg) {
    if (caption == true)
      System.out.println(msg);
  }
}
