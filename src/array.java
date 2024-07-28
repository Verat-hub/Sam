import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your array length: ");
        int len = in.nextInt();
        int[]scan=new int[len];
        for (int i=0;i<scan.length;i++){
            System.out.println("Enter the value of the index: "+i);
            scan[i]=in.nextInt();
        }
        for(int j:scan){
            System.out.println(j);
        }
        
    }

    
}
