package com.place.serviceimpl;

import com.place.entity.Location;
import com.place.repository.LocationRepository;
import com.place.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }


    @Override
    public List<Location> searchLocations(String keyword) {
        return locationRepository.findByPlaceNameContaining(keyword);
    }
}

