package chapter06;
/*
Date   : 2018-12-25
Author : Lee HyeWon
*/
/*
클래스 매서드와 인스턴스 매서드

공통된 값을 유지하거나 인스턴스 변수나 인스턴스 매소드를 사용하지 않을 때 클래스 매서드(static 매소드)를 사용할 것을 고려한다.

Math클래스에는 인스턴스 변수나 매소드가 없고, 모두 클래스 매소드이다. 따라서 필요한 값을 모두 매게변수 처리를 한다.
*/
class MyMathTest2 {
    public static void main(String[] args) {
        //클래스매소드 호출, 인스턴스 생성없이 호출 가능
        System.out.println(MyMath2.add(200L, 100L));
        System.out.println(MyMath2.subStract(200L, 100L));
        System.out.println(MyMath2.multiply(200L, 100L));
        System.out.println(MyMath2.devide(200.0, 100.0));

        MyMath2 mm = new MyMath2(); //인스턴스 생성
        mm.a = 200L;
        mm.b = 100L;
        //인스턴스 매소드는 객체생성 후에만 호출이 가능함.
        System.out.println(mm.add());
        System.out.println(mm.subStract());
        System.out.println(mm.multiply());
        System.out.println(mm.devide());
    }
}
class MyMath2 {
    long a, b;

    static long add(long a, long b) { return a + b; }
    static long subStract(long a, long b) { return a - b; }
    static long multiply(long a, long b) { return a * b; }
    static double devide(double a, double b) { return a / b; }

    //인스턴스 변수 a,b만을 이용해서 작업하므로 매게변수가 필요 없다.
    long add() { return a+b; } //a,b는 인스턴스변수
    long subStract() { return a-b; }
    long multiply() { return a*b; }
    double devide() { return a/b; }
}