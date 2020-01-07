package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private String city;
 private long phone;

 public int getId() {
 return id;
 }

 public void setId(int id) {
 this.id = id;
 }

 public String getName() {
 return name;
 }

 public void setName(String name) {
 this.name = name;
 }

 public String getCity() {
 return city;
 }

 public void setCity(String city) {
 this.city = city;
 }

 public long getPhone() {
 return phone;
 }

 public void setPhone(long phone) {
 this.phone = phone;
 }

}