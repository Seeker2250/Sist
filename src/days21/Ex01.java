package days21;

/**
 * @author created by Seeker2250 on 7/29/24.
 * @Subject
 * @Contents
 * Compiler가 클래스 변환
 * Class Direction extends Enum {
 *   static final Direction EAST = new Direction(); 이건 객체야
 * }
 */
enum Direction{EAST(100, "▶"), SOUTH(200, "▼"), WEST(300, "◀"), NORTH(400,"▲") ;

  Direction(int i, String s) {
  }

  public int getValue() {
    return value;
  }

  public String getSymbol() {
    return symbol;
  }

  private int value;
  private String symbol;
  Direction(String symbol, int value){
  }
}

public class Ex01 {
  public static void main(String[] args) {
    System.out.println(Direction.EAST);
    System.out.println(Direction.EAST.toString());//"EAST"
    System.out.println(Direction.NORTH.name());//"EAST"
    System.out.println(Direction.NORTH.ordinal());//ordinal이라는 method도, variable도 있어 name()이후에 가능
    System.out.println();

    Direction[] dirArr = Direction.values();
    for (Direction dir: dirArr
         ) {
      System.out.println( dir.name() + "/" + dir.ordinal() + "/" + dir.getSymbol()+"/" + dir.getValue());}
  }
}
