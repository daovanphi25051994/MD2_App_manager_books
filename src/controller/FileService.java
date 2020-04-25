/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import main.LoginJframe;
import static main.LoginJframe.STUDENT_DATA_PATH;
import model.Student;
import model.User;

/**
 *
 * @author samsung
 */
public class FileService<T> {

    public void saveArrayListToFileData(ArrayList<T> list, String targetPath) {
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(targetPath);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (T object : list) {
                objectOutputStream.writeObject(object);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectOutputStream.close();
                fileOutputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void addDataToArrayListFromFile(ArrayList<T> list, String sourcePath) {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(sourcePath);
            objectInputStream = new ObjectInputStream(fileInputStream);
            T object;
            while ((object = (T) objectInputStream.readObject()) != null) {
                list.add(object);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
