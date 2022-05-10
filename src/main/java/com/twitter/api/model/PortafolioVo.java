package com.twitter.api.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "portfolio")
public class PortafolioVo  implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    @Column(name = "idportfolio")
    private int idportfolio;
    @Column(name = "description")
    private String description;
    @Column(name = "image_url")
    private String image_url;
    @Column(name = "twitter_user_name")
    private String twitter_user_name;
    @Column(name = "title")
    private String title;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "experience")
    private String experience;
    @Column(name = "experience_summary")
    private String experience_summary;
    @Column(name = "image_path")
    private String image_path;
    @Column(name = "last_names")
    private String last_names;
    @Column(name = "name")
    private String name;
    @Column(name = "names")
    private String names;
    @Column(name = "phone")
    private String phone;
    @Column(name = "tittle")
    private String tittle;
    @Column(name = "twitter_user")
    private String twitter_user;
    @Column(name = "twitter_user_id")
    private String twitter_user_id;
    @Column(name = "user_id")
    private String user_id;
    @Column(name = "zip_code")
    private String zip_code;

    public PortafolioVo() {
    }

    public int getIdportfolio() {
        return idportfolio;
    }

    public void setIdportfolio(int idportfolio) {
        this.idportfolio = idportfolio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getTwitter_user_name() {
        return twitter_user_name;
    }

    public void setTwitter_user_name(String twitter_user_name) {
        this.twitter_user_name = twitter_user_name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getExperience_summary() {
        return experience_summary;
    }

    public void setExperience_summary(String experience_summary) {
        this.experience_summary = experience_summary;
    }

    public String getImage_path() {
        return image_path;
    }

    public void setImage_path(String image_path) {
        this.image_path = image_path;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getTwitter_user() {
        return twitter_user;
    }

    public void setTwitter_user(String twitter_user) {
        this.twitter_user = twitter_user;
    }

    public String getTwitter_user_id() {
        return twitter_user_id;
    }

    public void setTwitter_user_id(String twitter_user_id) {
        this.twitter_user_id = twitter_user_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "PortafolioVo{" +
                "idportfolio=" + idportfolio +
                ", description='" + description + '\'' +
                ", image_url='" + image_url + '\'' +
                ", twitter_user_name='" + twitter_user_name + '\'' +
                ", title='" + title + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", experience='" + experience + '\'' +
                ", experience_summary='" + experience_summary + '\'' +
                ", image_path='" + image_path + '\'' +
                ", last_names='" + last_names + '\'' +
                ", name='" + name + '\'' +
                ", names='" + names + '\'' +
                ", phone='" + phone + '\'' +
                ", tittle='" + tittle + '\'' +
                ", twitter_user='" + twitter_user + '\'' +
                ", twitter_user_id='" + twitter_user_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", zip_code='" + zip_code + '\'' +
                '}';
    }
}

