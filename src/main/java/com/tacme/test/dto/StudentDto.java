package com.tacme.test.dto;

import com.tacme.test.entity.Address;
import com.tacme.test.entity.Contact;

public class StudentDto {
   
   private Long id;
   private String firstName;
   private String lastName;
   private Long rollNumber;
   private Contact contactDetails;
   private Address addressDetails;
   private String dob;
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }
   public Long getRollNumber() {
      return rollNumber;
   }
   public void setRollNumber(Long rollNumber) {
      this.rollNumber = rollNumber;
   }
   public Contact getContactDetails() {
      return contactDetails;
   }
   public void setContactDetails(Contact contactDetails) {
      this.contactDetails = contactDetails;
   }
   public Address getAddressDetails() {
      return addressDetails;
   }
   public void setAddressDetails(Address addressDetails) {
      this.addressDetails = addressDetails;
   }
   public String getDob() {
      return dob;
   }
   public void setDob(String dob) {
      this.dob = dob;
   }
   
   

}
