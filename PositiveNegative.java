import java.util.Scanner;
public class PositiveNegative{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    int a=sc.nextInt();
    if(a>0){
        System.out.println("positive");
    }
    else if(a<0){
        System.out.println("negative");
    }
    else{
        System.out.println("zero");
    }
    }
}

