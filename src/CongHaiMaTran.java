import java.util.Scanner;

public class CongHaiMaTran {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số cột của hai ma trận: ");
        int x = sc.nextInt();
        System.out.print("số dòng của hai ma trận: ");
        int y = sc.nextInt();
        int[][] array1 = new int[x][y];
        int[][] array2 = new int[x][y];
        int[][] array3 = new int[x][y];
        System.out.println("Nhập dữ liệu cho các ma trận.");
        for (int i = 0; i < x; i++) {
            System.out.println("Nhập dữ liệu cho dòng " + (i + 1) + " của ma trận 1:");
            for (int j = 0; j < y; j++) {
                int number = sc.nextInt();
                array1[i][j] = number;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.println("Nhập dữ liệu cho dòng " + (i + 1) + " của ma trận 2:");
            for (int j = 0; j < y; j++) {
                int number = sc.nextInt();
                array2[i][j] = number;
            }
        }
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Ma Trận mới khi gộp hai ma trận 1 và 2 lại là: ");
        for (int i = 0; i < x; i++) {
            System.out.println();
            for (int j = 0; j < y; j++) {
                System.out.print(array3[i][j] + "\t");
            }
        }
    }
}
