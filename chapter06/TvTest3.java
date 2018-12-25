package chapter06;

class Tv3 {
    /*
    Date    : 2018-12-24
    Author  : Lee HyeWon
    */
    /* 
    같은 클래스로부터 생성되었을 지라도 각 인스턴스의 속성(맴버변수)는 서로 다른값을 유지할 수 있다.

    하나의 참조변수로 2개의 인스턴스는 참조 X
    참조변수에는 주소값 1개만 저장이 가능하므로, 여러개의 참조변수가 하나의 인스턴스를 참조하는 것은 가능 O 
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

class TvTest3 {
    public static void main(String[] args) {
        Tv3 t1 = new Tv3();
        Tv3 t2 = new Tv3();
        System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");

        t2 = t1;        // t1이 저장하고 있는 주소값을 t2에 저장한다.
                        //t2가 갖고 있던 값 일허어버리고, t1에 저장되어있던 값 t2에 저장
                        //따라서, t2가 갖고있던 값은 참조하지 못하게 된다.(Garbate Collector로 자동적으로 메모리에서 삭제)
        t1.channel = 7; // channel 값을 7로 한다. 
                        //t1과 t2가 같은 인스턴스를 가르키고 있어 t1, t2모두 channel은 7이 된다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        
        System.out.println("t1의 channel값은 "+ t1.channel + "입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel + "입니다.");
    }
}