package com.vsu.amm.controllers;

import com.vsu.amm.entities.PlaceEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by antiz_000 on 10/30/2017.
 */

@RestController
@RequestMapping("/place")
public class PlaceController {

    @RequestMapping("/{id}")
    public String getBasic(@PathVariable(value = "id") String id) {
        return "";
    }

    @RequestMapping("/{id}/comments")
    public String getComments(@PathVariable(value = "id") String id) {
        return "";
    }

    @RequestMapping("/{id}/rating")
    public String getRating(@PathVariable(value = "id") String id) {
        return "";
    }

}
