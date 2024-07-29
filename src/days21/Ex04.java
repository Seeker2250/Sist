package days21;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents txt -> 문자 stream
 * file + 문자 스트림 = FileReader, FileWriter
 * [File Class]
 * file + directory를 다루는 여러 기능이 구현된 class
 * (생성, 삭제, 정보, 파일명 변경 등)
 */
public class Ex04 {
  public static void main(String[] args) throws ParseException {
//    String parent="./src/days21";
    File parent = new File("./src/days21");
    String child = "Ex01.java";

    File file = new File(parent, child);
    System.out.println(file.length() + "byte입니다.");

    System.out.println(file.isDirectory() + "/ : /" + file.isFile());

    long ms = file.lastModified();

//    LocalDateTime dt = LocalDateTime.of();
    Date d = new Date(ms);
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
    System.out.println(sdf.format(ms));

    try (FileReader reader = new FileReader(file)) {//file 객체는 close 안하면 다음에는 열려있는데 어떡할 거냐고 물어봄. 반드시 close해 줄 것
      int code;
      while ((code = reader.read()) != -1) {
        System.out.printf("%c",(char)code);
      }

    } catch (Exception e) {

    }

  }//main
}//class
