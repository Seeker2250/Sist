package days19;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents
 */
public class Test {

    public static void main(String[] args) {
      solution(1,2,3,4);

    }

    public static int [] solution(int numer1, int denom1, int numer2, int denom2) {
      int[] answer = new int[2];
      int a2 = (numer1 * denom2);
      int c2 = (numer2 * denom1);
      int b2 = (denom1 * denom2);
      int d2 = (denom2 * denom1);
      int mol=0;
      if (denom1 != denom2) {
        a2 = (numer1 * denom2);
        c2 = (numer2 * denom1);
        b2 = (denom1 * denom2);
        d2 = (denom2 * denom1);
        mol = a2 + c2;
        for (int i = 2; i < b2; i++) {
          if (mol % i == 0 && b2 % i == 0) {
            mol = mol / i;
            b2 = b2 / i;
          } // if
        } // for
      }
      answer[0]= mol;
      answer[1]=b2;


      return answer;
    }

  }//class

