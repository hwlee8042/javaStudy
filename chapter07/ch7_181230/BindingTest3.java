package chapter07.ch7_181230;

class BindingTest3{
    public static void main(String[] args) {
        Parent3 p3 = new Child3();
        Child3 c3 = new Child3();

        System.out.println("p3.x = " + p3.x); //100
        p3.method(); //x = 200 / super.x = 100 / this.x = 200
        System.out.println();
        System.out.println("c3.x = " + c3.x); //200
        c3.method();//x = 200 / super.x = 100 / this.x = 200
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("Parent Method");
    }
}

class Child3 extends Parent3{
    int x = 200;

    void method() {
        System.out.println("x = " + x); //this.x와 같다.
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}

