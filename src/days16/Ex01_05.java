package days16;

import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents
 */
public class Ex01_05 {
  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    try {
//      sc = new Scanner(System.in);
//    } catch (Exception e) {
//
//    } finally {
//      sc.close();
//    }


//    try - resources문 자동으로 자원 할당 해제
    try {
      Scanner sc = new Scanner(System.in);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

//    try{
//      try{
//        try{
//
//        }catch (){
//
//        }
//      }catch (){
//
//      }
//    }catch (){
//      try {
//
//      }catch (){
//
//      }
//    }
//  }
//}
  }
}
