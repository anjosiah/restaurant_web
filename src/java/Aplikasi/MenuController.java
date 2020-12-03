package Aplikasi;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session; 

@ManagedBean(name = "Menu_Ctr")
@SessionScoped
public class MenuController {

    private HibernateUtil helper;
    private Session session;

    private int id_menu;
    private String nama_menu;
    private int harga;

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNama_menu() {
        return nama_menu;
    }

    public void setNama_menu(String nama_menu) {
        this.nama_menu = nama_menu;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public List getAll() {
        session = helper.createSessionFactory().openSession();
        try {
            session.beginTransaction();
            Query query = session.createQuery("from Menu");
            List menu = (List) query.list();
            if (menu != null && menu.size() > 0) {
                return menu;
            }
        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
        return null;
    }

}
