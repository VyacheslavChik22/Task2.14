import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("book1");
        myArrayList.add("book2");
        myArrayList.add("book3");

        System.out.println(Arrays.toString(myArrayList.toArray()));
    }
}
