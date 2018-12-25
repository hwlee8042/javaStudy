package chapter06;

class CallStackTest {
    /*
    Date   : 2018-12-24
    Author : Lee HyeWon
    */
    public static void main(String[] args) { // 1. JVM에 의해 main 호출 callstack영역에 main매소드를 위한 메모리 공간 할당
        firstMethod();  //2.firstMethod() 호출 > static 매소드는 객체생성 없이 바로 호출 가능
                        //호출한 상태에서 callStack에 대기상태로 남아있는다.
                        //6. 더이상 수행할 코드가 없으면 main 종료후 callStack은 완전히 비워짐
    }

    static void firstMethod(){ 
        secondMethod(); //3. secondMethod 호출
                        //secondMethod 수행 마쳐야 firstMethod 나머지 문장 수행
                        //6. 더이상 수행할 코드가 없으면 종료 후 main으로 돌아간 후 stack에서 사라짐
    }

    static void secondMethod(){
        System.out.println("secondMethod()"); // 4. println찍고 더이상 수행할 코드 없으면 종료 후 firstMethod()로 돌아감
                                              // 5. stack에서 사라지고 
    }
}