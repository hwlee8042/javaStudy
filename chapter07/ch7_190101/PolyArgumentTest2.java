package chapter07.ch7_190101;

class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer2 buyer = new Buyer2(); //사는사람 객체 생성

        //Prodcut2를 상속받은 하위클래스의 객체를 생성해서 매게변수로 넣어 준다.
        buyer.buy2(new Tv2());
        buyer.buy2(new Computer2());
        buyer.buy2(new Computer2());
        buyer.buy2(new Tv2());

        System.out.println("잔액 : " + buyer.money);
        System.out.println("남은 포인트 : " + buyer.bonusPoint);
    }
}

//상위클래스
class Product2{
    int price;//가격
    int bonusPoint;//보너스점수

    Product2(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0); //제품가격의 10% 적립
    }
}

class Tv2 extends Product2{
    Tv2(){
        super(100); // Tv2가격 100만원
    }
    public String toString(){
        return "Tv2";
    }
}

class Computer2 extends Product2 {
    Computer2(){
        super(200);//컴퓨터 가격 200만원
    }

    public String toString(){
        return "Computer2";
    }
}

class Buyer2 {
    int money = 400;//가지고 있는 돈
    int bonusPoint = 0;//보유한 Point점수

    //돈 계산 매소드 생성
    void buy2(Product2 p2){//매게변수로 Product의 참조변수를 넣으면, 해당 클래스를 상속받은 하위클래스들을 받을 수 있다.
        if(money < p2.price){
            System.out.println("잔액 부족");
            return; //else대신에 사용
        }
            money -= p2.price;
            bonusPoint += p2.bonusPoint;
            System.out.println(p2+" 구매완료");
    }
}