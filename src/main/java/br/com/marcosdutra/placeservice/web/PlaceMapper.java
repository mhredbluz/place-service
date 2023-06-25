package br.com.marcosdutra.placeservice.web;

import br.com.marcosdutra.placeservice.api.PlaceResponse;
import br.com.marcosdutra.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), 
        place.slug(), place.state(), place.createdAt(), place.updatedAt()) ;
    }    
}
