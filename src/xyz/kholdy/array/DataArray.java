package xyz.kholdy.array;

public class DataArray {
    private Person[] a;
    private int nElems;

    public DataArray(int max) {
        a = new Person[max];
        nElems = 0;
    }

    public Person find(String searchName) {
        int i;

        for (i = 0; i < nElems; i++) {
            if (a[i].getLastName().equals(searchName)) break;
        }

        if (i == nElems) {
            return null;
        } else {
            return a[i];
        }
    }

    public void insert(String lastName, String firstName, int age) {
        a[nElems] = new Person(lastName, firstName, age);
        nElems++;
    }

    public boolean delete(String searchName) {
        int i;

        for (i = 0; i < nElems; i++) {
            if (a[i].getLastName().equals(searchName)) break;
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

    public void display() {
        for (int i = 0; i < nElems; i++) {
            a[i].displayPerson();
            System.out.println();
        }
    }
}
