package chapter07.ch7_181226;

class DeckTest {
    public static void main(String[] args) {
        Deck d  = new Deck();   //카드 한 벌(Deck)을 만든다.
        Card c = d.pick(0);     //섞기 전에 제일 위의 카드를 뽑는다.
        System.out.println(c);  //c.toString()과 같다.
        // ** 참조변수의 출력이나 덧셈연산자를 이용한 참조변수와 문자열의 결합에는 toString()가 자동적으로 호출되어
        //    참조변수를 문자열로 대치한 후 처리한다.

        d.shuffle();            //카드를 섞는다.
        c=d.pick(0);            //섞은 후에 제일 위의 카드를 뽑는다.
        System.out.println(c);
    }
}

class Deck {
    final int CARD_NUM = 52; //카드의 개수(변하지 않도록 상수로 선언)
    Card cardArr[] = new Card[CARD_NUM]; //Card객체 배열을 포함

    //기본생성자
    Deck() { //Deck의 카드를 초기화 한다.
        int i = 0;

        for(int k = Card.KIND_MAX; k > 0; k--){
            for(int n = 0; n < Card.NUM_MAX; n++){
                cardArr[i++] = new Card(k, n+1);
            }
        }
    }

    Card pick(int index){ //지정된 위치 (index)에 있는 카드 하나를 꺼내서 반환
        return cardArr[index];//객체의 주소값 return
    }

    void shuffle() {//카드 순서를 섞는다.
        for(int i=0; i<cardArr.length; i++){
            int r = (int)(Math.random() * CARD_NUM);

            //카드 섞기
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}

class Card {
    static final int KIND_MAX = 4;  //카드 무늬의 수
    static final int NUM_MAX = 13;  //무늬별 카드 수

    static final int SPADE   = 4;
    static final int DIAMOND = 3;
    static final int HEART   = 2;
    static final int CLOVER  = 1;

    int kind;
    int number;

    //생성자
    Card(){
        this(SPADE, 1);
    }

    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789XJQK"; //숫자 10은 X로 표현

        return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
        //charAt :: 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴한다.
    }
}