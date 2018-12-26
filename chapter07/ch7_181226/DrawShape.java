package chapter07.ch7_181226;

class DrawShape {
    public static void main(String[] args) {
        Point[] p = {new Point(100, 100),
                     new Point(140, 50),
                     new Point(200, 100)
                    };
        Triangle t = new Triangle(p);
        Circle c = new Circle(new Point(150, 150), 50);
        // Point p = new Point(150, 150);
        // Circle c = new Circle(p, 50);

        t.draw(); //삼각형을 그린다.
        c.draw(); //원을 그린다.
    }
}

class Shape {
    String color = "black";
    void draw() {
        System.out.println("[color="+color+"]");
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    Point(){
        this(0,0);
    }

    String getXY(){
        return "("+x+" , "+y+")"; //x와 y의 값을 문자열로 반환
    }
}

class Circle extends Shape {
    Point center; // 원의 원점좌표 > Circle과 Point는 포함관계(원은 점을 가지고 있다.)
    int r; // 반지름

    Circle() {
        this(new Point(0,0), 100); 
    }

    Circle(Point center, int r){
        this.center = center;
        this.r = r;
    }

    void draw() {//원을 그리는 대신에 원의 정보를 출력하도록 했다. > 오버라이딩
        System.out.println("[center = ("+center.x+" , "+center.y+"), r="+r+", color="+color); //center = (150,150), r=50, color=black
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p){
        this.p = p;
    }

    void draw(){
        System.out.println("p1 = "+p[0].getXY()+", p2 = "+p[1].getXY()+", p3 = "+p[2].getXY()+", color = "+color);
        // p1 = (100,100), p2 = (140,50), p3=(200,100) , color = black
    }
}