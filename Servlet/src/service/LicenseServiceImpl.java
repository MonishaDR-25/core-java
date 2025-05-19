package service;

import dto.LicenseDto;

public class LicenseServiceImpl implements LicenseService {

    @Override
    public boolean save(LicenseDto licenseDto) {
        System.out.println("Saving LicenseDto in LicenseServiceImpl: " + licenseDto);

            return true;
        }

}