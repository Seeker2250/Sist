package days17;

import days13.Point;

import java.io.IOError;
import java.io.IOException;
import java.util.Objects;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex05 {
  public static void main(String[] args) {
//    Arrays Class : toString(), sort(), binarySearch()
//    Object Class : 모든 method static
//                              Objects.method()
//                              객체 비교 또는 Null check 유용
    Point p1 = null;
//    p1체크
    if(p1==null){
    }
    if(Objects.isNull(p1)){
    }
//    위 둘은 같아
    if(p1!=null){
    }
    if(Objects.nonNull(p1)){
    }
//    위 둘도 같아

    if(p1==null){
      new IOException("예외 메시지를 적고 ");
    }
    Point pCopy = p1;

    Objects.requireNonNull(p1, "예외 메시지를 적고");//위랑 똑같아

    if(p1 !=null && p1.equals(pCopy)){}
    if(Objects.equals(p1, pCopy)){}

  }//main
}//class
