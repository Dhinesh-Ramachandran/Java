import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int printValue =1;
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(printValue);
                printValue++;
            }
            System.out.println();
        }
    }
}
