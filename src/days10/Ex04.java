package days10;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;

public class Ex04 {
  static int index = 0;
  static char con = 'y';
  static Scanner sc = new Scanner(System.in);
  static int[] m = new int[2];
  static int selectedNumber;//메뉴 선택 후 선택된 메뉴를 저장할 변수
  static String[] menus = {"추가", "수정", "삭제", "검색", "조회", "종료"};

  //      배열을 사용했을 때의 단점
//    ->Java Collection Class 사용 JCF(Java Collection Framework)
//    JDK(Java Development toolKit) JRE(JavaRuntime Environment
  public static void main(String[] args) throws IOException {

    while (true) {
      dispMenus();
      selectedMenus();
      processMenus();
    }
  }//main

  //  ENUM으로 선언할 예정
  static final int ADD = 1;
  static final int UPDATE = 2;
  static final int DELETE = 3;
  static final int SEARCH = 4;
  static final int READ = 5;
  static final int OFF = 6;

  private static void processMenus() throws IOException {
    switch (selectedNumber) {
      case ADD://추가
        add();
        break;
      case UPDATE://수정
        break;//m[index]= asdf;
      case DELETE://삭제
//        삭제할 index 주면 m[index] 사라지고, m[index+1]가 m[index]되도록
        delete();
        break;
      case SEARCH://검색
//        search();
        break;
      case READ://조회 = 배열의 모든 요소를 출력
        list();
        break;
      case OFF://종료
        exit();
        break;
    }//switch
    pause();
  }

  private static void delete() {
    System.out.println("[3] 삭제");
    int deleteIndex;
    String regex = String.format("[0-%d]", index - 1);
    //3번째 방이라고 하면 2라는 뜻이니까 0부터 2라는 뜻
    String inputData;
    do {//유효성 검사
      System.out.println("삭제할 위치를 입력하세요");
      inputData = sc.next();
    } while (!inputData.matches(regex));
    deleteIndex = Integer.parseInt(inputData);
    for (int i = deleteIndex+1; i < index; i++) {
      m[i-1] = m[i];
    }
    m[index-1] = 0;
    index--;
    System.out.println(Arrays.toString(m));
  }


  private static void pause() {
    System.out.println("enter를 치면 계속합니다.");
    try {
      System.in.read();
      System.in.skip(System.in.available());
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    System.out.println("\n".repeat(30));
  }

  private static void list() {
    System.out.println("[5] 조회");
    if (index == 0) {
      System.out.println("아직 추가된 요소가 없습니다.");
      return;
    }
    for (int i = 0; i < index; i++) {
      System.out.println("m[" + i + "]는 " + m[i] + " 입니다.");
    }
    System.out.println();
  }

  private static void add() throws IOException {
    System.out.println("[1]추가");
    do {
      if (m.length == index) {//혹은 (m[m.length - 1] != 0)
//        System.out.println("방이 다 찼습니다.");
//        return;
        increaseArrM();
      }
      System.out.println("추가할 정수를 입력하세요.");
      int n = sc.nextInt();
      m[index++] = n;

      System.out.println("계속 추가할 거라면 y나 Y를 입려하세요.");
      con = (char) System.in.read();
      System.in.skip(System.in.available());

    } while (Character.toUpperCase(con) == 'Y');

  }

  private static void increaseArrM() {
    int[] temp = new int[m.length + 3];
//    for (int i = 0; i < m.length; i++) {
//      temp[i] = m[i];
//    }
    System.arraycopy(m, 0, temp, 0, m.length);
    System.out.println(Arrays.toString(temp));
    m = temp;
  }


  private static void exit() {
//    return을 쓰면 swtich로 돌아갈거고, switch만 break 걸리겠지
//    return으로 종료하려면 main에서 써야 해
    System.out.println("프로그램을 종료합니다.");
    System.exit(-1);//process종료할 때 반할될 integer, 이걸 응용해서 뭔가 처리할 수도 있겠지
  }

  private static void selectedMenus() {
    //유효성 검사
    String regex = "[1-6]";
    String inputData;

    do {
      System.out.println("메뉴를 선택하세요");
      inputData = sc.next();
    } while (!inputData.matches(regex));

    selectedNumber = Integer.parseInt(inputData);

  }

  private static void dispMenus() {
    System.out.println("\t\t\t[메뉴]");
    for (int i = 0; i < menus.length; i++) {
      System.out.printf("[%d]%s\t", i + 1, menus[i]);
    }
    System.out.println();
  }
}//class
