
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
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

    
    public LoginJframe() {
        initComponents();
        showListBooks();

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
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        registerPassword2Field = new javax.swing.JPasswordField();
        message = new javax.swing.JLabel();
        mainDialog = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        searchAuthor = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        book = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        nameBookFeild = new javax.swing.JTextField();
        nameAuthorFeild = new javax.swing.JTextField();
        amountField = new javax.swing.JTextField();
        btnSetBook = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        btnSortAuthor = new javax.swing.JButton();
        btnSortAmount = new javax.swing.JButton();
        sortByName = new javax.swing.JButton();
        btnReverse = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBooks = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        getGeneric = new javax.swing.JButton();
        btnShowAmount = new javax.swing.JButton();
        messageMain = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginEmailField = new javax.swing.JTextField();
        loginPassword1Field = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnRegister = new javax.swing.JButton();
        messageLogin = new javax.swing.JLabel();

        RegisterDialog.setTitle("Register");
        RegisterDialog.setModal(true);

        email.setText("Email :");

        password1.setText("Password :");

        password2.setText(" Password :");

        tittle.setText("Register Form");

        address.setText("Address :");

        phoneNumber.setText("Phone number :");

        registerAddressField.setColumns(20);
        registerAddressField.setRows(5);
        jScrollPane1.setViewportView(registerAddressField);

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
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
                                        .addComponent(registerBtn)
                                        .addGap(67, 67, 67)
                                        .addComponent(loginBtn)
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
                            .addComponent(registerBtn)
                            .addComponent(loginBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(message)
                        .addGap(6, 6, 6))))
        );

        javax.swing.GroupLayout RegisterDialogLayout = new javax.swing.GroupLayout(RegisterDialog.getContentPane());
        RegisterDialog.getContentPane().setLayout(RegisterDialogLayout);
        RegisterDialogLayout.setHorizontalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterDialogLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        RegisterDialogLayout.setVerticalGroup(
            RegisterDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        mainDialog.setTitle("Main Dialog");
        mainDialog.setModal(true);

        btnSearch.setText("Search Book");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
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
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(searchAuthor)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchAuthor))
                .addGap(28, 28, 28))
        );

        book.setText("Book");

        jLabel6.setText("Name :");

        jLabel7.setText("Author :");

        jLabel8.setText("Amount :");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSetBook.setText("Set Book");
        btnSetBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetBookActionPerformed(evt);
            }
        });

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        btnSortAuthor.setText("Sort Author");
        btnSortAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortAuthorActionPerformed(evt);
            }
        });

        btnSortAmount.setText("Sort Amount");
        btnSortAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortAmountActionPerformed(evt);
            }
        });

        sortByName.setText("Sort Book");
        sortByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortByNameActionPerformed(evt);
            }
        });

        btnReverse.setText("Reverse");
        btnReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReverseActionPerformed(evt);
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
                        .addComponent(remove)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnSetBook)
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
                        .addComponent(btnSortAuthor)
                        .addGap(18, 18, 18)
                        .addComponent(btnSortAmount))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(btnReverse)))
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
                    .addComponent(btnAdd)
                    .addComponent(btnSetBook)
                    .addComponent(remove))
                .addGap(39, 39, 39)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSortAuthor)
                    .addComponent(btnSortAmount)
                    .addComponent(sortByName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnReverse))
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

        btnShowAmount.setText("Show Amount");
        btnShowAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(messageMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnShowAmount)
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
                        .addComponent(btnShowAmount))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(messageMain)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainDialogLayout = new javax.swing.GroupLayout(mainDialog.getContentPane());
        mainDialog.getContentPane().setLayout(mainDialogLayout);
        mainDialogLayout.setHorizontalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(210, 210, 210)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainDialogLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainDialogLayout.setVerticalGroup(
            mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        btnLogin.setText("Login");
        btnLogin.setToolTipText("");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogin)
                .addGap(51, 51, 51)
                .addComponent(btnRegister)
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
                            .addComponent(btnRegister)
                            .addComponent(btnLogin))
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

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        RegisterDialog.setSize(1000, 800);
        RegisterDialog.setVisible(true);
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        RegisterDialog.setVisible(false);
    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        String email = registerEmailField.getText();
        String password1 = String.valueOf(registerPassword1Field.getPassword());
        String password2 = String.valueOf(registerPassword2Field.getPassword());
        String phoneNumber = registerPhoneNumberField.getText();
        String address = registerAddressField.getText();
        Validate validate = new Validate();
        boolean isUser = validate.isUser(email, password1, password2, phoneNumber);
        if (isUser && !userManager.isUserExist(email)) {
            User user = new User(email, password1, phoneNumber, address);
            userManager.addUser(user);
            message.setText("Register Success!!");
        } else {
            message.setText("Register Failed!!");
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String email = loginEmailField.getText();
        String password = String.valueOf(loginPassword1Field.getPassword());
        for (User myUser : userManager.getListUser()) {
            if (myUser.getEmail().equals(email) && myUser.getPassword().equals(password)) {
                messageLogin.setText("Login Success!!");
                mainDialog.setSize(1000, 800);
                mainDialog.setVisible(true);
            } else {
                messageLogin.setText("Login Failed!!");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed
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


    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String name = nameBookFeild.getText();
        String author = nameAuthorFeild.getText();
        String amount = amountField.getText();
        Validate validate = new Validate();
        boolean isBook = validate.isBook(name, author, amount);
        if (isBook) {
            if (bookManager.isBookExist(name)) {
                return;
            }
            Book book = new Book(name, author, Integer.parseInt(amount));
            bookManager.addBook(book);
            showListBooks();
            resetBookFiled();
        }

    }//GEN-LAST:event_btnAddActionPerformed

    public void resetBookFiled() {
        nameBookFeild.setText("");
        nameAuthorFeild.setText("");
        amountField.setText("");
    }

    private void btnSetBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetBookActionPerformed
        String nameBook = nameBookFeild.getText();
        String author = nameAuthorFeild.getText();
        String amount = amountField.getText();
        Validate validate = new Validate();
        boolean isBook = validate.isBook(nameBook, author, amount);
        if (isBook) {
            for (Book myBook : bookManager.listBook) {
                if (myBook.getName().equals(nameBook)) {
                    myBook.setAuthor(author);
                    myBook.setAmount(Integer.parseInt(amount));
                    showListBooks();
                    resetBookFiled();
                    break;
                }
            }
        }

    }//GEN-LAST:event_btnSetBookActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        String keyName = nameBookFeild.getText();
        for (Book myBook : bookManager.listBook) {
            if (myBook.getName().equals(keyName)) {
                bookManager.removeBook(myBook);
                showListBooks();
                resetBookFiled();
                break;
            }
        }
    }//GEN-LAST:event_removeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
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
    }//GEN-LAST:event_btnSearchActionPerformed

    private void sortByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortByNameActionPerformed
        Collections.sort(bookManager.listBook, new NameComparator());
        showListBooks();
    }//GEN-LAST:event_sortByNameActionPerformed

    private void btnSortAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortAuthorActionPerformed
        Collections.sort(bookManager.listBook, new AuthorComparator());
        showListBooks();
    }//GEN-LAST:event_btnSortAuthorActionPerformed

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

    private void btnSortAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortAmountActionPerformed
        Collections.sort(bookManager.listBook, new AmountComparator());
        showListBooks();
    }//GEN-LAST:event_btnSortAmountActionPerformed

    private void btnReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReverseActionPerformed
        Collections.reverse(bookManager.listBook);
        showListBooks();
    }//GEN-LAST:event_btnReverseActionPerformed

    private void getGenericActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getGenericActionPerformed
        String messageContent = "Book Generic: ";
        messageContent += String.valueOf(bookManager.listBook.size());
        messageMain.setText(messageContent);
    }//GEN-LAST:event_getGenericActionPerformed

    private void btnShowAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAmountActionPerformed
        int amountSum = 0;
        for (Book book : bookManager.listBook) {
            amountSum += book.getAmount();
        }
        String messageContent = "Book amount sum: ";
        messageContent += String.valueOf(amountSum);
        messageMain.setText(messageContent);
    }//GEN-LAST:event_btnShowAmountActionPerformed

    
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
                frame.setSize(1000, 800);
                frame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog RegisterDialog;
    private javax.swing.JLabel address;
    private javax.swing.JTextField amountField;
    private javax.swing.JLabel book;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReverse;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetBook;
    private javax.swing.JButton btnShowAmount;
    private javax.swing.JButton btnSortAmount;
    private javax.swing.JButton btnSortAuthor;
    private javax.swing.JLabel email;
    private javax.swing.JButton getGeneric;
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
    private javax.swing.JButton loginBtn;
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
    private javax.swing.JTextArea registerAddressField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField registerEmailField;
    private javax.swing.JPasswordField registerPassword1Field;
    private javax.swing.JPasswordField registerPassword2Field;
    private javax.swing.JTextField registerPhoneNumberField;
    private javax.swing.JButton remove;
    private javax.swing.JButton searchAuthor;
    private javax.swing.JTextField searchField;
    private javax.swing.JButton sortByName;
    private javax.swing.JTable tableBooks;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
