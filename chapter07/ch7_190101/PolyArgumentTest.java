package chapter07.ch7_190101;

/*
1. 조상클래스의 참조변수를 매게변수로 선언했을 경우,
해당 조상클래스의 하위클래스들을 사용할 수 있다.

2. 조상타입의 참조변수가 배열로 선언되었을 경우,
해당 클래스를 상속받은 하위클래스의 객체들을 해당 배열에 넣어 사용할 수 있다.
*/

class Product {
    int price; //제품가격
    int bonusPoint;//제품 구매 시 제공하는 보너스 점수

    //price값 받는 생성자
    Product(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
    }
}

class Tv extends Product { 
    //조상클래스의 생성자 Product(int price)를 호출한다.
    Tv() {
        super(100); //Tv가격 100만원
    }
    public String toString(){
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString(){
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(300);
    }
    public String toString(){
        return "Audio";
    }
}

//물건 사는 사람
class Buyer {
    int money = 1000;//소유금액
    int bonusPint = 0;//보너스 점수

    //조상클래스의 참조변수 배열로 선언
    Product[] item = new Product[10];
    int i = 0; //Product 배열 카운트

    //Product타입의 참조변수는 
    //Product 자손클래스의 참조변수는 어느것이나 매게변수로 받을 수 있다.
    void buy(Product p){
        if(money < p.price){
            System.out.println("잔액 부족");
            return;
        }

        money -= p.price;               //가진 돈에서 구입한 제품의 가격을 뺀다.
        this.bonusPint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
        item[i++] = p;                  //제품을 해당 배열에 저장한다.

        System.out.println("제품" + p +"를 구매하셨습니다.");
    }

    void summary() {    //구매한 물품에 대한 정보를 요약해서 보여준다.
        int sum = 0;    //구입한 물품의 가격 합산
        String itemList = ""; //물품 구입 목록

        //for문으로 물품의 가격과 구입 목록 만든다
        for(int i=0; i<item.length; i++){
            if(item[i] == null) break;
            sum += item[i].price;
            //itemList += item[i] + ", ";
            itemList += (i==0)? "" + item[i] : "," + item[i];
        }

        System.out.println("구입한 목록 : "+itemList);
        System.out.println("총 구입 가격 : "+sum);
    }
}

class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Audio());
        b.summary();

        System.out.println("현재 남은 돈은 : "+b.money);
        System.out.println("현재 보너스 점수는 : "+b.bonusPint);
    }
}