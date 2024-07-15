package days05;

public class Ex02 {
  public static void main(String[] args) {
    //for ( type elements: array 혹은 collection) {

   // }
//
//    String [] names = new String[3];
//    names[0] = "홍길동1";
//    names[1] = "홍길동1";
//    names[2] = "홍길동1";
//
//    Array Initialize 방법
//    (1)
//    String [] names = new String[]{
//        "김준석1", "김준석2", "김준석3"
//    };
//    (2)
    String [] names = {
        "김준석1",
        "김준석2",
        "김준석3"
    };//이것도 똑같아

    for (String anyIdentifier: names ) {
      System.out.println(anyIdentifier);
    }


  }
}
