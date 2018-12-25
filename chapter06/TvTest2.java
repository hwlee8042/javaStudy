package chapter06;

class Tv2{
    /*
    Date    : 2018-12-24
    Author  : Lee HyeWon
    */
    /* 
    인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스이 타입과 일치해야한다.
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

class TvTest2 {
    public static void main(String[] args) {
        Tv2 t1 = new Tv2();   //Tv t1; t1 = new Tv(); 를 한 문장으로 가능
        Tv2 t2 = new Tv2();   // t1과 t2는 참조하는 class는 같지만 서로 다른 주소값을 갖는 참조변수가 된다.
        System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");

        t1.channel = 7; // channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        
        System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
    }
}