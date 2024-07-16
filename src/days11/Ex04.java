package days11;

/**
 * created by Seeker2250 on 7/15/24.
 */
public class Ex04 {
  public static void main(String[] args) {
//    java exe를 통해 class 실행, 이게 시작 개체를 찾을 것(main function이 있는 class)
//    그래서 Ex04.main()을 찾고, 프로그램 시작
//    main function close bracket 만나면 종료
//    main function call하면, parameter 주어야 하는데 그럼 이때 되는 parameter인거지
//    git도 마찬가지로 뒤에 들어가는 말들이 다 parameter일 수 있지.

    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    System.out.println("end");
  }
}
