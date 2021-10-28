/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.CurrentAccount;
import model.GiaoDich;
import model.KhachHang;
import model.NguoiDung;
import model.NhanVien;
import model.TaiKhoan;
import service.CurrentAccountService;
import service.GDChuyenTienService;
import service.GDGoiRutService;
import service.GiaoDichService;
import service.KhachHangService;
import service.NhanVienService;
import service.TaiKhoanService;

/**
 *
 * @author Admin
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    NguoiDung nd;
    ArrayList<NhanVien> dsnv;
    ArrayList<KhachHang> dskh;
    CurrentAccount currentAccount = null;

    public Home(NguoiDung nd) {
        this.nd = nd;
        initComponents();

        selectedTaskBar(home, ind_1, btn_Home);
        if (nd.getTenNhom().equals("CHINHANH")) {
            task_bar.setVisible(true);
            task_bar1.setVisible(false);
            lbl_HoTenNV_dn.setText(nd.getHoTen());
            lbl_QuyenNV_dn.setText(nd.getTenNhom());
            lbl_maNV.setText(nd.getMaNV());
        } else {
            task_bar.setVisible(false);
            task_bar1.setVisible(true);
            lbl_HoTenNV_dn1.setText(nd.getHoTen());
            lbl_QuyenNV_dn1.setText(nd.getTenNhom());
            lbl_maNV_dn1.setText(nd.getMaNV());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        task_bar = new javax.swing.JPanel();
        btn_Home = new javax.swing.JPanel();
        ind_1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_KhachHang = new javax.swing.JPanel();
        ind_2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_TaiKhoan = new javax.swing.JPanel();
        ind_3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btn_GiaoDich = new javax.swing.JPanel();
        ind_4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        btn_BaoCao = new javax.swing.JPanel();
        ind_5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_NhanVien = new javax.swing.JPanel();
        ind_6 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        lbl_HoTenNV_dn = new javax.swing.JLabel();
        lbl_QuyenNV_dn = new javax.swing.JLabel();
        lbl_maNV_dn = new javax.swing.JLabel();
        task_bar1 = new javax.swing.JPanel();
        btn_Home1 = new javax.swing.JPanel();
        ind_7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_KhachHang1 = new javax.swing.JPanel();
        ind_8 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btn_TaiKhoan1 = new javax.swing.JPanel();
        ind_9 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btn_GiaoDich1 = new javax.swing.JPanel();
        ind_10 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        btn_ChuyenTien1 = new javax.swing.JPanel();
        ind_11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        btn_NhanVien1 = new javax.swing.JPanel();
        ind_12 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        btn_exit1 = new javax.swing.JLabel();
        lbl_HoTenNV_dn1 = new javax.swing.JLabel();
        lbl_QuyenNV_dn1 = new javax.swing.JLabel();
        lbl_maNV_dn1 = new javax.swing.JLabel();
        Display = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        giaodich = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbl_cmnd = new javax.swing.JLabel();
        lbl_HoTen = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        pnl_10 = new javax.swing.JPanel();
        pnl_GiaoDich = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_movements = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tf_SoTKNhan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_SoTienChuyen = new javax.swing.JTextField();
        btn_ChuyenTien = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tf_SoTienGui = new javax.swing.JTextField();
        btn_GuiTien = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        tf_SoTienRut = new javax.swing.JTextField();
        btn_RutTien = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        lbl_SoDu = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbl_messageGD = new javax.swing.JLabel();
        tf_TimSoTK = new javax.swing.JTextField();
        btn_TimSoTK = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        employee = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        lbl_maNV = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        lbl_hoTen = new javax.swing.JLabel();
        pnl_6 = new javax.swing.JPanel();
        pnl_7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_NhanVien = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        customer = new javax.swing.JPanel();
        pnl_8 = new javax.swing.JPanel();
        pnl_9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_khachHang = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        lbl_maNV1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_hoTen1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ngân Hàng");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        task_bar.setBackground(new java.awt.Color(23, 35, 51));
        task_bar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home.setBackground(new java.awt.Color(23, 35, 51));
        btn_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_HomeMousePressed(evt);
            }
        });
        btn_Home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_1.setOpaque(false);
        ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
        ind_1.setLayout(ind_1Layout);
        ind_1Layout.setHorizontalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_1Layout.setVerticalGroup(
            ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Home.add(ind_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 114));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PTIT");
        btn_Home.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("banking");
        btn_Home.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        task_bar.add(btn_Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 110));

        btn_KhachHang.setBackground(new java.awt.Color(23, 35, 51));
        btn_KhachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_KhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_KhachHangMousePressed(evt);
            }
        });

        ind_2.setOpaque(false);
        ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
        ind_2.setLayout(ind_2Layout);
        ind_2Layout.setHorizontalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_2Layout.setVerticalGroup(
            ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Khách Hàng");

        javax.swing.GroupLayout btn_KhachHangLayout = new javax.swing.GroupLayout(btn_KhachHang);
        btn_KhachHang.setLayout(btn_KhachHangLayout);
        btn_KhachHangLayout.setHorizontalGroup(
            btn_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhachHangLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        btn_KhachHangLayout.setVerticalGroup(
            btn_KhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhachHangLayout.createSequentialGroup()
                .addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_KhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar.add(btn_KhachHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 110, 40));

        btn_TaiKhoan.setBackground(new java.awt.Color(23, 35, 51));
        btn_TaiKhoan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_TaiKhoanMousePressed(evt);
            }
        });

        ind_3.setOpaque(false);
        ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
        ind_3.setLayout(ind_3Layout);
        ind_3Layout.setHorizontalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_3Layout.setVerticalGroup(
            ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tài Khoản");

        javax.swing.GroupLayout btn_TaiKhoanLayout = new javax.swing.GroupLayout(btn_TaiKhoan);
        btn_TaiKhoan.setLayout(btn_TaiKhoanLayout);
        btn_TaiKhoanLayout.setHorizontalGroup(
            btn_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_TaiKhoanLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        btn_TaiKhoanLayout.setVerticalGroup(
            btn_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_TaiKhoanLayout.createSequentialGroup()
                .addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_TaiKhoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar.add(btn_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 110, -1));

        btn_GiaoDich.setBackground(new java.awt.Color(23, 35, 51));
        btn_GiaoDich.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_GiaoDich.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_GiaoDichMousePressed(evt);
            }
        });

        ind_4.setOpaque(false);
        ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
        ind_4.setLayout(ind_4Layout);
        ind_4Layout.setHorizontalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_4Layout.setVerticalGroup(
            ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Giao Dịch");

        javax.swing.GroupLayout btn_GiaoDichLayout = new javax.swing.GroupLayout(btn_GiaoDich);
        btn_GiaoDich.setLayout(btn_GiaoDichLayout);
        btn_GiaoDichLayout.setHorizontalGroup(
            btn_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_GiaoDichLayout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel34)
                .addGap(0, 38, Short.MAX_VALUE))
        );
        btn_GiaoDichLayout.setVerticalGroup(
            btn_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_GiaoDichLayout.createSequentialGroup()
                .addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_GiaoDichLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar.add(btn_GiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 110, -1));

        btn_BaoCao.setBackground(new java.awt.Color(23, 35, 51));
        btn_BaoCao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_BaoCao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BaoCaoMouseClicked(evt);
            }
        });

        ind_5.setOpaque(false);
        ind_5.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_5Layout = new javax.swing.GroupLayout(ind_5);
        ind_5.setLayout(ind_5Layout);
        ind_5Layout.setHorizontalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_5Layout.setVerticalGroup(
            ind_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Báo Cáo");

        javax.swing.GroupLayout btn_BaoCaoLayout = new javax.swing.GroupLayout(btn_BaoCao);
        btn_BaoCao.setLayout(btn_BaoCaoLayout);
        btn_BaoCaoLayout.setHorizontalGroup(
            btn_BaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BaoCaoLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        btn_BaoCaoLayout.setVerticalGroup(
            btn_BaoCaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_BaoCaoLayout.createSequentialGroup()
                .addComponent(ind_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_BaoCaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar.add(btn_BaoCao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 110, -1));

        btn_NhanVien.setBackground(new java.awt.Color(23, 35, 51));
        btn_NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NhanVienMouseClicked(evt);
            }
        });

        ind_6.setOpaque(false);
        ind_6.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_6Layout = new javax.swing.GroupLayout(ind_6);
        ind_6.setLayout(ind_6Layout);
        ind_6Layout.setHorizontalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_6Layout.setVerticalGroup(
            ind_6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel35.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Nhân Viên");

        javax.swing.GroupLayout btn_NhanVienLayout = new javax.swing.GroupLayout(btn_NhanVien);
        btn_NhanVien.setLayout(btn_NhanVienLayout);
        btn_NhanVienLayout.setHorizontalGroup(
            btn_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVienLayout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel35)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        btn_NhanVienLayout.setVerticalGroup(
            btn_NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVienLayout.createSequentialGroup()
                .addComponent(ind_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_NhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar.add(btn_NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 110, -1));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        btn_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exitMousePressed(evt);
            }
        });
        task_bar.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        lbl_HoTenNV_dn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_HoTenNV_dn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_HoTenNV_dn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HoTenNV_dn.setText("Ngô Sĩ Tiến");
        task_bar.add(lbl_HoTenNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 110, 20));

        lbl_QuyenNV_dn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_QuyenNV_dn.setForeground(new java.awt.Color(153, 255, 204));
        lbl_QuyenNV_dn.setText("CHINHANH");
        task_bar.add(lbl_QuyenNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 20));

        lbl_maNV_dn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_maNV_dn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV_dn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_maNV_dn.setText("NV2");
        task_bar.add(lbl_maNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, 20));

        getContentPane().add(task_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 590));

        task_bar1.setBackground(new java.awt.Color(23, 35, 51));
        task_bar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Home1.setBackground(new java.awt.Color(23, 35, 51));
        btn_Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Home1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_Home1MousePressed(evt);
            }
        });
        btn_Home1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ind_7.setOpaque(false);
        ind_7.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_7Layout = new javax.swing.GroupLayout(ind_7);
        ind_7.setLayout(ind_7Layout);
        ind_7Layout.setHorizontalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_7Layout.setVerticalGroup(
            ind_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Home1.add(ind_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 114));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PTIT");
        btn_Home1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("banking");
        btn_Home1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        task_bar1.add(btn_Home1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 110, 110));

        btn_KhachHang1.setBackground(new java.awt.Color(23, 35, 51));
        btn_KhachHang1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_KhachHang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_KhachHang1MousePressed(evt);
            }
        });

        ind_8.setOpaque(false);
        ind_8.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_8Layout = new javax.swing.GroupLayout(ind_8);
        ind_8.setLayout(ind_8Layout);
        ind_8Layout.setHorizontalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_8Layout.setVerticalGroup(
            ind_8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Khách Hàng");

        javax.swing.GroupLayout btn_KhachHang1Layout = new javax.swing.GroupLayout(btn_KhachHang1);
        btn_KhachHang1.setLayout(btn_KhachHang1Layout);
        btn_KhachHang1Layout.setHorizontalGroup(
            btn_KhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhachHang1Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addGap(0, 24, Short.MAX_VALUE))
        );
        btn_KhachHang1Layout.setVerticalGroup(
            btn_KhachHang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_KhachHang1Layout.createSequentialGroup()
                .addComponent(ind_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_KhachHang1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar1.add(btn_KhachHang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 110, 40));

        btn_TaiKhoan1.setBackground(new java.awt.Color(23, 35, 51));
        btn_TaiKhoan1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TaiKhoan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_TaiKhoan1MousePressed(evt);
            }
        });

        ind_9.setOpaque(false);
        ind_9.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_9Layout = new javax.swing.GroupLayout(ind_9);
        ind_9.setLayout(ind_9Layout);
        ind_9Layout.setHorizontalGroup(
            ind_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_9Layout.setVerticalGroup(
            ind_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Tài Khoản");

        javax.swing.GroupLayout btn_TaiKhoan1Layout = new javax.swing.GroupLayout(btn_TaiKhoan1);
        btn_TaiKhoan1.setLayout(btn_TaiKhoan1Layout);
        btn_TaiKhoan1Layout.setHorizontalGroup(
            btn_TaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_TaiKhoan1Layout.createSequentialGroup()
                .addComponent(ind_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(0, 37, Short.MAX_VALUE))
        );
        btn_TaiKhoan1Layout.setVerticalGroup(
            btn_TaiKhoan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_TaiKhoan1Layout.createSequentialGroup()
                .addComponent(ind_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_TaiKhoan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar1.add(btn_TaiKhoan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 110, -1));

        btn_GiaoDich1.setBackground(new java.awt.Color(23, 35, 51));
        btn_GiaoDich1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        ind_10.setOpaque(false);
        ind_10.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_10Layout = new javax.swing.GroupLayout(ind_10);
        ind_10.setLayout(ind_10Layout);
        ind_10Layout.setHorizontalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_10Layout.setVerticalGroup(
            ind_10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel36.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Giao Dịch");

        javax.swing.GroupLayout btn_GiaoDich1Layout = new javax.swing.GroupLayout(btn_GiaoDich1);
        btn_GiaoDich1.setLayout(btn_GiaoDich1Layout);
        btn_GiaoDich1Layout.setHorizontalGroup(
            btn_GiaoDich1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_GiaoDich1Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 21, Short.MAX_VALUE))
        );
        btn_GiaoDich1Layout.setVerticalGroup(
            btn_GiaoDich1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_GiaoDich1Layout.createSequentialGroup()
                .addComponent(ind_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_GiaoDich1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar1.add(btn_GiaoDich1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 110, -1));

        btn_ChuyenTien1.setBackground(new java.awt.Color(23, 35, 51));
        btn_ChuyenTien1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ChuyenTien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_ChuyenTien1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_ChuyenTien1MouseReleased(evt);
            }
        });

        ind_11.setOpaque(false);
        ind_11.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_11Layout = new javax.swing.GroupLayout(ind_11);
        ind_11.setLayout(ind_11Layout);
        ind_11Layout.setHorizontalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_11Layout.setVerticalGroup(
            ind_11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Báo Cáo");

        javax.swing.GroupLayout btn_ChuyenTien1Layout = new javax.swing.GroupLayout(btn_ChuyenTien1);
        btn_ChuyenTien1.setLayout(btn_ChuyenTien1Layout);
        btn_ChuyenTien1Layout.setHorizontalGroup(
            btn_ChuyenTien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ChuyenTien1Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        btn_ChuyenTien1Layout.setVerticalGroup(
            btn_ChuyenTien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_ChuyenTien1Layout.createSequentialGroup()
                .addComponent(ind_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_ChuyenTien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar1.add(btn_ChuyenTien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 110, -1));

        btn_NhanVien1.setBackground(new java.awt.Color(23, 35, 51));
        btn_NhanVien1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_NhanVien1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NhanVien1MouseClicked(evt);
            }
        });

        ind_12.setOpaque(false);
        ind_12.setPreferredSize(new java.awt.Dimension(3, 43));

        javax.swing.GroupLayout ind_12Layout = new javax.swing.GroupLayout(ind_12);
        ind_12.setLayout(ind_12Layout);
        ind_12Layout.setHorizontalGroup(
            ind_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        ind_12Layout.setVerticalGroup(
            ind_12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        jLabel37.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Nhân Viên");

        javax.swing.GroupLayout btn_NhanVien1Layout = new javax.swing.GroupLayout(btn_NhanVien1);
        btn_NhanVien1.setLayout(btn_NhanVien1Layout);
        btn_NhanVien1Layout.setHorizontalGroup(
            btn_NhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVien1Layout.createSequentialGroup()
                .addComponent(ind_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel37)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        btn_NhanVien1Layout.setVerticalGroup(
            btn_NhanVien1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_NhanVien1Layout.createSequentialGroup()
                .addComponent(ind_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(btn_NhanVien1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        task_bar1.add(btn_NhanVien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 110, -1));

        btn_exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
        btn_exit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exit1MousePressed(evt);
            }
        });
        task_bar1.add(btn_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, -1, -1));

        lbl_HoTenNV_dn1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_HoTenNV_dn1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_HoTenNV_dn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_HoTenNV_dn1.setText("Nguyễn Văn Bình");
        task_bar1.add(lbl_HoTenNV_dn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 110, 20));

        lbl_QuyenNV_dn1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_QuyenNV_dn1.setForeground(new java.awt.Color(153, 255, 204));
        lbl_QuyenNV_dn1.setText("NGANHANG");
        task_bar1.add(lbl_QuyenNV_dn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, 20));

        lbl_maNV_dn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_maNV_dn1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV_dn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_maNV_dn1.setText("NV1");
        task_bar1.add(lbl_maNV_dn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, 20));

        getContentPane().add(task_bar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 590));

        Display.setBackground(new java.awt.Color(71, 120, 197));
        Display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(71, 120, 197));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/nganhang.png"))); // NOI18N
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        Display.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

        giaodich.setBackground(new java.awt.Color(71, 120, 197));
        giaodich.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(120, 168, 252));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cmnd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_cmnd.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cmnd.setText("CMND");
        lbl_cmnd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel11.add(lbl_cmnd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 120, -1));

        lbl_HoTen.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_HoTen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_HoTen.setText("HO TEN");
        jPanel11.add(lbl_HoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 20));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("PTIT");
        jPanel11.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, 30));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("banking");
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_play_25px.png"))); // NOI18N
        jPanel11.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 60, -1, 20));

        giaodich.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 219, 130));

        pnl_10.setBackground(new java.awt.Color(255, 255, 255));
        pnl_10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_GiaoDich.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbl_movements.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbl_movements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã giao dịch", "Loại giao dịch", "Ngày giao dịch", "Số tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_movements.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_movements.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_movements.setRowHeight(22);
        jScrollPane4.setViewportView(tbl_movements);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Số dư hiện tại:");

        jPanel1.setBackground(new java.awt.Color(254, 211, 48));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Chuyển tiền");

        tf_SoTKNhan.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Số tài khoản nhận");

        tf_SoTienChuyen.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_ChuyenTien.setBackground(new java.awt.Color(255, 255, 255));
        btn_ChuyenTien.setText("→");
        btn_ChuyenTien.setOpaque(false);
        btn_ChuyenTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ChuyenTienActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Số tiền");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_SoTKNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tf_SoTienChuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_ChuyenTien))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_SoTienChuyen)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_ChuyenTien)
                        .addComponent(tf_SoTKNhan)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(150, 222, 95));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Gửi tiền");

        tf_SoTienGui.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_GuiTien.setBackground(new java.awt.Color(255, 255, 255));
        btn_GuiTien.setText("→");
        btn_GuiTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuiTienActionPerformed(evt);
            }
        });

        jLabel40.setForeground(new java.awt.Color(51, 51, 51));
        jLabel40.setText("Số tiền");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tf_SoTienGui, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_GuiTien))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_GuiTien)
                    .addComponent(tf_SoTienGui))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(120, 168, 252));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(51, 51, 51));
        jLabel41.setText("Rút tiền");

        tf_SoTienRut.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_RutTien.setBackground(new java.awt.Color(255, 255, 255));
        btn_RutTien.setText("→");
        btn_RutTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RutTienActionPerformed(evt);
            }
        });

        jLabel51.setForeground(new java.awt.Color(51, 51, 51));
        jLabel51.setText("Số tiền");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(tf_SoTienRut, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_RutTien))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel51)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_RutTien)
                    .addComponent(tf_SoTienRut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addContainerGap())
        );

        lbl_SoDu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_SoDu.setText("10.321.031 VNĐ");

        javax.swing.GroupLayout pnl_GiaoDichLayout = new javax.swing.GroupLayout(pnl_GiaoDich);
        pnl_GiaoDich.setLayout(pnl_GiaoDichLayout);
        pnl_GiaoDichLayout.setHorizontalGroup(
            pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GiaoDichLayout.createSequentialGroup()
                        .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GiaoDichLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        pnl_GiaoDichLayout.setVerticalGroup(
            pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                        .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pnl_10.add(pnl_GiaoDich, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 520));

        jPanel17.setBackground(new java.awt.Color(242, 247, 247));

        lbl_messageGD.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_messageGD.setForeground(new java.awt.Color(102, 102, 102));
        lbl_messageGD.setText("Thông báo");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_messageGD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_messageGD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pnl_10.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        giaodich.add(pnl_10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 750, 570));

        tf_TimSoTK.setBackground(new java.awt.Color(123, 156, 225));
        tf_TimSoTK.setForeground(new java.awt.Color(255, 255, 255));
        tf_TimSoTK.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_TimSoTK.setBorder(null);
        tf_TimSoTK.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_TimSoTK.setPreferredSize(new java.awt.Dimension(2, 20));
        giaodich.add(tf_TimSoTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 141, -1));

        btn_TimSoTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        btn_TimSoTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_TimSoTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimSoTKMouseClicked(evt);
            }
        });
        giaodich.add(btn_TimSoTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, 20));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        giaodich.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_credit_control_50px.png"))); // NOI18N
        giaodich.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        Display.add(giaodich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        employee.setBackground(new java.awt.Color(71, 120, 197));
        employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(120, 168, 252));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/imge_1.jpg"))); // NOI18N
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        lbl_maNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_maNV.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV.setText("NV1");
        jPanel9.add(lbl_maNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, 30));
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 8));

        lbl_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_hoTen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hoTen.setText("Nguyễn Văn Bình");
        jPanel9.add(lbl_hoTen, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        employee.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 219, 118));

        pnl_6.setBackground(new java.awt.Color(255, 255, 255));
        pnl_6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_7.setBackground(new java.awt.Color(255, 255, 255));
        pnl_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbl_NhanVien.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbl_NhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ", "Tên", "Địa chỉ", "Phái", "Số điện thoại", "Mã CN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_NhanVien.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_NhanVien.setRowHeight(22);
        tbl_NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_NhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_NhanVien);

        javax.swing.GroupLayout pnl_7Layout = new javax.swing.GroupLayout(pnl_7);
        pnl_7.setLayout(pnl_7Layout);
        pnl_7Layout.setHorizontalGroup(
            pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_7Layout.setVerticalGroup(
            pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        pnl_6.add(pnl_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 520));

        jPanel13.setBackground(new java.awt.Color(242, 247, 247));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 102, 102));
        jLabel19.setText("Danh sách nhân viên");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pnl_6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        employee.add(pnl_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 750, 570));

        jPanel14.setBackground(new java.awt.Color(84, 127, 206));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Sửa thông tin");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Xóa tài khoản");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)))
                .addGap(41, 41, 41))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        employee.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, 110));

        jTextField3.setBackground(new java.awt.Color(123, 156, 225));
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        jTextField3.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField3.setPreferredSize(new java.awt.Dimension(2, 20));
        employee.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 141, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employee.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        employee.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        Display.add(employee, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        customer.setBackground(new java.awt.Color(71, 120, 197));
        customer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_8.setBackground(new java.awt.Color(255, 255, 255));
        pnl_8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_9.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tbl_khachHang.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tbl_khachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CMND", "Họ", "Tên", "Địa chỉ", "Phái", "Ngày cấp", "Số điện thoại", "Mã CN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_khachHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tbl_khachHang.setGridColor(new java.awt.Color(255, 255, 255));
        tbl_khachHang.setRowHeight(22);
        jScrollPane3.setViewportView(tbl_khachHang);
        if (tbl_khachHang.getColumnModel().getColumnCount() > 0) {
            tbl_khachHang.getColumnModel().getColumn(0).setHeaderValue("CMND");
            tbl_khachHang.getColumnModel().getColumn(1).setHeaderValue("Họ");
            tbl_khachHang.getColumnModel().getColumn(3).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(3).setHeaderValue("Địa chỉ");
            tbl_khachHang.getColumnModel().getColumn(4).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(4).setHeaderValue("Phái");
            tbl_khachHang.getColumnModel().getColumn(5).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(5).setHeaderValue("Ngày cấp");
            tbl_khachHang.getColumnModel().getColumn(6).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(6).setHeaderValue("Số điện thoại");
            tbl_khachHang.getColumnModel().getColumn(7).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(7).setHeaderValue("Mã CN");
        }

        javax.swing.GroupLayout pnl_9Layout = new javax.swing.GroupLayout(pnl_9);
        pnl_9.setLayout(pnl_9Layout);
        pnl_9Layout.setHorizontalGroup(
            pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_9Layout.setVerticalGroup(
            pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_9Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );

        pnl_8.add(pnl_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 520));

        jPanel15.setBackground(new java.awt.Color(242, 247, 247));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Danh sách khách hàng");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pnl_8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        customer.add(pnl_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 750, 570));

        jPanel16.setBackground(new java.awt.Color(84, 127, 206));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        jLabel45.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Sửa thông tin");
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Xóa tài khoản");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)))
                .addGap(41, 41, 41))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        customer.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, 110));

        jTextField4.setBackground(new java.awt.Color(123, 156, 225));
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setBorder(null);
        jTextField4.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField4.setPreferredSize(new java.awt.Dimension(2, 20));
        customer.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 141, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        customer.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        customer.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jPanel12.setBackground(new java.awt.Color(120, 168, 252));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/imge_1.jpg"))); // NOI18N
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        lbl_maNV1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_maNV1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV1.setText("241852101");
        jPanel12.add(lbl_maNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 110, 30));
        jPanel12.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 8));

        lbl_hoTen1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_hoTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hoTen1.setText("Nguyễn Văn Bình");
        jPanel12.add(lbl_hoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, 30));

        customer.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 219, 118));

        Display.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1000, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void selectedTaskBar(javax.swing.JPanel selected, javax.swing.JPanel index, javax.swing.JPanel button) {
        home.setVisible(false);
        employee.setVisible(false);
        customer.setVisible(false);
        giaodich.setVisible(false);
        resetColor(new JPanel[]{btn_Home, btn_KhachHang, btn_TaiKhoan, btn_GiaoDich, btn_BaoCao, btn_NhanVien}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6});
        selected.setVisible(true);
        index.setOpaque(true);
        setColor(button);
    }


    private void btn_HomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_HomeMousePressed
        selectedTaskBar(home, ind_1, btn_Home);
    }//GEN-LAST:event_btn_HomeMousePressed

    private void btn_KhachHangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KhachHangMousePressed
        selectedTaskBar(customer, ind_2, btn_KhachHang);
        DefaultTableModel dtmKhachHang = (DefaultTableModel) tbl_khachHang.getModel();
        dskh = new KhachHangService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).docToanBoKhachHang();
        dtmKhachHang.setRowCount(0);
        for (KhachHang kh : dskh) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(kh.getCmnd());
            vec.add(kh.getHo());
            vec.add(kh.getTen());
            vec.add(kh.getDiachi());
            vec.add(kh.getPhai());
            vec.add(kh.getNgaycap());
            vec.add(kh.getSdt());
            vec.add(kh.getMaCN());
            dtmKhachHang.addRow(vec);
        }
    }//GEN-LAST:event_btn_KhachHangMousePressed

    private void btn_TaiKhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TaiKhoanMousePressed

    }//GEN-LAST:event_btn_TaiKhoanMousePressed

    private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMousePressed
        Login login = new Login();
        login.setVisible(true);
        login.pack();
        login.setLocationRelativeTo(null);
        // close the current form(login form)
        this.dispose();
    }//GEN-LAST:event_btn_exitMousePressed

    private void btn_BaoCaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BaoCaoMouseClicked

    }//GEN-LAST:event_btn_BaoCaoMouseClicked

    private void btn_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhanVienMouseClicked
        selectedTaskBar(employee, ind_6, btn_NhanVien);
        DefaultTableModel dtmNhanVien = (DefaultTableModel) tbl_NhanVien.getModel();
        dsnv = new NhanVienService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).docToanBoNhanVien();
        dtmNhanVien.setRowCount(0);
        for (NhanVien nv : dsnv) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(nv.getMaNV());
            vec.add(nv.getHo());
            vec.add(nv.getTen());
            vec.add(nv.getDiachi());
            vec.add(nv.getPhai());
            vec.add(nv.getSdt());
            vec.add(nv.getMaCN());
            dtmNhanVien.addRow(vec);
        }
    }//GEN-LAST:event_btn_NhanVienMouseClicked

    private void tbl_NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_NhanVienMouseClicked
        int index = tbl_NhanVien.getSelectedRow();
        TableModel model = tbl_NhanVien.getModel();
        String maNV = model.getValueAt(index, 0).toString();
        String hoTen = (model.getValueAt(index, 1).toString() + " " + model.getValueAt(index, 2));
        lbl_maNV.setText(maNV);
        lbl_hoTen.setText(hoTen);
    }//GEN-LAST:event_tbl_NhanVienMouseClicked


    private void btn_Home1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Home1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Home1MousePressed

    private void btn_KhachHang1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_KhachHang1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_KhachHang1MousePressed

    private void btn_TaiKhoan1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TaiKhoan1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_TaiKhoan1MousePressed

    private void btn_ChuyenTien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ChuyenTien1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ChuyenTien1MouseClicked

    private void btn_ChuyenTien1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ChuyenTien1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ChuyenTien1MouseReleased

    private void btn_NhanVien1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NhanVien1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NhanVien1MouseClicked

    private void btn_exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_exit1MousePressed

    private void btn_ChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChuyenTienActionPerformed
        GDChuyenTienService gd = new GDChuyenTienService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if(!checkSoTK(tf_SoTKNhan.getText())){
            lbl_messageGD.setText("Số tài khoản nhận không đúng!");
        }
        else if (!checkTien(tf_SoTienChuyen.getText())) {
            lbl_messageGD.setText("Kiểm tra lại số tiền chuyển!");
        }
        else {
            if (gd.chuyenTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienChuyen.getText()), tf_SoTKNhan.getText(), nd.getMaNV()) != -1) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTKNhan.setText("");
                tf_SoTienChuyen.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Lỗi chuyển tiền!");
            }
        }
    }//GEN-LAST:event_btn_ChuyenTienActionPerformed

    private void btn_GuiTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuiTienActionPerformed
        GDGoiRutService gd = new GDGoiRutService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (checkTien(tf_SoTienGui.getText())) {
            if (gd.guiTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienGui.getText()), nd.getMaNV()) != -1) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTienGui.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Lỗi gủi tiền!");
            }
        } else {
            lbl_messageGD.setText("Kiểm tra lại số tiền gửi!");
        }
    }//GEN-LAST:event_btn_GuiTienActionPerformed

    private void btn_RutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RutTienActionPerformed
        GDGoiRutService gd = new GDGoiRutService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (checkTien(tf_SoTienRut.getText())) {
            if (gd.rutTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienRut.getText()), nd.getMaNV()) != -1) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTienRut.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Lỗi rút tiền!");
            }
        } else {
            lbl_messageGD.setText("Kiểm tra lại số tiền rút!");
        }
    }//GEN-LAST:event_btn_RutTienActionPerformed

    private void btn_TimSoTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimSoTKMouseClicked
        currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(tf_TimSoTK.getText());
        updateUIGiaoDich();
    }//GEN-LAST:event_btn_TimSoTKMouseClicked

    private void btn_GiaoDichMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_GiaoDichMousePressed
        selectedTaskBar(giaodich, ind_4, btn_GiaoDich);
        pnl_GiaoDich.setVisible(false);
        currentAccount = null;
        updateUIGiaoDich();
        tf_TimSoTK.setText("");
    }//GEN-LAST:event_btn_GiaoDichMousePressed

    private boolean checkTien(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    private boolean checkSoTK(String str) {
        
        boolean check =  new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).checkSoTK(str);
        System.out.println(str);
        System.out.println(check);
        return check;
    }

    private void displayMovements() {
        DefaultTableModel dtmMovements = (DefaultTableModel) tbl_movements.getModel();
        ArrayList<GiaoDich> movs = new GiaoDichService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).displayMovements(currentAccount.getSoTK());
        dtmMovements.setRowCount(0);
        for (GiaoDich gd : movs) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(gd.getMaGD());
            vec.add(gd.getLoaiGD());
            vec.add(gd.getNgayGD());
            vec.add(gd.soTien());
            dtmMovements.addRow(vec);
        }
    }

    private void updateUIGiaoDich() {
        lbl_messageGD.setText("Thông tin giao dịch");
        if (currentAccount != null) {
            pnl_GiaoDich.setVisible(true);
            lbl_HoTen.setText(currentAccount.getHo() + " " + currentAccount.getTen());
            lbl_cmnd.setText(currentAccount.getCmnd());
            lbl_SoDu.setText(currentAccount.soDu() + "");
            displayMovements();
        } else {
            lbl_HoTen.setText("HO TEN");
            lbl_cmnd.setText("CMND");
            pnl_GiaoDich.setVisible(false);
        }
    }

    /**
     * @ptf_timSoTKgs the command line arguments
     */
    private void setColor(JPanel pane) {
        pane.setBackground(new Color(41, 57, 80));
    }

    private void resetColor(JPanel[] pane, JPanel[] indicators) {
        for (int i = 0; i < pane.length; i++) {
            pane[i].setBackground(new Color(23, 35, 51));

        }
        for (int i = 0; i < indicators.length; i++) {
            indicators[i].setOpaque(false);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JPanel btn_BaoCao;
    private javax.swing.JButton btn_ChuyenTien;
    private javax.swing.JPanel btn_ChuyenTien1;
    private javax.swing.JPanel btn_GiaoDich;
    private javax.swing.JPanel btn_GiaoDich1;
    private javax.swing.JButton btn_GuiTien;
    private javax.swing.JPanel btn_Home;
    private javax.swing.JPanel btn_Home1;
    private javax.swing.JPanel btn_KhachHang;
    private javax.swing.JPanel btn_KhachHang1;
    private javax.swing.JPanel btn_NhanVien;
    private javax.swing.JPanel btn_NhanVien1;
    private javax.swing.JButton btn_RutTien;
    private javax.swing.JPanel btn_TaiKhoan;
    private javax.swing.JPanel btn_TaiKhoan1;
    private javax.swing.JLabel btn_TimSoTK;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_exit1;
    private javax.swing.JPanel customer;
    private javax.swing.JPanel employee;
    private javax.swing.JPanel giaodich;
    private javax.swing.JPanel home;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_10;
    private javax.swing.JPanel ind_11;
    private javax.swing.JPanel ind_12;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JPanel ind_7;
    private javax.swing.JPanel ind_8;
    private javax.swing.JPanel ind_9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbl_HoTen;
    private javax.swing.JLabel lbl_HoTenNV_dn;
    private javax.swing.JLabel lbl_HoTenNV_dn1;
    private javax.swing.JLabel lbl_QuyenNV_dn;
    private javax.swing.JLabel lbl_QuyenNV_dn1;
    private javax.swing.JLabel lbl_SoDu;
    private javax.swing.JLabel lbl_cmnd;
    private javax.swing.JLabel lbl_hoTen;
    private javax.swing.JLabel lbl_hoTen1;
    private javax.swing.JLabel lbl_maNV;
    private javax.swing.JLabel lbl_maNV1;
    private javax.swing.JLabel lbl_maNV_dn;
    private javax.swing.JLabel lbl_maNV_dn1;
    private javax.swing.JLabel lbl_messageGD;
    private javax.swing.JPanel pnl_10;
    private javax.swing.JPanel pnl_6;
    private javax.swing.JPanel pnl_7;
    private javax.swing.JPanel pnl_8;
    private javax.swing.JPanel pnl_9;
    private javax.swing.JPanel pnl_GiaoDich;
    private javax.swing.JPanel task_bar;
    private javax.swing.JPanel task_bar1;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTable tbl_khachHang;
    private javax.swing.JTable tbl_movements;
    private javax.swing.JTextField tf_SoTKNhan;
    private javax.swing.JTextField tf_SoTienChuyen;
    private javax.swing.JTextField tf_SoTienGui;
    private javax.swing.JTextField tf_SoTienRut;
    private javax.swing.JTextField tf_TimSoTK;
    // End of variables declaration//GEN-END:variables

}
