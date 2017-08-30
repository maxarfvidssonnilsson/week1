package exercises;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Ex7SmallestStepRPS {

    public static void main(String[] args) {
        new Ex7SmallestStepRPS().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        int[] array = new int[5], array2 = new int[5];
        out.print("Plz tell me five numbers");
        int hg = sc.nextInt();
        int hgLength = String.valueOf(hg).length();
        if (hgLength != 5){
            out.println("I said five!!!");
        }
        else {
            int i = 0;
            while (i < hgLength) {
                array2[i] = hg % 10;
                hg /= 10;
                i++;
            }
            i = 0;
            while (i < hgLength) {
                array[i] = array2[hgLength - i - 1];
                i++;
            }
            while (true) {
                out.println("choose a number you whant to find.");
                int number = sc.nextInt();
                boolean numberFound = false;
                for (int z = 0; z < hgLength; z++) {
                    if (number == array[z]) {
                        out.println(z);
                        numberFound = true;
                    }
                }
                if (numberFound == false) {
                    out.println("your number was not found.");
                }
            }
        }
    }
}

