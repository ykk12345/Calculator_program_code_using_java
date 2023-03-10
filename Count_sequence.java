import java.util.Scanner;
public class Count_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int count=0;
        int rem=0;

        while(n>0)
        {
            rem=n%10;
            if(rem==target)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
