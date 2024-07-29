package days21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents Ex01.java를 읽어서 Ex01Copy.java
 * FileReader FileWriter
 */
public class Ex06 {
  public static void main(String[] args) {
    String sourceFile = "/Users/junst/downloads/4일차_복습_김준석.txt";
    String copyFile = "/Users/junst/downloads/4일차_복습_김준석copy.txt";
    fileCopyBinaryStream(sourceFile, copyFile);

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

//    > 복사 처리 시간 : 14377875(ns)
    fileCopyBinaryStream(sourceFile, copyFile);
  }

  private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

    long start = System.nanoTime();

    try (FileInputStream fis = new FileInputStream(sourceFile);
         FileOutputStream fos = new FileOutputStream(copyFile)){
      int code;
      while ((code = fis.read()) != -1) {
        System.out.printf("%08d\n",Integer.parseInt(Integer.toBinaryString(code)));
        fos.write(code);
      } // while
      fos.flush();//close()가 flush가 가지고 있다. try-with-resource 안에 close가 있으니 사실 없어도 돼
      System.out.println("파일 복사 완료!!!");

      long end = System.nanoTime();
      System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end - start));
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
