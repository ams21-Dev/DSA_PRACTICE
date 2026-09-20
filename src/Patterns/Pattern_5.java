import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sf = new Scanner(System.in);
        int input = sf.nextInt();
        for(int i=1;i<=input;i++){
            for(int j=i;j<=input;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sf.close();
    }
}