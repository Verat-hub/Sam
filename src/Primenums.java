public class Primenums {
    public static void main(String[] args) {
        int num =31;
        int count =0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
            count++;
        }
    }if(count==0){
        System.out.println("Prime Number");
    }
    else{
        System.out.println("Composite");
    }

    }
}
