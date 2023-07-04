package com.gvmmpg.greenvibes.domain.user;

import jakarta.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String user_email;
    private String user_password;
    private String user_phone;
    private String user_birthday;
    private String user_address;

    public User(UserRegister data) {
        this.user_name = data.user_name();
        this.user_email = data.user_email();
        this.user_password = data.user_password();
        this.user_birthday = data.user_birthday();
        this.user_phone = data.user_phone();
        this.user_address = data.user_address();
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_birthday='" + user_birthday + '\'' +
                ", user_address='" + user_address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }
    public String getUser_name() {
        return user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public String getUser_birthday() {
        return user_birthday;
    }

    public String getUser_address() {
        return user_address;
    }
}
