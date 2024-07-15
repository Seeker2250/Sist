package days08;

import org.w3c.dom.ls.LSOutput;

public class Ex03_03 {//출신지역 배열로 처리해보기

  public static void main(String[] args) {
//    [주민등록번호]
//    6. 검증
    String rrn = "890123-1742131";
    if (isCheckRRN(rrn)) {
      System.out.println("올바른 주민등록번호입니다.");
    } else System.out.println("잘못된 주민등록번호입니다.");

  }//main


  public static boolean isCheckRRN(String rrn) {
    int T = 0;
    int[] values = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};
    for (int i = 0; i <= 12; i++) {
//      if(i==6) continue; 이거 없어도   위에  이거 덕에 괜찮아!
      T += values[i] * (rrn.charAt(i) - '0');
    }
    int X = rrn.charAt(13) - '0';
    return X == (11 - T % 11) % 10;
//    X=(11−(2A+3B+4C+5D+6E+7F+8G+9H+2I+3J+4K+5L)mod11)mod10
//    int A = rrn.charAt(0) - '0';
//    int B = rrn.charAt(1) - '0';
//    int C = rrn.charAt(2) - '0';
//    int D = rrn.charAt(3) - '0';
//    int E = rrn.charAt(4) - '0';
//    int F = rrn.charAt(5) - '0';
//                      -
//    int G = rrn.charAt(7) - '0';
//    int H = rrn.charAt(8) - '0';
//    int I = rrn.charAt(9) - '0';
//    int J = rrn.charAt(10) - '0';
//    int K = rrn.charAt(11) - '0';
//    int L = rrn.charAt(12) - '0';
//    int X = rrn.charAt(13) - '0';
//    return X == (11 - (2 * A + 3 * B + 4 * C + 5 * D + 6 * E + 7 * F + 8 * G + 9 * H + 2 * I + 3 * J + 4 * K + 5 * L) % 11) % 10;
//    return X == (11-(2*A+3*B+4*C+5*D+6*E+7*F+8*G+9*H+2*I+3*J+4*K+5*L)%11)%10;
//    if (X == Integer.parseInt(rrn.substring(12))) {
//      return true;
//    }else return false;
//    int A = Integer.parseInt(rrn.substring(0,1));

//    AB    CD     EF - GHIJKL
//    시도   시군구  읍면동
  }
}
