package edu.ufp.inf.lp2._03_course.version2;

import java.util.List;
import java.lang.String;

public class Discipline {

  private String name;

  private int ects;

  private short courseSemester;

  private short courseYear;

    /**
    * 
    *
   */
  private List<Grade> grades;
  
  public void associateGrade(Grade g) {
  }

  public static void main(String[] args) {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEcts() {
    return ects;
  }

  public void setEcts(int ects) {
    this.ects = ects;
  }

  public short getCourseSemester() {
    return courseSemester;
  }

  public void setCourseSemester(short courseSemester) {
    this.courseSemester = courseSemester;
  }

  public short getCourseYear() {
    return courseYear;
  }

  public void setCourseYear(short courseYear) {
    this.courseYear = courseYear;
  }

  public List<Grade> getGrades() {
    return grades;
  }

  public void setGrades(List<Grade> grades) {
    this.grades = grades;
  }

  public Discipline(String name, int ects, short courseSemester, short courseYear, List<Grade> grades) {
    this.name = name;
    this.ects = ects;
    this.courseSemester = courseSemester;
    this.courseYear = courseYear;
    this.grades = grades;
  }
}