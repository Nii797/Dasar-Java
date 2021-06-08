package Test;

public class Mobil {
    private String nama;
    private String warna;
    private int jarak = 0;
    private int fuel = 100;

    Mobil(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public void printData() {
        System.out.println("Nama Mobil: " + this.nama + ".");
        System.out.println("Warna Mobil: " + this.warna + ".");
        System.out.println("Jarak Mobil: " + this.jarak + " Km.");
        System.out.println("Bahan Bakar: " + this.fuel + "L");
    }

    public void runMobil(int jarak) {
        System.out.println("Bergerak " + jarak + " Km ...");
        if (jarak <= this.fuel) {
            this.jarak += jarak;
            this.fuel -= jarak;
        } else {
            System.out.println("Bahan bakar tidak cukup");
        }

        // this.jarak += jarak;
        System.out.println("Jarak : " + this.jarak + " Km.");
        System.out.println("Bahan Bakar: " + fuel + "L");
    }

}
