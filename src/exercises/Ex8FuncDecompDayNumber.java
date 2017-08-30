package exercises;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.in;
import static java.lang.System.out;

/*
 *   Program to calculate the day number for same day in a given year.
 *   - You should use methods and functional decomposition.
 *   - To check solution, see http://mistupid.com/calendar/dayofyear.htm
 *
 *
 * See:
 * - FuncDecompLCR
 */
public class Ex8FuncDecompDayNumber {

    public static void main(String[] args) {
        new Ex8FuncDecompDayNumber().program();
    }

    final Scanner sc = new Scanner(in);

    void program() {
        //test();                // <--------- Uncomment to test only

        // -- In ----------------
        boolean leapYear = false;
        int days = 0;
        out.print("Input a year > ");
        int year = sc.nextInt();
        out.print("Input a month number > ");
        int month = sc.nextInt();
        out.print("Input a day number > ");
        int day = sc.nextInt();

        // --- Process ---------
        if (year % 4 == 0) {
            out.println("the year of " + year + " is a leap year.");
            leapYear = true;
        } else {
            out.println("the year of " + year + " is not a leap year.");
        }

        int[] monthssss = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (leapYear == true && month >= 2){
            monthssss[1] += 1;
        }
        if (day > monthssss[month - 1]){
            out.println("This month does not have that number of days!!!!!!!");
        }
        else if (month > 12){
            out.println("there are only 12 months in a year!!!!!");
        }
        else
        {
            for (int i = 0; i < (month - 1); i ++){
                days += monthssss[i];
            }
            days+= day;


            out.println("day number of " + day + "/" + month + " 2017 is: " + days);
        }

        // ---- Out ----


    }





    void printResult(int year, int month, int day, int numberOfDay) {
        // Use this
    }

    void test(){
        out.println("Start testing");

        // TODO test any method you discover here

        exit(0);
    }


}
