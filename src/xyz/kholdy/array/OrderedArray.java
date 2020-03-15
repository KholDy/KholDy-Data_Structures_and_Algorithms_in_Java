package xyz.kholdy.array;

public class OrderedArray {
    private long[] a;
    private int nElems;

    public OrderedArray(int max) {
        a = new long[max];
        nElems = 0;
    }

    public int size() {
        return nElems;
    }

    //Бинарный поиск элемента
    public int find(long searchKey) {
        int lowerBound = 0;             //Нижняя граница массива
        int upperBound = nElems - 1;    //Верхняя граница массива
        int curIn;                      //Середина массива

        while (true) {
            curIn = (lowerBound + upperBound) / 2;
            if (a[curIn] == searchKey) {
                return curIn;           //Элемент найден
            } else if (lowerBound > upperBound) {
                return nElems;          //Элемент не найден
            } else {
                if (a[curIn] < searchKey) {
                    lowerBound = curIn + 1;
                } else {
                    upperBound = curIn - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int i;

        //Определение позиции вставки
        for (i = 0; i < nElems; i++) {
            if (a[i] > value) break;
        }

        //Перемещение последующих элементов
        for (int j = nElems; j > i; j--) {
            a[j] = a[j - 1];
        }

        a[i] = value;
        nElems++;
    }

    public boolean delete(long value) {
        int i = find(value);
        if (i == nElems) {
            return false;   //Элемент не найден
        } else {
            //Если элемент найден, перемещаем элементы на одн к началу массива
            for (int j = i; j < nElems; j++) {
                a[j] = a[j + 1];
            }
            nElems--;
            return true;
        }
    }

    public long[] merge(long[] b) {
        long[] merge = new long[a.length + b.length];
        int j = 0;

        for (int i = 0; i < merge.length; i++) {
            if (a[i] < b[i]) {
                merge[j] = a[i];
                merge[j + 1] = b[i];
            }
        }

        return merge;
    }

    public void noDups() {
        for (int i = 0; i < nElems; i++) {
            for (int j = 0; j < nElems; j++) {
                if (a[i] == a[j] && i != j) {
                    delete(a[j]);
                }
            }
        }
    }

    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
