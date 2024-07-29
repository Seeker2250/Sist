package days19;

import java.util.*;

/**
 * @author created by Seeker2250 on 7/25/24.
 * @Subject
 * @Contents Map
 * Key : Value
 * key 중복 x value 중복 o
 * HashMap    (신규), 사용 권장
 * HashTable  (구)
 * <p>
 * Hashing : Hash Function을 이용하여 데이터를 Hash Table에 저장하고 검색하는 기법
 * Hash Function : 데이터가 저장된 곳을 알려주는 Function
 * -> 데이터를 빠르게 검색할 수 있음(검색용)
 * Hashing 사용해서 많은 데이터를 검색할 때 성능이 뛰어나
 */
public class Ex12_02 {
  public static void main(String[] args) {
    Hashtable<String, String> hm = new Hashtable<>();
    hm.put("admin", "관리자");
    hm.put("hong", "홍길동");
    hm.put("adsf", "냐미");
    System.out.println(hm);

    hm.entrySet();//entry 갯수 얻어와~!
    Set<Map.Entry<String, String>> es = hm.entrySet();
    Iterator <Map.Entry<String, String>> ir = es.iterator();
    while (ir.hasNext()){
      Map.Entry<String, String> entry =  (Map.Entry<String, String>) ir.next();
      System.out.printf("%s==%s\n",entry.getKey(), entry.getValue());
    }

//    System.out.println(hm.size());//entry 갯수
//
////    모든 key 조회
//    System.out.println(hm.keySet());//Set으로 return(중복 방지)
//    System.out.println(hm.values());
//
//    Set<String> keys = hm.keySet();
//    Iterator<String> ir = keys.iterator();
//    while (ir.hasNext()){
//      String key = ir.next();
//      System.out.printf("%s == %s \n",key, hm.get(key));//hm.get(key)으로 value 같이 가져와
//    }
////    hm.get(keys);
//
//    Collection<String> values = hm.values();
//    Iterator<String> ir2 = values.iterator();
//    while (ir2.hasNext()){
//      String key = ir2.next();
//      System.out.printf("%s \n",values);
//  }
  }//main
}//class
