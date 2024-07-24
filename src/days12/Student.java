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

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", kor=" + kor +
        ", eng=" + eng +
        ", mat=" + mat +
        ", tot=" + tot +
        ", rank=" + rank +
        ", avg=" + avg +
        '}';
  }
  public Student(){};

  public Student(String name, int kor, int eng, int mat, int tot, int rank, double avg) {
    this.name = name;
    this.kor = kor;
    this.eng = eng;
    this.mat = mat;
    this.tot = tot;
    this.rank = rank;
    this.avg = avg;
  }

  //  method
  public void dispInfo() {
    System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n"
        , name, kor, eng, mat, tot, avg, rank);
  }
}
