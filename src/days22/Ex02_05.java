package days22;

import java.io.File;
import java.io.IOException;


/**
 * @author created by Seeker2250 on 7/30/24.
 * @Subject
 * @Contents https://needjarvis.tistory.com/742 lambda & stream으로 만들 때 참고
 */
public class Ex02_05 {
  public static void main(String[] args) throws IOException {
//    days22
//       ㄴ temp
//            ㄴ a.txt file
//            ㄴ b.txt file
//            ㄴ subtemp directory
//                   ㄴ c.txt file

//    String pathname = "./src/days22/temp/subtemp";
//    File file = new File(pathname);
//    file.mkdirs();
//
//    File atxt = new File("./src/days22/temp/a.txt");
//    atxt.createNewFile();
//    File btxt = new File("./src/days22/temp/b.txt");
//    btxt.createNewFile();
//    File ctxt = new File("./src/days22/temp/subtemp/c.txt");
//    ctxt.createNewFile();

    String pathname = "./src/days22/temp";
    File f = new File(pathname);
//    if(f.exists()){
//      System.out.println(f.delete());
//      하위 디렉토리, 안의 파일들이 없어야 삭제할 수 있다.
//      재귀함수 만들어

//    deleteFolder(pathname);
    scanDelete(f);
    f.delete();
    System.out.println(f.getName() + " 폴더 삭제");
  }//main

  public static void scanDelete(File f) {
    File[] files = f.listFiles();

    for (File file : files) {
      if (file.isFile()) {
        file.delete();
        System.out.println(file.getName() + " 파일 삭제");
      } else {
        scanDelete(file.getAbsoluteFile());
        file.delete();
        System.out.println(file.getName() + " 폴더 삭제");
      }
    }
  }


//  public static void deleteDirectory(File directory) {
//    if (directory.exists() == true) {
//      if (directory.isDirectory() == true) {
//        deleteDirectory(directory);
//      }//isDrectory if
//      else if (directory.isFile() == true) {
//        deleteFile(directory);
//      }// isFile if
//    }//exists if
//    else directory.delete();
//  }//method
//
//  public static void deleteFile(File f) {
//    f.delete();
//  }

//  public static void deleteFolder(String path) {
//
//    File folder = new File(path);
//    try {
//      if (folder.exists()) {
//        File[] folder_list = folder.listFiles();
//
//        for (int i = 0; i < folder_list.length; i++) {
//          if (folder_list[i].isFile()) {
//            folder_list[i].delete();
//            System.out.println("파일이 삭제되었습니다.");
//          } else {
//            deleteFolder(folder_list[i].getPath());
//            System.out.println("폴더가 삭제되었습니다.");
//          }//if-else
//          folder_list[i].delete();
//        }//for
//        folder.delete(); //폴더 삭제
//      }//if
//    } catch (Exception e) {//try
//      e.getStackTrace();
//    }//catch
//  }
}//class
