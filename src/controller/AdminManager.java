/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Admin;

/**
 *
 * @author samsung
 */
public class AdminManager {

    private static AdminManager userManager;
    public static final ArrayList<Admin> listAdmins = new ArrayList<>();

    private AdminManager() {
    }

    public static AdminManager getAdminManager() {
        if (userManager == null) {
            userManager = new AdminManager();
        }
        return userManager;
    }

    public boolean addAdmin(Admin user) {
        if (user == null) {
            return false;
        }
        listAdmins.add(user);
        return true;
    }

    public boolean removeAdmin(Admin user) {
        if (user == null) {
            return false;
        }
        for (Admin myUser : listAdmins) {
            if (myUser.equals(user)) {
                listAdmins.remove(user);
                return true;
            }
        }

        return false;
    }

    public boolean isAdminExist(String email) {
        for (Admin user : listAdmins) {
            if (user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

}
