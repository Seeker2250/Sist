package days21;

import java.io.*;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex12_02 {
  public static void main(String[] args) throws IOException {
    int [] score = {
//        5명 학생의 번호, 국, 영, 수
        // 번호 국 영  수
        1, 100, 90, 90,    // 4*4
        2, 70 , 90,100,
        3, 100,100,100,
        4, 70 , 60, 80,
        5, 70 , 90,100
    };
    String name = "./src/days21/score.txt";
    String mode = "rw";
    try (RandomAccessFile raf = new RandomAccessFile(name, mode)) {//mode로 읽기 or 쓰기 설정
      for (int i = 0; i < score.length; i++) {
        long fp = raf.getFilePointer();//하나하나 읽어와서
        System.out.printf("현재 파일 포인터 : %d  - [%d]\n",fp,score[i]);
        raf.writeInt(score[i]);//현재 위치 기록
      }//txt에 읽기 작업을 할거야
    } catch (Exception e) {
    }    // 일시정지 + 엔터 계속.
    System.out.println("> 엔터 치면 이어서 진행");
    System.in.read();
    System.in.skip(System.in.available());

    // 모든 학생의 번호,국,영,수 성적 정보를 출력..( score.dat )
    int no, kor, eng, mat;
    int tot;
    double avg;
    try(RandomAccessFile raf = new RandomAccessFile(name, mode)){
      int studentNum = score.length/4;
      for (int i = 0; i < studentNum; i++) {
        no = raf.readInt(); // 1
        kor = raf.readInt(); // kor
        eng = raf.readInt(); // eng
        mat = raf.readInt(); // mat
        tot = kor + eng + mat;
        avg = (double)tot/3;
        System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n",
            no, kor, eng, mat, tot, avg);
      }    System.out.println("> 엔터 치면 이어서 진행");
      System.in.read();
      System.in.skip(System.in.available());

    //txt에 읽기 작업을 할거야

      //// 문제
      //      // ㄱ. 3번 학생의 수학점수(100-> 20) 점 수정.
      //      // ㄴ. 3번 학생만 성적 정보를 출력.
      //      // 번호:3, 국어:100, 영어:100, 수학:100, 총점:300, 평균:100.00
      raf.seek(44);
      raf.writeInt(20);
      raf.seek(32);
      no = raf.readInt(); // 44
      kor = raf.readInt(); // kor
      eng = raf.readInt(); // eng
      mat = raf.readInt(); // mat
      tot = kor + eng + mat;
      avg = (double)tot/3;
      System.out.printf("번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n",
          no, kor, eng, mat, tot, avg);
    } catch (Exception e) {
    }
    try(RandomAccessFile raf = new RandomAccessFile(name, mode)){
//      4*4*2는 학생 2명 꺼 전부, +4 하면 번호 +4하면 국어 +4 하면 영어 +4 하면 수학
      int pos = 4*4*2+4+4+4;
      raf.seek(pos);
      raf.writeInt(20);

      pos = 4*4*2;
      raf.seek(pos);
    }
  }//main
}//class
