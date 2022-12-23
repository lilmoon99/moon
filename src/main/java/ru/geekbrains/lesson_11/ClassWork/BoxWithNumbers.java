package ru.geekbrains.lesson_11.ClassWork;

import java.util.List;

public class BoxWithNumbers<N extends Number>{
        private N[] numbers;

        public BoxWithNumbers(N... numbers) {
            this.numbers = numbers;
        }

        public boolean equalByAvg(BoxWithNumbers<?> another){
            return Math.abs(this.avg() - another.avg())<0.0000001;
        }

        public boolean equalWithList(List<? extends Number> list){
            double sum = 0;
            for (Number number : list) {
                sum += number.doubleValue();
            }
            sum /= list.size();
            return Math.abs(this.avg()-sum) < 0.00001;
        }
        public double avg(){
            return sum() / numbers.length;
        }

        public double sum(){
            double sum = 0;
            for (N number : numbers) {
                sum += number.doubleValue();
            }
            return sum;
        }
        public N[] getNumbers() {
            return numbers;
        }

        public void setNumbers(N... numbers) {
            this.numbers = numbers;
        }
    }
