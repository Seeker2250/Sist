package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject
 * @Contents
 */
public class Student {
  public String name;
  public int kor;
  public int eng;
  public int mat;
  public int tot;
  public int rank;
  public int wrank;
  public double avg;

  @Override
  public String toString() {
    return super.toString();
  }

  public void dispInfo() {
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
        , name, kor, eng, mat, tot, avg, rank, wrank);
  }
}

