import java.util.Scanner;

public class TinhTongCacSoTrenMotCotXacDinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số dòng: ");
        int dong = sc.nextInt();
        System.out.print("Số cột: ");
        int cot = sc.nextInt();

        int[][] array = new int[cot][dong];
        for (int i = 0; i < cot; i++) {
            System.out.println("thêm dữ liệu vào mảng ở dòng: " + (i + 1));
            for (int j = 0; j < dong; j++) {
                int number = sc.nextInt();
                array[i][j] = number;
            }
        }
        int tong = 0;
        System.out.print("Bạn muốn tính tổng của cột thứ mấy: ");
        int cot_num = sc.nextInt();
        for (int i = 0; i < cot; i++) {
            for (int j = 0; j < dong; j++) {
                if (j == cot_num - 1) {
                    tong = tong + array[i][j];
                }
            }
        }
        System.out.println("Tổng của các số nằm trên cột thứ " + cot_num + " là: " + tong);
    }
}
