package days22;

import java.io.File;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02_04 {
  public static void main(String[] args) {
    String parent = "./src/days22";
//    days22 directory dksdp upload directory의 유무 확인, 없으면 생성
    File uploadDir = new File(parent, "upload");//객체 생성
//    System.out.println(uploadDir.exists());//존재 유무 확인
    if (!uploadDir.exists()) {
//      uploadDir.mkdir(); : 상위 directory 없으면 오류 나(안 만들어지면 false)
//      uploadDir.mkdirs(); : 상위 directory 존재하지 않으면 만들고 하위까지 생성(안 만들어지면 false)
      System.out.println(uploadDir.mkdirs());
    }else {
//      directory가 있으면 upload directory 삭제
      System.out.println(uploadDir.delete());
//      uploadDir.deleteOnExit(); : 실행중인 애가 종료될 때 삭제하겠다.
    }
  }
}
