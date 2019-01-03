package javaTest.ch06_190103;

class test01 {
    public static void main(String[] args) {
        SutdaCard s1 = new SutdaCard();

        SutdaCard s2 = new SutdaCard("kwang");
        System.out.println(s2.isKwang);
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard(){
        for(int i=1; i<11; i++){
            num = i;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    SutdaCard(String isKwang){
        if(isKwang == "kwang"){
            this.isKwang = true;
            System.out.println("광입니다.");
        }else{
            this.isKwang = false;
            System.out.println("광이 아닙니다.");
        }
    }
}

/*
연습문제 6-1답
class SutdaCard {
    int num;
    boolean isKwang;
}
*/