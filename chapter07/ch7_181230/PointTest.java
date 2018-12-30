package chapter07.ch7_181230;

/*
Super() : 조상클래스의 생성자를 호출하는데 사용된다.
- 자손 클래스의 인스턴스를 생성하면, 자손의 맴버와 조상의 맴버가 모두 합쳐진 하나의 인스턴스 생성된다.
- 생성자는 무조건 첫번째 줄에 조상 생성자 호출
*/
class PointTest {
    public static void main(String[] args) {
        Point3D p3 = new Point3D();
    }
}

class Point {
    int x = 0;
    int y = 0;

    Point(int x, int y){
        //super(); //Object클래스의 기본생성자를 컴파일러가 호출한다.
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return "x : " + x + ", y : "+ y;
    }
}

class Point3D extends Point {
    int z = 30;

    Point3D() {
        this(100, 200, 300); //Point3D(int x, int y, int z)를 호출한다.
    }

    Point3D(int x, int y, int z){
        /*
        super(); //컴파일러가 자동적으로 상위클래스의 기본생성자를 호출한다.
        this.x = x;
        this.y = y;
        this.z = z;
        */
        super(x , y); //Point3D(int x, int y)를 호출한다.
        this.z = z;
    }

    //super를 사용해서 조상클래스의 매소드를 포함시키는 것이 좋다.
    //후에 조상매소드가 변경되더라도 변경된 내용이 자손 클래스의 매소드에 자동적으로 반영된다.
    String getLocation(){ //오버라이딩
        return super.getLocation() + ", z : " + z; //조상 매소드 호출
    }
}