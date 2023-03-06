package edu.ufp.inf.lp2._01_intro;

import java.lang.String;

public class Date {
  public Date(short day, short month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

  public short getDay() {
    return day;
  }

  public void setDay(short day) {
    this.day = day;
  }

  public short getMonth() {
    return month;
  }

  public void setMonth(short month) {
    this.month = month;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  private short day;
  private short month;
  private int year;

  public String toString() {
  return null;
  }

  public boolean equals(Object o) {
  return false;
  }

  public int hashCode() {
  return 0;
  }

  public int compareTo(Date d) {
  return 0;
  }

  public boolean afterDate(Date d) {
  return false;
  }

  public boolean beforeDate(Date d) {
  return false;
  }

  public int diferenceDays(Date d) {
  return 0;
  }

  public int diferenceMonths(Date d) {
  return 0;
  }

  public int diferenceYears(Date d) {
  return 0;
  }

  public void incrementDate() {
  }

  public long daysCrawlerRecursiveAux(Date begin, Date end) {
  return 0;
  }

  public int daysCrawlerRecursive(Date begin, Date end) {
  return 0;
  }

  public int daysCrawler(Date begin, Date end) {
  return 0;
  }

  public int monthsCrawler(Date begin, Date end) {
  return 0;
  }

  public boolean isLeapYear(int year) {
  return false;
  }

  public int daysMonth(short month, int year) {
  return 0;
  }

  public int daysBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
  return 0;
  }

  public int monthsBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year) {
  return 0;
  }

  public static void main(String[] args) {



  }

}