package days22;

import java.io.File;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02_02 {
  public static void main(String[] args) {
    //      days21 directory에서 .java만 조회
    String pathName = "./src/days21/Ex01.java";
    File file = new File(pathName);
    File [] files = file.listFiles();

//    int cnt = pathName.lastIndexOf(".");
//    String ext = pathName.substring(cnt);
//    System.out.println(ext);

    int no = 1;
    for (int i = 0; i < files.length; i++) {
      File f = files[i];
      if(f.isFile()){
        String fileName = f.getName();
        if(fileName.endsWith(".java")){
//          System.out.print("%d. %s\n", no++, fileName);
        }
      }
    }
  }//main
}//class
