package chapter07.ch7_190102;

class DefaultMethodTest {
    public static void main(String[] args) {
        Child_D c = new Child_D();
        c.method1(); //매소드는 실제 생성된 객체를 갖고온다. //method1() in Child_D
        c.method2(); //method2() in Parent
        MyInterface.staticMethod(); //staticMethod() in MyInterface
        MyInterface2.staticMethod(); //staticMethod() in MyInterface2
    }
}

class Child_D extends Parent_D implements MyInterface, MyInterface2 {
    public void method1() {
        System.out.println("method1() in Child_D"); //오버라이딩
    }
}

class Parent_D {
    public void method2() {
        System.out.println("method2() in Parent");
    }
}

interface MyInterface {
    //추상매소드(public void method1();) 대신 default매소드 선언
    default void method1() { 
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    //추상매소드 대신에 static매소드 선언
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    //MyInterface인터페이스와 매소드명이 동일한 default매소드 선언
    // > 충돌나면 해당 인터페이스를 구현한 클래스에서 오버라이딩하면 된다.
    default void method1() {
        System.out.println("method1 in MyInterface2");
    }

    //MyInterface인터페이스와 매소드명이 동일한 static매소드 선언
    static void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}