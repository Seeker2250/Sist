package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.MessageFormat;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex08_02 {
  public static void main(String[] args) {
    String fileName = "./src/days21/student.txt";
    try (FileReader r = new FileReader(fileName);
         BufferedReader br = new BufferedReader(r)) {
//홍길동,98,57,100,255,85.000000,true
      String info = br.readLine();
      String pattern = "{0},{1},{2},{3},{4},{5},{6}";
      MessageFormat mf = new MessageFormat(pattern);


//      Object [] objs = mf.parse(info);//object []이야
//      for (Object asdf: objs) {
//        System.out.println(asdf);
//      }
//    } catch (Exception e) {
//      throw new RuntimeException(e);
//    }
      Object[] datas = mf.parse(info);// class casting exception 주의할 것
      String name = (String) datas[0];//String이 down casting이 가능하잖아 그래서 String으로
      // (down casting은 이미 up casting 된 것만 down casting)
      int kor = Integer.parseInt((String) datas[1]);//int는 안되니까 String으로 바꿔서 int로
      int eng = Integer.parseInt((String) datas[2]);
      int mat = Integer.parseInt((String) datas[3]);
      int tot = Integer.parseInt((String) datas[4]);
      double avg = Double.parseDouble((String) datas[5]);
      boolean gender = Boolean.parseBoolean((String) datas[6]);

      System.out.printf("%s %d %d %d %d %f %b\n"
          , name, kor, eng, mat, tot, avg, gender);

    } catch (Exception e) {

    }

  }//main
}//class
