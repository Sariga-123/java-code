import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        int reverse=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n/=10;
            System.out.println(n+" is a palindrome");
        }
    }
}