package xyz.kholdy.array;

public class HighArrayApp {

    public static void main(String[] args) {
        HighArray arr = new HighArray(100);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.display();

        HighArray arrSorted = new HighArray(100);
        for (int i = 0; i < 10; i++) {
            arrSorted.insert(arr.getMax());
        }

        arrSorted.display();

        if (arr.find(55)) {
            System.out.println("Found " + 55);
        } else {
            System.out.println("Can not find " + 55);
        }

        arr.delete(0);
        arr.delete(55);
        arr.delete(99);

        arr.display();

        System.out.println(arr.getMax());
        arr.display();


    }

}
