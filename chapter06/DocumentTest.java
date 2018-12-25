package chapter06;

class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();   //기본생성자 호출
        Document d2 = new Document("자바.txt"); //매게변수가 있는 생성자 호출
    }
}

class Document {
    //명시적 초기화
    static int count = 0;
    String name;

    //생성자
    Document(){
        this("제목없음" + ++count); //매게변수가 있는 생성자 호출 Document("제목없음1");
    }

    Document(String name){
        this.name = name; // 인스턴스 변수 name의 인스턴스에 매게변수 name값 대입
        System.out.println("문서 "+this.name+"가 생성되었습니다.");//1. 문서 제목없음1가 생성되었습니다.
                                                                 //2. 문서 자바.txt가 생성되었습니다.
    }
}