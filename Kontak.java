public class Kontak {
    String name;
    String phoneNumber;

    Kontak(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String toString() {
        return "Nama: " + name + ", Nomor: " + phoneNumber;
    }
}