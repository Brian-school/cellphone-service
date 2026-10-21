package com.pluralsight;

public class CellPhone {
    private String serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public void createCellPhone() {
        this.serialNumber = "0";
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public void createCellPhone(String serialNumber, String model, String carrier, String phoneNumber, String owner) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public void createCellPhone(CellPhone phone) {
        this.serialNumber = phone.serialNumber;
        this.model = phone.model;
        this.carrier = phone.carrier;
        this.phoneNumber = phone.phoneNumber;
        this.owner = phone.owner;
    }

    // getters
    public String getSerialNumber () {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    //  setters
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void dial(String number) {
        System.out.printf("%s's phone is calling %s",
                this.phoneNumber,
                number);
    }

    public void dial(CellPhone phone) {
        System.out.printf("%s's phone is calling %s",
                this.phoneNumber,
                phone.phoneNumber);
    }

}
