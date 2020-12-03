package Aplikasi;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;
import java.text.SimpleDateFormat;
import java.util.Date;

@ManagedBean(name = "Tsk_Ctr")
@SessionScoped
public class TransaksiController {

    private HibernateUtil helper;
    private Session session;

    private int id_transaksi;
    private String nama_menu;
    private int jumlah_menu1 = 0;
    private int jumlah_menu2 = 0;
    private int jumlah_menu3 = 0;
    private int jumlah_menu4 = 0;
    private int jumlah_menu5 = 0;
    private int jumlah_menu6 = 0;
    private int jumlah_menu7 = 0;
    private int jumlah_menu8 = 0;
    private int jumlah_menu9 = 0;
    private int jumlah_menu10 = 0;
    private int jumlah_menu11 = 0;
    private int jumlah_menu12 = 0;
    private int jumlah_menu13 = 0;
    private int jumlah_menu14 = 0;
    private int jumlah_menu15 = 0;
    private int jumlah_menu16 = 0;
    private int jumlah_menu17 = 0;
    private int jumlah_menu18 = 0;
    private int jumlah_menu19 = 0;
    private int jumlah_menu20 = 0;
    private String tgl_transaksi;
    private int total_harga;

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();

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

    public int getJumlah_menu1() {
        return jumlah_menu1;
    }

    public void setJumlah_menu1(int jumlah_menu1) {
        this.jumlah_menu1 = jumlah_menu1;
    }

    public int getJumlah_menu2() {
        return jumlah_menu2;
    }

    public void setJumlah_menu2(int jumlah_menu2) {
        this.jumlah_menu2 = jumlah_menu2;
    }

    public int getJumlah_menu3() {
        return jumlah_menu3;
    }

    public void setJumlah_menu3(int jumlah_menu3) {
        this.jumlah_menu3 = jumlah_menu3;
    }

    public int getJumlah_menu4() {
        return jumlah_menu4;
    }

    public void setJumlah_menu4(int jumlah_menu4) {
        this.jumlah_menu4 = jumlah_menu4;
    }

    public int getJumlah_menu5() {
        return jumlah_menu5;
    }

    public void setJumlah_menu5(int jumlah_menu5) {
        this.jumlah_menu5 = jumlah_menu5;
    }

    public int getJumlah_menu6() {
        return jumlah_menu6;
    }

    public void setJumlah_menu6(int jumlah_menu6) {
        this.jumlah_menu6 = jumlah_menu6;
    }

    public int getJumlah_menu7() {
        return jumlah_menu7;
    }

    public void setJumlah_menu7(int jumlah_menu7) {
        this.jumlah_menu7 = jumlah_menu7;
    }

    public int getJumlah_menu8() {
        return jumlah_menu8;
    }

    public void setJumlah_menu8(int jumlah_menu8) {
        this.jumlah_menu8 = jumlah_menu8;
    }

    public int getJumlah_menu9() {
        return jumlah_menu9;
    }

    public void setJumlah_menu9(int jumlah_menu9) {
        this.jumlah_menu9 = jumlah_menu9;
    }

    public int getJumlah_menu10() {
        return jumlah_menu10;
    }

    public void setJumlah_menu10(int jumlah_menu10) {
        this.jumlah_menu10 = jumlah_menu10;
    }

    public int getJumlah_menu11() {
        return jumlah_menu11;
    }

    public void setJumlah_menu11(int jumlah_menu11) {
        this.jumlah_menu11 = jumlah_menu11;
    }

    public int getJumlah_menu12() {
        return jumlah_menu12;
    }

    public void setJumlah_menu12(int jumlah_menu12) {
        this.jumlah_menu12 = jumlah_menu12;
    }

    public int getJumlah_menu13() {
        return jumlah_menu13;
    }

    public void setJumlah_menu13(int jumlah_menu13) {
        this.jumlah_menu13 = jumlah_menu13;
    }

    public int getJumlah_menu14() {
        return jumlah_menu14;
    }

    public void setJumlah_menu14(int jumlah_menu14) {
        this.jumlah_menu14 = jumlah_menu14;
    }

