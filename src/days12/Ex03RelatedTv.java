package days12;

/**
 * created by Seeker2250 on 7/16/24.
 */

public class Ex03RelatedTv {
  public int age = 10;

  public static void main(String[] args) {
//    member fields는 access modifier 안돼 public int age = 10;

//    Array
    int[] m = null;//stack memory에 주소를 기억할 공간이 생겨 이 이름이 m, 주소값을 참조중인 변수지
//    그래서 m은 reference variable, 근데 null로 초기화 한 상태에서는 아직 기억공간 안 만들어짐
    m = new int[3];
//    이때 기억공간 생겨

//    member fields는
//    [type] [name]
//    type이 Tv가 될 수 있지
    Tv t1;//이땐 변수만 만들어지고 아직 안 실체화 되지 않았어(object)

//    type이 class니까 object, 그리고 t1은 reference variable인 것.
//    object : class를 type으로 둔 참조 변수
//    instance : new constructor로 heap area에 할당한 것

    t1= new Tv();//이게 instantiate(인스턴스화) 혹은 객체 생성이라고 함, instance는 생성된 object
//    기억공간에 [power]라고 하는 boolean형 기억공간, [channel]라고 하는 int형 기억공간, [color]라고 하는 기억공간이 생기는거야.
//    함수코드에 power()가 올라가, channelUp, channelDown() 전부 메모리 상에서 올라가.
//    method의 주소값들이 참조되고 있어
//    [power] [channel] [color] [power()] [channelUp] [channelDown]이 기억공간들이 다 생긴 게 instance
//    [power] [channel] [color] [power()] [channelUp] [channelDown]들을 참조한    [0x200]따위의 주소가 객체, t1

//    만약 여기서
//    t1 = new Tv();하면 instance는 두 개인데 object는 1개가 돼
//    그리고 참조하는 주소는 하나인데 instance만 두 개이므로 똑같은 것처럼 보이지만 memory에서는 달라

//  사과나무 class, 바구니 object, 사과 instance
//  사과 여러 개 따와서 바구니 하나일 수 있어.

//    instance에 할당된 memory에 접근하려면 object.field 혹은 object.method()
    t1.power();
    System.out.println(t1.power?"켜짐상태":"꺼짐 상태");
    t1.channel = 10;
    System.out.println(t1.channel);
    t1.channelUp();
    System.out.println(t1.channel);
    t1.channelDown();
    System.out.println(t1.channel);
    t1.power();
    System.out.println(t1.power?"켜짐상태":"꺼짐 상태");
  }
}
