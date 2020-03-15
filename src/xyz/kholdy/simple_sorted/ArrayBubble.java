package xyz.kholdy.simple_sorted;

import java.util.Arrays;

public class ArrayBubble {
    private long[] array;   //Ссылка на массив
    private int nElements;  //Колличество элкментов в массиве

    public ArrayBubble(int elements) {
        array = new long[elements]; //Создание массива емкостью elements элементов
        this.nElements = 0; //Массив пуст
    }

    public void insert(long value) {
        array[nElements] = value;   //Вставка элемента
        nElements++;    //Увеличение счетчика элементов в массиве
    }

    public void display() {
        System.out.println(Arrays.toString(array)); //Вывод массива в терминал
    }

    public void bubbleSort() {
        long temp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
