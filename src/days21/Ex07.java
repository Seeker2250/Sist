package days21;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject  Memory Stream
 * @Contents
 * 주로 다른 곳에 입출력 하기 전에 메모리 상에서 데이터를 임시로 저장할 목적으로 사용하는 Stream
 *
 * Byte Stream
 * ByteArrayInputStream, ByteArrayOutputStream
 *
 * Character Stream  안써
 * CharArrayReader / CharArray
 *
 * StringReader / StringWriter
 *
 */
public class Ex07 {
  public static void main(String[] args) {
    byte [] buf = {0,1,2,3,4,5,6,7,8,9};
    try(ByteArrayInputStream bis = new ByteArrayInputStream(buf);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ){
      int code;
      while((code = bis.read())!=-1) {
        System.out.println(code);
        bos.write(code);
      }//byte array를 bis이용해서 쓰기 bos Stream object에 가지고 있는ㄱ어ㅑ
//      이걸 굳이 bos->byte array하겠다면
      byte [] outBuf = bos.toByteArray();
      System.out.println(Arrays.toString(outBuf));
    }catch (Exception e){};
  }
}
