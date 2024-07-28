import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int len=in.nextInt();
        String[]scan=new String[len];
        for(int i=0;i<scan.length;i++){
        System.out.println("Enter the value of index: "+i);
        scan[i]=in.next();
    }
    for(String j:scan){
        System.out.println(j);
    }

    }
}
