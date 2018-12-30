package chapter07.ch7_181230;

/*
instanceof 연산자 
- 참조변수가 참조하고 있는 실제 인스턴스타입을 확인해주는 연산자
- 왼쪽에 있는 참조변수가 오른쪽에 있는 타입으로 형변환이 가능한지 확인해주는 연산자
*/
class InstanceofTest {
    public static void main(String[] args) {
        FireEngine fe = new FireEngine();

        if (fe instanceof FireEngine) {
            System.out.println("This is a FireEngine instance.");
        }

        if (fe instanceof Car) {
            System.out.println("This is a Car instance.");
        }

        if (fe instanceof Object) {
            System.out.println("This is an Object instance.");
        }

        System.out.println(fe.getClass().getName()); //클래스의 이름 출력
    }
}

class Car {}
class FireEngine extends Car {}