package chapter06;

/*
Date    : 2018-12-25
Author  : Lee HyeWon
*/
/*
this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소값이 저장되어 있다.
       모든 인스턴스매소드에 지역변수로 숨겨진 채로 존재
this(), this(매게변수) : 생성자, 같은 클래스의 다른 생성자 호출 시 사용
*/
class Car2 {
    String color;
    String gearType;
    int door;

    Car2(){
        this("white", "auto", 4);
    }

    Car2(String c){
        this(c, "auto", 4);
    }

    Car2(String color, String gearType, int door){
        /*
        매게변수로 선언된 변수와 class에 선언된 인스턴스 변수의 변수명이 구별 되지 않을 때,
        인스턴스 변수 앞에 this를 사용
        
        this는 참조변수로 인스턴스 자신을 가르킨다. > this는 static매소드에는 사용 X
                                                 > static매소드가 호출 된 시점에 인스턴스 존재X일 수 있으므로
        */
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

class CarTest2 {
    public static void main(String[] args) {
        String color = "blue";
        Car2 c1 = new Car2();
        Car2 c2 = new Car2(color);

        System.out.println("c1 :: " +c1.color + " , " +c1.gearType + " , " + c1.door);
        System.out.println("c2 :: " +c2.color + " , " +c2.gearType + " , " + c2.door);
    }
}
