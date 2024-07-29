package days21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.stream.Stream;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 */
public class Ex07_02 {
  public static void main(String[] args) throws IOException {
    String content = "package days21;\n" +
        "\n" +
        "/**\n" +
        " * @author created by Seeker2250 on 7/29/24.\n" +
        " * @Subject\n" +
        " * @Contents\n" +
        " * Compiler가 클래스 변환\n" +
        " * Class Direction extends Enum {\n" +
        " *   static final Direction EAST = new Direction(); 이건 객체야\n" +
        " * }\n" +
        " */\n" +
        "enum Direction{EAST(100, \"▶\"), SOUTH(200, \"▼\"), WEST(300, \"◀\"), NORTH(400,\"▲\") ;\n" +
        "\n" +
        "  Direction(int i, String s) {\n" +
        "  }\n" +
        "\n" +
        "  public int getValue() {\n" +
        "    return value;\n" +
        "  }\n" +
        "\n" +
        "  public String getSymbol() {\n" +
        "    return symbol;\n" +
        "  }\n" +
        "\n" +
        "  private int value;\n" +
        "  private String symbol;\n" +
        "  Direction(String symbol, int value){\n" +
        "  }\n" +
        "}\n" +
        "\n" +
        "public class Ex01 {\n" +
        "  public static void main(String[] args) {\n" +
        "    System.out.println(Direction.EAST);\n" +
        "    System.out.println(Direction.EAST.toString());//\"EAST\"\n" +
        "    System.out.println(Direction.NORTH.name());//\"EAST\"\n" +
        "    System.out.println(Direction.NORTH.ordinal());//ordinal이라는 method도, variable도 있어 name()이후에 가능\n" +
        "    System.out.println();\n" +
        "\n" +
        "    Direction[] dirArr = Direction.values();\n" +
        "    for (Direction dir: dirArr\n" +
        "         ) {\n" +
        "      System.out.println( dir.name() + \"/\" + dir.ordinal() + \"/\" + dir.getSymbol()+\"/\" + dir.getValue());}\n" +
        "  }\n" +
        "}\n";
//    문제 : Ex01.java의 21번 line의 문자열을 String line21이란 변수에 저장 후 출력


//    int cnt = 0;
//    try (BufferedReader br = new BufferedReader(new FileReader("./src/days21/Ex01.java"))) {
//      String line;
//      while ((line = br.readLine()) != null) {
//        cnt++;
//        if(cnt==21) System.out.println(line);
//    }//while
//    } catch (IOException e) {
//      throw new RuntimeException(e);
//    }

//    (1) 풀이
//    String [] datas = content.split("\n");
//    String line21 = datas[20];
//    System.out.println(line21);

//    (2)풀이
//    Memory Stream

//    StringReader reader = new StringReader(content);
//    BufferedReader br = new BufferedReader(reader);
//    for (int i = 0; i < 20; i++) br.readLine();//20번까지 버리는거야
//    String line21 = br.readLine();
//    System.out.println(line21);

//    (3)풀이
//    String [] -> Stream<String>
//    20라인 스킵->21라인 출력
//    String line21 = Stream.of(content.split("\n")).skip(20).findFirst().get();//Stream이 돼서 써먹는거야->이건 Optional<String>가져와
//    System.out.println(line21);

  }//main
}//class
