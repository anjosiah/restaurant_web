package Aplikasi;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean(name = "User_Ctr")
@SessionScoped

public class UserController {

    private HibernateUtil helper;
    private Session session;

    private int id_user;
    private String username;
    private String password;
    private String user_type;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String login() {

        try {
            session = helper.createSessionFactory().openSession();
            session.beginTransaction();
            Query query = session.createQuery("from User where username=:username and password=:password and user_type=:user_type");
            query.setString("username", username);
            query.setString("password", password);
            query.setString("user_type", "admin");
            List list = query.list();
            if (list.size() == 1) {
                return "admin";
            } else {
                Query query1 = session.createQuery("from User where username=:username and password=:password and user_type=:user_type");
                query1.setString("username", username);
                query1.setString("password", password);
                query1.setString("user_type", "user");
                List list1 = query1.list();
                if (list1.size() == 1) {
                    return "user";
                } else {
                    return "gagal";
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return "gagal";
    }

}
