package chapter06;

/*
Date   : 2018-12-25
Author : Lee HyeWon
*/
/*
재귀호출로 x의 n승을 구하는 power()를 만들고
결과 값이 62인 클래스를 만들어보자.
*/
class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int result = 0;

        for(int i=1; i<=n; i++){ //자연수는 1부터 시작해야하므로 int i는 1부터 시작해야한다.
            result += power(x, i);
        }

        System.out.println(result);
    }

    static int power(int x, int n){
        int result = 0;
        
        if(n==1) 
            return x;
        else{
            result = x * power(x, n-1);
        }
            
        return result;
    }
}