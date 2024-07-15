package days10;

public class Ex04_02 {
  public static void main(String[] args) {
    int[] m = new int[3];

    int[] temp = new int[m.length + 3];
    for (int i = 0; i < m.length; i++) {
      temp[i] = m[i];
    }
    m = temp;


  }
}
