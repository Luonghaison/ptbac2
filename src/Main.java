import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gia tri a");
        int a = sc.nextInt();
        System.out.println("Nhap gia tri b");
        int b = sc.nextInt();
        System.out.println("Nhap gia tri cua c");
        int c = sc.nextInt();

        QuadraticEquation bac2 = new QuadraticEquation(a, b, c);

        if (bac2.getDelta() >= 0) {
            System.out.println("nghiệm pt là " + bac2.getX1() + "va" + bac2.getX2());
        } else if (bac2.getDelta() == 0) {
            System.out.println("pt co nghiem kep \n" + bac2.getX1());
        } else {
            System.out.println("pt vo nghiem");


        }
    }
}