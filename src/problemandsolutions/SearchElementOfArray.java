package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        int x, snum;
        for (x = 0; x < arr.length; x++) {
            System.out.println("Please Enter the Number : ");
            arr[x] = scan.nextInt();
        }
        System.out.println("Please Enter Search Number : ");
        snum = scan.nextInt();
        boolean found = false;
        for (x = 0; x < arr.length; x++) {
            if (snum == arr[x]) {
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

    }


}

