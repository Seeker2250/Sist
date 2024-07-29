package days20;

import java.io.FileWriter;
import java.util.Properties;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 * Map : Hashtable, HashMap, TreeMap, SortedMap, Properties 컬렉션 클래스
 * 1. Hashtable<String><String> == Properties
 * 2. key + value = entry
 * 3. 환경 설정값들을 파일로 저장 / 읽기
 *                            put() / get()
 *                            setProperties() / getProperties()
 * 4. 저장되는 파일 확장자 : .properties
 *    store(), storeToXML()
 *    load()로 읽어
 *
 * 아래는 Properties 예제
 * key(String) value(String) -> Map
 * setProperty() / getProperty -> p 객체에 저장
 *
 * 파일(.properties) 저장
 * p.store(FileWriter, comment)
 * p.storeXML(FileOutputStream, comment)
 *
 */
public class Ex03 {
  public static void main(String[] args) {
    // 예) DBMS(오라클) + Java 연동 ( DB 연결 설정 정보 )
    String className = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:xe";
    String user = "scott";
    String password = "tiger";

    Properties p = new Properties();
    p.setProperty("className","oracle.jdbc.driver.OracleDriver");
    p.setProperty("url","jdbc:oracle:thin:@localhost:1521:xe");
    p.setProperty("user","scott");
    p.setProperty("password","tiger");

    String fileName = "./src/days20/jdbcConfig.properties";//java에서 db 연결하는 설정값
//    FileReader 읽을 때
//    FileWriter 입력할 때
    try (FileWriter writer = new FileWriter(fileName)){
//      p.store(writer,"jdbc configuration example");//저장할 때 writer 사용

      System.out.println("save end");
    } catch (Exception e) {
      e.printStackTrace();
    }

  }//main
}//class
