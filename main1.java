package ss;

/**
 * Created by DELL on 2/22/2021.
 */
public class main1 {
    public static void main(String[] args) {
        String[] names = { "Hajeb", "Mahfoud", "Shatha" };

        printArray(names);
    }

    public static <T> void printArray(T[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");

    }
}
