import java.util.Scanner;

public class VeBanDoChoiCaRo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("số cột: ");
        int a = sc.nextInt();
        System.out.print("số dòng:");
        int b = sc.nextInt();
        char[][] array = new char[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = ' ';
            }
        }
        System.out.print("Kí hiệu của người chơi thứ nhất: ");
        char nguoi1 = sc.next().charAt(0);
        System.out.print("Kí hiệu của người chơi thứ hai: ");
        char nguoi2 = sc.next().charAt(0);
        while (true) {
            System.out.println("Lượt người thứ nhất.");
            System.out.println("mời bạn chọn tọa độ: ");
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            if (array[a1][b1] == nguoi1 || array[a1][b1] == nguoi2) {
                System.out.println("Vị trí bạn chọn đã được lựa chọn. Mời bạn chọn lại vị trí.");
                continue;
            } else {
                array[a1][b1] = nguoi1;
            }
            System.out.println("Lượt người thứ hai.");
            System.out.println("mời bạn chọn tọa độ: ");
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            if (array[a2][b2] == nguoi1 || array[a2][b2] == nguoi2) {
                System.out.println("Vị trí bạn chọn đã được lựa chọn. Mời bạn chọn lại vị trí.");
                continue;
            } else {
                array[a2][b2] = nguoi2;
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(array[i][j] + "|");
                }
                System.out.println();
                System.out.println("--------------------------------------");
            }
        }
    }
}
