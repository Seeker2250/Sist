package days17;

import java.io.FileReader;
import java.util.Arrays;

/**
 * @author created by Seeker2250 on 7/23/24.
 * @Subject
 * @Contents
 */
public class Ex06 {
  public static void main(String[] args) {
    String fileName = "./src/days17/Ex01.java";
//    대문자 A-Z 26개
//    소문자 a-z 26개
//    숫자   0-9 10개
//    막대 그래프 출력

    int [][] counts = new int[3][];//가변 배열
//    0행 대문자 0 A 65-25Z
    counts[0] = new int[26];
//    1행 대문자 0 a 97-25z
    counts[1] = new int[26];
//    2행 대문자 0 행 0-9 9
    counts[2] = new int[9];

    try(FileReader reader = new FileReader(fileName)){
//      int reader.read();//문자 코드 값이 들어갈거야
      int code;
      while((code = reader.read())!=-1){
        System.out.println(code);
        if(Character.isUpperCase((char) code)){//대문자
//          code == 65 == A
          counts[0][code - 'A']++;//받은 거에서 빼면 위치 찾아갈 거 아냐
        } else if (Character.isLowerCase((char) code)) {//소문자
          counts[1][code - 'a']++;
        }else if (Character.isDigit(code)){//숫자
          counts[2][code - '0']++;
        }
      }//while
      System.out.println(Arrays.toString(counts[0]));
      System.out.println(Arrays.toString(counts[1]));
      System.out.println(Arrays.toString(counts[2]));

//      막대 그래프
      for (int i = 0; i < counts.length; i++) {
        System.out.println("=".repeat(40));
        for (int j = 0; j < counts[i].length; j++) {
//          대문자 만들기, 소문자 만들기, 숫자 만들기
          System.out.printf("'%c' : %s(%d)\n", i==0?'A'+j:i==1?'a'+j:'0'+j ,"#".repeat(counts[i][j]), counts[i][j] );
        }
      }
    }
    catch (Exception e){

    }
  }
}
