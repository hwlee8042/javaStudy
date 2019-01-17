package javaTest.ch11;

import java.util.*;

/*
Student클래스가 Comparable인터페이스를 구현하도록 변경해서 이름(name)이
기본 정렬 기준이 되도록 하시오.
*/
class Exercise11_5_generics {
    public static void main(String[] args) {
        ArrayList<Student2> list11_5g = new ArrayList<Student2>();
        list11_5g.add(new Student2("홍길동",1,1,100,100,100)); 
        list11_5g.add(new Student2("남궁성",1,2,90,70,80)); 
        list11_5g.add(new Student2("김자바",1,3,80,80,90)); 
        list11_5g.add(new Student2("이자바",1,4,70,90,70));  
        list11_5g.add(new Student2("안자바",1,5,60,100,80));
        
        Collections.sort(list11_5g);
        Iterator it = list11_5g.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

class Student2 implements Comparable<Student2> {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    //생성자
    Student2(String name, int ban, int no, int kor, int eng, int math) {
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

    public int compareTo(Student2 s){
        if(s instanceof Student2) {
            Student2 tmp = (Student2)s;
            return name.compareTo(tmp.name);
        }else{
            return -1;
        }
    }
}