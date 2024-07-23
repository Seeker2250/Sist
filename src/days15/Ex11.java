package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject
 * @Contents
 */
public class Ex11 {
  public static void main(String[] args) {
    String parsingFile = "Hello.html";
    String docType = "html";
    Parseable parser = ParserManager.getParser(docType);
    parser.parse(parsingFile);


    System.out.println(" end ");


  }
}//class

interface Parseable {
  void parse(String fileName);// 파일명 구문 분석하는 메서드

  default void print() {
  }
}

class XMLParser implements Parseable {
  @Override
  public void parse(String fileName) {
    System.out.println("XML parsing");
  }
}

class HTMLParser implements Parseable {
  @Override
  public void parse(String fileName) {
    System.out.println("HTML parsing");
  }
}

class ParserManager {
  public static Parseable getParser(String docType) {//XML, HTML
    if (docType.equals("xml")) {
      return new XMLParser();
    } else if (docType.equals("html")) {
      return new XMLParser();
    } else return null;
  }
}
