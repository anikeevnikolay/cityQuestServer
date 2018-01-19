package com.vsu.amm.json;

import com.vsu.amm.entities.PlaceEntity;

/**
 * Created by antiz_000 on 11/20/2017.
 */
public class PlaceJson {
    private long placeID;
    private String locationName;
    private String description;
    private String priceList;
    private UserJson creator;

    public PlaceJson(PlaceEntity p) {
        placeID = p.getPlaceID();
        locationName = p.getLocationName();
        description = p.getDescription();
        priceList = p.getPriceList();
        creator = new UserJson(p.getCreator());
  }
}
