package javaTest.ch11;

import java.util.*;

class Student7 {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student7(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
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
}

/*
BanNoAscending클래스를 완성하여, ArrayList에 담긴 Student7인스턴스들이
ban과 no로 오름차순 정렬이 되도록 하시오.
*/
class BanNoAscending implements Comparator {
    public int compare(Object o1, Object o2){
        if(o1 instanceof Student7 && o2 instanceof Student7){
            Student7 s1 = (Student7)o1;
            Student7 s2 = (Student7)o2;

            //ban 비교
            int result = s1.ban - s2.ban;

            if(result == 0){//반이 같으면, 번호를 비교
                return s1.no - s2.no;
            }

            return result;
        }
        return -1;
    }
}

class Exercise11_7 {
    public static void main(String[] args) {
        ArrayList list11_7 = new ArrayList();
        list11_7.add(new Student7("이자바",2,1,70,90,70));  
        list11_7.add(new Student7("안자바",2,2,60,100,80));
        list11_7.add(new Student7("홍길동",1,3,100,100,100)); 
        list11_7.add(new Student7("남궁성",1,1,90,70,80)); 
        list11_7.add(new Student7("김자바",1,2,80,80,90)); 

        Collections.sort(list11_7, new BanNoAscending());

        Iterator it = list11_7.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}