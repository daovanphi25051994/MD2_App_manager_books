package controller;

import java.util.ArrayList;
import model.Admin;

public class AdminManager {

    private static AdminManager adminManager;
    public static final ArrayList<Admin> listAdmins = new ArrayList<>();

    private AdminManager() {
    }

    public static AdminManager getAdminManager() {
        if (adminManager == null) {
            adminManager = new AdminManager();
        }
        return adminManager;
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
