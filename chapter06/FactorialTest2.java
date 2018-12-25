package chapter06;

class FactorialTest2 {
    public static void main(String[] args) {
        /*
        Date   : 2018-12-25
        Author : Lee HyeWon
        */
        int tmp = 4;

        if(tmp != 0){
            tmp = factorial(4);
        }

        System.out.println(tmp);
    }

    static int factorial(int x){
        int result = 0;

        if(x != 1){
            result = x * factorial(x-1);
        }else{
            result = 1;
        }

        return result;
    }

}