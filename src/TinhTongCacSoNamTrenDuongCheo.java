import java.util.Scanner;

public class TinhTongCacSoNamTrenDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn mảng của bạn cao bao nhiêu: ");
        int n = sc.nextInt();
        int[][] hinhvuong = new  int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập dữ liệu cho các mảng: ");
            for (int j = 0; j < n; j++) {
                int number = sc.nextInt();
                hinhvuong[i][j] = number;
            }
        }
        int tổng = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == n - j - 1 || j == n - i - 1) {
                    tổng = tổng + hinhvuong[i][j];
                }
            }
        }
        System.out.println("Tổng của các số nằm trên đường chéo của hình vuông là: "+tổng);
    }
}
