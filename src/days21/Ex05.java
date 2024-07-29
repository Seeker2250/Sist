package days21;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents Ex01.java를 읽어서 Ex01Copy.java
 * FileReader FileWriter
 */
public class Ex05 {
  public static void main(String[] args) {
    String sourceFile = "./src/days21/Ex01.java";
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

    try (FileReader reader = new FileReader(sourceFile);
         FileWriter writer = new FileWriter(copyFile)) {
      int code;
      while ((code = reader.read()) != -1) {
        // System.out.printf("%c", (char)code);
        writer.write(code);
        // writer.flush();
      } // while
      writer.flush();//이거 없으면 안돼 공부해
      System.out.println("파일 복사 완료!!!");

      long end = System.nanoTime();
      System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end - start));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
