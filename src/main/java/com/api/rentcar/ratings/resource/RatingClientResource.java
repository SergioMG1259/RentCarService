package com.api.rentcar.ratings.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RatingClientResource {
    private Long id;
    private String comment;
    private int rating;
}
