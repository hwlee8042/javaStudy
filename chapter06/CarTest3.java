package chapter06;

class CarTest3 {
    /*
    생성자를 적절히 활용하면 간결하고 직관적인, 객체지형적인 코드 작성 가능
    */
    public static void main(String[] args) {
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1); //c1의 복사본 c2를 생성한다. // c1의 값이 c2에 복사되었지만 c2와 c1의 주소값은 다르다.

        System.out.println("c1 :: " +c1.color + " , " +c1.gearType + " , " + c1.door); //c1 :: white , auto , 4
        System.out.println("c2 :: " +c2.color + " , " +c2.gearType + " , " + c2.door); //c2 :: white , auto , 4

        c1.door = 100; //c1의 인스턴스 변수 door의 값을 변경
        System.out.println("c1.door = 100; 수행 후");
        System.out.println("c1 :: " +c1.color + " , " +c1.gearType + " , " + c1.door); //c1 :: white , auto , 100
        System.out.println("c2 :: " +c2.color + " , " +c2.gearType + " , " + c2.door); //c2 :: white , auto , 4
    }
}

class Car3 {
    String color;
    String gearType;
    int door;

    Car3(){
        this("white", "auto", 4);
    }

    Car3(Car3 c) { //인스턴스의 목사를 위한 생성자
        /* color = c.color;
        gearType = c.gearType;
        door = c.door; */
        this(c.color, c.gearType, c.door);
    }

    Car3(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}