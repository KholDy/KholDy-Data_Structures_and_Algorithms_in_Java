package xyz.kholdy.array;

public class HighArray {
    private long[] a;
    private int nElems;     //Количество элементов в массиве

    public HighArray(int max) {
        a = new long[max];
        nElems = 0;         //При создании массива все элемнты пусты
    }

    public int getnElems() {
        return nElems;
    }

    public boolean find(long searchKey) {
        for (int i = 0; i < nElems; i++) {
            if (a[i] == searchKey) {
                return true;
            }
        }
        return false;
    }

    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i;

        for (i = 0; i < nElems; i++) {
            if (a[i] == value) break;
        }

        if (i == nElems) {
            return false;
        } else {
            for (int j = i; j < nElems; j++) { //Сдвиг элементов после удаления найденого значения
                a[j] = a[j + 1];
            }
            nElems--; //Уменьшение размера массива на один удаленный элемент
            return true;
        }
    }

    public long getMax() {
        long max = 0;
        for (int i = 0; i < nElems; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        delete(max);
        return max;
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
