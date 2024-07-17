package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents access modifier는 method든 fields든 용도가 같아.
 */
public class Time {
  //  fields
  public int hour;
  protected int minute;
  int second;
  private long millisecond;//1000ms = 1초

  //  methods
  public void privateTest() {
//
    millisecond = 1423;
  }
  private void test(){

  }
}
