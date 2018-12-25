package chapter06;

public class MyMathTest {
    /*
    Date   : 2018-12-24
    Author : Lee HyeWon
    */
    /*
    매소드란? 특정 작업을 수행하는 일련의 문장들을 하나로 묶는 것
    - 사용이유
    1. 높은 재사용성
    2. 중보 코드 제거
    3. 프로그램 구조화(각 기능별로 매소드 만들기)

    매서드의 구현부의 들어가는 매게변수는 모두 지역변수이다.
    */
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L); //자동 형변환이 가능한 인자값을 보내면 error X

        System.out.println("add(5L,3L) " + result1);
        System.out.println("substract(5L,3L) " + result2);
        System.out.println("multiply(5L,3L) " + result3);
        System.out.println("divide(5L,3L) " + result4);
    }
}

class MyMath {
    long add(long a, long b){
        long result = a + b;
        return result;
        //return a+b; //위의 두 줄을 이와 같이 한줄로 간단히 할 수 있다.
    }
    long subtract(long a, long b){
        return a - b;   //호출한 매서드로 돌아간다. void에서는 return을 컴파일러가 'return;'자동으로 생성
                        //void 외에 return값은 모든 매서드에서는 생략 불가 
    }
    long multiply(long a, long b){
        return a * b;
    }
    double divide(double a, double b){
        return a / b;
    }
}