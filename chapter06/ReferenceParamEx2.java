package chapter06;

class ReferenceParamEx2 {
    /*
    Date   : 2018-12-25
    Author : Lee HyeWon
    */
    /*
    임시적으로 간단히 처리할 때 별도의 클래스 선언보다는 배열을 이용할 수 있다.
    */
    public static void main(String[] args) {
        int[] x = {10}; //크기가 1인 배열. x[0] = 10;
        System.out.println("main() : x = " + x[0]); //1.main() : x = 10

        change(x); //배열의 주소값이 저장되어있는 x를 change매소드에 전달
        System.out.println("After change(x)"); //3. After change(x)
        System.out.println("main() : x = " + x[0]); //4. main() : x = 1000
    }

    static void change(int[] x){//참조형 매게변수 > x의 배열 주소값 매게변수에 복사
        x[0] = 1000;
        System.out.println("change() : x = " + x[0]); //2. change() : x = 1000
    }
}