    public int getJumlah_menu15() {
        return jumlah_menu15;
    }

    public void setJumlah_menu15(int jumlah_menu15) {
        this.jumlah_menu15 = jumlah_menu15;
    }

    public int getJumlah_menu16() {
        return jumlah_menu16;
    }

    public void setJumlah_menu16(int jumlah_menu16) {
        this.jumlah_menu16 = jumlah_menu16;
    }

    public int getJumlah_menu17() {
        return jumlah_menu17;
    }

    public void setJumlah_menu17(int jumlah_menu17) {
        this.jumlah_menu17 = jumlah_menu17;
    }

    public int getJumlah_menu18() {
        return jumlah_menu18;
    }

    public void setJumlah_menu18(int jumlah_menu18) {
        this.jumlah_menu18 = jumlah_menu18;
    }

    public int getJumlah_menu19() {
        return jumlah_menu19;
    }

    public void setJumlah_menu19(int jumlah_menu19) {
        this.jumlah_menu19 = jumlah_menu19;
    }

    public int getJumlah_menu20() {
        return jumlah_menu20;
    }

    public void setJumlah_menu20(int jumlah_menu20) {
        this.jumlah_menu20 = jumlah_menu20;
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

    public String makanan_1() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu1);
            transaksi.setNama_menu("French Fries");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(15000 * jumlah_menu1);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_2() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu2);
            transaksi.setNama_menu("Onion Ring");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(15000 * jumlah_menu2);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_3() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu3);
            transaksi.setNama_menu("Fried Rice");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(25000 * jumlah_menu3);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_4() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu4);
            transaksi.setNama_menu("Beef Toast");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(27000 * jumlah_menu4);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_5() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu5);
            transaksi.setNama_menu("Chicken Toast");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(23000 * jumlah_menu5);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_6() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu6);
            transaksi.setNama_menu("Chicken Wing");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(13000 * jumlah_menu6);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_7() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu7);
            transaksi.setNama_menu("Chicken Burger");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(15000 * jumlah_menu7);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_8() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu8);
            transaksi.setNama_menu("Beef Burger");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(15000 * jumlah_menu8);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_9() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu9);
            transaksi.setNama_menu("Indomie");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(8000 * jumlah_menu9);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String makanan_10() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu10);
            transaksi.setNama_menu("Spaghetti");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(20000 * jumlah_menu10);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_1() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu11);
            transaksi.setNama_menu("Cappucino");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(20000 * jumlah_menu11);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_2() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu12);
            transaksi.setNama_menu("Caffe Latte");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(20000 * jumlah_menu12);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_3() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu13);
            transaksi.setNama_menu("Caffe Mocha");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(25000 * jumlah_menu13);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_4() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu14);
            transaksi.setNama_menu("Asian Dolce Latte");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(25000 * jumlah_menu14);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_5() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu15);
            transaksi.setNama_menu("Caramel Macchiato");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(28000 * jumlah_menu15);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_6() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu16);
            transaksi.setNama_menu("Vanilla Latte");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(24000 * jumlah_menu16);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_7() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu17);
            transaksi.setNama_menu("Double Shots Iced Shaken Espresso");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(29000 * jumlah_menu17);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_8() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu18);
            transaksi.setNama_menu("Caffee Americano");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(18000 * jumlah_menu18);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_9() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu19);
            transaksi.setNama_menu("Caffee Misto");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(18000 * jumlah_menu19);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public String minuman_10() {
        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Transaksi transaksi = new Transaksi();
            transaksi.setJumlah_menu(jumlah_menu20);
            transaksi.setNama_menu("Brewed Coffee");
            transaksi.setTgl_transaksi(formatter.format(date));
            transaksi.setTotal_harga(15000 * jumlah_menu20);
            session.save(transaksi);
            session.getTransaction().commit();
            session.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public List getAll() {
        session = HibernateUtil.createSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Transaksi");
            List tsk = (List) query.list();
            if (tsk != null && tsk.size() > 0) {
                return tsk;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

    public TransaksiController() {
    }

}
