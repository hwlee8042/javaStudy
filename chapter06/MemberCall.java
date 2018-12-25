package chapter06;

class MemberCall {
    /*
    Date    : 2018-12-25
    Author  : Lee HyeWon
    */
    int iv = 10;
    static int cv = 20;

    int iv2 = cv; //인스턴스 변수는 static변수를 사용 할 수 있다.
    //static int cv2 = iv;  //에러. 클래스변수는 인스턴스 변수를 사용할 수 없음.
    static int cv2 = new MemberCall().iv; // 클래스 변수가 인스턴스 변수를 사용해야만 하는 경우 객체를 생성해야 사용가능.

    static void staticMethod1(){
        System.out.println(cv);
        //System.out.println(iv); //에러. 클래스매소드에서 인스턴스 변수를 사용 불가
        MemberCall c = new MemberCall();
        System.out.println(c.iv); //객체를 생성한 후에야 인스턴스변수의 참조가능.
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv); //인스턴스 매서드에서는 인스턴스 변수를 바로 사용가능.
    }

    static void staticMethod2() {
        staticMethod1();
        //instanceMethod1(); //에러. 클래스메서드에서는 인스턴스 매소드를 호출 할 수 없음
        MemberCall c = new MemberCall();
        c.instanceMethod1(); //인스턴스를 생성한 후에야 호출 할 수 있음
        /*
        MemberCall c = new MemberCall().instanceMethod1(); 
        */
    }

    void instanceMethod2() { //인스턴스매소드에서는 인스턴스매서드와 클래스매소드
        staticMethod1();     //모두 인스턴스 생성업시 바로 호출 가능
        instanceMethod1();
    }
}