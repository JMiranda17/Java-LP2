package edu.ufp.inf.lp2._03_course.version2;

import java.util.ArrayList;
import java.util.List;
import java.lang.String;

public class CourseClass {

  private String name;

    /**
    * 
    *
   */
  private List<Student> students;
    /**
    * 
    *
   */
  private List<Discipline> disciplines;

  public ArrayList searchStudent(String name) {
  return null;
  }

  public Student searchStudent(long number) {
  return null;
  }

  public Discipline searchDiscipline(String name) {
  return null;
  }

  public void registerStudent(Student s) {
  }

  public Student unregisterStudent(String sname) {
  return null;
  }

  public void associateDiscipline(Discipline d) {
  }

  public Discipline desassociateDiscipline(String dname) {
  return null;
  }

  public void launchGrade(String Name, long studentNumber, float grade) {
  }

  public void associateGrade2Discipline(String disciplineName, long studentNumber, float grade) {
  }

}