package dto;



public class DonationDto {
    private String donorName;
    private double amount;
    private String purpose;
    private String email;

    // Getters and Setters
    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "donorName='" + donorName + '\'' +
                ", amount=" + amount +
                ", purpose='" + purpose + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

