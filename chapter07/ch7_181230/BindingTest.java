package chapter07.ch7_181230;

/*
참조변수와 인스턴스의 연결
★ 참조변수의 타입이 참조변수가 참조하고 있는 인스턴스에서 사용할 수 있는 맴버의 개수를 결정한다.
* 상위클래스에서 선언된 변수를 하위클래스에서 같은 이름의 변수나 매소드를 사용할때
  > 변수는 참조변수의 타입을 따라간다.
  > 매서드는 실제 인스턴스타입에 정의된 매서드가 호출된다.
*/
class BindingTest {  
    public static void main(String[] args) {
        Parent1 p = new Child1();
        Child1 c = new Child1();

        System.out.println("p.x = " + p.x); //변수는 참조변수 타입을 따라간다. > p.x = 100
        p.method(); //매소드는 실제 인스턴스 타입에 정의된 매소드가 호출 > Child Method

        System.out.println("c.x = " + c.x); //c.x = 200
        c.method(); // Child Method
    }
}

class Parent1 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

//Child1에 구현부가 없게 되면 Parent1 Class의 맴버들이 호출 된다.
/* class Child1 extends Parent1 { } */

class Child1 extends Parent1 {
    int x = 200;

    void method() {
        System.out.println("Child Method");
    }
}