package com.gvmmpg.greenvibes.domain.user;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Blob;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="users")
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String user_name;
    @Column(name = "email")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "birthday")
    private LocalDate user_birthday;
    @Column(name = "country")
    private String user_country;
    @Column(name = "city")
    private String user_city;
    @Column(name = "address")
    private String user_address;
    @Column(name = "profession")
    private String user_profession;
    @Column(name = "schooling_level")
    private String user_level_schooling;
    @Column(name = "gender")
    private String user_gender;
    @Column(name = "race")
    private String user_race;
    // @Lob
    // @Column(name = "image")
    // private Blob user_image;

    public User(UserRegister data) {
        this.user_name = data.user_name();
        this.login = data.user_login();
        this.password = data.user_password();
        this.user_birthday = data.user_birthday();
        this.user_country = data.user_country();
        this.user_city = data.user_city();
        this.user_address = data.user_address();
        this.user_profession = data.user_profession();
        this.user_level_schooling = data.user_level_schooling();
        this.user_gender = data.user_gender();
        this.user_race = data.user_race();
        // this.user_image = data.user_image();
    }

    public User() {}

    @Override
    public String toString() {
        return "User{" +
                "user_name='" + user_name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", user_birthday='" + user_birthday + '\'' +
                ", user_address='" + user_address + '\'' +
                ", user_country='" + user_country + '\'' +
                ", user_city='" + user_city + '\'' +
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
    public String getLogin() {
        return login;
    }
    public String getUser_Password() {
        return password;
    }
    public LocalDate getUser_birthday() {
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
    public String getUser_country() {
        return user_country;
    }
    public String getUser_city() {
        return user_city;
    }
    // public Blob getUser_photo() {return user_image;}

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUser_birthday(LocalDate user_birthday) {
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
    public void setUser_country(String user_country) {
        this.user_country = user_country;
    }
    public void setUser_city(String user_city) {
        this.user_city = user_city;
    }
    // public void setUser_image(Blob user_image) {this.user_image = user_image;}

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public String getUsername() {
        return login;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return true;
    }

}
