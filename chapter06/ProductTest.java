package chapter06;

class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
                                                                        //count변수가 static일 때   count변수가 인스턴스일 때
        System.out.println("p1의 제품번호 (serialNo)는 " + p1.serialNo); //         1                           1
        System.out.println("p2의 제품번호 (serialNo)는 " + p2.serialNo); //         2                           1
        System.out.println("p3의 제품번호 (serialNo)는 " + p3.serialNo); //         3                           1
    }
}

class Product {
    //명시적 초기화
    //static int count = 0; //클래스 변수 :: 생성된 인스턴스의 수를 저장하기 위한 변수
    int count = 0; //인스턴스 변수 :: 인스턴스 변수는 객체 생성 될 때마다 0으로 초기화
    int serialNo;

    //인스턴스변수 초기화블럭
    //> 인스턴스변수 초기화 할 때 생성자를 사용해도 되지만, 
    //  모든 생성자에서 공통으로 수행되어야 하는 내용 떄문에 인스턴스변수 블럭 초기화를 사용
    {
        ++count; //클래스 변수 count = count + 1; > 1, 2, 3
                 // ** 만약, count가 인스턴스 변수로 선언되었다면 인스턴스 변수 생성 될 때마다 0으로 초기화 되어
                 // ** serialNo값은 항상 1이다
        serialNo = count;
    }

    //기본생성자 생략 가능
    Product(){}

}