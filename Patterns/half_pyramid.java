public class half_pyramid{
    public static void main(String args[]){
        int n=4;
        // outer loop
        for(int line=1; line<=4; line++){
            // inner loop
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}