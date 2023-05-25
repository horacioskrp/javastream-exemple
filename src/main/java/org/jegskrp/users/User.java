package org.jegskrp.users;

public class User {
    private final Long id;
    private final String first_name;
    private final String last_name;
    private final String email;
    private final String gender;
    private final String ip_address;
    private final String ccard_type;

    public User(Long id, String first_name, String last_name, String email, String gender, String ip_address, String ccard_type) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.gender = gender;
        this.ip_address = ip_address;
        this.ccard_type = ccard_type;
    }

    public Long getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getIp_address() {
        return ip_address;
    }

    public String getCcard_type() {
        return ccard_type;
    }
}

