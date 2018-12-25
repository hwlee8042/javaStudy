package chapter06;

class TvTest4 {
    /*
    Date    : 2018-12-24
    Author  : Lee HyeWon
    */
    /*
    배열에 객체를 넣을 때는 주소값이 들어간다.
    배열 생성 후 객체를 저장하지 않으면 참조변수의 기본값인 null값으로 자동초기화 된다.
    */
    public static void main(String[] args) {
        Tv4[] tvArr = new Tv4[3];

        //Tv객체를 생성해서 Tv객체 배열의 각 요소에 저장
        for(int i=0; i<tvArr.length; i++){
            tvArr[i] = new Tv4();
            tvArr[i].channel = i + 10; //tvArr[i]의 channel에 i+10을 저장 //tvArr[] = {10, 11, 12}
        }

        for(int i=0; i<tvArr.length; i++){
            tvArr[i].channelUp(); //tvArr[i]의 매소드를 호출, 채널이 1증가 //tvArr[] = {11, 12, 13}
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}

class Tv4 {
     //Tv의 속성(멤버변수)
     String color;       //색상
     boolean power;      //전원상태(on/off)
     int channel;        //채널
 
     //Tv의 기능(매서드)
     void power() { power = !power; }    //Tv를 켜거나 끄는 기능을 하는 매서드
     void channelUp() { ++channel; }     //Tv의 채널을 높이는 기능을 하는 매서드
     void channelDown() { --channel; }    //Tv의 채널을 낮추는 기능을 하는 매서드
}