package chapter06;

class Data { int x; }

class PrimitiveParamEx {
    /*
    Date   : 2018-12-24
    Author : Lee HyeWon
    */
    /*
    매소드를 호출 할 때 매개변수로 지정한 값을 매소드의 매소드에 복사해서 넘겨준다.
    - 기본형 매개변수 : 변수의 값을 읽기만 할 수 있다.
    - 참조형 매개변수 : 변수의 값을 읽고 변경할 수 있다.
    */
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+d.x); //1. main() : x = 10

        change(d.x); // change static매소드에 10인 값을 갖고간다.
        // change매소드 호출된 것이 종료되면 x=1000d인 메모리가 stack에서 제거됨
        System.out.println("After change(d.x)");// 3. After change(d.x)
        System.out.println("main() : x = "+d.x);// 4. main() : x = 10
    }

    static void change(int x){ //기본형 매개변수>매게변수에 값을 10값을 복사해서 넘겨받는다.
        x = 1000; // 복사본 x값이 1000으로 변경 > 따라서 main에 있는 x값에 영향 X
        System.out.println("change() : x = "+x); //2. change() = x = 1000
    }
}