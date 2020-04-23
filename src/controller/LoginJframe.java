package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.AmountComparator;
import model.AuthorComparator;
import model.Book;
import model.BookManager;
import model.NameComparator;
import model.User;
import model.UserManager;
import model.Validate;

public class LoginJframe extends javax.swing.JFrame {

    UserManager userManager = UserManager.getUserManager();
    BookManager bookManager = BookManager.getBookManager();
    Validate validate = new Validate();
    

    public LoginJframe() {
        initComponents();
        addListBookFromDataToArray();
        showListBooks();
//        addListBookFromDataToArray();
//        showListBooks();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RegisterDialog = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        registerEmailField = new javax.swing.JTextField();
        registerPassword1Field = new javax.swing.JPasswordField();
        email = new javax.swing.JLabel();
        password1 = new javax.swing.JLabel();
        password2 = new javax.swing.JLabel();
        tittle = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        registerPhoneNumberField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        registerAddressField = new javax.swing.JTextArea();
        backLogin = new javax.swing.JButton();
        register = new javax.swing.JButton();
        registerPassword2Field = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        mainDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        searchBook = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchAuthor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addBook = new javax.swing.JButton();
        nameBookFeild = new javax.swing.JTextField();
        nameAuthorFeild = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        setBook = new javax.swing.JButton();
        removeBook = new javax.swing.JButton();
        sortByAuthor = new javax.swing.JButton();
        sortByAmount = new javax.swing.JButton();
        sortByName = new javax.swing.JButton();
        reverseListBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        getGeneric = new javax.swing.JButton();
        getAmountSum = new javax.swing.JButton();
        messageMain = new javax.swing.JLabel();
        saveBookData = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        loginPassword1Field = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        goRegister = new javax.swing.JButton();
        messageLogin = new javax.swing.JLabel();

        RegisterDialog.setTitle("Register");
        RegisterDialog.setModal(true);

        email.setText("Email :");

        password1.setText("Password :");

        password2.setText("Password :");

        tittle.setText("Register Form");

        address.setText("Address :");

        phoneNumber.setText("Phone number :");

        registerAddressField.setColumns(20);
        registerAddressField.setRows(5);
        jScrollPane1.setViewportView(registerAddressField);

        backLogin.setText("Login");
        backLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginActionPerformed(evt);
            }
        });

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(address)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(tittle)
                                .addGap(190, 190, 190))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(register)
                                        .addGap(67, 67, 67)
                                        .addComponent(backLogin)
                                        .addGap(88, 88, 88))
                                    .addComponent(jScrollPane1)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email)
                            .addComponent(password1)
                            .addComponent(password2)
                            .addComponent(phoneNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerPassword1Field, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerPhoneNumberField)
                            .addComponent(registerEmailField)
                            .addComponent(registerPassword2Field))))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tittle)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password2)
                    .addComponent(registerPassword2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(registerPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(address)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(register)
                            .addComponent(backLogin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(message)
                        .addGap(6, 6, 6))))
        );

        javax.swing.GroupLayout RegisterDialogLayout = new javax.swing.GroupLayout(RegisterDialog.getContentPane());
        RegisterDialog.getContentPane().setLayout(RegisterDialogLayout);
        RegisterDialogLayout.setHorizontalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        RegisterDialogLayout.setVerticalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        mainDialog.setTitle("Main Dialog");
        mainDialog.setModal(true);

        searchBook.setText("Search Book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });

        searchAuthor.setText("Search Author");
        searchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAuthorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(searchBook)
                .addGap(18, 18, 18)
                .addComponent(searchAuthor)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBook)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAuthor))
                .addGap(28, 28, 28))
        );

        book.setText("Book");

        jLabel6.setText("Name :");

        jLabel7.setText("Author :");

        jLabel8.setText("Amount :");

        addBook.setText("Add");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        setBook.setText("Set Book");
        setBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBookActionPerformed(evt);
            }
        });

        removeBook.setText("Remove");
        removeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookActionPerformed(evt);
            }
        });

        sortByAuthor.setText("Sort Author");
        sortByAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAuthorActionPerformed(evt);
            }
        });

        sortByAmount.setText("Sort Amount");
        sortByAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAmountActionPerformed(evt);
            }
        });

        sortByName.setText("Sort Book");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });

        reverseListBook.setText("Reverse");
        reverseListBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseListBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(book)
                .addGap(119, 119, 119))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removeBook)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(addBook)
                        .addGap(18, 18, 18)
                        .addComponent(setBook)
                        .addGap(0, 109, Short.MAX_VALUE))
                    .addComponent(amountField)
                    .addComponent(nameAuthorFeild)
                    .addComponent(nameBookFeild))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sortByName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortByAuthor)
                        .addGap(18, 18, 18)
                        .addComponent(sortByAmount))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(reverseListBook)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(book)
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nameBookFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameAuthorFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBook)
                    .addComponent(setBook)
                    .addComponent(removeBook))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortByAuthor)
                    .addComponent(sortByAmount)
                    .addComponent(sortByName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(reverseListBook))
        );

        tableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"sach 1", "a1",  new Integer(1)},
                {"sach 2", "a2",  new Integer(2)},
                {"sach 3", "a3",  new Integer(3)}
            },
            new String [] {
                "Name book", "Author", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBooks.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tableBooks);
        tableBooks.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tableBooks.getColumnModel().getColumnCount() > 0) {
            tableBooks.getColumnModel().getColumn(1).setResizable(false);
            tableBooks.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getGeneric.setText("Generic Book");
        getGeneric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGenericActionPerformed(evt);
            }
        });

        getAmountSum.setText("Show Amount");
        getAmountSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAmountSumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(messageMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(getAmountSum)
                    .addComponent(getGeneric))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(getGeneric)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getAmountSum))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(messageMain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveBookData.setText("Save");
        saveBookData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBookDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainDialogLayout = new javax.swing.GroupLayout(mainDialog.getContentPane());
        mainDialog.getContentPane().setLayout(mainDialogLayout);
        mainDialogLayout.setHorizontalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBookData)
                        .addGap(30, 30, 30))))
        );
        mainDialogLayout.setVerticalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(saveBookData)))
                .addGap(26, 26, 26)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jLabel2.setText("Email :");

        jLabel3.setText("Password :");

        jLabel1.setText("Login Form");

        login.setText("Login");
        login.setToolTipText("");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        goRegister.setText("Register");
        goRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login)
                .addGap(51, 51, 51)
                .addComponent(goRegister)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(messageLogin)
                .addGap(166, 166, 166))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(goRegister)
                            .addComponent(login))
                        .addGap(49, 49, 49)))
                .addComponent(messageLogin)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showListBooks() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableBooks.setModel(defaultTableModel);
        defaultTableModel.addColumn("Name book");
        defaultTableModel.addColumn("Name author");
        defaultTableModel.addColumn("Amount");
        for (Book book : bookManager.listBook) {
            defaultTableModel.addRow(new Object[]{book.getName(), book.getAuthor(), book.getAmount()});
        }
    }

    public void addListBookFromDataToArray(){
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try{
            fileInputStream = new FileInputStream("/home/samsung/NetBeansProjects/JavaApplication1/book_data2.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            Book book;
            while((book = (Book) objectInputStream.readObject()) != null){
                bookManager.addBook(book);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                objectInputStream.close();
                fileInputStream.close();
            } catch (IOException ex) {
                Logger.getLogger(LoginJframe.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }     
    }
        
    public String[] getBookDataFromUser() {
        String nameBook = nameBookFeild.getText();
        String author = nameAuthorFeild.getText();
        String amount = amountField.getText();
        String[] bookData = {nameBook, author, amount};
        return bookData;
    }

    public void resetBookFiled() {
        nameBookFeild.setText("");
        nameAuthorFeild.setText("");
        amountField.setText("");
    }

    private void goRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRegisterActionPerformed
        RegisterDialog.setSize(750, 670);
        RegisterDialog.setVisible(true);
    }//GEN-LAST:event_goRegisterActionPerformed

    private void backLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginActionPerformed
        RegisterDialog.setVisible(false);
    }//GEN-LAST:event_backLoginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        String email = registerEmailField.getText();
        String password1 = String.valueOf(registerPassword1Field.getPassword());
        String password2 = String.valueOf(registerPassword2Field.getPassword());
        String phoneNumber = registerPhoneNumberField.getText();
        String address = registerAddressField.getText();
        boolean isUser = validate.isUser(email, password1, password2, phoneNumber);
        if (isUser && !userManager.isUserExist(email)) {
            User user = new User(email, password1, phoneNumber, address);
            userManager.addUser(user);
            message.setText("Register Success!!");
        } else {
            message.setText("Register Failed!!");
        }
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String email = loginEmailField.getText();
        String password = String.valueOf(loginPassword1Field.getPassword());
        for (User myUser : userManager.getListUser()) {
            if (myUser.getEmail().equals(email) && myUser.getPassword().equals(password)) {
                messageLogin.setText("Login Success!!");
                mainDialog.setSize(1200, 800);
                mainDialog.setVisible(true);   
                return;
            }
        }
        messageLogin.setText("Login Failed!!");
    }//GEN-LAST:event_loginActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        String[] bookData = getBookDataFromUser();
        boolean isBook = validate.isBook(bookData[0], bookData[1], bookData[2]);
        if (isBook) {
            if (bookManager.isBookExist(bookData[0])) {
                return;
            }
            Book book = new Book(bookData[0], bookData[1], Integer.parseInt(bookData[2]));
            bookManager.addBook(book);
            showListBooks();
            resetBookFiled();
        }
    }//GEN-LAST:event_addBookActionPerformed

    private void setBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBookActionPerformed
        String[] bookData = getBookDataFromUser();
        boolean isBook = validate.isBook(bookData[0], bookData[1], bookData[2]);
        if (isBook) {
            for (Book myBook : bookManager.listBook) {
                if (myBook.getName().equals(bookData[0])) {
                    myBook.setAuthor(bookData[1]);
                    myBook.setAmount(Integer.parseInt(bookData[2]));
                    showListBooks();
                    resetBookFiled();
                    break;
                }
            }
        }
    }//GEN-LAST:event_setBookActionPerformed

    private void removeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookActionPerformed
        String keyName = nameBookFeild.getText();
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(keyName)) {
                bookManager.removeBook(myBook);
                showListBooks();
                resetBookFiled();
                break;
            }
        }
    }//GEN-LAST:event_removeBookActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        String name = searchField.getText();
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(name)) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();
                tableBooks.setModel(defaultTableModel);
                defaultTableModel.addColumn("Name book");
                defaultTableModel.addColumn("Name author");
                defaultTableModel.addColumn("Amount");
                defaultTableModel.addRow(new Object[]{myBook.getName(), myBook.getAuthor(), myBook.getAmount()});
                nameBookFeild.setText(myBook.getName());
                nameAuthorFeild.setText(myBook.getAuthor());
                amountField.setText(String.valueOf(myBook.getAmount()));
                break;
            } else {
                showListBooks();
            }
        }
    }//GEN-LAST:event_searchBookActionPerformed

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed
        Collections.sort(bookManager.listBook, new NameComparator());
        showListBooks();
    }//GEN-LAST:event_sortByNameActionPerformed

    private void sortByAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByAuthorActionPerformed
        Collections.sort(bookManager.listBook, new AuthorComparator());
        showListBooks();
    }//GEN-LAST:event_sortByAuthorActionPerformed

    private void searchAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAuthorActionPerformed
        String author = searchField.getText();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableBooks.setModel(defaultTableModel);
        defaultTableModel.addColumn("Name book");
        defaultTableModel.addColumn("Name author");
        defaultTableModel.addColumn("Amount");
        boolean isAuthor = false;
        for (Book myBook : bookManager.listBook) {
            if (myBook.getAuthor().equals(author)) {
                defaultTableModel.addRow(new Object[]{myBook.getName(), myBook.getAuthor(), myBook.getAmount()});
                isAuthor = true;
            }
        }
        if (!isAuthor) {
            showListBooks();
        }
    }//GEN-LAST:event_searchAuthorActionPerformed

    private void sortByAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByAmountActionPerformed
        Collections.sort(bookManager.listBook, new AmountComparator());
        showListBooks();
    }//GEN-LAST:event_sortByAmountActionPerformed

    private void reverseListBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseListBookActionPerformed
        Collections.reverse(bookManager.listBook);
        showListBooks();
    }//GEN-LAST:event_reverseListBookActionPerformed

    private void getGenericActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGenericActionPerformed
        String messageContent = "Book Generic: ";
        messageContent += String.valueOf(bookManager.listBook.size());
        messageMain.setText(messageContent);
    }//GEN-LAST:event_getGenericActionPerformed

    private void getAmountSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAmountSumActionPerformed
        int amountSum = 0;
        for (Book book : bookManager.listBook) {
            amountSum += book.getAmount();
        }
        String messageContent = "Book amount sum: ";
        messageContent += String.valueOf(amountSum);
        messageMain.setText(messageContent);
    }//GEN-LAST:event_getAmountSumActionPerformed

    private void saveBookDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBookDataActionPerformed
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("/home/samsung/NetBeansProjects/JavaApplication1/book_data2.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            for (Book book : bookManager.listBook) {
                objectOutputStream.writeObject(book);
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
    }//GEN-LAST:event_saveBookDataActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJframe frame = new LoginJframe();
                frame.setSize(750, 670);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog RegisterDialog;
    private javax.swing.JButton addBook;
    private javax.swing.JLabel address;
    private javax.swing.JTextField amountField;
    private javax.swing.JButton backLogin;
    private javax.swing.JLabel book;
    private javax.swing.JLabel email;
    private javax.swing.JButton getAmountSum;
    private javax.swing.JButton getGeneric;
    private javax.swing.JButton goRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton login;
    private javax.swing.JTextField loginEmailField;
    private javax.swing.JPasswordField loginPassword1Field;
    private javax.swing.JDialog mainDialog;
    private javax.swing.JLabel message;
    private javax.swing.JLabel messageLogin;
    private javax.swing.JLabel messageMain;
    private javax.swing.JTextField nameAuthorFeild;
    private javax.swing.JTextField nameBookFeild;
    private javax.swing.JLabel password1;
    private javax.swing.JLabel password2;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JButton register;
    private javax.swing.JTextArea registerAddressField;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JPasswordField registerPassword1Field;
    private javax.swing.JPasswordField registerPassword2Field;
    private javax.swing.JTextField registerPhoneNumberField;
    private javax.swing.JButton removeBook;
    private javax.swing.JButton reverseListBook;
    private javax.swing.JButton saveBookData;
    private javax.swing.JButton searchAuthor;
    private javax.swing.JButton searchBook;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton setBook;
    private javax.swing.JButton sortByAmount;
    private javax.swing.JButton sortByAuthor;
    private javax.swing.JButton sortByName;
    private javax.swing.JTable tableBooks;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
