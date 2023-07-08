package oop.homeWorks.dz1;

import java.util.ArrayList;

public class User extends Basket{
    private String login;
    private String password;

    public User() {
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        super.tovars = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
public void inbas(Tovar tovar, Categoria categoria){
        super.inBasket(tovar, categoria);
}


}
