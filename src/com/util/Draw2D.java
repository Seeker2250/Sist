package com.util;

public class Draw2D {

  public static void drawLine() {
    System.out.println("-".repeat(30));//줄 그으려고 100줄 썼다고 가정
  }

  public static void drawLine(int length) {
    for (int i = 1; i <= length; i++) {
      System.out.print("-");
    }
    System.out.println();
  }

  public static void drawLine(char style, int length) {
    for (int i = 1; i <= length; i++) {
      System.out.print(style);
    }
    System.out.println();
  }
}
