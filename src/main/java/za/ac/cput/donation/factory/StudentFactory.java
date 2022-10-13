package za.ac.cput.donation.factory;

import za.ac.cput.donation.entity.Student;
import za.ac.cput.donation.util.Helper;

public class StudentFactory {
    public static Student createStudent(String firstName, String lastName, String email, boolean isFunded,
                                        String password){
        if(Helper.isValid(firstName) && Helper.isValid(lastName) && Helper.isValidEmail(email)
                && Helper.isValidPassword(password))
            return new Student.Builder().setFirstName(firstName).setLastName(lastName).setEmail(email.toLowerCase())
                    .setIsFunded(isFunded).setPassword(password).build();
        return null;
    }
}
