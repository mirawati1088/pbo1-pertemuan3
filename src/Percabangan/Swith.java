package Percabangan;

public class Swith {
    public static void main(String[] args) {
       char nilai='D';
        switch (nilai){
            case 'A':
                System.out.println("Mhs: \"Terimakasi Pak\"");
                System.out.println("DoseN : \"Selamat Ya\"");
                break;
            case 'B':
                System.out.println("Mhs  :\"kenapa ulun dapat C ,pak??\"");
                System.out.println("Dosen :\" karena e karena\"");
                break;
            case 'C':
                System.out.println("Mhs : \"uln sekali kada ngumpul tugas pak\"");
                System.out.println("Dosen :\"itu lah akibatnya,huhu!!!\"");
                break;

            default:
                System.out.println("Mhs : \"ulun rekos lah pak,,,\"");
                System.out.println("Dosen :\"Silah kan mba ,lebih rajin!!!\"");
                break;
        }
    }
}
