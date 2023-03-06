package edu.ufp.inf.lp2._01_intro;

import java.lang.String;

public class Person {

  public Person(String idNumber, String name, String address, Date birth) {
    this.idNumber = idNumber;
    this.name = name;
    this.address = address;
    this.birth = birth;
  }

  public Date getBirth() {
    return birth;
  }

  public void setBirth(Date birth) {
    this.birth = birth;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
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

  private String idNumber;

  private String name;

  private String address;
  private Date birth;

  public int age() {
  return 0;
  }

  public boolean olderThan(Person p) {
  return false;
  }

  public String toString() {
  return null;
  }

  public boolean equals(Object o) {
  return false;
  }

  public int hashCode() {
  return 0;
  }

}