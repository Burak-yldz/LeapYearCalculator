import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {


        System.out.println("Please enter a year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        if (year>0)
        {
            if (year%4==0)
            {
                if (year%100== 0)
                {
                    if (year%400 == 0)
                    {
                        System.out.println(" Leap year!" + year );
                    }
                    else
                    {
                        System.out.println(" Not leap year!" + year);
                    }
                }
                else
                {
                    System.out.println(" Leap year!" + year );
                }
            }
            else
            {
                System.out.println(" Not leap year!" + year );
            }
        }
        else
        {
            System.out.println("You entered incorrect value" + year);
        }
        input.close();
    }
}