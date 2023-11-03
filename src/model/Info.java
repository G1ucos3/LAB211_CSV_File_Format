package model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Info {
    private int iD;
    private String name;
    private String email;
    private String phone;
    private String address;
    ArrayList<Info> al = new ArrayList<>();

    public Info(int iD, String name, String email, String phone, String address) {
        this.iD = iD;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Info() {
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Info> getAl() {
        return al;
    }

    public void setAl(ArrayList<Info> al) {
        this.al = al;
    }
}
