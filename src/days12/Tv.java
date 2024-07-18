package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */
public class Tv {
//   member(elements)
//      ㄴmember variable(field) - property == feature
//         ㄴaccess modifier, modifiers, type, field name(initialized value)
//  local variable은 initialization 없이 못 써
  public boolean power;
  public int channel = 1;
  public String color = null;
//  member function == method == function

  public void power() {
    power = !power;
  }

  public void channelUp() {
    channel++;
  }

  public void channelDown() {
    channel--;
  }
}
