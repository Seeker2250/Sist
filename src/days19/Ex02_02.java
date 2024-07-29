package days19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Ex02_02 {
  public static void main(String[] args) {
    Vector vt = new Vector();
    ArrayList al = new ArrayList();
    vt.addElement("김준석");//동기화처리 된 method
    vt.addElement("김준석");
    vt.addElement("김선우");
    vt.addElement("김재민");
    vt.addElement("김인경");
    vt.addElement(null);
    System.out.println(" - ".repeat(30));
    ListIterator ir = vt.listIterator();
    //기존 Iterator는 단방향, 읽기 끝나면 끝이야. 전 꺼 읽으려면 다시 만들어야 해. 그런데 이건 양방향이야
    while (ir.hasNext()){
      String name = (String)ir.next();
      System.out.println(name);
    }
    System.out.println(" - ".repeat(30));
    while (ir.hasPrevious()){//역방향으로
      String name = (String)ir.previous();
      System.out.println(name);
    }

  }//main
}//class
