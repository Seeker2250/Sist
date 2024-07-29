package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents SequenceInputStream
 * 순차적 + 입력용 ByteStream(출력용은 없어)
 * 하나의 파일 용량이 너무 커서
 * 여러 개의 파일로 분리했다고 가정하면
 * 그 분리된 파일을 여러 개의 입력 스트림으로 만들고 연속적으로 그 입력 스트림을 연결해서
 * 하나의 스트림처럼 데이터를 처리할 수 있는 바이트 스트림
 * <p>
 * a_dat
 * ㄴa_1.dat
 * ㄴa.2.dat
 */
public class Ex10 {
  public static void main(String[] args) throws IOException {
    byte[] a = {1, 2, 3};
    byte[] b = {4, 5, 6};
    byte[] c = {7, 8, 9};
//   memory stream 3개
//   byte [] -> ByteArrayInputStream memory stream
    ByteArrayInputStream a_bis = new ByteArrayInputStream(a);
    ByteArrayInputStream b_bis = new ByteArrayInputStream(b);
    ByteArrayInputStream c_bis = new ByteArrayInputStream(c);

//    SequenceInputStream sis1 = new SequenceInputStream(a_bis, b_bis);
//    SequenceInputStream sis2 = new SequenceInputStream(sis1, c_bis);
//    System.out.println(sis2);
    Vector<ByteArrayInputStream> v = new Vector<>();
    v.add(a_bis);
    v.add(b_bis);
    v.add(c_bis);
    Enumeration<ByteArrayInputStream> e = v.elements();//순서 유지, 중복 허용
    SequenceInputStream sis = new SequenceInputStream(e);

//    출력
    int code = 0;
    while((code = sis.read())!=-1){
      System.out.println(code);
    }

  }
}
