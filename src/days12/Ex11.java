package days12;

/**
 * @author created by Seeker2250 on 7/16/24.
 * @Subject
 * @Contents
 */
public class Ex11 {
  public static void main(String[] args) {

//    primitive of reference type method(매개변수)
//                                     ㄴ primitive
//                                     ㄴ reference

    int[] m = new int[3];
    System.out.println(m.length);//3
    Ex11 ex = new Ex11();//static 없으면 이거 필요해
    m = ex.increaseArr(m);//객체명.method();
//    increaseArr(m);
    System.out.println(m.length);//6
  }//main

  public int[] increaseArr(int[] m) {//reference type parameter
    int[] temp = new int[m.length + 3];
    return temp;
  }
//  m은 3개짜리 배열은 참조하고 있었는데
//  temp는 6개짜리 배열이 되고, temp를 return했어
//  근데 m이 6개짜리 배열을 가리키게 되면서 3개짜리 배열은 아무도 참조하지 않아
//  그래서 3개짜리 배열은 garbage가 되면서 GC가 처리하는 것
//
}//class
