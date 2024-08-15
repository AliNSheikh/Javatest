/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaapplication1;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ROMEL CENTER
 */
public class UserService {
    private List<User> users = new ArrayList<>();

    public void createUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUser(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public void updateUser(User updatedUser) {
        User user = getUser(updatedUser.getUsername());
        if (user != null) {
            user.setPassword(updatedUser.getPassword());
            user.setActive(updatedUser.isActive());
        }
    }

    public void deleteUser(String username) {
        users.removeIf(user -> user.getUsername().equals(username));
    }
}