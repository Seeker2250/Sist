package days13;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject 3반 30명 처리
 * @Contents
 */

public class Repeat {
  public static void main(String[] args) throws IOException {
    final int CLASS_COUNT = 3;
    final int STUDENT_COUNT = 30;
    Student[][] students = new Student[CLASS_COUNT][STUDENT_COUNT];

    String[][] names = new String[CLASS_COUNT][STUDENT_COUNT];

    int[][][] infos = new int[6][CLASS_COUNT][STUDENT_COUNT];

    double[][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];


    int[] cnts = new int[CLASS_COUNT];

    char con = 'y';//입력 지속 여부
    String name;
    int kor, eng, mat, tot, rank, wrank;
    double avg;
    Scanner sc = new Scanner(System.in);
    int cIdx; // 1 2 3반

    do {
      System.out.println("반을 입력해주세요.");
      cIdx = sc.nextInt() - 1;

      System.out.println("학생 정보를 입력해주세요");
      System.out.printf("%d반의 %d번 학생의 이름, 국어 점수, 영어 점수, 수학 점수를 입력해주세요. \n", cIdx + 1, cnts[cIdx] + 1);//cnts[ban-1]+1의 의미 : n반의 입력 받을 학생
      name = getName();
      kor = getScore();
      eng = getScore();
      mat = getScore();
      tot = kor + eng + mat;
      avg = (double) tot / 3;
      wrank = rank = 1;

      students[cIdx][cnts[cIdx]] = new Student();//이거 안하면 Null Pointer Exception
      students[cIdx][cnts[cIdx]].name = name;
      students[cIdx][cnts[cIdx]].kor = kor;
      students[cIdx][cnts[cIdx]].eng = eng;
      students[cIdx][cnts[cIdx]].mat = mat;
      students[cIdx][cnts[cIdx]].tot = tot;
      students[cIdx][cnts[cIdx]].rank = rank;
      students[cIdx][cnts[cIdx]].wrank = wrank;
      students[cIdx][cnts[cIdx]].avg = avg;
      cnts[cIdx]++;

      System.out.println("계속 입력 하시겠습니까?");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
    } while (Character.toUpperCase(con) == 'Y');

//  반, 전교 등수 처리 start
    for (int i = 0; i < cnts.length; i++) {//전교생
      for (int j = 0; j < cnts[i]; j++) {

        for (int i2 = 0; i2 < cnts.length; i2++) {//비교 대상
          for (int j2 = 0; j2 < cnts[i2]; j2++) {
            if (students[i][j].tot < students[i2][j2].tot) {
              students[i][j].wrank++;
              if (i == i2) {
                students[i][j].rank++;
              }//inner if
            }//outer if
          }//j2 for
        }//i2 for
      }//inner for
    }//outter for
//  반, 전교 등수 처리 end

    int totStudents = IntStream.of(cnts).sum();
    System.out.println("\t\t학생 정보 출력 : " + totStudents + "명");
    for (int i = 0; i < cnts.length; i++) {
      System.out.printf("%d반 학생 : %d명 \n", i + 1, cnts[i]);
      for (int j = 0; j < cnts[i]; j++) {
        System.out.printf("[%d] ", j + 1);
        students[i][j].dispInfo();
      }//for j
    }//for i
  }//main


  private static String getName() {

    Random rnd = new Random();
    String[] lastNames = {"김", "이", "박", "최", "권", "홍"};
    int index = rnd.nextInt(lastNames.length);
    String name = lastNames[index];

    char[] firstNames = new char[2];
    for (int i = 0; i < firstNames.length; i++) {
      firstNames[i] = (char) (rnd.nextInt('힣' - '가' + 1) + '가');
    }
    String firstName = String.valueOf(firstNames);

    name += firstName;
    return name;
  }//getName()

  public static int getScore() {
    return (int) (Math.random() * 101);
  }//getScore()


}//class