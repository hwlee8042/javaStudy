package chapter06;

class Data { int x; }

class ReferenceReturnEx {
    /*
    Date   : 2018-12-25
    Author : Lee HyeWon 
    */
    /*
    return값이 참조형일때
    */
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10; // 1. d의 인스턴스 값에 10 저장

        Data d2 = copy(d); // 2. 참조변수 copy로 전달
                           // 7.반환된 tmp값 d2에 저장
        System.out.println("d.x = " + d.x); // d.x = 10
        System.out.println("d2.x = " + d2.x); //d2.x = 10
    }

    static Data copy(Data d){ //3.참조변수 d의 주소값 copy 매게변수에 복사 // return type이 Data인 copy 매소드
        Data tmp = new Data(); //4.Data class 객체 생성 Data d와 다른 주소값 생성
        tmp.x = d.x;    // 5.tmp.x tmp의 x인스턴스에 d가 갖고있는 x 인스턴스 값 대입

        return tmp; // 6.tmp값 반환 
                    //* > copy에서 만들어진 객체의 주소값이 main으로 반환되어 main에서 copy매소드의 변수 값 사용가능
                    // ** 반화형이 참조형일 때 '객체의 주소'가 반환된다.
    }

}