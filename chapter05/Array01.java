package chapter05;

public class Array01 {
    public static void main(String[] args) {
        /**
        DATE   : 2018-12-23 SUN
        AUTHOR : LeeHyeWon
        */
        /*
        배열 복사
        배열의 길이는 정해지므로, 배열 복사시 위치가 적절치 못하면 여유공간이 부족해 ArrayIndexOutOfBoundsException이 발생
        */
        char[] abc = {'A', 'B', 'C', 'D'};
        char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.println(abc);
        System.out.println(num);   

        
    }
}
