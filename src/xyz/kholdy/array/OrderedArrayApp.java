package xyz.kholdy.array;

import java.util.Arrays;

public class OrderedArrayApp {

    public static void main(String[] args) {
        int maxSize = 100;
        OrderedArray arr = new OrderedArray(maxSize);

        arr.insert(77);
        arr.insert(22);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(0);
        arr.insert(22);
        arr.insert(33);

        arr.display();

        arr.noDups();
        arr.display();

        int searchKey = 55;
        if (arr.find(searchKey) != arr.size()) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);

        arr.display();
    //*********************************************Слияние двух массивов************************************************
        int[] a = {21, 23, 24, 40, 75, 76, 77, 78, 900, 2100, 2200, 2300, 2400, 2500};
        int[] b = {10, 11, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
        int[] merge = new int[a.length + b.length];

        int indexArrayA = 0;
        int indexArrayB = 0;

        for (int i = 0; i < merge.length; i++) {
            if (indexArrayA > a.length - 1) {           //Если достигли конца массива А
                merge[i] = b[indexArrayB];
                indexArrayB++;
            } else if (indexArrayB > b.length - 1) {    //Если достигли конца массива В
                merge[i] = a[indexArrayA];
                indexArrayA++;
            } else if (a[indexArrayA] < b[indexArrayB]) {
                merge[i] = a[indexArrayA];
                indexArrayA++;
            } else {
                merge[i] = b[indexArrayB];
                indexArrayB++;
            }
        }

        System.out.println(Arrays.toString(merge));
    }
}
