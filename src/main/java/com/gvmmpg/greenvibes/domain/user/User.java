package com.gvmmpg.greenvibes.domain.user;

import jakarta.persistence.*;

import java.sql.Blob;

@Entity
@Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user_name;
    private String user_email;
    private String user_password;
    private String user_birthday;
    private String user_address;
    private String user_profession;
    private String user_level_schooling;
    private String user_gender;
    private String user_race;
    // @Lob
    // private Blob user_image;


    public User(UserRegister data) {
        this.user_name = data.user_name();
        this.user_email = data.user_email();
        this.user_password = data.user_password();
        this.user_birthday = data.user_birthday();
        this.user_address = data.user_address();
        this.user_profession = data.user_profession();
        this.user_level_schooling = data.user_level_schooling();
        this.user_gender = data.user_gender();
        this.user_race = data.user_race();
        // this.user_image = data.user_image();
    }

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_birthday='" + user_birthday + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_profession='" + user_profession + '\'' +
                ", user_level_schooling='" + user_level_schooling + '\'' +
                ", user_gender='" + user_gender + '\'' +
                ", user_race='" + user_race + '\'' +
                '}';
    }

    // GETTERS
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
    public String getUser_birthday() {
        return user_birthday;
    }
    public String getUser_address() {
        return user_address;
    }
    public String getUser_profession() {
        return user_profession;
    }
    public String getUser_level_schooling() {
        return user_level_schooling;
    }
    public String getUser_gender() {
        return user_gender;
    }
    public String getUser_race() {
        return user_race;
    }
    // public Blob getUser_photo() {return user_image;}

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }
    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }
    public void setUser_birthday(String user_birthday) {
        this.user_birthday = user_birthday;
    }
    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }
    public void setUser_profession(String user_profession) {
        this.user_profession = user_profession;
    }
    public void setUser_level_schooling(String user_level_schooling) {
        this.user_level_schooling = user_level_schooling;
    }
    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }
    public void setUser_race(String user_race) {
        this.user_race = user_race;
    }
    // public void setUser_image(Blob user_image) {this.user_image = user_image;}
}
