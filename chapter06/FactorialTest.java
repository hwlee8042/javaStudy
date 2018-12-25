package chapter06;

class FactorialTest {
    /*
    Date   : 2018-12-25
    Author : Lee HyeWon 
    */
    /*
    재귀호출(recursive call) : 나 자신을 호출하는 것
    > 재귀호출은 대부분 for문으로 바꿀 수 있고, for문 보다 성능이 좋지 않은데,
    for문이 반복적으로 사용하거나 복잡할 경우 재귀호출을 사용 한다.

    ex) factorial > 한 숫자가 1이 될 때까지 1씩 빼면서 곱함 재귀호출의 대표적 예 
    > web에서 재귀호출 함수는 언제 끝났는지 확인 할 때 thread와 같이 사용
    */
    public static void main(String[] args) {
        int result = factorial(4);

        System.out.println(result);
    }

    static int factorial(int x){
        int result = 0;

        if(x == 1){
            result = 1;
        }else{
            result = x * factorial(x-1); //재귀호출 4*3*2*1 //factorial(1) 일 때 result 값이 return 1이 되면서 factorial(1)을 부른 곳으로
                                         //값이 return 되면서 재귀호출 되고 있던 매소드가 종료된다.
        }

        return result;
        /*
        위의 식 간단하게 표현(code refactoring)
        if(x == 1) return 1;
        return x * factorial(x-1);
        */
    }
}