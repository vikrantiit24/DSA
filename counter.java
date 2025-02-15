import java.util.Scanner;
public class counter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n = in.nextInt();
        int count =0;
        while (n>0){
            int rem = n%10;
            if(rem == 3){
                count++;
            }
            n = n /10;
        }
        System.out.println("The number of 3 in the digit is "+count);
    }
}
