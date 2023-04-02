package com.mastercode.week05.abstraction.interface_;

import java.io.Serializable;

public class UserServiceImpl implements UserService, CommonService, Serializable {
  @Override
  public void createUser() {
    System.out.println("User Created");
  }

  @Override
  public void updateUser(String user) {
    System.out.println(user + " updated");
  }

  @Override
  public void test() {

  }
}
