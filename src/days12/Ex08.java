package days12;

/**
 * created by Seeker2250 on 7/16/24.
 *
 * @subject Object(Class) Array
 * @Contents class array 주의사항
 */
public class Ex08 {
  public static void main(String[] args) {
    Point[] points = new Point[1000];//Class type의 Array 선언
//  Array니까 다 null 들어가있지.
//  Class Array 사용할 때 주의사항
    points[0] = new Point();//초기화 안해주면 null pointer exception
    points[0].x = 10;
    points[0].y = 20;
    points[0].dispPoint();
  }//main
}//class
