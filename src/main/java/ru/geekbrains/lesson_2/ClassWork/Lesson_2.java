package ru.geekbrains.lesson_2.ClassWork;

public class Lesson_2 {
    public static void main(String[] args) {
//        switchExample();
//        loopsExample();
//        oneDimArrays();
//        int [][] arr1 = new int[3][3]
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        for(int y = 0; y< arr.length;y++){
//            for(int x = 0;x<arr[y].length;x++){
//                System.out.print(arr[y][x]+ " ");
//            }
//            System.out.println();
//        }
//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + "  ");
//            }
//            System.out.println();
//        }
    }

    private static void oneDimArrays() {
        //        int [] arr = new int [10];
        int arr[] = new int[10];
//        int [] arr = { 12,2,41,5,1,23}
        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 12;
        arr[3] = 19;
        arr[4] = 17;
//        System.out.println(arr.length);
//        for (int i = 0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        for (int i = arr.length-1;i>=0;i--){
//            System.out.println(arr[i]);
//        }
//        for (int i: arr) {
//            System.out.println(i);
//        }
//
    }

    private static void loopsExample() {
        int count1 = 0;
        while (count1 <= 100) {
            count1++;
            if (count1 % 2 != 0) continue;
            System.out.println(count1);
        }
        do {
            System.out.println(count1++);
        } while (count1 <= 10);
//        инициализация условие итерация
        for (int count = 0; count <= 10; count++) {
            if (count % 3 == 0) continue;
            System.out.println(count);
            if (count == 6) break;
            int count2 = 5;
            for (; ; ) {
                System.out.println(count2++);
            }
        }
    }

    private static void switchExample() {
        int someNumber = 1;
        String result = someNumber < 0 ? "negative" : "positive";
        System.out.println(result);

        switch (someNumber) {
            case 1:
                System.out.println("Its 1");
                break;
            case 2:
                System.out.println("Its 2");
                break;
            case 3:
                System.out.println("Its 3");
                break;
            default:
                System.out.println("stop");
        }
    }

}