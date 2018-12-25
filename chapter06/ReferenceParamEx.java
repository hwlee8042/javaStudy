package chapter06;

class Data{ int x; }

/*
Date   : 2018-12-25
Author : Lee HyeWon
*/
class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = "+d.x); //참조변수 d의 인스턴스 값 10
        //1. main() : x = 10

        change(d); // 참조변수 값 change매소드에 넘김
        System.out.println("After change(d)"); //3. After change(d)
        System.out.println("main() : x = " + d.x);// main() : x = 1000
    }

    static void change(Data d){ //참조형 매개변수 > d가 갖고있는 주소값 매게변수에 복사
        d.x = 1000; //참조변수 d의 인스턴스에 1000 대입
        System.out.println("change() : x = " + d.x); //2. change() : x = 1000
    }
}