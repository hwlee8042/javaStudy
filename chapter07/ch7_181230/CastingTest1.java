package chapter07.ch7_181230;

class CastingTest1 {
    public static void main(String[] args) {
        Car car = null; 
        Car car2 = new Car(); //car참조변수에 Car타입의 인스턴스(객체) 저장
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe; //fe의 주소값 car에 대입 > fe가 참조하던 인스턴스 car도 참조
                  //car는 water()를 사용할 수 X 
                  //car = (Car)fe; Car가 상위클래스라서 형변환 생략가능
        //car.water(); //error(undefined) Car타입의 참조변수는 water() 호출 X
                       //상위클래스는 하위클래스의 매소드를 참조하지 못한다.
        fe2 = (FireEngine)car; // 조상타입을 자손타입으로 형변환
                               // 자손타입으로 형변환하여 fe2는 water() 사용O
        fe2. water();

        car2.drive();

        //조상타입의 인스턴스를 자손타입의 참조변수로 참조하는 것은 허용되지 않는다.
        fe2 = (FireEngine)car2; //java.lang.ClassCastException 
        
        fe2.drive();
        car.drive();

    }
}

class Car{
    String color;
    int door;

    void drive(){ //운전하는 기능
        System.out.println("drive, brrr ~ ");
    }

    void stop(){ //멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car { //소방차
    void water() { // 물 뿌리는 기능 
        System.out.println("water !!!");
    }
}