import java.util.*;
public class Calculator {
    public static void main(String[] args)
    {
        // Calculator program
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two numbers to perform operations");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println("enter the operation you want to perform:");
        System.out.println("enter 1.ADDITION\n2.SUBTRACTION\n3.MULTIPLICATION\n4.DIVISION");
        int op=sc.nextInt();
        if(op==1)
        {
            System.out.println("ADDITION RESULT:"+(n1+n2));
        }
        else if(op==2)
        {
            System.out.println("SUBTRACTION RESULT:"+(n1-n2));
        } else if (op==3) {System.out.println("MULTIPLICATION RESULT:"+(n1*n2));

        }
        else if(op==4)
        {
            System.out.println("DIVISION RESULT:"+(n1/n2));
        }
        else
        {
            System.out.println("Enter the valid choice from 1/2/3/4");
        }
    }
}
