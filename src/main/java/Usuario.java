import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String email;
    private String password;
    private List<Nombre> listanombre;

    public Usuario(String email, String password, List<Nombre> listanombre) {
        this.email = email;
        this.password = password;
        this.listanombre = listanombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Nombre> getListanombre() {
        return listanombre;
    }

    public void setListanombre(List<Nombre> listanombre) {
        this.listanombre = listanombre;
    }
}
