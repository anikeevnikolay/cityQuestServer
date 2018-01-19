package com.vsu.amm.entities;

import javax.persistence.*;
import java.math.BigInteger;

/**
 * Created by antiz_000 on 10/30/2017.
 */

@Entity
@Table(name = "places")
public class PlaceEntity {

    @Id
    @Column(name = "place_id")
    private long placeID;

    @Column(name = "location_name")
    private String locationName;

    @Column(name = "description")
    private String description;

    @Column(name = "price_list")
    private String priceList;

    @ManyToOne
    @JoinColumn(name = "creator")
    private UserEntity creator;

    public UserEntity getCreator() {
        return creator;
    }

    public String getPriceList() {
        return priceList;
    }

    public String getDescription() {
        return description;
    }

    public String getLocationName() {
        return locationName;
    }

    public Long getPlaceID() {
        return placeID;
    }

    @Override
    public String toString() {
        return "PlaceEntity{" +
                "locationName='" + locationName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
//    @JoinColumn(name = "owner")
//    private UserEntity owner;
}
