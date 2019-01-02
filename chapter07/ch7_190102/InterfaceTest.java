package chapter07.ch7_190102;

/*
클래스 B의 매소드 값이 바뀌면 클래스 A의 값도 변경되는 단점이있다.
*/
class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new B());
    }
}

//클래스를 사용하는 쪽(User)
class A {
    public void methodA(B b) {
        b.methodB();
    }
}

//클래스를 제공하는 쪽(Provider)
class B {
    public void methodB() {
        System.out.println("methodB()");
    }
}