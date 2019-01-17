package javaTest.ch11;

import java.util.*;
/*
정수집합 1,2,3,4와 3,4,5,6의 교집합, 차집합, 합집합을 구하는 코드이다.
코드를 완성하여 실행한 결과와 같은 결과를 출력하시오
ArrayList클래스의 addAll(), removeAll(), retainAll()을 사용하라.
*/
class Exercise11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList kyo = new ArrayList();    //교집합 > 3,4
        ArrayList cha = new ArrayList();    //차집합 > 1,2 || 3,4
        ArrayList hap = new ArrayList();    //합집합 > 1,2,3,4,5,6

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        
        System.out.println("list1 = " + list1); //[1, 2, 3, 4]
        System.out.println("list2 = " + list2); //[3, 4, 5, 6]

        kyo.addAll(list1);//list1의 모든 요소를 kyo에 넣는다.
        kyo.retainAll(list2);//kyo와 list2와 공통된 요소 남기고 나머지 삭제
        System.out.println("kyo = " + kyo);

        cha.addAll(list1);
        cha.removeAll(list2);//list2와 공통되는 요소를 모두 삭제한다.
        System.out.println("cha = " + cha);

        cha.addAll(list2);
        cha.removeAll(list1);
        System.out.println("cha = " + cha);

        hap.addAll(list1);
        hap.removeAll(kyo);//Collection(kyo)와 동일한 객체를 ArrayList hap에서 삭제
        hap.addAll(list2);
        System.out.println("hap = " + hap);

    }
}
/*
* ArrayList는 배열을 기반으로 하여 배열의 크기를 변경할 수 없으므로,
저장공간이 부족했을 때 새로운 배열을 만들어서 복사해야하므로 비용 많이 든다.
따라서 중간의 값이 삭제가 된다면 삭제된 빈공간을 채우기 위해 나머지 요소들을 이동하는데,
만약 배열의 '첫번째 요소'가 삭제 되면 첫번째의 빈공간을 채우기 위해 나머지 요소들을 이동시켜야
하므로 비용이 많이든다.
하지만 '마지막 요소'가 삭제 될 때는 다른 요소를 이동시킬 필요 없이 null로 공간을
채우면 되므로 적은 비용으로 처리가 가능하다.

* LickedList는 doubly circular linked list로 구현되어있는데
이중 가장 오래 걸리는 요소는 LinckedList의 중간요소에 접근하는 시간이 가장 오래걸린다.
*/