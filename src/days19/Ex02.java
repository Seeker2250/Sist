package days19;

import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.function.Consumer;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 * List                                                                 Set, Map
 * ArrayList
 * Vector -> 사실 ArrayList와 같아.
 *          차이점 : Multi Thread 안전(동기화 처리가 되어있어)
 *
 * StringBuffer(multi thread 안전, 동기화처리)
 * StringBuilder(multi thread 위험)
 * Stack
 */
public class Ex02 {
  public static void main(String[] args) {
      Vector vt = new Vector();
      ArrayList al = new ArrayList();
      vt.addElement("김준석");//동기화처리 된 method
    vt.addElement("김준석");
    vt.addElement("김선우");
    vt.addElement("김재민");
    vt.addElement("김인경");
    vt.addElement(null);
    System.out.println(vt);
    System.out.println(vt.capacity());
    vt.trimToSize();
    System.out.println(vt.capacity());
    vt.setSize(10);
    System.out.println(vt.capacity());

    System.out.println(vt.get(1));
    System.out.println(vt.elementAt(1));
//    vt.remove(1);
//    vt.removeElementAt(1);
//
//    vt.remove("김준석"); //true false
//    vt.removeElement("김준석");


//    vt.clear();   모든 요소 삭제
//    vt.removeAllElements();
    vt.removeIf(e-> e == null);//null인 요소 삭제

//    vt.set(1, "asf");
//    vt.setElementAt("fda", 3);
    System.out.println(" - ".repeat(30));
    Iterator ir = vt.iterator();
    while (ir.hasNext()){
      String name = (String)ir.next();
      System.out.println(name);
    }
    System.out.println(" - ".repeat(30));
//    vt.forEach(new Consumer<String>() { --->Lambda & Stream
//      @Override
//      public void accept(String n) {
//        System.out.println(n);
//      }
//    });

//    vt.forEach(n-> System.out.println(n));
//    68번 라인이랑 70번 라인을은 같아
    vt.forEach(System.out::println);//method reference
//    parameter 1개 뿐이잖아.
//    그럼 요소 하나씩 뽑아오라고

    vt.firstElement();//==vt.get(0);
    vt.lastElement();//==vt.get(vt.size()-1);
    int idx = vt.indexOf("김준석");
    vt.insertElementAt("바보", idx + 1);//김준석 뒤에 바보 넣어
    System.out.println(vt);
    List sl = vt.subList(2,5);//return type : List Interface

  }//main
}//class
