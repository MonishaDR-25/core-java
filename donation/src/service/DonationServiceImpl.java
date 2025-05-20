package service;

import dto.DonationDto;

public class DonationServiceImpl implements DonationService {

    @Override
    public boolean save(DonationDto donationDto) {
        System.out.println("Saving DonationDto in DonationServiceImpl: " + donationDto);

        if (donationDto != null) {
            System.out.println("DonationDto is not null");

            String donorName = donationDto.getDonorName();
            if (donorName != null && donorName.length() >= 3 && donorName.length() <= 20) {
                System.out.println("Donor name is valid");
            } else {
                System.err.println("Donor name is invalid");
                return false;
            }

            String email = donationDto.getEmail();
            if (email != null && !email.isEmpty()) {
                System.out.println("Email is valid");
            } else {
                System.err.println("Email is invalid");
                return false;
            }

            String purpose = donationDto.getPurpose();
            if (purpose != null && !purpose.isEmpty()) {
                System.out.println("Purpose is valid");
            } else {
                System.err.println("Purpose is invalid");
                return false;
            }

            double amount = donationDto.getAmount();
            if (amount > 0) {
                System.out.println("Amount is valid");
            } else {
                System.err.println("Amount must be greater than zero");
                return false;
            }

        } else {
            System.err.println("DonationDto is null");
            return false;
        }

        System.out.printf("donatino data is good..-");
        return  true;
    }
}
