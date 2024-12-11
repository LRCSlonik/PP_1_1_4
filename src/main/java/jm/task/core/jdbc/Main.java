package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args)  {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Alex","Kichen", (byte) 58);
        userService.saveUser("Balu","Vinex", (byte) 15);
        userService.saveUser("Cril","Safin", (byte) 5);
        userService.saveUser("Den","Abramov", (byte) 34);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
