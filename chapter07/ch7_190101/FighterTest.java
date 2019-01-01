package chapter07.ch7_190101;

/*
인터페이스 : 추상매소드와 상수만 맴버로 가질 수 있다.(추상매서드보다 더 추상적)
추상클래스 : abstract가 붙은 매소다가 있으면 abstract클래스, 
            모두 구현된 클래스더라도 abstract를 붙일 수 있지만 인스턴스를 가질 수 없다.
추상매소드 : 구현부가 없는 매소드로 상속을 통해 오버라이딩 되어야한다.
만약 추상클래스를 상속받았는데 추상클래스에 있는 추상매소드를 모두 오버라이딩 하지 않는다면 상속받은 클래스도 추상 클래스가 되어야한다.

> 여기서 abstract를 붙이지 않고 구현부가 없는 매소드 void test() {} 이렇게 매소드의 구현부를 넣지 않고 상속 받아서 사용해도 되지만
abstract void test();를 적는 이유는 반드시 오버라딩되어야 하는 매소드라는 것을 강조하기 위해서이다.

추상클래스 > 미완성된 설계도 / 인터페이스 > 밑그림만 그려진 기본설계도
*/
class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        
        if(f instanceof Unit) {
            System.out.println("f는 Unit클래스의 자손입니다.");
        }
        if(f instanceof Fightable) {
            System.out.println("f는 Fightable인터페이스를 구현했습니다.");
        }
        if(f instanceof Movable) {
            System.out.println("f는 Movable인터페이스를 구현했습니다.");
        }
        if(f instanceof Attackable){
            System.out.println("f는 Attackable인터페이스를 구현했습니다.");
        }
        if(f instanceof Object){
            System.out.println("f는 Object클래스의 자손입니다.");
        }
    }
}

//Unit클래스를 상속받고, Fightable 인터페이스를 구현하는 Fighter클래스
//Fighter클래스는 Unit클래스를 상속 받았으므로 클래스들의 최상위 클래스인 Object클래스의 자손이기도 하다.
class Fighter extends Unit implements Fightable {
    //Fightable인터페이스가 상속받은 인터페이스들이 갖고있던 추상매서드들 오버라이딩
    //* 구현할때 public 접근제어자 사용 
    // > 오버라이딩 할 때, 조상 매서드 보다 넓은 번위의 접근제어자 지정해야한다.
    public void move(int x, int y){/* 내용생략 */}
    public void attack(Unit u){/* 내용생략 */}
}

//클래스
class Unit {

}

//인터페이스
interface Fightable extends Movable, Attackable {} //Fightable인터페이스가 Movable인터페이스와 Attackavle인터페이스를 상속 받았다.
interface Movable { void move(int x, int y); }//public abstract void move(int x, int y) 추상 매서드 > 컴파일시 public abstract생성
interface Attackable{ void attack(Unit u); }//Unit클래스를 매게변수로 받은 attack추상매서드
