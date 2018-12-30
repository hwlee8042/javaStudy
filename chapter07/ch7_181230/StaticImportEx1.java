package chapter07.ch7_181230;
import static java.lang.System.out;
import static java.lang.Math.*;

/*
static import문을 사용하면 static맴버를 호출 할 때 클래스 이름을 생략 할 수 있다.
java.lang 패키지는 import하지 않아도 된다.
*/
class StaticTestEx1 {
    public static void main(String[] args) {
        //System.out.println(Math.random());
        out.println(random()); 

        //System.out.println("Math.PI : " + Math.PI);
        out.println("Math.PI : " + PI);
    }
}