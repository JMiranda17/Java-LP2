package edu.ufp.inf.lp2._03_course.version2;

import java.util.List;
import java.lang.String;
import edu.ufp.inf.lp2._01_intro.Date;
import edu.ufp.inf.lp2._01_intro.Person;

public class Student extends edu.ufp.inf.lp2._01_intro.Person {
  public Student(String idNumber, String name, String address, Date birth, long number, Date registration, String email, String password, CourseClass courseClass, List<Grade> grades) {
    super(idNumber, name, address, birth);
    this.number = number;
    this.registration = registration;
    this.email = email;
    this.password = password;
    this.courseClass = courseClass;
    this.grades = grades;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public Date getRegistration() {
    return registration;
  }

  public void setRegistration(Date registration) {
    this.registration = registration;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CourseClass getCourseClass() {
    return courseClass;
  }

  public void setCourseClass(CourseClass courseClass) {
    this.courseClass = courseClass;
  }

  public List<Grade> getGrades() {
    return grades;
  }

  public void setGrades(List<Grade> grades) {
    this.grades = grades;
  }

  private long number;

  private Date registration;

  private String email;

  private String password;

    private CourseClass courseClass;
    /**
    * 
    *
   */
  private List<Grade> grades;

  public Student(String idNumber, String name, String address, Date birth) {
    super(idNumber, name, address, birth);
  }

  public void addGrade(Grade g) {
  }

  public Grade removeGrade(float g, String nd, Date d) {
  return null;
  }

  public Grade changeGrade( float ng, float g, String nd, Date d) {
  return null;
  }

  public Grade searchGrade(float g, String nd, Date d) {
  return null;
  }

  public float averageGrades() {
  return 0.0F;
  }

  public Grade maxGrade() {
  return null;
  }

  public Grade minGrade() {
  return null;
  }

  public void registerInCourseClass(CourseClass cc) {
  }

  public CourseClass unregisterFromCourseClass() {
  return null;
  }

  public static void main(String[] args) {



  }
}