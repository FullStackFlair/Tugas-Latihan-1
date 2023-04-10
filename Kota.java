package TugasLatihan1;


//Tugas 1 Soal Latihan
public class Kota<E> {
    private final E element;

    public Kota(E Kota) {
        element = Kota;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah Kota di Jawa Timur : " + jumlahKota.getElement());
        System.out.println("Salah Satu Kota di awa Timur : " + namaKota.getElement());
    }

    public E getElement() {
        return element;
    }
}
