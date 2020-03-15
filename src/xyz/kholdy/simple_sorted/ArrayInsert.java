package xyz.kholdy.simple_sorted;

import java.util.Arrays;

public class ArrayInsert {
    private long[] array; //Link on array
    private int nElements;  //Quantity elements in array

    public ArrayInsert(int element) {
        array = new long[element];  //Creating array, volume "element" elements
        this.nElements = 0; //Empty array
    }

    public void insert(long value) {
        array[nElements] = value;   //Insert value in place nElements
        nElements++;    //Counter increase
    }

    public void display() {
        System.out.println(Arrays.toString(array)); //Console output
    }

    public void insertSort() {
        int j;
        long temp;

        for (int i = 1; i < array.length; i++) {    //Внешний цикл идет вправо
            temp = array[i];    //Копируем не отсортированый элемент во временную переменную
            for (j = i; j > 0; j--) {   //Внутренний цикл идет влево
                if (array[j - 1] >= temp) {  //Сравниваем не отсортированный элемент с отсортированным
                    array[j] = array[j - 1]; //Если temp меньше то сдвигаем отсортированный элемент вправо
                } else { //Иначе выходим из цикла
                    break;
                }
            }
            array[j] = temp;    //Записываем неотсортированный элемент на свое место
        }
    }
}
