package chapter06;

class Tv {
    /*
    Date   : 2018-12-24
    Author : Lee HyeWon 
    */
    /*
    클래스는 사물들의 설계도이며, 클래스로 사물을 만든느 과정을 인스턴스화(instantiate)라고 한다.
    객체의 구성요소는 속성(변수), 기능(매소드)를 갖고있으며, 속성과 기능을 member라고 한다.

    현재 예제는 TV라는 설계도를 인스턴스화 하는 과정이다.
    */

    //Tv의 속성(멤버변수)
    String color;       //색상
    boolean power;      //전원상태(on/off)
    int channel;        //채널

    //Tv의 기능(매서드)
    void power() { power = !power; }    //Tv를 켜거나 끄는 기능을 하는 매서드
    void channelUp() { ++channel; }     //Tv의 채널을 높이는 기능을 하는 매서드
    void channelDown() { --channel; }    //Tv의 채널을 낮추는 기능을 하는 매서드
}

class TvTest {
    public static void main(String[] args) {
        Tv t;           //Tv 클래스 타입의 참조변수 t선언 > t를 위한 공간이 마련된다. 
                        //but 인스턴스가 생성되지 않았으므로 참조변수로 아무것도 사용X
        t = new Tv();   // new에 의해 t에 인스턴스가 메모리의 빈 공간에 생성된다. > =(대입연산자) 참조변수t에는 주소값 저장
                        // color은 null로 초기화, power은 false로 초기화, chanel은 0으로 초기화
                        // 따라서, **참조변수 t가 Tv인스턴스를 참조하고 있다. > 인스턴스는 참조변수로만 다룰 수 있다.
        t.channel = 7;
        t.channelDown(); //channel = 6
        System.out.println("현재 채널은 " + t.channel + " 입니다.");
    }
}