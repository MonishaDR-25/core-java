package dto;

public class LicenseDto {
    private String name;
    private String contactNumber;
    private String fatherName;
    private String adharNumber;
    private String address;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getAdharNumber() {
        return adharNumber;
    }

    public void setAdharNumber(String adharNumber) {
        this.adharNumber = adharNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "LicenseDto{" +
                "name='" + name + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", adharNumber='" + adharNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
