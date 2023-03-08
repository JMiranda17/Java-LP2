package edu.ufp.inf.lp2._03_course.version2;

import java.util.List;
import java.lang.String;
import edu.ufp.inf.lp2._01_intro.Date;
import edu.ufp.inf.lp2._01_intro.Person;

public class Student extends edu.ufp.inf.lp2._01_intro.Person {

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

  public Grade changeGrade( float, float g, String nd, Date d) {
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

}