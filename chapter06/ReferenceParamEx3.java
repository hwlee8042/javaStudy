package chapter06;

class ReferenceParamEx3 {
    /*
    Date   : 2018-12-25
    Author : Lee HyeWon
    */
    public static void main(String[] args) {
        int[] arr = new int[] {3, 2, 1, 6, 5, 4};

        printArr(arr); //printArr호출 매서드 역할이 끝나면 callstack에 할당된 메모리 삭제
        sortArr(arr);  
        printArr(arr);
        System.out.println("sum="+sumArr(arr));
    }

    public static void printArr(int[] arr){ //배열의 모든 요소를 출력
        System.out.print("[");
        for(int i : arr){ //향상된 for문
            System.out.print(i+",");
        }
        System.out.println("]"); //[3, 2, 1, 6, 5, 4,] 출력 후 main으로 돌아감
    }

    public static int sumArr(int[] arr){    //배열의 모든 요소의 합을 반환
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void sortArr(int[] arr){          //배열을 오름차순으로 정렬
        for(int i=0; i<arr.length-1; i++){          //arr.length-1 == 5
            for(int j=0; j<arr.length-1-i; j++){    //arr.length-1-i == 4,3,2,1
                if(arr[j] > arr[j+1]){              //arr[4] > arr[5]
                    int tmp = arr[j];               
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;                 //arr[5] = arr[4]; arr[4] = arr[5]
                }
            }
        }
    }//sortArr(int[] arr)
}