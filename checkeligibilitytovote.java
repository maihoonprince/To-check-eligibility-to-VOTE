import java.util.*;

public class checkeligibilitytovote 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18)
        {
        System.out.println("You are eligible to vote");
        }
        else
        {
        System.out.println("Not eligible to vote");
        }
    }
}
