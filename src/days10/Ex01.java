package days10;

import java.io.IOException;
import java.util.Scanner;

public class Ex01 {
  //Repeat2 1번
  public static void main(String[] args) throws IOException {
    String name;
    int kor;
    int eng;
    int mat;
    int tot;
    int rank;
    double avg;
    final int STUDENT_COUNT = 30;
    String[] names = new String[STUDENT_COUNT];
    int[] kors = new int[STUDENT_COUNT];
    int[] engs = new int[STUDENT_COUNT];
    int[] mats = new int[STUDENT_COUNT];
    int[] tots = new int[STUDENT_COUNT];
    int[] ranks = new int[STUDENT_COUNT];
    double[] avgs = new double[STUDENT_COUNT];
    Scanner sc = new Scanner(System.in);
    int cnt = 0;//입력 받은 학생 수
    char con = 'y';//입력을 지속할 지 여부
    cnt = studentInformationInput(names, kors, engs, mats, tots, avgs, ranks, sc);
    studentInformationOutput(names, kors, engs, mats, tots, avgs, ranks, cnt);

    //    1. 30명 학생의 이름,국,영,수,총,평,등를 처리하는 배열을 선언
//하고 학생정보 입력 후 출력하는 코딩을 하세요.
// ( 조건 : 학생정보 입력 및 출력하는 메서드를 만들어서 코딩

//   studentInfomationOutput()
// )
  }

  private static void studentInformationOutput(String[] names, int[] kors, int[] engs, int[] mats,
                                               int[] tots, double[] avgs, int[] ranks, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
          , i + 1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
    }
  }

  private static int studentInformationInput(String[] names, int[] kors, int[] engs, int[] mats, int[] tots, double[] avgs,
                                             int[] ranks, Scanner sc) throws IOException {
    //메인 함수의 배열과 완전히 다르지만 메인 함수가 가리키는 곳과 같아서 값은 같아
    String name;
    int kor;
    int eng;
    int mat;
    int tot;
    int rank;
    double avg;
    int cnt = 0;
    char con = 'y';

    do {
      System.out.print((cnt + 1) + "번 학생 이름, 국어, 영어, 수학 입력하세요.");

      name = sc.next();
      kor = sc.nextInt();
      eng = sc.nextInt();
      mat = sc.nextInt();
      tot = kor + eng + mat;
      avg = (double) tot / 3;
      rank = 1;

      names[cnt] = name;
      kors[cnt] = kor;
      engs[cnt] = eng;
      mats[cnt] = mat;
      tots[cnt] = tot;
      avgs[cnt] = avg;
      ranks[cnt] = rank;
      cnt++;
      System.out.print("입력을 지속할 거라면 y나 Y를 입력해주세요.\n");
      con = (char) System.in.read();
      System.in.skip(System.in.available());
//    } while (con == 'Y' || con == 'y');
    } while ((Character.toUpperCase(con) == 'Y'));
    return 0;
  }


}
