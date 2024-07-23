package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject   정규표현식 prefix / suffix
 * @Contents
 */
public class Ex05_03 {
  public static void main(String[] args) {
    String[] urlArr = {
        "www.naver.com",
        "http://www.naver.com",
        "http://www.sist.co.kr",
        "https://www.daum.net"
    };
//    String regex = "^http://";// ^는 이 놈으로 시작해야 한다는 의미
    String regex = ".com$";// $는 이 놈으로 끝나야 한다는 의미
    for (int i = 0; i < urlArr.length; i++) {
//      if (urlArr[i].startsWith("http://"))
      if (urlArr[i].endsWith(".com"))
        System.out.println(urlArr[i]);
    }
  }
}
