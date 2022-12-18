package ru.geekbrains.lesson_9.HomeWork;

public class HomeWork {
    public static void main(String[] args) {
        String [][] array = {
                {"1","2","3","4"},
                {"5","6","7","8"},
                {"9","10","11","12"},
                {"13","14","15","16"}
//                {"5","5","5","5"}
        };
        checker(array);
    }

    private static class MyArraySizeException extends RuntimeException{
        public MyArraySizeException() {
        }

        public MyArraySizeException(String message) {
            super("Wrong array size.");
        }
    }

    private static class MyArrayDataException extends RuntimeException{
        public MyArrayDataException() {
        }

        public MyArrayDataException(String message) {
            super(message);
        }
    }

    public static void checker(String[][] array) throws MyArraySizeException {
        int maxSize = 4;
        int sum = 0;
        int temp = 0;
        if (array.length!= maxSize) throw new MyArraySizeException("Wrong array length.Need 4*4.");
        for (int i = 0; i < array.length; i++) {
            if (array[i].length!= maxSize) throw new MyArraySizeException("Wrong array length.Need 4*4.");
        for (int j = 0;j<array[i].length;j++){
            try {
                    temp = Integer.parseInt(array[i][j]);
                } catch (NumberFormatException exception){
                System.out.println("Cant parse string: i"+i +" "+ "j" + j);
                throw new MyArrayDataException("Is not a number.");
            }
                sum += temp;
        }
        }
        System.out.println(sum);

    }
}
