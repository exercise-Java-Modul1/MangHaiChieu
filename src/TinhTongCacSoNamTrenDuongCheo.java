import java.util.Scanner;

public class TinhTongCacSoNamTrenDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bạn muốn mảng của bạn cao bao nhiêu: ");
        int x = sc.nextInt();
        System.out.print("Bạn muốn mảng của bạn rộng bao nhiêu: ");
        int y = sc.nextInt();
        int[][] hinhvuong = new  int[x][y];
        for (int i = 0; i < x; i++) {
            System.out.println("Nhập dữ liệu cho các mảng: ");
            for (int j = 0; j < y; j++) {
                int number = sc.nextInt();
                hinhvuong[i][j] = number;
            }
        }
        int tổng = hinhvuong[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                tổng = tổng + hinhvuong[i][j];
            }
        }
        int tổng_all = tổng - hinhvuong[0][0];
        System.out.println(tổng_all);
    }
}
