package com.place.service;

import com.place.entity.Location;

import java.util.List;

public interface LocationService {
    Location createLocation(Location location);
    List<Location> searchLocations(String keyword);
}

