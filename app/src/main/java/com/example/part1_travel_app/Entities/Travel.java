package com.example.part1_travel_app.Entities;

import com.example.part1_travel_app.Utils.RequestStatus;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
//TODO add tags
public class Travel {
    private int ID;
    private String name;
    private String phone;
    private String mail;
    private String addressSource;
    private List<String> addressDestination;
    private int numOfPanssengers;
    private Date dateOut;
    private Date dateReturn;
    private RequestStatus status;
    private HashMap<String,Boolean> companies;


    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public String getAddressSource() {
        return addressSource;
    }

    public List<String> getAddressDestination() {
        return addressDestination;
    }

    public int getNumOfPanssengers() {
        return numOfPanssengers;
    }

    public Date getDateOut() {
        return dateOut;
    }

    public Date getDateReturn() {
        return dateReturn;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public HashMap<String, Boolean> getCompanies() {
        return companies;
    }


    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAddressSource(String addressSource) {
        this.addressSource = addressSource;
    }

    public void setAddressDestination(List<String> addressDestination) {
        this.addressDestination = addressDestination;
    }

    public void setNumOfPanssengers(int numOfPanssengers) {
        this.numOfPanssengers = numOfPanssengers;
    }

    public void setDateOut(Date dateOut) {
        this.dateOut = dateOut;
    }

    public void setDateReturn(Date dateReturn) {
        this.dateReturn = dateReturn;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    public void setCompanies(HashMap<String, Boolean> companies) {
        this.companies = companies;
    }
}
