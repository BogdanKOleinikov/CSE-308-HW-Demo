package com.example.currentplacedetailsonmap;

import org.parceler.Parcel;


@Parcel
public class Person {

    private String key;
    private String name;
    private String address;
    private String contactNumber;

    public Person(){

    }

    public Person(String name, String address, String contactNumber){
        this.name = name;
        this.address = address;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object object){
        if(object == null)
            return false;
        if(!Person.class.isAssignableFrom(object.getClass()))
            return false;
        final Person person = (Person)object;
        return person.getKey().equals(key);
    }
}
