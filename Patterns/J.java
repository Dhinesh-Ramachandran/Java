import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=(n*2)-1;row++){
            int rowChange = row>n ? (n*2)-row : row;
            for(int col=1;col<=rowChange;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
