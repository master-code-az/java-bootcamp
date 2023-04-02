package com.mastercode.week05.abstraction.diamond.solution;

public class D implements B, C {

  @Override
  public void a() {
    C.super.a();
  }
}
