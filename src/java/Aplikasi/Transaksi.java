package Aplikasi;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Transaksi implements Serializable {

    @Id
    private int id_transaksi;
    private String nama_menu;
    private int jumlah_menu;
    private String tgl_transaksi;
    private int total_harga;

    public int getId_transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getJumlah_menu() {
        return jumlah_menu;
    }

    public void setJumlah_menu(int jumlah_menu) {
        this.jumlah_menu = jumlah_menu;
    }

    public String getTgl_transaksi() {
        return tgl_transaksi;
    }

    public void setTgl_transaksi(String tgl_transaksi) {
        this.tgl_transaksi = tgl_transaksi;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }

}
