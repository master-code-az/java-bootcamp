package com.mastercode.week05.abstraction.interface_;

public class Main {

  public static void main(String[] args) {
    System.out.println(UserService.name);

    UserServiceImpl userService  = new UserServiceImpl();
    userService.createUser();
    userService.updateUser("User 1");
  }

}
