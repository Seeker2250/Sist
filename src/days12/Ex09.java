package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author created by Seeker2250 on 7/16/24.
 * @Subject
 * @Contents
 * Class Array 덕분에 배열에서 각 index마다 instance 계속 생기고
 * 그러면 3차원 배열과 같은 효과를 낼 수 있지
 */
public class Ex09 {
  static String name;
  static int kor, eng, mat, tot, rank;
  static double avg;
  static final int STUDENT_COUNT = 30;
  //    Class Array declare
  static Student[] students = new Student[STUDENT_COUNT];
  //  static String[] names = new String[STUDENT_COUNT];
//  static int[] kors = new int[STUDENT_COUNT];
//  static int[] engs = new int[STUDENT_COUNT];
//  static int[] mats = new int[STUDENT_COUNT];
//  static int[] tots = new int[STUDENT_COUNT];
//  static int[] ranks = new int[STUDENT_COUNT];
//  static double[] avgs = new double[STUDENT_COUNT];
//  이거랑 같아
  static Scanner scanner = new Scanner(System.in);
  static int count = 0;//입력 받은 학생 수
  static char con = 'y';//입력을 지속할 지 여부

  public static void main(String[] args) throws IOException {
//days10.Ex01_02.java -> Class Array를 활용하여 수정
//    Student.java를 만들자

    studentInfomationInput();
    studentInfomationOutput();
  }//main

  private static void studentInfomationOutput() {
    System.out.printf("총 학생수 : %d\n", count);

    for (int i = 0; i < count; i++) {
      System.out.printf("[%d]\t", i + 1);
      students[i].dispInfo();
    }

  }

  private static void studentInfomationInput() throws IOException {

    do {
      System.out.printf("%d번 학생 이름, 국어, 영어, 수학 입력하세요 ", count + 1);

      name = getName();  // scanner.next();
      kor = getScore(); // scanner.nextInt();
      eng = getScore(); // scanner.nextInt();
      mat = getScore(); // scanner.nextInt();
      tot = kor + eng + mat;
      avg = (double) tot / 3;
      rank = 1;

      students[count] = new Student(); //이거(객체 생성) 없으면 Null Pointer Exception 중요해.
      students[count].name = name;
      students[count].kor = kor;
      students[count].eng = eng;
      students[count].mat = mat;
      students[count].tot = tot;
      students[count].avg = avg;
      students[count].rank = rank;
      count++;
      // 입력 계속 ?
      System.out.println("입력 계속할거야?");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
      // } while ( con == 'Y' || con == 'y');
    } while (Character.toUpperCase(con) == 'Y');

    processRank();
  }

  public static void processRank() {
    // i=0   j==0,1,2,3
    for (int i = 0; i < count; i++) {  // 행
      students[i].rank = 1;
      for (int j = 0; j < count; j++) { // 열
        if (students[i].tot < students[j].tot) students[i].rank++;
      }
    }
  }

  private static String getName() {
    // 성 128개
    Random rnd = new Random();
    String[] lastNames = {"김", "이", "박", "최", "권", "홍"};
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
