package za.ac.cput.donation.factory;

import za.ac.cput.donation.entity.Donor;
import za.ac.cput.donation.util.Helper;

public class DonorFactory {
    public static Donor createDonor(String firstName, String lastName, String email, String password){
        if(Helper.isValid(firstName) && Helper.isValid(lastName)
                && Helper.isValidEmail(email) && Helper.isValidPassword(password))
            return new Donor.Builder().setFirstName(firstName).setLastName(lastName)
                    .setEmail(email.toLowerCase()).setPassword(password).build();
        return null;
    }
}
