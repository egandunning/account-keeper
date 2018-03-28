package beans;

import java.io.Serializable;

public class Account implements Serializable {

    public static final long serialVersionUID = 1L;

    private String name;
    private String url;
    private String owner;
    private StreetAddress address;
}