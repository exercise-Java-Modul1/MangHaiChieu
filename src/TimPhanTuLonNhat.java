import java.util.Scanner;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số cột: ");
        int x = sc.nextInt();
        System.out.print("Số dòng: ");
        int y = sc.nextInt();
        double[][] array = new double[x][y];
        for (int i = 0; i < x; i++) {
            System.out.println("Nhập giá trị vào cho dòng " + (i + 1));
            for (int j = 0; j < y; j++) {
                double number = sc.nextDouble();
                array[i][j] = number;
            }
        }
        double max = array[0][0];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
    }
}
