package ss;

import java.util.Arrays;

/**
 * Created by DELL on 2/22/2021.
 */
public class main3 {
    public static void main(String[] args) {
        //تعريف مصفوفتين
        int[] array1 = {
                1,
                2,
                3,
                4
        };
        int[] array2 = {
                5,
                6,
                7,
                8
        };

        //حساب مجموع طول صفيفتين
        int length = array1.length + array2.length;

        System.out.println("First Array is: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(" " + array1[i]);
        }
        System.out.println(" ");

        System.out.println("Second Array is: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(" " + array2[i]);
        }

        //إنشاء مصفوفة ناتجة من الطول المحسوب
        int[] result = new int[length];
        int position = 0;

        //لكل  لإضافة عناصر array1 إلى المصفوفة الناتجة
        for (int element: array1) {
            result[position] = element;
            position++;
        }

        //لكل حلقة لإضافة عناصر array2 إلى المصفوفة الناتجة
        for (int element: array2) {
            result[position] = element;
            position++;
        }

        System.out.println("\nThe resulting array after merging two arrays is: ");
        System.out.println(Arrays.toString(result));
    }
}
