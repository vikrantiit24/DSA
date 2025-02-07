import java.util.Scanner;

public class day1 {
    public static void main(String[] args) {
//Leap year problem
        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the year");
//        int year = input.nextInt();
//        if(year%4==0){
//            System.out.println("leap year(LY)");
//        }
//        else {
//            System.out.println("Not a leap year ");
//        }
//        System.out.print("enter the first number\n");
//        int num1 = input.nextInt();
//        System.out.print("enter the first number\n");
//        int num2 = input.nextInt();
//        int sum = num2+num1;
//        System.out.println("the sum of two numbers is: "+sum);
        //Multiplicative_Table
//        System.out.println("Enter the number");
//        int num = input.nextInt();
//        for(int i=1 ; i<11; i++){
//
//            System.out.println(num*i);
//        }
//        int hcf =0;
//        System.out.println("enter num1");
//        int num1 = input.nextInt();
//        System.out.println("enter num2");
//        int num2 = input.nextInt();
//        for(int i =1; i<num1;i++){
//           if (num1%i==0 && num2%i==0){
//               hcf =i;
//           }
//           else{
//               System.out.println("this is a prime number ");
//           }
//        }
//        System.out.println("the hcf of two numbers is  "+hcf);
//        int lcm = num1*num2/hcf;
//        System.out.println("the lcm of two numbers is  "+lcm);

        //Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
        int sum =0;
        System.out.println("Enter the number");
        int n = input.nextInt();
        for (int i=0 ; i<n ; i++){
            System.out.println("enter number ");
            int net = input.nextInt();
            sum+=net;
        }
        System.out.println("the sum og the numbers is  "+sum);

    }

}
