import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        System.out.println("Enter the  number:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println("Entered age is:"+num);
        if (num>=18){
        System.out.println("Eligible"+" "+num);
    }
    else{
        System.out.println("Not eligible"+num);
    }
    }
}
