package javaTest.ch11;

import java.util.*;

/*
Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이
기본 정렬 기준이 되도록 하시오.
*/
class Exercise11_5 {
    public static void main(String[] args) {
        ArrayList list11_5 = new ArrayList();
        list11_5.add(new Student("홍길동",1,1,100,100,100)); 
        list11_5.add(new Student("남궁성",1,2,90,70,80)); 
        list11_5.add(new Student("김자바",1,3,80,80,90)); 
        list11_5.add(new Student("이자바",1,4,70,90,70));  
        list11_5.add(new Student("안자바",1,5,60,100,80));
        
        //Collections.sort(List list)를 이용하면 ArrayList에 저장된 요소들을 쉽게 정렬할 수 있다.
        //ArrayList에 저장된 요소는 Comparable인터페이스를 구현한 것이어야한다.
        Collections.sort(list11_5);//list11_5에 저장된 요소를 저장 (compareTo()호출)
        Iterator it = list11_5.iterator();//컬랙션에 저장된 요소에 접근
        
        while(it.hasNext()){//iterator 다음 요소가 있는지 확인 있으면 true 없으면 false
            System.out.println(it.next()); //iterator의 다음 요소를 읽어온다.
        }
        /*
        Iterator 은 컬랙션에 저장된 요소에 접근하기 위한 인터페이스이다.
        Iterator, ListIterator(양방향 조회기능 추가), Enumeration(구버전)
        ★Iterator
        boolean hashNext() - 읽어올 요소가 남아있는지 확인 (있으면 true, 없으면 false)
        Object  next()     - 다음 요소를 읽어온다.
        void    remove()   - next()로 읽어온 요소를 삭제

        ★ListIterator
        //hashNext(), next(), remove()는 Iterator과 같다.
        Object hashPrevious() -  이전 요소가 남아있는지 확인
        Object previous()   - 이전 요소를 읽어온다.
        int    nextIndex()  - 다음 요소의 index읽어온다.
        int    previous()   - 전 요소의 index를 읽어온다.
        void   add(Object o) - 컬랙션에 Object추가
        void   set(Object 0) - next(), previous()로 읽어온 요소를 Obejct객체로 변경
        */
    }
}

class Student implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    //생성자
    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor+eng+math;
    }

    float getAverage() {
        return (int)((getTotal()/3f)*10+0.5)/10f;
    }

    public String toString() {
        return name + " " + ban + " " + no + " " 
        + kor + " " + eng + " " + math + " " + getTotal() + " " + getAverage();
    }

    //Comparabe인터페이스에 있는 compareTo()에 Object객체를 매게변수로 
    //받아서 값을 비교하는 매소드를 오버라이딩해줘야한다.
    public int compareTo(Object o){
        if(o instanceof Student) {
            Student tmp = (Student)o;

            return name.compareTo(tmp.name); //String클래스의 compareTo()를 호출
        }else{
            return -1;
        }
    }
}

/*
Comaparable과 Compatator은 Collection을 정렬하기 위한 인터페이스다.
> Comaprable은 기본정렬 기준을 구현하는데 사용
기본정렬 (Interger, Wrapper클래스, String, Date, File)을 오름차순으로 정렬
public int compareTo(Object o); 로 비교한다.
return값이 두 객체의 값이 같으면 0 / 비교하는 값보다 작으면 음수 / 비교하는 값보다 크면 양수

> Compatator은 기본정렬 외에 다른 기준으로 정렬을 할 때 사용
int compare(Object o1, Object o2);
// 두개의 객체를 비교해서 음수, 0,  양수로 값을 반환
*/