package reverseString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        char arr[] = inputStr.toCharArray();
        scanner.close();
        System.out.println(swap(arr));
    }

    private static String swap(char arr[]) {
        int n = arr.length - 1, i = 0;
        while (n > i) {
            // swap characters
            char temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
            n--;
            i++;
        }
        String reverse = new String(arr);
        return reverse;
    }

}
