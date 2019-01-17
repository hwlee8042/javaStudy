package javaTest.ch11;

import java.util.*;

class Student6 implements Comparable {
    String name;
    int ban;
    int no;
    int kor, eng, math;

    Student6(String name, int ban, int no, int kor, int eng, int math) {
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

    public int compareTo(Object o){
        if(o instanceof Student6){
            Student6 tmp = (Student6)o;
            return name.compareTo(tmp.name);
        }else{
            return -1;
        }
    }
}
/*
성적평균의 범위별로 학생 수를 세기 위한 것이다.
TreeSet이 학생들의 평균을 기준으로 정렬하도록 compare(Object o1, Object o2)와
평균점수의 범위를 주면 해당 범위에 속한 학생의 수를 반환하는 getGroupCount()를 완성하라
TreeSet의 subSet(Object from, Object to)를 사용하라
> subSet : from과 to(to는 범위에 속하지 X) 사이의 값 반환
*/
class Exercise11_6 {

    static int getGroupCount(TreeSet set, int from, int to){
        Student6 s1 = new Student6("", 0, 0, from, from, from);
        Student6 s2 = new Student6("", 0, 0, to, to, to);

        return set.subSet(s1, s2).size();//크기 반환
    }

    public static void main(String[] args) {
        TreeSet tSet = new TreeSet(new Comparator() {//익명클래스
            public int compare(Object o1, Object o2){
                if(o1 instanceof Student6 && o2 instanceof Student6){
                    Student6 s1 = (Student6)o1;
                    Student6 s2 = (Student6)o2;

                    return (int)(s1.getAverage() - s2.getAverage());
                    //compare은 음수, 0, 양수를 반환해야하므로 int로 형변환
                }

                return -1;
            }
        });

        tSet.add(new Student6("홍길동",1,1,100,100,100)); 
        tSet.add(new Student6("남궁성",1,2,90,70,80)); 
        tSet.add(new Student6("김자바",1,3,80,80,90)); 
        tSet.add(new Student6("이자바",1,4,70,90,70));  
        tSet.add(new Student6("안자바",1,5,60,100,80));

        Iterator it = tSet.iterator();

        while(it.hasNext())
            System.out.println(it.next());
        
        System.out.println("[60~69] : " + getGroupCount(tSet, 60, 70));
        System.out.println("[70~79] : " + getGroupCount(tSet, 70, 80));
        System.out.println("[80~89] : " + getGroupCount(tSet, 80, 90));
        System.out.println("[90~100] : " + getGroupCount(tSet, 90, 101));
    }
}