package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02_03 {
  public static void main(String[] args) {
    String pathName = "./src/days21";
    File parent = new File(pathName);
    String keyword = "DataInputStream";
//    Line Text Path 출력
    File[] lists = parent.listFiles(((dir, name) -> name.endsWith(".java")));
    File child = null;
    int line = 1;
    String strLine = null;
    String text = null;
    String path = null;
    String fileName = null;
    for (int i = 0; i < lists.length; i++) {
      child = lists[i];
      fileName = child.getName();
      line = 1;
        try(FileReader reader = new FileReader(child);
            BufferedReader br = new BufferedReader(reader)
        ){
          while ((strLine = br.readLine())!=null){
            if(strLine.contains(keyword)){
              strLine = strLine.replaceAll(keyword, "<span style='color:red'>"+keyword+"</span>");
              System.out.printf("%d \t %s \t %s \n", line, strLine, fileName);
            }//if
            line++;
          }//while
        }//try
      catch (Exception e) {
        throw new RuntimeException(e);
      }//catch
    }
  }//main
}//class
