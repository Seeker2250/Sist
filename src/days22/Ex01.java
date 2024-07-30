package days22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 * File class
 *    ㄴ file, directory
 */
public class Ex01 {
  public static void main(String[] args) throws IOException, ParseException {
    String pathname ="/Users/junst/SsEducation/src/days21/Ex01.java";
    File file = new File(pathname);
    System.out.println(file.getParent());
    System.out.println(file.getName());
    System.out.println(file.getPath());
    System.out.println(file.getAbsolutePath());//절대경로
    System.out.println(file.getCanonicalPath());//표준경로 : 최상위 경로로부터 최단 경로를 포함한 경로
    System.out.println(file.isFile());
    System.out.println(file.isDirectory());
    System.out.println(file.exists());//파일 존재 유무(ex 삭제할 때 존재 유무 확인 후 삭제)
    System.out.println(file.length());
    System.out.println(file.pathSeparator);//OS에서 사용하는 경로 구분자(delimiter)
    System.out.println(file.separator);//OS에서 사용하는 이름 구분자(delimiter)

//    Ex01.java
    String fileName = file.getName();

//    확장자 어제처럼 substring
//    확장자를 제외한 파일명

  }
}
