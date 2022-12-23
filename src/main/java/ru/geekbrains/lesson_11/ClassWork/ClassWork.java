package ru.geekbrains.lesson_11.ClassWork;

import java.util.Arrays;
import java.util.List;

//T(ype),E(lement),K(ey),V(alue),N(umber)
public class ClassWork {
    public static void main(String[] args) {
//        simpleBox();
//        genBox();
//        varargExample(10,21);
        BoxWithNumbers<Integer> bi = new BoxWithNumbers<>(1,2,3,4,5);
        BoxWithNumbers<Integer> bi2 = new BoxWithNumbers<>(1,2,3,4,5);
        BoxWithNumbers<Float> bf = new BoxWithNumbers<>(1f,2f,3f,4f,5f);
//        System.out.println(bi.equalByAvg(bf));
//
//        System.out.println(bf.equalWithList(List.of(1,2,3,4,5)));
//        Collections.copy();
//        double a = 0.7;
//        double b = 0;
//        for (int i = 0; i < 70; i++) {
//            b += 0.01;
//        }
//        System.out.println(Math.abs(a - b) <0.00000001);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(bi.equalByAvg(bi2));
//        System.out.println(bi.sum());
//        System.out.println(bi.avg());
            List<Integer> ints = List.of(5,4,3,2);
            int sum = getFirstObject(ints) + 10;
        System.out.println(sum);
    }
    
    private static <Q> Q getFirstObject(List<Q> list){
        return list.get(0);
    }
    
    private static void varargExample(int ... ints){
        System.out.println(ints.getClass().getName());
        System.out.println(Arrays.toString(ints));
    }

    private static void genBox() {
        //BoxGen bgRaw = new BoxGen(10); RAW example DON'T USE!
        BoxGen<Integer> boxi = new BoxGen<>(100);
        BoxGen<Integer> boxii = new BoxGen<>(500);

        BoxGen<String> boxs = new BoxGen<>("Hello ");
        BoxGen<String> boxss = new BoxGen<>("world!");
        int sum = boxi.getItem() + boxii.getItem();
        System.out.println(sum);
        System.out.println(boxs.getItem() + boxss.getItem());
    }

    private static void simpleBox() {
        Box boxi = new Box(25);
        Box boxii = new Box(45);

        //... a lot of string of code

        boxi.setObj("Hello");


        //... a lot of string of code


        int sum = 0;
        if (boxi.getObj() instanceof Integer && boxii.getObj() instanceof Integer) {

            sum = (Integer) boxi.getObj() + (Integer) boxii.getObj();

        }

        System.out.println(sum);
    }
}
