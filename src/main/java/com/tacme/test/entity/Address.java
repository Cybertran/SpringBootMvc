package com.tacme.test.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class Address  implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String street1;
   private String street2;
   private String pincode;
   private String landmark;
  
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getStreet1() {
      return street1;
   }
   public void setStreet1(String street1) {
      this.street1 = street1;
   }
   public String getStreet2() {
      return street2;
   }
   public void setStreet2(String street2) {
      this.street2 = street2;
   }
   public String getPincode() {
      return pincode;
   }
   public void setPincode(String pincode) {
      this.pincode = pincode;
   }
   public String getLandmark() {
      return landmark;
   }
   public void setLandmark(String landmark) {
      this.landmark = landmark;
   }
   
   
}
