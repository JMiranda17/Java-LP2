package edu.ufp.inf.lp2._03_course.version2;

import edu.ufp.inf.lp2._01_intro.Date;
import edu.ufp.inf.lp2._03_course.version2.Student;
import edu.ufp.inf.lp2._03_course.version2.Discipline;

public class Grade {

  private float grade;

  private Date date;

  private Discipline discipline;

  private Student student;

  public float getGrade() {
    return grade;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public Grade(float grade, Date date, Discipline discipline, Student student) {
    this.grade = grade;
    this.date = date;
    this.discipline = discipline;
    this.student = student;
  }

  public Discipline associatedDiscipline() {
  return null;
  }

  public void associateDiscipline(Discipline discipline) {
  }

  public Student associatedStudent() {
  return null;
  }

  public void associateStudent(Student student) {
  }

  public static void main(String[] args) {

  }
}