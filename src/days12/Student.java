package days12;

/**
 * @author created by Seeker2250 on 7/16/24.
 * @Subject
 * @Contents
 */
public class Student {
//  fields(instance variable)
  public String name;
  public int kor;
  public int eng;
  public int mat;
  public int tot;
  public int rank;
  public double avg;

//  method
  public void dispInfo() {
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
        , name, kor, eng, mat, tot, avg, rank);
  }
}
