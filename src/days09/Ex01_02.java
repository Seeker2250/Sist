package days09;

import java.util.Calendar;
import java.util.Date;

public class Ex01_02 {
  public static void main(String[] args) {
//    1) 첫 요일이 무슨 요일인지 가져와야 해!
//    2) 마지막 날짜가 언제까지 있는지 가져와야 해!

//    Calendar Class 사용
    Calendar c = Calendar.getInstance();
    c.set(2020, 5 - 1, 1);//월은 -1 해야해(Date 객체로 변환될 때 필요해)
    Date d = new Date(c.getTimeInMillis());
    System.out.println(c.toString());
    c.get(Calendar.DAY_OF_WEEK);//요일 가져와
    System.out.println(c.get(Calendar.DAY_OF_WEEK));
    int lastDay = c.getActualMaximum(Calendar.DAY_OF_MONTH);
    System.out.println(lastDay);


//    Date Class사용
//    Date d = new Date(2022-1900,7-1,1);//현재 날짜 알려면 1900년을 빼고 1월을 빼야 해 1900년 기준
////    그러므로 지금 이건 7월이 되는거지
//    System.out.println(d.toLocaleString());//사라질 예정인 method, 날짜와 시간 정보를 가지고 있어
//    int dayOfWeek = d.getDay();
//    System.out.println(dayOfWeek);//4니까 01234 -> 일월화수목 이니까 맞아
//
//    d.setMonth(d.getMonth()+1);//월을 내가 설정할거야, 1달 증가(8월이 되는거야)
//    System.out.println(d.toLocaleString());
//    d.setDate(d.getDate()-1);//다음달에서 1일 뺐더니 마지막이야
//    System.out.println(d.toLocaleString());//전체 시간 확인
//    System.out.println(d.getDate());//마지막 날만 가져와!


  }//main
}//class
