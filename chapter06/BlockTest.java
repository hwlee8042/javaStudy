package chapter06;

class BlockTest {
    /*
    Date    : 2018-12-25
    Author  : Lee HyeWon
    */
    /*
    * 변수 초기화
    맴버변수의 경우 자동적으로 변수의 자료형에 맞는 기본값으로 초기화가 된다.
    하지만 지역변수의 경우 반드시 초기화를 해야한다.

    * 맴버변수(클래스 변수, 인스턴스 변수) 초기화 방법
    1. 명시적 초기화 : 변수선언과 동시에 초기화
    2. 초기화 블럭   : 클래스변수 초기화 블럭(블럭 앞에 static이 붙는다.) 
                      인스턴스변수 초기화 블럭(단순히 클래스 내에 블럭{}을 만들고 코드 작성)
                      > 생성자보다 인스턴스변수 초기블럭이 먼저 수행된다.
    3. 생성자        : 인스턴스 변수를 초기화 할 때
    */
    static{//클래스변수 초기화 블럭
        System.out.println("static { }"); //1.static 초기화 블럭 제일 먼저 method area에 올라감
    }
    {//인스턴스 변수 초기화 블럭
        System.out.println("{ }"); //3. main에서 bt의 인스턴스 변수 생성되면서 먼저 실행 //6
    }
    public BlockTest(){ //기본생성자
        System.out.println("생성자"); //4. 기본생성자 생성되면서 초기화블럭 다음으로 실행 //7
    }
    public static void main(String[] args) { 
        System.out.println("BlockTest bt = new BlockTest(); "); //2. main 매소드가 2번째로 실행
        BlockTest bt = new BlockTest(); //인스턴스 변수 bt가 생성되면서 인스턴 변수 초기화 블럭 실행

        System.out.println("BlockTest bt2 = new BlockTest(); "); //5. bt 생성자 실행 후 sysout실행
        BlockTest bt2 = new BlockTest(); //bt2 객체 생성되면서 초기화 블럭 실행 후 생성자 실행
    }
}