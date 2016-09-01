package com.tacme.test.entity;



import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Student  implements Serializable{
   
   
   @Id
   @GeneratedValue(strategy=GenerationType.AUTO)
   private Long id;
   private Long rollNumber;
   private Date dob;
   private String department;
   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
   @JoinColumn(name="contact_details",referencedColumnName="id")
   private Contact contactDetails;
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public Long getRollNumber() {
      return rollNumber;
   }
   public void setRollNumber(Long rollNumber) {
      this.rollNumber = rollNumber;
   }
   public Date getDob() {
      return dob;
   }
   public void setDob(java.util.Date date) {
      this.dob = date;
   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
   public Contact getContactDetails() {
      return contactDetails;
   }
   public void setContactDetails(Contact contactDetails) {
      this.contactDetails = contactDetails;
   }
   
   

}
