package com.iakovenko.coursework02;

import java.util.List;

public class Paragraph {
  private String title;
  private String text;
  private String answer1;
  private String answer2;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getAnswer1() {
    return answer1;
  }

  public void setAnswer1(String answer1) {
    this.answer1 = answer1;
  }

  public String getAnswer2() {
    return answer2;
  }

  public void setAnswer2(String answer2) {
    this.answer2 = answer2;
  }

  @Override
  public String toString() {
    return title + "\n" + text + "\n" + answer1 + "\n" + answer2;

  }
}