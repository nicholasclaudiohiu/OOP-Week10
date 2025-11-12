package Assignment;

public class Handphone extends Barang {
    private String warna;

    public Handphone(String id, String nama, double harga, int stok, String warna) {
        super(id, nama, harga, stok);
        this.warna = warna;
    }

    public String getWarna() { return warna; }

    @Override
    public double getHargaJual() {
        return harga;
    }
}

