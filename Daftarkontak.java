import java.util.ArrayList;
import java.util.Scanner;


public class Daftarkontak {
    public static void main(String[] args) {
        ArrayList<Kontak> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("=== Menu Daftar Kontak ===");
            System.out.println("1. Tambah Kontak");
            System.out.println("2. Lihat Semua Kontak");
            System.out.println("3. Hapus Kontak");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.print("Masukkan nama: ");
                String name = scanner.nextLine();
                System.out.print("Masukkan nomor telepon: ");
                String phoneNumber = scanner.nextLine();
                contacts.add(new Kontak(name, phoneNumber));
            } else if (option == 2) {

                System.out.println("Daftar Kontak:");
                for (Kontak contact : contacts) {
                    System.out.println(contact);
                }
            } else if (option == 3) {

                System.out.print("Masukkan nama kontak yang ingin dihapus: ");
                String nameToRemove = scanner.nextLine();
                contacts.removeIf(contact -> contact.name.equals(nameToRemove));
            } else if (option == 4) {
                System.out.println("Keluar...");
            } else {
                System.out.println("Opsi tidak valid!");
            }
        }
        scanner.close();
    }
}

