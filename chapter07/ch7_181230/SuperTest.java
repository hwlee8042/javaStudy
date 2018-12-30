package chapter07.ch7_181230;

/*
super : 조상클래스로부터 상속받은 맴버를 참조할 때 사용하는 참조변수
- 상속받은 맴버와 자신의 클래스에 정의된 맴버의 이름이 같을 때는 super사용
- static에서 사용 불가
*/
class SuperTest {
    public static void main(String[] args) {
        Child c = new Child(); //Child클래스 객체 생성
        c.method(); //child의 method()호출
    }
}

class Parent {
    int x = 10;
}

class Child extends Parent { //Parent클래스를 상속바은 Child클래스
    int x = 20;
    void method() {
        System.out.println("x = "+ x); // 10 / 20
        System.out.println("this.x = "+ this.x); // 10 / 20
        System.out.println("super.x = "+ super.x); // 10 / 10
    }
}