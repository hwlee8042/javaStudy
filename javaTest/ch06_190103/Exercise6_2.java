package javaTest.ch06_190103;

/*
결과 
3
1K
나오도록
*/
class Exercise6_2 {
    public static void main(String[] args) {
           SutdaCard1 card1 = new SutdaCard1(3, false);
           SutdaCard1 card2 = new SutdaCard1();

           System.out.println(card1.info()); //3출력
           System.out.println(card2.info()); //1K출력
    }
}

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1(){
        this(1, true);
    }

    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }

    String info(){
        return num + (isKwang? "K" : "");
    }
}