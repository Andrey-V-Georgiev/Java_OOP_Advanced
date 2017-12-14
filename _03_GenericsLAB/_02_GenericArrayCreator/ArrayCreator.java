package _03_GenericsLAB._02_GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public ArrayCreator(){

    }

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }


    public static <T> T[] create(Class<T> cl, int length, T item) {
        T[] array = (T[]) Array.newInstance(cl, length);
        for (int i = 0; i < array.length; i++) {
            array[i] = item;
        }
        return array;
    }


}