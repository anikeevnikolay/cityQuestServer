package com.vsu.amm.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by antiz_000 on 11/1/2017.
 */

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "auto_gen")
    @SequenceGenerator(name = "auto_gen", sequenceName = "user_id_seq")
    @Column(name = "user_id")
    private long userId;

    @Column(name = "login")
    private String login;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "pass_hash")
    private String passHash;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "register_date")
    private Date registerDate = new Date();

    @Temporal(TemporalType.DATE)
    @Column(name = "birthday")
    private Date birthday;

    @OneToMany(mappedBy = "creator", fetch = FetchType.LAZY)
    private List<PlaceEntity> createdPlaces = new ArrayList<>();

    public long getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public List<PlaceEntity> getCreatedPlaces() {
        return createdPlaces;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserEntity{\n")
                .append("login='").append(login + "\'\n")
                .append("firstName='").append(firstName).append("\'\n")
                .append("lastName='").append(lastName).append("\'\n")
                .append("birthday=").append(birthday).append("\'\n'")
                .append("places:\n");
        for (PlaceEntity place : createdPlaces)
            sb.append(" - ").append(place).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public UserEntity(String login, String firstName, String lastName, Date birthday, String passHash) {

        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.passHash = passHash;
    }

    public UserEntity() {
    }
}
