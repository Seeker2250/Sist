package days15;

/**
 * @author created by Seeker2250 on 7/19/24.
 * @Subject Singleton(GoF design pattern)
 * @Contents 유일한 객체를 만들기 위한 패턴(메모리 절약을 위해, 인스턴스 재사용을 위해)
 * 객체가 리소스를 많이 차지하는 무거운 클래스일 때 적합하다
 * DB연결 모듈이 대표적(무거움, 굳이 여러 번 할 필요 x)
 * <p>
 * constructor에 new 붙여
 */
public class Ex05 {
  public static void main(String[] args) {
//    'BoardDAO()' has private access in 'days15.BoardDAO'
//    BoardDAO dao = new BoardDAO();
    BoardDAO dao = BoardDAO.getInstance();
    System.out.println(dao.hashCode());
    dao.insert();

    dao = BoardDAO.getInstance();
    System.out.println(dao.hashCode());
    dao.select();

    dao = BoardDAO.getInstance();
    System.out.println(dao.hashCode());
    dao.delete();

  }//main
}//class

//Db connection + CRUD
class BoardDAO {   //Data Access Object
  private static BoardDAO boardDAO = null;

  //1. Singleton을 위해 private으로 생성자
  private BoardDAO() {
  }

  //  동기화 처리 object Lock(이 함수 쓰고 있으면 못 들어오게)
  public synchronized static BoardDAO getInstance() {
//    return new BoardDAO();
//    없으면 만들고, 있으면 넘겨
    if (boardDAO == null) {
      boardDAO = new BoardDAO();
    }//if
    return boardDAO;
  }//getInstance
  public void insert(){
    System.out.println("DB추가");
  }
  public void select(){
    System.out.println("DB조회");
  }
  public void update(){
    System.out.println("DB수정");
  }
  public void delete(){
    System.out.println("DB삭제");
  }
}
