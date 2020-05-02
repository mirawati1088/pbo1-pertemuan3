package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet < totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan");
        } else {
            System.out.println("Uang cukup, Selamat menikmati");
        }
    }
}