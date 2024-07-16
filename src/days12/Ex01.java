package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Ex01 {
  public static void main(String[] args) throws IOException {
//    한 반에 30명인 학생이 3반일 때,
//    이름, 국어, 영어, 수학, 총점, 평균, 등수, 전교등수 입출력
    final int CLASS_COUNT = 3;
    final int STUDENT_COUNT = 30;
    String[][] names = new String[CLASS_COUNT][STUDENT_COUNT];
//    이름, 국어, 영어, 수학, 총점, 평균, 등수, 전교등수 받는 2차원 배열 여러 개 써도 되지만 3차원 배열 써보자
    int[][][] infos = new int[6][CLASS_COUNT][STUDENT_COUNT];
//    0면 : 국어, 1면 : 영어, 2면 : 수학, 3면 : 총점, 4면 : 등수, 5면 : 전교등수
//    행 : 반
//    열 : 학생
//    infos[2][1][19]는 2반 20번 학생의 영어 점수가 될 것
    double[][] avgs = new double[CLASS_COUNT][STUDENT_COUNT];

//    입력 받은 학생 수를 저장할 변수 선언
//    각 반 별로 3개 필요할 것 같으니 차라리 Array쓰자
    int[] cnts = new int[CLASS_COUNT];

    char con = 'y';//입력 지속 여부
    String name;
    int kor, eng, mat, tot, rank, wrank;
    double avg;
    Scanner sc = new Scanner(System.in);
    int ban; // 1 2 3반

    do {
      System.out.println("반을 입력해주세요.");
      ban = sc.nextInt();//1or2or3

      System.out.println("학생 정보를 입력해주세요");
      System.out.printf("%d반의 %d번 학생의 이름, 국어 점수, 영어 점수, 수학 점수를 입력해주세요. \n", ban, cnts[ban - 1] + 1);//cnts[ban-1]+1의 의미 : n반의 입력 받을 학생
      name = getName();  // scanner.next();
      kor = getScore(); // scanner.nextInt();
      eng = getScore(); // scanner.nextInt();
      mat = getScore(); // scanner.nextInt();
      tot = kor + eng + mat;
      avg = (double) tot / 3;
      wrank = rank = 1;

      names[ban - 1][cnts[ban - 1]] = name;
      infos[0][ban - 1][cnts[ban - 1]] = kor;
      infos[1][ban - 1][cnts[ban - 1]] = eng;
      infos[2][ban - 1][cnts[ban - 1]] = mat;
      infos[3][ban - 1][cnts[ban - 1]] = tot;
      infos[4][ban - 1][cnts[ban - 1]] = rank;
      infos[0][ban - 1][cnts[ban - 1]] = wrank;

      avgs[ban - 1][cnts[ban - 1]] = avg;
      cnts[ban - 1]++;//ban-1이 찐 반, cnts가 번호가 되겠지

      System.out.println("계속 입력 하시겠습니까?");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
    } while (Character.toUpperCase(con) == 'Y');

//    총학생 수는 cnt에 있는 값들 하면 되니까
    int totStudents = IntStream.of(cnts).sum();
    System.out.println("\t\t학생 정보 출력 : " + totStudents + "명");
    for (int i = 0; i < cnts.length; i++) {
      System.out.printf("%d반 학생 : %d명 ", i + 1, cnts[i]);
      for (int j = 0; j < cnts[i]; j++) {
        System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
            , i + 1, names[i][j], infos[0][i][j], infos[1][i][j], infos[2][i][j], infos[3][i][j], avgs[i][j], infos[4][i][j], infos[5][i][j]);
        //i+1은 반, 국어 영어 수학 총점 평균 반등수 전교등수
      }//for j
    }//for i
  }//main


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
  }//getName()

  public static int getScore() {
    return (int) (Math.random() * 101);
  }//getScore()


}//class
