package days16;

/**
 * @author created by Seeker2250 on 7/22/24.
 * @Subject
 * @Contents    문자열 다루는 class들
 *              1. String
 *              2. StringBuffer
 *              3. StringBuilder
 *              4. StringTokenizer
 */
public class Ex05 {
  public static void main(String[] args) {
    String name = "김준석";//name 은 주소값 가지고 있는거야 reference variable이잖아
    name += "님";
    name += " 안녕하세요:)";
    System.out.println(name);

//    String -> class
    String name2 = new String("김준석");//이게 맞잖아!

//    두 문자열 비교는 equals(), equalsIgnoreCase()
    System.out.println(name.length());//공백 포함
    System.out.println(name.charAt(5));
    System.out.println(name.substring(0,5));
    System.out.println(name.repeat(3));
    System.out.println(name.trim());
//    System.out.println(name.split(regex));
    System.out.println("abD".toLowerCase());
    System.out.println("abD".toUpperCase());
    System.out.println(name.toCharArray());

    String msg = String.format("%s님 %d살", "이름", 20);//class method, static
    System.out.println(msg);
    //name.chars()//String -> IntStream
    System.out.println(name.compareTo(msg));//equals()는 boolean을 return
//    두 문자열이 같으면 compareTo는 0이 나와.
//    첫 문자열 첫 값 두 번째 문자열 첫 값 비교, 2->2, 3->3... Unicode로 차이 나와(양수든 음수든)

//    name이라는 문자열 속에 "석"이라는 문자열 포함 유무 확인
    System.out.println(name.contains("석"));
// name 문자열 속에 "석" 몇 번째에 있냐, 없으면 -1
    System.out.println(name.indexOf("석"));
// 똑같은데 마지막부터 찾는 거(index값은 같아)
    System.out.println(name.lastIndexOf("석"));
  }
}
