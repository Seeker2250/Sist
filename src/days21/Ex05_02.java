package days21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents Ex01.java를 읽어서 Ex01Copy.java
 * FileReader FileWriter
 */
public class Ex05_02 {
  public static void main(String[] args) {
    String sourceFile = ".src/days21/Ex01.java";
    String copyFile = "";

    int idx = sourceFile.lastIndexOf("/");
    System.out.println(idx);
    String parent = sourceFile.substring(0, idx);
    System.out.println(parent);
    String child = sourceFile.substring(idx + 1);
    System.out.println(child);
    idx = child.indexOf(".");
    String fileName = child.substring(0, idx);
    System.out.println(fileName);
    String ext = child.substring(idx);
    System.out.println(ext);
    fileName += "Copy";

    copyFile = String.format("%s/%s%s", parent, fileName, ext);
    System.out.println(copyFile);

    fileCopyTextStream(sourceFile, copyFile);
  }

  private static void fileCopyTextStream(String sourceFile, String copyFile) {

    long start = System.nanoTime();
    final int BUFFER_SIZE = 1024;
    try (FileReader reader = new FileReader(sourceFile);
         FileWriter writer = new FileWriter(copyFile);
         BufferedReader br = new BufferedReader(reader, BUFFER_SIZE);
         BufferedWriter bw = new BufferedWriter(writer, BUFFER_SIZE)) {
//      String line;
//      while((line = br.readLine())!=null){
//        bw.write(line);//읽어온 라인 적어
//      }
      char [] cbuf = new char[BUFFER_SIZE];
      int readCharNum;
      while((readCharNum = br.read(cbuf))!=-1){//읽어온 문자 수는 readCharNum(1024로 떨어지지 않으니까), 실제 읽어온 문자는 cbuf에 저장
        bw.write(cbuf,0,readCharNum);//여기에 cbuf쓰면 짜투리 읽고 남은 거 어떡할거야? 그래서 readCharNum까지만 해야지
      }//while

      System.out.println("파일 복사 완료!!!");

      long end = System.nanoTime();
      System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end - start));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
