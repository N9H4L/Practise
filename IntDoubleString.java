import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        // Write your code here.
        double d = scan.nextDouble();
        String s = scan.next();
        System.out.println("String: " + s +  scan.nextLine());
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
}
