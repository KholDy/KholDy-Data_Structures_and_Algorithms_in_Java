package xyz.kholdy.array;

public class DataApp {

    public static void main(String[] args) {
        int maxSize = 100;
        DataArray arr = new DataArray(maxSize);

        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Lamarque", "Henry", 54);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        arr.display();
        System.out.println();

        String searchName = "Stimson";
        Person found = arr.find(searchName);

        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + searchName);
        }

        System.out.println();
        arr.delete("Smith");
        arr.delete("Yee");
        arr.delete("Creswell");

        arr.display();
    }

}
