package days22;

import java.io.*;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02_06 {
  public static void main(String[] args) {
//    88KB
    String child = "시간표_(5강의실)(디지털컨버전스)AWS 클라우드와 Kafka를 활용한 Java(자바) Full-Stack 개발자 양성과정(E).xlsx";
//    10KB로 slice,
//    양성과정(E)_1.xlsx
//    양성과정(E)_2.xlsx ...
    String parent = "./src/days22";//path
    File file = new File(parent, child);
    System.out.println("파일 크기는 : " + file.length() + "byte입니다.");
    final int VOLUME = 10 * 1024;//10KB
    String baseName = getBaseFileName(child);//~양성과정(E)
    String ext = getExtension(child);//.xlsx
    FileOutputStream fos = null;
    BufferedOutputStream bos = null;//Input도 필요한데 try with resource에 넣으면 자동으로 close되니까 그때 하자~

    int code = 0;//1 byte 저장할 변수
    int index = 0;//순수 파일명 뒤에_1, _2, _3붙일 때 쓰자
    int i = 0;//읽어온 byte 수를 카운팅

    try (FileInputStream fis = new FileInputStream(file);//하나 만들어질 때마다 쓰기용 스트림 객체 하나씩 생겨야지(총 9개)
         BufferedInputStream bis = new BufferedInputStream(fis);) {
      while ((code = bis.read()) != -1) {
        if (i % VOLUME == 0) {
          if (i != 0) bos.close(); //파일 저장 0일 때는 제외
//         ~양성과정(E)_index.xlsx 저장
          child = String.format("%s_%d%s", baseName, ++index, ext);
          File temp = new File(parent, child);
          fos = new FileOutputStream(temp);
          bos = new BufferedOutputStream(fos);
        }
        bos.write(code);
        i++;//읽어올 때마다 1증가
      }bos.close();


    } catch (Exception e) {
      throw new RuntimeException(e);
    }


  }//main

  //  확장자를 return하는 method 이거 그냥 파일면 가져올건데 getName()써되..?
  public static String getExtension(String fileName) {
    int pos = fileName.lastIndexOf(".");
    return fileName.substring(pos);
  }

  //  확장자를 제외한 file name을 return하는 method
  public static String getBaseFileName(String fileName) {
    int pos = fileName.lastIndexOf(".");
    return fileName.substring(0, pos);
  }
}//class
