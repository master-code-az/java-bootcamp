package com.mastercode.week05.concreate;

public class Rectangle {

  private int length;
  private int width;

  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }

  public int getAre() {
    return length * width;
  }
}
