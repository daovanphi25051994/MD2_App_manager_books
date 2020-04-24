package main;

import controller.AmountComparator;
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
import controller.AuthorComparator;
import model.Book;
import controller.BookManager;
import controller.FileService;
import controller.NameComparator;
import model.User;
import controller.UserManager;
import controller.Validate;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class LoginJframe extends javax.swing.JFrame {

    private UserManager userManager = UserManager.getUserManager();
    private BookManager bookManager = BookManager.getBookManager();
    private Validate validate = new Validate();
    private FileService fileService = new FileService();
    public static final String BOOK_DATA_PATH = "/home/samsung/NetBeansProjects/JavaApplication1/src/data/book_data2.txt";
    public static final String USER_DATA_PATH = "/home/samsung/NetBeansProjects/JavaApplication1/src/data/user_data2.txt";
    public static final String NAME_BOOK_LABEL = "Name book";
    public static final String NAME_AUTHOR_LABEL = "Name Author";
    public static final String AMOUNT_LABEL = "Amount";
    public static final String REGISTER_SUCCESS_MESSAGE = "Register Successful!!";
    public static final String REGISTER_FAILED_MESSAGE = "Register Failed!!";
    public static final String LOGIN_SUCCESS_MESSAGE = "Login Successful!!";
    public static final String LOGIN_FAILED_MESSAGE = "Login Failed!!";
    public static final String BOOK_GENERIC_MESSAGE = "Book Generic: ";
    public static final String BOOK_AMOUNT_MESSAGE = "Book amount sum: ";

    public LoginJframe() {
        initComponents();
        addListBookFromDataToArray();
        showListBooks();
        fileService.writeFileUserToArray(userManager.listUser, USER_DATA_PATH);
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mainDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        searchBook = new javax.swing.JButton();
        searchAuthor = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nameBookFeild = new javax.swing.JTextField();
        nameAuthorFeild = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        setBook = new javax.swing.JButton();
        removeBook = new javax.swing.JButton();
        sortByAuthor = new javax.swing.JButton();
        sortByAmount = new javax.swing.JButton();
        sortByName = new javax.swing.JButton();
        reverseListBook = new javax.swing.JButton();
        addBook = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        getGeneric = new javax.swing.JButton();
        getAmountSum = new javax.swing.JButton();
        messageMain = new javax.swing.JLabel();
        saveBookData = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        loginPassword1Field = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        goRegister = new javax.swing.JButton();
        messageLogin = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        RegisterDialog.setTitle("Register");
        RegisterDialog.setModal(true);

        email.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        email.setText("Email :");

        password1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        password1.setText("Password :");

        password2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        password2.setText("RePassword :");

        tittle.setFont(new java.awt.Font("Abyssinica SIL", 3, 24)); // NOI18N
        tittle.setForeground(new java.awt.Color(55, 197, 1));
        tittle.setText("Register Form");

        address.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        address.setText("Address :");

        phoneNumber.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        phoneNumber.setText("Phone number :");

        registerAddressField.setColumns(20);
        registerAddressField.setRows(5);
        jScrollPane1.setViewportView(registerAddressField);

        backLogin.setBackground(new java.awt.Color(37, 61, 232));
        backLogin.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        backLogin.setText("Login");
        backLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backLoginActionPerformed(evt);
            }
        });

        register.setBackground(new java.awt.Color(68, 202, 14));
        register.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*");

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*");

        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(address)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                                .addComponent(register)
                                .addGap(67, 67, 67)
                                .addComponent(backLogin)
                                .addGap(88, 88, 88))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(password1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(email)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(password2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(phoneNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tittle, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(registerPassword1Field)
                            .addComponent(registerPassword2Field, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerEmailField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerPhoneNumberField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(message)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tittle)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email)
                    .addComponent(jLabel9))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password1)
                    .addComponent(jLabel10))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPassword2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password2)
                    .addComponent(jLabel11))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerPhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(address)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                .addContainerGap(59, Short.MAX_VALUE))
        );
        RegisterDialogLayout.setVerticalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        mainDialog.setTitle("Main Dialog");
        mainDialog.setModal(true);

        searchBook.setBackground(new java.awt.Color(213, 255, 139));
        searchBook.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        searchBook.setText("Search Book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });

        searchAuthor.setBackground(new java.awt.Color(213, 255, 139));
        searchAuthor.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        searchAuthor.setText("Search Author");
        searchAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAuthorActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchBook)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchAuthor))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBook)
                    .addComponent(searchAuthor)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        jPanel6.setBackground(new java.awt.Color(219, 249, 245));

        book.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        book.setForeground(new java.awt.Color(250, 135, 42));
        book.setText("BOOK MANAGER");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel6.setText("Name :");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel7.setText("Author :");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        jLabel8.setText("Amount :");

        setBook.setBackground(new java.awt.Color(246, 211, 15));
        setBook.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        setBook.setText("Set Book");
        setBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setBookActionPerformed(evt);
            }
        });

        removeBook.setBackground(new java.awt.Color(244, 15, 10));
        removeBook.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        removeBook.setText("Remove");
        removeBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeBookActionPerformed(evt);
            }
        });

        sortByAuthor.setBackground(new java.awt.Color(213, 255, 139));
        sortByAuthor.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        sortByAuthor.setText("Sort Author");
        sortByAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAuthorActionPerformed(evt);
            }
        });

        sortByAmount.setBackground(new java.awt.Color(213, 255, 139));
        sortByAmount.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        sortByAmount.setText("Sort Amount");
        sortByAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByAmountActionPerformed(evt);
            }
        });

        sortByName.setBackground(new java.awt.Color(213, 255, 139));
        sortByName.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        sortByName.setText("Sort Book");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });

        reverseListBook.setBackground(new java.awt.Color(213, 255, 139));
        reverseListBook.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        reverseListBook.setText("Reverse");
        reverseListBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseListBookActionPerformed(evt);
            }
        });

        addBook.setBackground(new java.awt.Color(46, 95, 233));
        addBook.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        addBook.setText("Add");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameBookFeild, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(nameAuthorFeild)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(removeBook)
                                .addGap(34, 34, 34)
                                .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(sortByName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sortByAuthor)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortByAmount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(setBook, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(reverseListBook)
                        .addGap(150, 150, 150))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(book)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameBookFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameAuthorFeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(amountField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeBook, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBook, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setBook, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sortByAuthor)
                    .addComponent(sortByName)
                    .addComponent(sortByAmount))
                .addGap(18, 18, 18)
                .addComponent(reverseListBook)
                .addContainerGap(30, Short.MAX_VALUE))
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

        getGeneric.setBackground(new java.awt.Color(213, 255, 139));
        getGeneric.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getGeneric.setText("Generic Book");
        getGeneric.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getGenericActionPerformed(evt);
            }
        });

        getAmountSum.setBackground(new java.awt.Color(213, 255, 139));
        getAmountSum.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        getAmountSum.setText("Show Amount");
        getAmountSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAmountSumActionPerformed(evt);
            }
        });

        messageMain.setFont(new java.awt.Font("AnjaliOldLipi", 3, 18)); // NOI18N
        messageMain.setForeground(new java.awt.Color(26, 165, 20));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(getGeneric)
                        .addGap(44, 44, 44)
                        .addComponent(getAmountSum))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(messageMain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getGeneric)
                    .addComponent(getAmountSum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(messageMain, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        saveBookData.setBackground(new java.awt.Color(0, 85, 255));
        saveBookData.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        saveBookData.setForeground(new java.awt.Color(254, 254, 254));
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
                .addGap(22, 22, 22)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(96, 96, 96)
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(113, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveBookData, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );
        mainDialogLayout.setVerticalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBookData, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Viet Nam Library");
        setBackground(new java.awt.Color(47, 94, 24));

        jPanel2.setBackground(new java.awt.Color(254, 254, 254));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setText("Email :");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setText("Password :");

        jLabel1.setBackground(new java.awt.Color(240, 241, 242));
        jLabel1.setFont(new java.awt.Font("Abyssinica SIL", 2, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(10, 109, 242));
        jLabel1.setText("Login Form");

        loginEmailField.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        loginEmailField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginEmailFieldKeyPressed(evt);
            }
        });

        loginPassword1Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPassword1FieldActionPerformed(evt);
            }
        });
        loginPassword1Field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPassword1FieldKeyPressed(evt);
            }
        });

        login.setBackground(new java.awt.Color(40, 32, 240));
        login.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        login.setForeground(new java.awt.Color(254, 254, 254));
        login.setText("Login");
        login.setToolTipText("");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        goRegister.setBackground(new java.awt.Color(85, 236, 21));
        goRegister.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        goRegister.setForeground(new java.awt.Color(251, 254, 251));
        goRegister.setText("Register");
        goRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goRegisterActionPerformed(evt);
            }
        });

        messageLogin.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(messageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(goRegister)))
                        .addGap(54, 54, 54))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginPassword1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(login)
                    .addComponent(goRegister))
                .addGap(30, 30, 30)
                .addComponent(messageLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jPanel7.setBackground(new java.awt.Color(144, 226, 252));

        jLabel5.setBackground(new java.awt.Color(213, 233, 238));
        jLabel5.setFont(new java.awt.Font("Abyssinica SIL", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 10, 46));
        jLabel5.setText("Welcome to Lucy Library");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void showListBooks() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableBooks.setModel(defaultTableModel);
        defaultTableModel.addColumn(NAME_BOOK_LABEL);
        defaultTableModel.addColumn(NAME_AUTHOR_LABEL);
        defaultTableModel.addColumn(AMOUNT_LABEL);
        for (Book book : bookManager.listBook) {
            defaultTableModel.addRow(new Object[]{book.getName(), book.getAuthor(), book.getAmount()});
        }
    }

    public void addListBookFromDataToArray() {
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream(BOOK_DATA_PATH);
            objectInputStream = new ObjectInputStream(fileInputStream);
            Book book;
            while ((book = (Book) objectInputStream.readObject()) != null) {
                bookManager.addBook(book);
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

    public void searchBook() {
        String name = searchField.getText();
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(name)) {
                DefaultTableModel defaultTableModel = new DefaultTableModel();
                tableBooks.setModel(defaultTableModel);
                defaultTableModel.addColumn(NAME_BOOK_LABEL);
                defaultTableModel.addColumn(NAME_AUTHOR_LABEL);
                defaultTableModel.addColumn(AMOUNT_LABEL);
                defaultTableModel.addRow(new Object[]{myBook.getName(), myBook.getAuthor(), myBook.getAmount()});
                nameBookFeild.setText(myBook.getName());
                nameAuthorFeild.setText(myBook.getAuthor());
                amountField.setText(String.valueOf(myBook.getAmount()));
                break;
            } else {
                showListBooks();
            }
        }
    }

    public void login() {
        String email = loginEmailField.getText();
        String password = String.valueOf(loginPassword1Field.getPassword());
        for (User myUser : userManager.listUser) {
            if (myUser.getEmail().equals(email) && myUser.getPassword().equals(password)) {
                messageLogin.setText(LOGIN_SUCCESS_MESSAGE);
                mainDialog.setSize(1200, 800);
                mainDialog.setVisible(true);
                return;
            }
        }
        messageLogin.setText(LOGIN_FAILED_MESSAGE);
    }

    public void searchListBook() {
        String name = searchField.getText();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableBooks.setModel(defaultTableModel);
        defaultTableModel.addColumn(NAME_BOOK_LABEL);
        defaultTableModel.addColumn(NAME_AUTHOR_LABEL);
        defaultTableModel.addColumn(AMOUNT_LABEL);
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().indexOf(name) != -1 || myBook.getAuthor().indexOf(name) != -1) {
                defaultTableModel.addRow(new Object[]{myBook.getName(), myBook.getAuthor(), myBook.getAmount()});
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

    public void searchAuthor() {
        String author = searchField.getText();
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        tableBooks.setModel(defaultTableModel);
        defaultTableModel.addColumn(NAME_BOOK_LABEL);
        defaultTableModel.addColumn(NAME_AUTHOR_LABEL);
        defaultTableModel.addColumn(AMOUNT_LABEL);
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
    }

    public void saveBookData() {
        int isYesConfirm = JOptionPane.showConfirmDialog(this, "Do you want save as change ?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (isYesConfirm == JOptionPane.YES_OPTION) {
            FileOutputStream fileOutputStream = null;
            ObjectOutputStream objectOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(BOOK_DATA_PATH);
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
        }
    }

    public void resetBookFiled() {
        nameBookFeild.setText("");
        nameAuthorFeild.setText("");
        amountField.setText("");
    }

    public void register() {
        String email = registerEmailField.getText();
        String password1 = String.valueOf(registerPassword1Field.getPassword());
        String password2 = String.valueOf(registerPassword2Field.getPassword());
        String phoneNumber = registerPhoneNumberField.getText();
        String address = registerAddressField.getText();
        boolean isUser = validate.isUser(email, password1, password2, phoneNumber);
        if (isUser && !userManager.isUserExist(email)) {
            User user = new User(email, password1, phoneNumber, address);
            userManager.addUser(user);
            fileService.saveUserToFile(userManager.listUser, USER_DATA_PATH);
            message.setText(REGISTER_SUCCESS_MESSAGE);
        } else {
            message.setText(REGISTER_FAILED_MESSAGE);
        }
    }

    public void addBook() {
        String[] bookData = getBookDataFromUser();
        boolean isBook = validate.isBook(bookData[0], bookData[1], bookData[2]);
        if (isBook) {
            if (bookManager.isBookExist(bookData[0])) {
                JOptionPane.showMessageDialog(this, "sach da ton tai!!");
                return;
            }
            int isYesConfirm = JOptionPane.showConfirmDialog(this, "Do you want add book ?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (isYesConfirm == JOptionPane.YES_OPTION) {
                Book book = new Book(bookData[0], bookData[1], Integer.parseInt(bookData[2]));
                bookManager.addBook(book);
                showListBooks();
                resetBookFiled();
                return;
            } else {
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "sai dinh dang sach!!");
    }

    public void setBook() {
        String[] bookData = getBookDataFromUser();
        boolean isBook = validate.isBook(bookData[0], bookData[1], bookData[2]);
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(bookData[0])) {
                if (isBook) {
                    int isYesConfirm = JOptionPane.showConfirmDialog(this, "Do you want set book ?", "Confirm", JOptionPane.YES_NO_OPTION);
                    if (isYesConfirm == JOptionPane.YES_OPTION) {
                        myBook.setAuthor(bookData[1]);
                        myBook.setAmount(Integer.parseInt(bookData[2]));
                        showListBooks();
                        resetBookFiled();
                        return;
                    } else {
                        return;
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "sai dinh dang!");
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "khong tim thay name book");
    }

    public void removeBook() {
        String keyName = nameBookFeild.getText();
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(keyName)) {
                int isYesConfirm = JOptionPane.showConfirmDialog(this, "Do you want delete book ?", "Confirm", JOptionPane.YES_NO_OPTION);
                if (isYesConfirm == JOptionPane.YES_OPTION) {
                    bookManager.removeBook(myBook);
                    showListBooks();
                    resetBookFiled();
                    return;
                } else {
                    return;
                }
            }
        }
        JOptionPane.showMessageDialog(this, "khong tim thay sach");
    }

    private void goRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goRegisterActionPerformed
        RegisterDialog.setSize(750, 670);
        RegisterDialog.setVisible(true);
    }//GEN-LAST:event_goRegisterActionPerformed

    private void backLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backLoginActionPerformed
        RegisterDialog.setVisible(false);
    }//GEN-LAST:event_backLoginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        register();
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        login();
    }//GEN-LAST:event_loginActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        addBook();
    }//GEN-LAST:event_addBookActionPerformed

    private void setBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setBookActionPerformed
        setBook();
    }//GEN-LAST:event_setBookActionPerformed

    private void removeBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeBookActionPerformed
        removeBook();
    }//GEN-LAST:event_removeBookActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        searchBook();
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
        searchAuthor();
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
        String messageContent = BOOK_GENERIC_MESSAGE;
        messageContent += String.valueOf(bookManager.listBook.size());
        messageMain.setText(messageContent);
    }//GEN-LAST:event_getGenericActionPerformed

    private void getAmountSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAmountSumActionPerformed
        int amountSum = 0;
        for (Book book : bookManager.listBook) {
            amountSum += book.getAmount();
        }
        String messageContent = BOOK_AMOUNT_MESSAGE;
        messageContent += String.valueOf(amountSum);
        messageMain.setText(messageContent);
    }//GEN-LAST:event_getAmountSumActionPerformed

    private void saveBookDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBookDataActionPerformed
        saveBookData();
    }//GEN-LAST:event_saveBookDataActionPerformed

    private void searchFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            searchBook();
            return;
        }
        searchListBook();
    }//GEN-LAST:event_searchFieldKeyPressed

    private void loginEmailFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginEmailFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
            return;
        }
    }//GEN-LAST:event_loginEmailFieldKeyPressed

    private void loginPassword1FieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPassword1FieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
            return;
        }
    }//GEN-LAST:event_loginPassword1FieldKeyPressed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void loginPassword1FieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPassword1FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPassword1FieldActionPerformed

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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
