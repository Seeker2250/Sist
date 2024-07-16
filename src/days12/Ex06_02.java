package days12;

/**
 * created by Seeker2250 on 7/16/24.
 * <p>
 * 얕은 복제와 깊은 복제(shallow copy with deep copy)
 */
public class Ex06_02 {
  public static void main(String[] args) {
    //object clone, class clone

    Point p1 = new Point();
    p1.x = 10;
    p1.y = 20;
    p1.m = new int[2];
    p1.m[0] = 1;
    p1.m[1] = 2;
//    p1이라고 하는 Point 객체가 있어
//    x, y m[]이 있는데 m[]은 0번, 1번 방을 참조중이지. 그리고 이런 m[]을 p1이 참조중이고.
    p1.dispPoint();//x=10, y=20


    //object clone(객체 복제), instance는 다르지만 값은 같아
    Point p2 = new Point();//여기서 새로운 instance를 만들었잖아~
    p2.x = p1.x;
    p2.y = p1.y;
    p2.m = p1.m;//얕은 복제
//    p1이 x공간, y공간, m field가 10번지에 1, 14번지에 2 참조한다고 가정하면
//    p2가 만들어지고, x공간, y공간, m field 따로 다 만들어지는데
//    m array가 참조하고 있는 곳은 10번지와 14번지로 동일해!


//    만약에
    p2.m = new int[2];
    p2.m[0] = p1.m[0];
    p2.m[1] = p1.m[1];
//    라고 하면 이게 깊은 복제
    p2.dispPoint();

    //object copy(객체 복사)
    Point p3 = p1;
    p3.dispPoint();

  }//main
}//class
