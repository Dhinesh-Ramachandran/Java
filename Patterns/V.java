import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n*2;row++){
            int rowChange = row>n ? (n*2) -(row -1) :row;
            for(int col=1;col<=n*2;col++){
                if(col<=n-(rowChange-1) || col>(n+rowChange-1)){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
