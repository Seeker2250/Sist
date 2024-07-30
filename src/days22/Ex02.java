package days22;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents
 */
public class Ex02 {
  public static void main(String[] args) {
    String currentDirectory = System.getProperty("user.dir");
    System.out.println(currentDirectory);
//    /Users/junst/SsEducation
    File parent = new File(currentDirectory);
    System.out.println(parent.isDirectory());//true
//    하위 directory가 뭐가 있고 파일이 뭐가 있는지 확인
//    parent.list(); : String [] return
//    parent.list(filter); : 필터링 된 하위 directroy + 파일 목록을 String []로 return
//    parent.listFiles() : File []을 return
//    parent.listFiiles(filter); : 필터링 된 하위 directroy + 파일 목록을 File []로 return


//    String [] list = parent.list();
//    for (int i = 0; i < list.length; i++) {
////      System.out.println(list[i]);
//      File child = new File(parent, list[i]);
//      System.out.print(list[i] +"/");
//    System.out.println(child.isDirectory()?"directory":child.isFile()?"file":"이건 뭐지?");
//    }

    File[] list = parent.listFiles();
    for (int i = 0; i < list.length; i++) {
      File child = list[i];
      String name = child.getName();
      long ms = child.lastModified();
      Date d = new Date(ms);
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm");

      System.out.printf("%s\t%s\t%s\t%d\t\n", child.isFile() ? "File" : "Directory", name, sdf.format(d), child.length());
    }
  }
}
