package days04;

public class Ex05{
  public static void main(String[] args) {
    //index operator
    //한 학생의 국어점수를 저장할 변수 선언 -> int kor;

    //근데 만약 5000만 개가 필요하다고 가정하면
    //Array써야지
    int [] kors = new int[3];
//    field name 앞은 무조건 type이잖아 그러니까 int[]가 type인거야!
//    Array는 일단 reference type이잖아. 왜?
//    int [] kors;라고 하면 Array declare 맞지.
//    근데 kors가 그냥 field라고 해도 되는데, reference field(참조 변수)라고 하면 더 구체적이잖아.
//    그리고 그 중에서도 Array name이라고 하면 가장 구체적이지.
//    근데 array도 local field일 수 있잖아.
//    stack memory
    System.out.println(kors.length);//배열 크기
//    주의사항 : index bound 벗어나지 말 것
    kors[0] = 55;
    kors[1] = 14;
    kors[2] = 13;
    kors[3] = 99;
//    라고 하면 배열 크기를 벗어나겠지
  }
}
