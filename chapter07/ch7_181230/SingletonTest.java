package chapter07.ch7_181230;

class SingletonTest {
    public static void main(String[] args) {
        //Singleton s = new Singleton(); //error, Singleton()는 private접근자 이므로 객체생성불가
        Singleton s = Singleton.getInstance();
    }
}

//싱글톤 매소드
class Singleton {
    //외부에서 접근 못하도록 접근제어자 private
    //getInstance()에서 사용할 수 있도록 인스턴스가 미리 생성되야하므로 static 제어자 사용
    private static Singleton s = new Singleton();

    private Singleton(){
        System.out.println("싱글턴매소드에 접근완료!");
    }

    public static Singleton getInstance(){
        if(s == null){
            s = new Singleton();
        }
        return s;
    }
}