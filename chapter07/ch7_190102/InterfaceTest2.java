package chapter07.ch7_190102;

/*
InterfaceTest.java에서 A클래스(User)와 B클래스(Provide)는 직접적인 관계로 B매소드의 값이 변하면 A의 값도 변한다.

따라서, B가 갖고있던 매소드를 Interface I를 선언햐여 추상매서드로 만들어 B클래스가 I인터페이스를 구현하도록하고,
A클래스가 I인터페이스의 매소드를 사용하여 B와 직접적인 관계가 되지 않도록 하도록 하자.
*/

class InterfaceTest2 {
    public static void main(String[] args) {
        A1 a1 = new A1(); //A클래스 객체 생성
        a1.autoPlay(new B1()); //void autoPlay(I i)호출
        a1.autoPlay(new C1()); //void autoPlay(I i)호출
    }
}

class A1 {
    void autoPlay(I i){//인터페이스를 매게변수로 선언했을 때,
            //인터페이스를 구현한 class들을 사용하겠다는 것이다.
        i.play();
    }
}

interface I {
    public abstract void play();
}

class B1 implements I {
    public void play() {
        System.out.println("play in B class");
    }
}

class C1 implements I {
    public void play() {
        System.out.println("play in C class");
    }
}

