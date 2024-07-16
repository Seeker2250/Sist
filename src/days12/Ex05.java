package days12;

/**
 * created by Seeker2250 on 7/16/24.
 *
 * @subject access modifier 설명
 * @content 1) class declare
 *  1) public
 *    package 내외부 어디든 inheritance, reference 가능
 *
 *  2) protected(unactivated)
 *    독립적인 class를 선언할 때는 사용할 수 없는 modifier
 *    (중첩 class 안에서 사용할 수 있는 modifier)
 *    중첩 class : class 안에 있는 class
 *    같은 class, parents, child, 어디든 inheritance 가능(그 외는 안돼)
 *    package modifier + package 외부에서는 inheritance만 가능하다.
 *
 *  3) package(default)
 *    같은 class, 같은 package 내부에서만 inheritance, reference 가능
 *
 *  4) private
 *    같은 class 에서만 inheritance, reference 가능
 *
 * 2) members declare
 *  1) public
 *  2) protected
 *  3) package
 *  4) private
 *
 *  modifiers
 *  class 앞에...
 *  1) abstract -> 나중에 interface에서 보자
 *  2) final  -> inheritance에서 쓰여
 *  3) static(unactivated)
 */
public class Ex05 {//class 선언부

  public static void main(String[] args) {

  }//main
}//class

class Member {//public인 class는 1개여야 해. file name이랑 같은 거로!

  //  Class 'member' is public, should be declared in a file named 'member.java'
  protected class Address {

  }
}
