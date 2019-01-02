package chapter07.ch7_190102;

/*
제 3의 클래스를 통해 인터페이스 I로 구현한 클래스의 인스턴스를 제공 받는다.
> User class의 경우 클래스의 변경 없이 제 3의 클래스의 매소드만 변경하면 된다.

인터페이스 I의 참조변수 i로도 Object클래스에 정의 된 매서드를 호출 할 수 있다.
*/
class InterfaceTest3 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.methodA2();
    }
}

class A2 {
    void methodA2() {
        I2 i2 = InstanceManager.getInstance(); //제 3의 클래스의 매소드를 통해 
                                               //인터페이스 I2를 구현한 클래스의 인스턴스를 얻어온다.
        i2.methodB2();
        System.out.println(i2.toString());
    }
}

interface I2 {
    public abstract void methodB2();
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}

class B2 implements I2{
    public void methodB2() {
        System.out.println("methodB in B class");
    }

    public String toString() {
        return "class B";
    }
}