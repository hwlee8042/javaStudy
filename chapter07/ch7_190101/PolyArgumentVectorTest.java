package chapter07.ch7_190101;

import java.util.*;

/*
Array는 길이를 정해줘야하므로 Vector클래스를 사용한다.
Vector클래스는 길이가 자동으로 늘어나서 크기를 신경쓰지 않아도 되는 장점이 있다.

*Vector의 매소드
Vector()          : Vector클래스의 객체 생성
.add(Object o)    : Vector에 값을 추가할 때
.remove(Object o) : Vecotr의 값을 제거할 때
.get(int index)   : Vector의 값을 꺼낼 때
.isEmpty()        : Vector가 비어있는지 확인 할 때
.size()           : Vector의 크기(개수)가 몇 인지 반환
*/
class PolyArgumentVectorTest {
    public static void main(String[] args) {
        Buyer3 b = new Buyer3(); //구매자 생성
        Tv3 t = new Tv3();//Tv 객체생성
        Computer3 c = new Computer3();//Computer 객체생성
        Audio3 a = new Audio3();//Audio 객체생성

        b.buy3(t);//Tv사기
        b.buy3(c);//Computer사기
        b.buy3(a);//Audio사기
        b.summary3();//총합, 구매 목록
        System.out.println("computer 환불하기");
        b.refund(c);//환불내역
        b.summary3();//환불 후 총합, 구매 목록
    }
}

// 고객, 물건사는 사람
class Buyer3 {
    int moneyB3 = 1000;     //소유금액
    int bonusPointB3 = 0;;  //보너스 점수
    Vector buyVector = new Vector();// 구입한 제품을 저장하는데 Vector클래스 사용

    // buy3매소드 만들기 - 물건 샀을 때 인스턴스 변화 및 출력
    void buy3(Product3 p) {
        if(moneyB3 < p.price3){
            System.out.println("자금이 부족합니다.");
            return;
        }
        moneyB3 -= p.price3;
        bonusPointB3 += p.bonus3;
        buyVector.add(p); //vector에 값 추가할 때 add()사용한다.
        System.out.println(p +"를 구매 하였습니다.");
    }

    // refund매소드 만들기 - 환불한 내역 및 출력
    void refund(Product3 p) {
        //vector에서 값 제거할 때 > remove()
        if(buyVector.remove(p)){ 
            moneyB3 += p.price3;
            bonusPointB3 -= p.price3;
            System.out.println(p + "를 환불 하였습니다.");
        }else{//제거에 실패한 경우
            System.out.println("환불 할 물품이 없습니다.");
        }
    }

    // summary매소드 만들기 - 구매 총액, 물건 구입내역 출력
    void summary3(){
        int sum = 0;
        String itemList = "";

        //vector가 비어있는지 확인 > isEmpty()
        if(buyVector.isEmpty()){
            System.out.println("구입하신 물품이 없습니다.");
            return;
        }

        //구입한 물품 총 가격과 list만들기
        for(int i=0; i<buyVector.size(); i++){
            //vector의 객체 받을 수 있는 참조변수 선언
            Product3 p3 = (Product3)buyVector.get(i); //vector의 값 꺼낼 때 get()사용
                                            //vector의 값을 꺼내면 Object타입이므로 형변환을 잘 해줘야한다.
            sum += p3.price3;
            itemList += (i == 0)? "" + p3 : ", " + p3;
        }

        System.out.println("총금액 : " + sum +"만원 입니다.");
        System.out.println("구입 목록 : " + itemList);

    }
}

class Product3 {
    int price3 = 0; //제품가격
    int bonus3 = 0; //보너스 점수

    Product3(int price){
        price3 = price;
        bonus3 =(int)(price3 / 3.0); //3%적립
    }
}

class Tv3 extends Product3{
    Tv3(){ super(100); }
    public String toString() { return "Tv3"; }
}

class Computer3 extends Product3{
    Computer3(){ super(200); }
    public String toString() { return "Computer3"; }
}

class Audio3 extends Product3{
    Audio3(){ super(50); }
    public String toString() { return "Audio3"; }
}