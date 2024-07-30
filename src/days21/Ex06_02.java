package days21;

import java.io.*;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents Ex01.java를 읽어서 Ex01Copy.java
 * FileReader FileWriter
 */
public class Ex06_02 {
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

//    > 복사 처리 시간 : 587667(ns)
    fileCopyBinaryStream(sourceFile, copyFile);
  }

  private static void fileCopyBinaryStream(String sourceFile, String copyFile) {

    long start = System.nanoTime();

    final int BUFFER_SIZE = 1024;

    try (FileInputStream fis = new FileInputStream(sourceFile);
         FileOutputStream fos = new FileOutputStream(copyFile);
         BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
         BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
    ){
      int code;
      // 버퍼 == byte[]
      byte [] b = new byte[BUFFER_SIZE];
      int readByteNumber;

      while ( ( readByteNumber = bis.read(b) ) != -1 ) {
        //System.out.printf("%08d\n",  Integer.parseInt( Integer.toBinaryString(code) ));
        bos.write(b, 0, readByteNumber);
      } // while
      bos.flush();
      System.out.println("파일 복사 완료!!!");

      long end = System.nanoTime();
      System.out.printf("> 복사 처리 시간 : %d(ns)\n", (end-start));
    } catch (Exception e) {
      e.printStackTrace();
    }



  }

} // class