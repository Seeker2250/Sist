package days18;

import days12.Student;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/24/24.
 * @Subject
 * @Contents
 */
public class Ex05 {
  public static void main(String[] args) throws IOException {
//    한 반 30명 학생 성적처리
//    모든 배열을 만들어 봄 String[] names = new String[30]; ... 전부 1차원
//    Class 배열 만들어 봄 Students [] s= new Student[30]
//    ArrayList 사용할 예정 Student Class를 elements로

    String name;
    int kor, eng, mat, tot, rank;
    double avg;
    final int STUDENT_COUNT = 30;
    Student[] students = new Student[STUDENT_COUNT];
    ArrayList list = new ArrayList(STUDENT_COUNT);
    Scanner scanner = new Scanner(System.in);
    char con = 'y';//입력을 지속할 지 여부
    do {
      System.out.printf("%d번 학생 이름, 국어, 영어, 수학 입력하세요 ", list.size() + 1);

      name = getName();  // scanner.next();
      kor = getScore(); // scanner.nextInt();
      eng = getScore(); // scanner.nextInt();
      mat = getScore(); // scanner.nextInt();
      tot = kor + eng + mat;
      avg = (double) tot / 3;
      rank = 1;

      Student s = new Student();
      students[list.size()] = new Student(); //이거(객체 생성) 없으면 Null Pointer Exception 중요해.
      s.name = name;
      s.kor = kor;
      s.eng = eng;
      s.mat = mat;
      s.tot = tot;
      s.avg = avg;
      s.rank = rank;

      list.add(s);

      System.out.println("입력 계속할거야?");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
      // } while ( con == 'Y' || con == 'y');
    } while (Character.toUpperCase(con) == 'Y');
    System.out.printf("총 학생수 : %d\n", list.size());
    Iterator ir = list.iterator();
    while (ir.hasNext()) {
      Student s = (Student) ir.next();
      System.out.println(s);
    }
  }


  private static String getName() {
    // 성 128개
    Random rnd = new Random();
    String[] lastNames = {"김", "이", "박", "최", "권", "홍" };
    int index = rnd.nextInt(lastNames.length);
    String name = lastNames[index];

    // 이름 : 2문자
    char[] firstNames = new char[2];
    for (int i = 0; i < firstNames.length; i++) {
      firstNames[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
    }
    // char[] -> String
    String firstName = String.valueOf(firstNames);

    name += firstName;
    return name;
  }

  public static int getScore() {
    return (int) (Math.random() * 101);
  }

}//class

