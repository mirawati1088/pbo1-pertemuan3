package Percabangan;

public class IfElse {
    public static void main(String[] args) {
        double totalBelanja = 53000;
        double uangDiDompet = 25000;

        if (uangDiDompet < totalBelanja) {
            System.out.println("Uang kurang, kurangi jajan");
        } else if(uangDiDompet>totalBelanja) {
            double kembalian = uangDiDompet - totalBelanja;
            System.out.println("Uang cukup, ada kembalian :" + kembalian);
        }else{
            System.out.println("Uang pas..., Terimakasih...");
        }
    }
}