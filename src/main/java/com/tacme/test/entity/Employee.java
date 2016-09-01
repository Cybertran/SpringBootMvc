package com.tacme.test.entity;

import com.tacme.test.contants.Gender;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private Double salary;
   private Gender gender;
   private String maritalStatus;
   private String department;
   private String jobTitle;
   private Date dob;
   @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
   @JoinColumn(name="contact_details",referencedColumnName="id")
   private Contact contactDetails;
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public Double getSalary() {
      return salary;
   }
   public void setSalary(Double salary) {
      this.salary = salary;
   }
   public Gender getGender() {
      return gender;
   }
   public void setGender(Gender gender) {
      this.gender = gender;
   }
   public String getMaritalStatus() {
      return maritalStatus;
   }
   public void setMaritalStatus(String maritalStatus) {
      this.maritalStatus = maritalStatus;
   }
   public String getDepartment() {
      return department;
   }
   public void setDepartment(String department) {
      this.department = department;
   }
   public String getJobTitle() {
      return jobTitle;
   }
   public void setJobTitle(String jobTitle) {
      this.jobTitle = jobTitle;
   }
   public Date getDob() {
      return dob;
   }
   public void setDob(Date dob) {
      this.dob = dob;
   }
   public Contact getContactDetails() {
      return contactDetails;
   }
   public void setContactDetails(Contact contactDetails) {
      this.contactDetails = contactDetails;
   }

   
}
