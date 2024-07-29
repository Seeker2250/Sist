package days21;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 * Java IO(input + output)
 * Lambda Stream
 *
 * 컴퓨터(프로그램)<-------------------->외부 장치(다른 프로그램)
 *                     (송수신)
 * 프로그램 간 데이터를 주고받는 것 : IO
 * 데이터를 운반하는 통로가 필요
 * 두 장치를 연결해 주고 운반하는 통로 : Stream
 * Stream
 *    1 : 흐르는 물
 *    2 : 단방향
 *           읽기(입력용) Stream
 *           쓰기(출력용) Stream
 *        연속적인 데이터의 흐름
 *        Java의 모든 입출력은 Stream으로 이루어져 있어.
 *
 *   표준 입력 장치 : 키보드 -----수신-----> 프로그램 -------송신---->  모니터
 *                       입력용 Stream            출력용 Stream
 *                       System.in               System.out
 *
 *  Java Stream : 2가지 구분
 *    1) IO 단위에 따른 구분 : 문자 Stream
 *                              최상위 부모 클래스 : Reader, Writer
 *                                               File[Reader],File[Writer]
 *                                               1문자 == Unicode 2Byte == char
 *                                               1문자, String, String array 다 돼
 *
 *                         Byte Stream(실행파일, GIF 등)
 *                              최상위 부모 클래스 : InputStream, OutputStream
 *                              Properties Collection Class
 *                              File[OutputStream]
 *                              File을 binary data로 IO(days20/Ex03의 Properties예제 확인)
 *                              Java는 이진데이터 담는 타입이 없으니 1byte단위(8bit), Byte Array, int 다 돼
 *
 *      보조 스트림 : 어떤 Stream의 IO를 더 쉽도록 보조 역할을 하는 Stream
 *      File Reader reader == 생성하는 코딩;
 *      BufferedReader = br = new BufferedReader(reader);->BufferedReader가 보조 스트림
 */
public class Ex03 {
  public static void main(String[] args) {


  }//main
}//class
