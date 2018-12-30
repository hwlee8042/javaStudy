package chapter07.ch7_181230;

/*
제어자(Modifier)
1. static - 클래스의, 공통적인
: 클래스에 관계된 것이기 때문에 인스턴스를 생성하지 않고도 사용 가능
static 사용할 수 있는 곳 
- 맴버변수 
    : 공통적으로 사용되는 클래스 변수가 된다.
    : 클래스변수는 인스턴스를 생성하지 않고 사용 가능
    : 클래스가 메모리에 로드될 때 생성
- 매소드
    : 인스턴스 생성하지 않고 바로 사용가능
    : static매소드 안에서 인스턴스 변수 사용 X
2. final - 마지막의 변경될 수 없는
- 지역변수, 맴버변수 : 값을 변경할 수 없는 상수가 된다.
- 매소드 : 변경될 수 없는 매소드, 오버라이딩을 통해 재정의 X
- 클래스 : 변경 될 수 없는 클래스, 조상이 될 수 없다.

3. abstract - 추상의, 미완성의
> 매소드의 선언부만 작성하고 실제 구현부가 없는 매소드
> 클래스를 상속받아서 일부의 원하는 매소드만 오버라이딩 해도 된다.
- 클래스 : 클래스 내에 추상매서드가 선언 되어있음을 의미한다.
> 클래스 앞에 abstract가 붙으면 인스턴스를 생성하지 못한다.
- 매소드 : 선언부만 작성하고 구현부는 작성하지 않은 매소드 

* static과 abstract를 함께 사용 X 
> static매소드는 구현부가 있는 매서드에만 사용가능
* abstract 클래스와 final동시 사용 X 
> final class는 확장이 불가능한데, abstract는 상속을 통해 완성되어야하므로
* abstract매소드의 접근제어자가 private이면 X 
> 자손클래스에서 구현해야하므로 접근제어자가 private이면 자손클래스에서 접근 불가하므로
* 매소드에 private과 final을 같이 사용 X
> 접근제어자가 private인 매소드는 오버라이딩이 불가하므로 final을 쓰지 않아도 된다. 
*/

class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
        //c.NUMBER = 5; //error > 상수 변경 X
        System.out.println(c.KIND); //HEART
        System.out.println(c.NUMBER); //10
        System.out.println(c); //System.out.println(c.String());과 같다. //HEART 10
    }
}

class Card {
    final int NUMBER;       //상수지만 선언과 함께 초기화 하지 않고
    final String KIND;      //생성자에서 단 한번만 초기화 할 수 있다.
    static int width = 100;
    static int height = 250;

    Card() {
        this ("HEART", 1);
    }

    Card(String kind, int num){//매게변수가 있는 생성자로 상수 초기화
        KIND = kind; 
        NUMBER = num;
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

