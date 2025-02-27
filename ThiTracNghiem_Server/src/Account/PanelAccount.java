/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import Entity.Account;
import Work.*;
import java.awt.event.ItemEvent;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HuyHung
 */
public class PanelAccount extends javax.swing.JPanel {

    /**
     * Creates new form PanelSinhVien
     */
    private DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return false;
        }
    };
    
    private DefaultComboBoxModel dcb = new DefaultComboBoxModel();
    private AccountDAO accountDAO = new AccountDAO();
    private int iSearch = 0;
    private boolean addOrUpdate = true;
    private Vector<Account> vtAcc = null;
    private Check check = new Check();

    public PanelAccount() {
        initComponents();
        tbAccount.setEditingRow(1);
        loadColumnData();
//        setSizeColumn();
        loadRowData(0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbSelect = new javax.swing.JComboBox();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAccount = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfLastTime = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        tfUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cbPermission = new javax.swing.JComboBox();
        tfFullName = new javax.swing.JTextField();
        btCancel = new javax.swing.JButton();
        btOK = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        lbOnline = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btAdd = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("FACULTY INFORMATION");

        setPreferredSize(new java.awt.Dimension(750, 383));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tìm Kiếm", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));

        cbSelect.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "[--Chọn một--]", "Theo username", "Theo permission" }));
        cbSelect.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSelectItemStateChanged(evt);
            }
        });
        cbSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectActionPerformed(evt);
            }
        });

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });

        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Search.png"))); // NOI18N
        btSearch.setText("Tìm Kiếm");
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbAccount.setAutoCreateRowSorter(true);
        tbAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Môn Học", "Số Tiết", "Học Kì", "Hình Thức Thi"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAccountMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbAccountMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbAccount);
        if (tbAccount.getColumnModel().getColumnCount() > 0) {
            tbAccount.getColumnModel().getColumn(0).setMaxWidth(350);
            tbAccount.getColumnModel().getColumn(2).setMaxWidth(200);
            tbAccount.getColumnModel().getColumn(4).setMaxWidth(300);
        }

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));
        jPanel2.setForeground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Tên đầy đủ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Tài khoản");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Mật khẩu");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Thời gian");

        tfLastTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLastTimeActionPerformed(evt);
            }
        });

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Quyền hạn");

        cbPermission.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPermission.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Admin", "User" }));
        cbPermission.setAlignmentX(1.5F);
        cbPermission.setAlignmentY(1.5F);
        cbPermission.setName(""); // NOI18N
        cbPermission.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPermissionActionPerformed(evt);
            }
        });

        btCancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btCancel.setForeground(new java.awt.Color(255, 0, 0));
        btCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cancel.png"))); // NOI18N
        btCancel.setText("Cancel");
        btCancel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        btOK.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btOK.setForeground(new java.awt.Color(255, 0, 0));
        btOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/accept.png"))); // NOI18N
        btOK.setText(" OK");
        btOK.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOKActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Trạng thái:");

        lbOnline.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOnline.setForeground(new java.awt.Color(255, 0, 0));
        lbOnline.setText("Online");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfLastTime)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfFullName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(btOK, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOnline)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cbPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btCancel)
                            .addGap(33, 33, 33)))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {tfFullName, tfLastTime, tfPassword, tfUsername});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel8)
                            .addComponent(cbPermission, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(lbOnline))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(tfLastTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(tfFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(btCancel)
                            .addComponent(btOK))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfFullName, tfLastTime, tfPassword, tfUsername});

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204)));

        btAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btAdd.setForeground(new java.awt.Color(255, 0, 0));
        btAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/new.png"))); // NOI18N
        btAdd.setText("Add");
        btAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddActionPerformed(evt);
            }
        });

        btUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btUpdate.setForeground(new java.awt.Color(255, 0, 0));
        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        btUpdate.setText("Update");
        btUpdate.setEnabled(false);
        btUpdate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUpdateActionPerformed(evt);
            }
        });

        btDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 0, 0));
        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Remove.png"))); // NOI18N
        btDelete.setText("Delete");
        btDelete.setEnabled(false);
        btDelete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btDelete.setIconTextGap(2);
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btRefresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btRefresh.setForeground(new java.awt.Color(255, 0, 0));
        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Refresh.png"))); // NOI18N
        btRefresh.setText("Refresh");
        btRefresh.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(btAdd)
                .addGap(8, 8, 8)
                .addComponent(btUpdate)
                .addGap(8, 8, 8)
                .addComponent(btDelete)
                .addGap(8, 8, 8)
                .addComponent(btRefresh)
                .addContainerGap())
        );

        jLabel15.setBackground(new java.awt.Color(0, 0, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Manage Account");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadColumnData() {
        Vector<String> columnName = accountDAO.getColumnName();
        columnName.add(0, "STT");
        model.setColumnIdentifiers(columnName);
        // Set preferredWidth for column
        
    }

    private void loadRowData(int i) {
        removeRow();
        setEnableInput(false);
        setEditInput(false);
        setEnableButton2(false);
        int stt = 0;
        switch (i) {
            // Load data from box search.
            case 1:
                for (Account a : vtAcc) {
                    stt++;
                    model.addRow(toObjectData(stt, a));
                }
                break;

            //Load default data, i=0
            default:
                Vector<Account> vtRowData = accountDAO.getRowData();
                for (Account a : vtRowData) {
                    stt++;
                    model.addRow(toObjectData(stt, a));
                }
                break;
        }
        tbAccount.setModel(model);
    }

    private void setEnableInput(boolean kt) {
        tfUsername.setEnabled(kt);
        tfPassword.setEnabled(kt);
        tfLastTime.setEnabled(false);
        tfFullName.setEnabled(kt);
        cbPermission.setEnabled(kt);
    }

    private void setEditInput(boolean kt) {
        tfUsername.setEditable(kt);
        tfPassword.setEditable(kt);
        tfLastTime.setEditable(false);
        tfFullName.setEditable(kt);
        cbPermission.setEditable(kt);
    }

    private void setEnableButton(boolean kt) {
        btAdd.setEnabled(kt);
        btUpdate.setEnabled(kt);
        btDelete.setEnabled(kt);
    }

    private void setEnableButton2(boolean kt) {
        btOK.setEnabled(kt);
        btCancel.setEnabled(kt);
    }

    private void resetTextfiel() {
        tfUsername.setText("");
        tfFullName.setText("");
        tfPassword.setText("");
        tfLastTime.setText("");
        cbPermission.setSelectedItem(2);
    }
//private void setSizeColumn() {
//        TableColumn column = null;
//        for (int i = 0; i < 5; i++) {
//            column = tbAccount.getColumnModel().getColumn(i);
//            switch(i){ //730
//                case 0:column.setPreferredWidth(5);break;
//                case 1:column.setPreferredWidth(60);break;
//                case 2:column.setPreferredWidth(200);break;
//                case 3:column.setPreferredWidth(50);break;
//                case 4:column.setPreferredWidth(90);break;
//                case 5:column.setPreferredWidth(250);break;
//            }               
//        }
//    }
    private void removeRow() {
        //Xóa dữ liệu hiện tại
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }

    private Object[] toObjectData(int stt, Account acc) {
        Object[] obj = {stt, acc.getUsername(), acc.getPassword(), acc.getPermission(), acc.getLastTimeLogin(), acc.getFullname(),(acc.isOnline())?("Online"):("Offline")};
        return obj;
    }

    private boolean addOrUpdate(boolean add, Account acc) {
        if (check.checkUsername(acc.getUsername())) {
            if (check.checkUsername(acc.getPassword())) {
                // Button add
                if (add) {
                    if (accountDAO.checkUser(acc.getUsername())) {
                        JOptionPane.showMessageDialog(this, "<html>Thêm mới không thành công!\nUser: <b>" + acc.getUsername()
                                + "</b> đã tồn tại.\nVui lòng thử lại.", "   Thêm mới", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        accountDAO.addAccount(acc);
                        return true;
                    }
                    // Button update
                } else {
                    if (!accountDAO.checkUser(acc.getUsername())) {
                        JOptionPane.showMessageDialog(this, "Cập nhật không thành công!\n<html>User: <b>" + acc.getUsername()
                                + "</b> không có trong hệ thống.\nVui lòng thử lại.", "   Cập nhật", JOptionPane.ERROR_MESSAGE);
                        return false;
                    } else {
                        accountDAO.updateAccount(acc);
                        return true;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(this, "Mật khẩu không đúng định dạng!\nVui lòng thử lại.", "   Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Tên người dùng không đúng định dạng!\nVui lòng thử lại.", "   Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    private void cbSelectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSelectItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            iSearch = cbSelect.getSelectedIndex();
        }
    }//GEN-LAST:event_cbSelectItemStateChanged

    private void cbSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSelectActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        btSearch.doClick();
    }//GEN-LAST:event_tfSearchActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        if (tfSearch.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Khung tìm kiếm không được để trống.", "  Lỗi Tìm Kiếm   ", 0);
        } else {
            if (iSearch == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng chọn chế độ tìm kiếm.", "  Lỗi Tìm Kiếm   ", 0);
            } else {
                System.out.println(iSearch);
                search(iSearch, tfSearch.getText());
            }
        }
    }//GEN-LAST:event_btSearchActionPerformed

    private void search(int index, String name) {
        switch (index) {
            //Tìm Kiếm theo username
            case 1:
                vtAcc = accountDAO.findByUsername(name);
                if (vtAcc.size() > 0) {
                    loadRowData(1);
                } else {
                    JOptionPane.showMessageDialog(null, "<html> Username: <b>" + name + "</b> doesn't exit!", "  Lỗi Tìm Kiếm", 0);
                    tfSearch.requestFocus();
                }
                return;
            //Tìm Kiếm theo tên môn học
            case 2:
                vtAcc = accountDAO.findByPermission(name);
                if (vtAcc.size() > 0) {
                    loadRowData(1);
                } else {
                    JOptionPane.showMessageDialog(null, "<html> Permission: <b>" + name + "</b> doesn't exit!", "  Lỗi Tìm Kiếm", 0);
                    tfSearch.requestFocus();
                }
                return;
        }
    }
    private void tbAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseClicked

    }//GEN-LAST:event_tbAccountMouseClicked


    private void tbAccountMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAccountMouseReleased
        setEnableButton(true);
        setEnableButton2(false);
        setEnableInput(true);
        setEditInput(false);

        tfUsername.setText(tbAccount.getValueAt(tbAccount.getSelectedRow(), 1).toString());
        tfPassword.setText(tbAccount.getValueAt(tbAccount.getSelectedRow(), 2).toString());
        String per = tbAccount.getValueAt(tbAccount.getSelectedRow(), 3).toString();
        if (per.equalsIgnoreCase("admin")) {
            cbPermission.setSelectedIndex(0);
        } else {
            cbPermission.setSelectedIndex(1);
        }
        tfLastTime.setText(tbAccount.getValueAt(tbAccount.getSelectedRow(), 4).toString());
        tfFullName.setText(tbAccount.getValueAt(tbAccount.getSelectedRow(), 5).toString());
        lbOnline.setText(tbAccount.getValueAt(tbAccount.getSelectedRow(), 6).toString());


    }//GEN-LAST:event_tbAccountMouseReleased

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed


    private void btAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddActionPerformed
        setEnableInput(true);
        setEditInput(true);
        setEnableButton(false);
        resetTextfiel();
        setEnableButton2(true);
        addOrUpdate = true;
    }//GEN-LAST:event_btAddActionPerformed


    private void btUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUpdateActionPerformed
        setEnableInput(true);
        setEditInput(true);
        setEnableButton(false);
        setEnableButton2(true);
        addOrUpdate = false;
    }//GEN-LAST:event_btUpdateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        String usr = tfUsername.getText().trim();
        int b = JOptionPane.showConfirmDialog(null, "<html>Bạn có chắc chắn muốn xóa tài khoản <b>" + usr + " ??", "Thông Báo", JOptionPane.YES_NO_OPTION);
        if (b == JOptionPane.YES_OPTION) {
            if (accountDAO.delAccount(usr)) {
                JOptionPane.showMessageDialog(null, "Xóa thành công !", " Thành công", 1);
                btRefresh.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Xóa không thành công !", "Không Thành công", 0);
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        loadRowData(0);
        setEnableInput(false);
        setEditInput(false);
        setEnableButton(false);
        setEnableButton2(false);
        resetTextfiel();
        btAdd.setEnabled(true);
//        setSizeColumn();

    }//GEN-LAST:event_btRefreshActionPerformed

    private void cbPermissionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPermissionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPermissionActionPerformed

    private void tfLastTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLastTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLastTimeActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        setEnableInput(false);
        setEnableButton(true);
        setEnableButton2(false);
        resetTextfiel();
    }//GEN-LAST:event_btCancelActionPerformed

    private void btOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOKActionPerformed
        String usr = tfUsername.getText().trim();
        String pwd = tfPassword.getText().trim();
        String fname = tfFullName.getText().trim();
        String lastTime = null;
        String per = cbPermission.getSelectedItem().toString();
        boolean online = (lbOnline.getText().compareToIgnoreCase("online")==0)?(true):false;
        // Add
        if (addOrUpdate) {
            lastTime = "new user";
            Account acc = new Account(usr, pwd, per, lastTime, fname,false);
            if (addOrUpdate(true, acc)) {
                JOptionPane.showMessageDialog(this, "Thêm mới thành công!\n", "   Thêm mới", JOptionPane.INFORMATION_MESSAGE);
            }
            // Update
        } else {
            lastTime = tfLastTime.getText().trim();
            if (pwd.length() != 32) {
                pwd = MD5Encryption.encrypt(pwd);
            }
            Account acc = new Account(usr, pwd, per, lastTime, fname,online);
            if (addOrUpdate(false, acc)) {
                JOptionPane.showMessageDialog(this, "Cập nhật thành công!\n", "   Cập nhật", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        btRefresh.doClick();
    }//GEN-LAST:event_btOKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btOK;
    private javax.swing.JButton btRefresh;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbPermission;
    private javax.swing.JComboBox cbSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbOnline;
    private javax.swing.JTable tbAccount;
    private javax.swing.JTextField tfFullName;
    private javax.swing.JTextField tfLastTime;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables

    
}
