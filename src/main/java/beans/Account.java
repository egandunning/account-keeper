package beans;

import java.io.Serializable;

public class Account implements Serializable {

    public static final long serialVersionUID = 1L;

    private final long id;
    private String name;
    private String url;
    private String owner;
    private StreetAddress address;
    private String phone;
    private String data;

    public Account() {
        id = 0;
    }

    public Account(long id, String name, String url, String owner, StreetAddress address,
            String phone, String data) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.owner = owner;
        this.address = address;
        this.phone = phone;
        this.data = data;
    }

    public long getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public StreetAddress getAddress() {
        return address;
    }

    public void setAddress(StreetAddress address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Account [name=" + name + ", url=" + url + ", owner=" + owner
                + ", address=" + address + ", phone=" + phone + ", data=" + data
                + "]";
    }
}