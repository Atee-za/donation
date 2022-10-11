package za.ac.cput.donation.service;

import za.ac.cput.donation.entity.Parcel;

import java.util.List;

public interface IParcelService {
    Parcel save(Parcel parcel);
    Parcel find(long id);
    List<Parcel> findAll();
    List<Parcel> findAllAvailable();
    Parcel update(Parcel parcel);
}
