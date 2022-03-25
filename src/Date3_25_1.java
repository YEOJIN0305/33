import java.util.Scanner;

public class Date3_25_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = 3;
        int inc = 3;

        System.out.print("몇 줄 크기의 마름모를 만드시겠습니까?");
        int n = sc.nextInt();
        int m = (n + 1) / 2;
        System.out.print("중간 값은" + m + "\n");

        for (int i = 1; i <= n; i++){
            for(int j = 1; j <= inc; j++){
                if (j < dec) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if(i < m){
                inc++;
                dec--;
            } else{
                inc--;
                dec++;
            }

        }
    }
}
