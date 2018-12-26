package chapter07.ch7_181226;

/*
Date    : 2018-12-26
Author  : Lee HyeWon    
*/
/*
상속받은 하위클래스는 상위클래스의 생성자나 초기화블럭을 제외한 맴버들은 모두 상속 받으며
하위클래스에서는 상속받은 맴버들 뿐만 아닌 추가적으로 기능을 더 만들 수 있으므로 extends(확장하다)라는 단어가 쓰인다.

상위클래스(부모클래스)에 하위클래스(자손클래스)에서 사용되어야 하는 공통적인 맴버들을 정의해둔다면,
상속받은 하위클래스들에서 사용 할 수 있으므로 클래스들 간의 상속관계를 적절하게 맺어주는 것이
객체지향 프로그래밍에서 중요하다.
*/
class Tv{
    boolean power;  //전원상태(on/off)
    int chanel;     //채널

    void power(){ power = !power; }
    void channelUp(){ ++chanel; }
    void channelDown(){ --chanel; }
}

class CaptionTv extends Tv{
    boolean caption;    //캡션상태(on/off)
    void displayCaption(String text){
        if(caption){ //캡션상태가 on(true)일때만 text를 보여준다.
             System.out.println(text);
        }
    }
}

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv(); //Tv상속받은 하위클래스 CaptionTv객체 생성 > 따라서, Tv와 CaptionTv의 맴버는 모두 사용 가능
        ctv.chanel = 10;    //조상클래스로부터 상속받은 맴버
        ctv.channelUp();    //조상클래스로부터 상속받은 맴버
        System.out.println(ctv.chanel);

        ctv.displayCaption("Hello, World"); //if문으로 실행 X
        ctv.caption = true;                 //캡션기능을 켠다
        ctv.displayCaption("Hello, World2"); //캡션을 화면에 보여준다.
    }
}