import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        InsertionSort1 obj = new InsertionSort1();

        rand.setSeed(System.currentTimeMillis());

        int[] data = new int[10];

        for(int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
        }

        int[] orig = Arrays.copyOf(data, data.length);

        System.out.println("Array before sort: ");
        printIntegerList(orig);
        System.out.println("Data equal to Orig: " + Arrays.equals(data, orig));

        System.out.println("Array after sort: ");
        long begin = System.currentTimeMillis();
        Arrays.sort(data);
        printIntegerList(data);
        long end = System.currentTimeMillis();
        long elapsedTime = (end - begin) / 1000;
        System.out.println("Data equal to Orig: " + Arrays.equals(data, orig));
        System.out.println("Elapsed Time: " + elapsedTime + "s");

        /** Linked List **/
        SinglyLinkedList list = new SinglyLinkedList();

        list.addFirst("Jesus");
        list.addLast("Jessica");
        System.out.println("Size of list: " + list.size());
        System.out.print("Empty: " + list.isEmpty() + "\n");
        list.display();
    }
    public static void printIntegerList(int[] list) {
        for (int j : list) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
