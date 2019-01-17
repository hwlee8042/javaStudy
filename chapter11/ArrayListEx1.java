package chapter11;

import java.util.*;

/*
Collection interface > List, Set의 공통적인 부분을 뽑아서 interface로 정의
- List interface : 순서가 있고, 중복을 허용하는 데이터의 집합
    > ArrayList, LinkedList, Stack, Vector
- Set interface : 순서가 없고, 중복을 허용하지 X 데이터 집합
    > HashSet, TreeSet

- Map interface : Key와 Value 값이 쌍으로 이루어져있고, 순서가 X는 데이터 집합으로, Key는 중복X, value는 중복O
    > HashMap, TreeMap, HashTable, Properties
*/

class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //subList(int fromIndex, int toIndex) :: fromIndex부터 toIndex까지 반환
        ArrayList list2 = new ArrayList(list1.subList(1, 4)); 
        print(list1, list2);
        //list1 : [5, 4, 2, 0, 1, 3]
        //list2 : [4, 2, 0]

        Collections.sort(list1); //void sort(Comparator c) : 비교연산자 Comparator로 list정렬
        Collections.sort(list2);
        print(list1, list2);
        //list1 : [0, 1, 2, 3, 4, 5]
        //list2 : [0, 2. 4]

        //list2가 list1에 포함되어있으면 true반환
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2)); //true

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);
        //list1 : [0, 1, 2, 3, 4, 5]
        //list2 : [0, 2. 4, A, B, C]

        list2.set(3, "AA");
        print(list1, list2);
        //list1 : [0, 1, 2, 3, 4, 5]
        //list2 : [0, 2. 4, AA, B, C]

        //retailAll(Collection c); :: list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2)); 
        print(list1, list2);
        //list1 : [0, 2, 4]
        //list2 : [0, 2. 4, AA, B, C]

        //list2에서 list1에 포합된 객체들을 삭제한다.
        for(int i=list2.size()-1; i>=0; i--){
            if(list1.contains(list2.get(i))){
                list2.remove(i);
            }
        }
        print(list1, list2);
        //list1 : [0,2,4]
        //list2 : [AA, B, C]
    }// main end

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}