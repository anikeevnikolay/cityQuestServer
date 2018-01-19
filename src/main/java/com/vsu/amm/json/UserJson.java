package com.vsu.amm.json;

import com.vsu.amm.entities.PlaceEntity;
import com.vsu.amm.entities.UserEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by antiz_000 on 11/20/2017.
 */
public class UserJson {

    private long userId;
    private String login;
    private String firstName;
    private String lastName;
    private Date registerDate;
    private Date birthday;
    private List<Long> createdPlaces = new ArrayList<>();

    public UserJson(UserEntity u) {
        userId = u.getUserId();
        login = u.getLogin();
        firstName = u.getFirstName();
        lastName = u.getLastName();
        registerDate = u.getRegisterDate();
        birthday = u.getBirthday();
        for(PlaceEntity place : u.getCreatedPlaces())
            createdPlaces.add(place.getPlaceID());
    }

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

    public List<Long> getCreatedPlaces() {
        return createdPlaces;
    }
}
