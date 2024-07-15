package days09;

import java.io.IOException;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) throws IOException {
    final int STUDENT_COUNT = 30;
    String[] names = new String[STUDENT_COUNT];
    int[] kors = new int[STUDENT_COUNT];
    int[] engs = new int[STUDENT_COUNT];
    int[] mats = new int[STUDENT_COUNT];
    int[] tots = new int[STUDENT_COUNT];
    int[] ranks = new int[STUDENT_COUNT];
    double[] avgs = new double[STUDENT_COUNT];
    String name;
    int kor;
    int eng;
    int mat;
    int tot;
    int rank;
    double avg;
    Scanner sc = new Scanner(System.in);


    int cnt = 0;//입력 받은 학생 수
    char con = 'y';//입력을 지속할 지 여부


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
    System.out.println("총 학생 수는 : "+cnt+" ");

    for (int i = 0; i < cnt; i++) {
      System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
          ,i+1, names[i], kors[i],engs[i],mats[i],tots[i],avgs[i],ranks[i]);
    }

  }//main
}//class
