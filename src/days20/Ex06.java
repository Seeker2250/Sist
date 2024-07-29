package days20;

/**
 * @author created by Seeker2250 on 7/26/24.
 * @Subject
 * @Contents
 */
public class Ex06 {
  public static void main(String[] args) {

    Button callButton = new Button(new CallListener());
    callButton.touch();
    Button messageButton = new Button();
    messageButton.setListener(new MessageListener());
    messageButton.touch();
  }
}
class Button{
  //field
  OnClickListener listener;

  public void setListener(OnClickListener listener) {
    this.listener = listener;
  }

  Button(){}
  Button(OnClickListener listener){
    this.listener = listener;//constructor 주입
  }

  void touch(){
    this.listener.onClick();
  }
//  중첩 인터페이스
  interface OnClickListener{
    void onClick();//abstract method
  }
}
class CallListener implements Button.OnClickListener{
  @Override
  public void onClick() {
    System.out.println("이벤트 처리");
  }
}
class MessageListener implements Button.OnClickListener{
  @Override
  public void onClick() {
    System.out.println("메시지 처리");
  }
}