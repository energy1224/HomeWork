package com.iakovenko.coursework02;

import java.util.List;

public class Paragraph {
  private String title;
  private String text;
  private Paragraph answer1;
  private Paragraph answer2;

  public Paragraph() {
  }

  public Paragraph(String title, String text) {
    this.title = title;
    this.text = text;
  }

  public void setAnswer1(Paragraph answer1) {
    this.answer1 = answer1;
  }

  public void setAnswer2(Paragraph answer2) {
    this.answer2 = answer2;
  }

  public String getTitle() {
    return title;
  }

  public String getText() {
    return text;
  }

  public Paragraph getAnswer1() {
    return answer1;
  }

  public Paragraph getAnswer2() {
    return answer2;
  }

  @Override
  public String toString() {
    if(this.answer1 != null && this.answer2 != null)
    return title + "\n" + text + "\n" + "1 "+answer1.getTitle() + "\n" + "2 "+ answer2.getTitle()+"\n"+
            "3 Выйти в главное меню";

    else return title + "\n" + text+"\n"+
            "1 Выйти в главное меню";

  }
}