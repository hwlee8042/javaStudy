package javaTest.ch11;

import java.util.*;
/* 
Stack : LIFO(Last In First Out)
> 순차적으로 데이터를 추가하고 삭제하므로 ArrayList 컬랙션 클래스로 구현 적합
Object  push()   : stack에 객체 저장
Object  pop()    : stack의 객체 꺼낼 때 (비어있을때 EmptyStackException 발생)
boolean empty()  : stack이 비어있는지 확인
Object  peek()   : stack의 가장 위에 있는 객체 반환 
int search(Object o) : stack에서 Object객체를 찾아서 그 위치를 반환, 없으면 -1을 반환
> Stack은 클래스로 구현되어 있어 Stack class를 상속받으면 된다.

Queue : FIFO(First In First Out)
> 첫번째 넣은 값을 삭제하므로, ArrayList를 사용할 경우 빈 공간을 null로 채워야하므로
    LinckedList 컬랙션 클래스로 구현 적합
boolean offer(Object o) : Queue의 Object객체를 저장(성공 true, 실패 false 반환)
Object poll() : Queue의 객체 꺼내서 반환(비어있으면 null반환)
boolean add(Object o) : Queue에 Object객체를 추가, 추가 성공 true, 아니면 false
Object remove() : Queue이 객체 반환 (객체 없으면 NoSuchElementException발생)
Object element() : 삭제없이 요소 읽어온다(비어있으면 NoSuchElementException발생)
Object peek() : 삭제없이 요소 읽어온다.(비어있으면 null 반환)
> Queue는 인터페이스로 구현되어있어, Queue를 구현한 class를 상속받아 구현하면된다.

*/
class Exercise11_2 {
    public static void main(String[] args) {
        ArrayList list11_2 = new ArrayList();
        list11_2.add(3);
        list11_2.add(6);
        list11_2.add(2);
        list11_2.add(2);
        list11_2.add(2);
        list11_2.add(7);

        HashSet set = new HashSet(list11_2); //HashSet은 중복 허용X, 순서유지X
            //[3, 6, 2, 7]
        TreeSet tset = new TreeSet(set); //TreeSet은 중복 허용X, 저장시 객체 오름차순으로 저장
            //[2, 3, 6, 7] 

        Stack stack = new Stack(); 
        stack.addAll(tset);//[7, 6, 3, 2]

        while(!stack.empty()){
            System.out.print(stack.pop() + " " );
        }
    }
}