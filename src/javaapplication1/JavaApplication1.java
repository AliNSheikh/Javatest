/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ROMEL CENTER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      UserService userService = new UserService();

        // Call the createUser method from the UserService
     

        // Create a new user
        User user1 = new User();
        user1.setUsername("john_doe");
        user1.setPassword("password123");
        user1.setActive(true);
        userService.createUser(user1);
         User user2 = new User();
          user2.setUsername("alish");
        user2.setPassword("123");
        user2.setActive(false);
        userService.createUser(user2);
        
         // Get all users
        List<User> allUsers = userService.getAllUsers();
        for (int i = 0; i < allUsers.size(); i++) {
    System.out.println(allUsers.get(i).getUser());
}
     
        
        // Get a specific user
        User foundUser = userService.getUser("john_doe");
        System.out.println("Found user: " + foundUser.getUsername());

         // Update a user
        User updatedUser = new User();
        updatedUser.setUsername("john_doe");
        updatedUser.setPassword("newPassword");
        updatedUser.setActive(false);
        userService.updateUser(updatedUser);
           
        //check the update
        User foundUser2 = userService.getUser("john_doe");
        System.out.println("Found user: " + foundUser.getUser());

        // Delete a user
        userService.deleteUser("john_doe");
        // check the delete
        List<User> allUsers2 = userService.getAllUsers();
        for (int i = 0; i < allUsers2.size(); i++) {
    System.out.println("users now:  " +allUsers.get(i).getUser());}
        // TODO code application logic here
    }
    
}
