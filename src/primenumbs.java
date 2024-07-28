public class primenumbs {
    public static void main(String[] args) {
        // int a=37;
        int count=0;
        for(int j=1;j<=100;j++){
            // j=23
            for(int i=1;i<=j;i++){
                if(j%i==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(j);
            }
            count=0;
        }
    }
} 