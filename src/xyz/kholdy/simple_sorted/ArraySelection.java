package xyz.kholdy.simple_sorted;

import java.util.Arrays;

public class ArraySelection {
    private long[] array;   //Ссылка на массив
    private int nElements;  //Количество элементов в массиве

    public ArraySelection(int elements) {
        array = new long[elements]; //Создание массива
        this.nElements = 0; //Массив пуст
    }

    public void insert(long value) {
        array[nElements] = value;   //Вставка элемента
        nElements++;    //Увеличение счетчика элементов в массиве
    }

    public void display() {
        System.out.println(Arrays.toString(array)); //Вывод массива в терминал
    }

    public void selectionSort() {
        int min = 0;
        long temp = 0;

        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
