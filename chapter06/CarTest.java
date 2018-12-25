package chapter06;

class CarTest {
    /*
    Date    : 2018-12-25
    Author  : Lee HyeWon
    */
    /*
    > 생성자의 조건
    생성자의 이름은 클래스의 이름과 같아야 한다.
    생성자는 리턴 값이 없다.
    */
    public static void main(String[] args) {
        Car c1 = new Car(); //car 클래스의 인스턴스 생성

        //참조변수를 통해 car class에 값 대입
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4); //매게변수가 있는 생성자를 통해 값 초기화
        //인스턴스를 생성하는 동시에 원하는 값으로 초기화하므로, 코드가 더 간결하고 직관적이다.
        //new 연산자로 heap메모리에 Car클래스의 인스턴스 생성
        //c2에 매게변수가 있는 생성자의 주소값이 저장
        
        System.out.println("c1 :: " + c1.color +" , "+c1.gearType + " , " + c1.door);
        System.out.println("c2 :: " + c2.color +" , "+c2.gearType + " , " + c2.door);
    }
}

class Car {
    String color;       //색상
    String gearType;    //변속기 종류 - auto(자동), manual(수동)
    int door;           //문의 개수

    Car(){} //기본 생성자
    /*
    기본 생성자의 경우 매게변수가 있는 생성자기 있을 경우 따로 적어줘야하지만
    없을 때는 기본생성자가 자동으로 생성된다.
    */

    Car(String c, String g, int d){//매게변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}