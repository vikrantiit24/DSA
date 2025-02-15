import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 23335433;
        int ans =0;
        while (n > 0){
            int rem = n%10;
            n /= 10;
            ans = ans*10+rem;
        }
        System.out.println(ans);

    }
}
//logid
//Dividing n by 10 (n /= 10):
//
//This operation removes the last digit of the number n. For example, if n is 23335433, after n /= 10, the value of n will become 2333543. The last digit (3 in this case) is discarded.
//This process continues until n becomes 0, effectively removing the digits from right to left.
//Building the reversed number (ans = ans * 10 + rem):
//
//The variable ans is used to store the reversed number. Initially, ans is set to 0.
//Inside the loop, rem = n % 10 gives the last digit of n. For example, if n = 23335433, rem = 3 (because 23335433 % 10 = 3).
//Then, ans = ans * 10 + rem places that digit at the end of ans. Initially, ans is 0, so when the first digit (3) is added, ans becomes 3.
//On the next iteration, after dividing n by 10, n becomes 2333543 and rem = 3 again. Now, ans = 3 * 10 + 3 = 33. This process continues until n becomes 0.
//Step-by-step breakdown:
//For n = 23335433, this is how the algorithm works:
//
//First iteration:
//
//rem = 23335433 % 10 = 3
//n = 23335433 / 10 = 2333543
//ans = 0 * 10 + 3 = 3
//Second iteration:
//
//rem = 2333543 % 10 = 3
//n = 2333543 / 10 = 233354
//ans = 3 * 10 + 3 = 33
//Third iteration:
//
//rem = 233354 % 10 = 4
//n = 233354 / 10 = 23335
//ans = 33 * 10 + 4 = 334
//Fourth iteration:
//
//rem = 23335 % 10 = 5
//n = 23335 / 10 = 2333
//ans = 334 * 10 + 5 = 3345
//        ... and so on until n becomes 0.