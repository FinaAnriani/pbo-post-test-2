package tokojilbab.entity;

public class Jilbab implements Jilbab_Data {

    private int id;
    private String nama;
    private String jenis;
    private double harga;

    public Jilbab(int id, String nama, String jenis, double harga) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getJenis() {
        return jenis;
    }

    @Override
    public double getHarga() {
        return harga;
    }

    // Setters if needed
    public void setId(int id) {
        this.id = id;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}