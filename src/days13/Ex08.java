package days13;

/**
 * @author created by Seeker2250 on 7/17/24.
 * @Subject Static keyword
 * @Contents
 */
public class Ex08 {
  public static void main(String[] args) {
//    Save s1 = new Save("김선우", 1000, 0.03);
//    Save s2 = new Save("김인경", 10000, 0.03);
//    Save s3 = new Save("김재민", 5000, 0.03);
//    Save s4 = new Save("김준석", 15000, 0.03);
//    Save s5 = new Save("박준용", 1000, 0.03);
//
//    s1.dispSave();
//    s2.dispSave();
//    s3.dispSave();
//    s4.dispSave();
//    s5.dispSave();


//    Save[] sArr = new Save[5];
////  [null]  [null] [null] [null] [null]                        [0x100]sArr이 참조
////  0x100
////  sArr[0]
//    sArr[0] = new Save("김선우", 1000, 0.03);
//    sArr[1] = new Save("김인경", 10000, 0.03);
//    sArr[2] = new Save("김재민", 5000, 0.03);
//    sArr[3] = new Save("김준석", 15000, 0.03);
//    sArr[4] = new Save("박준용", 1000, 0.03);


//                   double(이자율은 같아) 근데 이자율이 다 8byte씩 잡혀 이거 근데 instance별로 잡을 필요없잖아 그냥 참조해서 쓰면 되지
//    [name] [money] [rate] [method 뭐시기]
//    0x100
//    [name] [money] [rate] [method 뭐시기]
//    0x200
//    [name] [money] [rate] [method 뭐시기]
//    0x300
//    [name] [money] [rate] [method 뭐시기]
//    0x400
//    [name] [money] [rate] [method 뭐시기]
//    0x500
//    그래서 ratio를 class variable로 만들거야
//    Static을 붙이면 1개만 만들어져. 이건 static variable로 할거야.


//    rate가 memory에 올라가.
//    class variable 접근 : class name.static variable
//    System.out.println(rate); private이라 non visible이야

//    Class Array로 initiaazation 하면?
    Save[] sArr = {
        new Save("김선우", 1000, 0.03),
        new Save("김인경", 10000, 0.03),
        new Save("김재민", 5000, 0.03),
        new Save("김준석", 15000, 0.03),
        new Save("박준용", 1000, 0.03)
    };

//    Save.rate = 0.07;//객체가 생성되면 객체로도 rate 접근 가능
    Save.setRate(0.05);
    //원래는 instance가 1개도 안 만들러져서 안돼(method area는 초기화 필수야)
//    그래서 setter()를 만들 때 static붙여
//    class fields를 접근하기 위해서 Static 사용


    for (int i = 0; i < sArr.length; i++) {
      sArr[i].dispSave();
    }

  }
}
