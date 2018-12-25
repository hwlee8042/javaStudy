package chapter06;

class VarArgsEx {
    /*
    Date    : 2018-12-25
    Author  : Lee HyeWon
    */
    /*
    가변인자와 오버로딩
    */
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300")); //100200300
        System.out.println(concatenate("-", strArr)); //100-200-300-
        System.out.println(concatenate(",", new String[]{"1","2","3"})); //1,2,3,

        System.out.println(new String[0]); //[Ljava.lang.String;@6d9c638
        System.out.println("[" + concatenate(",", new String[0])+ "]"); //?

        System.out.println("[" + concatenate(",")+ "]"); //[]
    }

    static String concatenate(String delim, String... args){
        String result = "";

        for(String str : args){
            result += str + delim;
        }

        return result;
    }

    /*
    The method concatenate(String, String[]) is ambiguous for the type VarArgsEx
    > 동일한 이름의 메소드 호출시 ambiguous for the type 에러가 발생
    가변인자의 경우 구별이 불가능 하여 error발생
    */
    /* static String concatenate(String... args){
        return concatenate("", args);
    } */
}