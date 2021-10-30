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
import service.CurrentAccountService;
import service.GDChuyenTienService;
import service.GDGoiRutService;
import service.GiaoDichService;
import service.KhachHangService;
import service.NhanVienService;
import service.TaiKhoanService;

public class Home extends javax.swing.JFrame {

    //==================== BIẾN TOÀN CỤC ====================//
    NguoiDung nd;
    CurrentAccount currentAccount = null;
    ArrayList<NhanVien> dsnv;
    ArrayList<KhachHang> dskh;

    public Home(NguoiDung nd) {
        this.nd = nd;
        initComponents();

        selectedTaskBar(home, ind_1, btn_Home);
        task_bar.setVisible(true);
        lbl_HoTenNV_dn.setText(nd.getHoTen());
        lbl_QuyenNV_dn.setText(nd.getTenNhom());
        lbl_maNV_dn.setText(nd.getMaNV());

        // Phân quyền chức năng
        if (nd.getTenNhom().equals("CHINHANH")) {
            
        } else if (nd.getTenNhom().equals("CONGTY")) {
            btn_GiaoDich.setVisible(false);
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
        Display = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        customer = new javax.swing.JPanel();
        pnl_8 = new javax.swing.JPanel();
        pnl_9 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_khachHang = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        lbl_maNV1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_hoTen1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        taikhoan = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        lbl_cmnd1 = new javax.swing.JLabel();
        lbl_HoTen1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        pnl_11 = new javax.swing.JPanel();
        pnl_TaiKhoan = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lbl_messageGD1 = new javax.swing.JLabel();
        tf_TimSoTK1 = new javax.swing.JTextField();
        btn_TimSoTK1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
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
        jLabel33 = new javax.swing.JLabel();
        baocao = new javax.swing.JPanel();
        pnl_12 = new javax.swing.JPanel();
        pnl_13 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
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
        lbl_HoTenNV_dn.setText("Nguyễn Văn Bình");
        task_bar.add(lbl_HoTenNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 110, 20));

        lbl_QuyenNV_dn.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_QuyenNV_dn.setForeground(new java.awt.Color(153, 255, 204));
        lbl_QuyenNV_dn.setText("QUYỀN");
        task_bar.add(lbl_QuyenNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 20));

        lbl_maNV_dn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_maNV_dn.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV_dn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_maNV_dn.setText("NV1");
        task_bar.add(lbl_maNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, 20));

        getContentPane().add(task_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 590));

        Display.setBackground(new java.awt.Color(71, 120, 197));
        Display.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setBackground(new java.awt.Color(71, 120, 197));
        home.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/nganhang.png"))); // NOI18N
        home.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        Display.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 590));

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
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
            tbl_khachHang.getColumnModel().getColumn(3).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(4).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(5).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(6).setResizable(false);
            tbl_khachHang.getColumnModel().getColumn(7).setResizable(false);
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
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
        lbl_maNV1.setText("CMND");
        jPanel12.add(lbl_maNV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 30));
        jPanel12.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 8));

        lbl_hoTen1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_hoTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hoTen1.setText("HỌ TÊN");
        jPanel12.add(lbl_hoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 100, 30));

        customer.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 219, 118));

        jPanel18.setBackground(new java.awt.Color(84, 127, 206));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Sửa");
        jLabel44.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Xóa");
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)))
                .addGap(73, 73, 73))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        customer.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, 110));

        Display.add(customer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        taikhoan.setBackground(new java.awt.Color(71, 120, 197));
        taikhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(120, 168, 252));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_cmnd1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_cmnd1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_cmnd1.setText("CMND");
        lbl_cmnd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel16.add(lbl_cmnd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 102, 120, -1));

        lbl_HoTen1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lbl_HoTen1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_HoTen1.setText("HO TEN");
        jPanel16.add(lbl_HoTen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, 20));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PTIT");
        jPanel16.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 40, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("banking");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_play_25px.png"))); // NOI18N
        jPanel16.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 60, -1, 20));

        taikhoan.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 219, 130));

        pnl_11.setBackground(new java.awt.Color(255, 255, 255));
        pnl_11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_TaiKhoan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_TaiKhoanLayout = new javax.swing.GroupLayout(pnl_TaiKhoan);
        pnl_TaiKhoan.setLayout(pnl_TaiKhoanLayout);
        pnl_TaiKhoanLayout.setHorizontalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        pnl_TaiKhoanLayout.setVerticalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pnl_11.add(pnl_TaiKhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 520));

        jPanel19.setBackground(new java.awt.Color(242, 247, 247));

        lbl_messageGD1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_messageGD1.setForeground(new java.awt.Color(102, 102, 102));
        lbl_messageGD1.setText("Danh sách tài khoản");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_messageGD1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbl_messageGD1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pnl_11.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        taikhoan.add(pnl_11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 750, 570));

        tf_TimSoTK1.setBackground(new java.awt.Color(123, 156, 225));
        tf_TimSoTK1.setForeground(new java.awt.Color(255, 255, 255));
        tf_TimSoTK1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_TimSoTK1.setBorder(null);
        tf_TimSoTK1.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_TimSoTK1.setPreferredSize(new java.awt.Dimension(2, 20));
        taikhoan.add(tf_TimSoTK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 141, -1));

        btn_TimSoTK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        btn_TimSoTK1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        taikhoan.add(btn_TimSoTK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        taikhoan.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jPanel20.setBackground(new java.awt.Color(84, 127, 206));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Sửa");
        jLabel46.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Xóa");
        jLabel49.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)))
                .addGap(73, 73, 73))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        taikhoan.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 220, 110));

        Display.add(taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

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
                    .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                        .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_GiaoDichLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))))
        );
        pnl_GiaoDichLayout.setVerticalGroup(
            pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_GiaoDichLayout.createSequentialGroup()
                        .addGroup(pnl_GiaoDichLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_SoDu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_credit_control_50px.png"))); // NOI18N
        giaodich.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 50, 50));

        Display.add(giaodich, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        baocao.setBackground(new java.awt.Color(71, 120, 197));
        baocao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_12.setBackground(new java.awt.Color(255, 255, 255));
        pnl_12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_13.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnl_13Layout = new javax.swing.GroupLayout(pnl_13);
        pnl_13.setLayout(pnl_13Layout);
        pnl_13Layout.setHorizontalGroup(
            pnl_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        pnl_13Layout.setVerticalGroup(
            pnl_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        pnl_12.add(pnl_13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 730, 520));

        jPanel21.setBackground(new java.awt.Color(242, 247, 247));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Lập báo cáo");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel23)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pnl_12.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 730, -1));

        baocao.add(pnl_12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 11, 750, 570));

        jPanel24.setBackground(new java.awt.Color(120, 168, 252));
        jPanel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Liệt kê khách hàng");
        jLabel53.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel24.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 30));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_customer_25px_1.png"))); // NOI18N
        jPanel24.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        baocao.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 219, 50));

        jPanel25.setBackground(new java.awt.Color(120, 168, 252));
        jPanel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("Sao kê giao dịch");
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel25.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 30));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_list_view_25px_2.png"))); // NOI18N
        jPanel25.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        baocao.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 219, 50));

        jPanel26.setBackground(new java.awt.Color(120, 168, 252));
        jPanel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Liệt kê tài khoản");
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel26.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 130, 30));

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Credit_Card_25px_3.png"))); // NOI18N
        jPanel26.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 30));

        baocao.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 219, 50));

        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_list_view_120px.png"))); // NOI18N
        baocao.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 110, 120));

        Display.add(baocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        employee.setBackground(new java.awt.Color(71, 120, 197));
        employee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(120, 168, 252));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/imge_1.jpg"))); // NOI18N
        jPanel9.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, 90));

        lbl_maNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbl_maNV.setForeground(new java.awt.Color(255, 255, 255));
        lbl_maNV.setText("MANV");
        jPanel9.add(lbl_maNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 100, 30));
        jPanel9.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, 8));

        lbl_hoTen.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbl_hoTen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_hoTen.setText("HỌ TÊN");
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
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
        jLabel42.setText("Sửa");
        jLabel42.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Xóa");
        jLabel43.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)))
                .addGap(73, 73, 73))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        employee.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 220, 110));

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

        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 1000, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //==================== GIAO DIỆN ====================//
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

    private void selectedTaskBar(javax.swing.JPanel selected, javax.swing.JPanel index, javax.swing.JPanel button) {
        home.setVisible(false);
        customer.setVisible(false);
        taikhoan.setVisible(false);
        giaodich.setVisible(false);
        baocao.setVisible(false);
        employee.setVisible(false);
        resetColor(new JPanel[]{btn_Home, btn_KhachHang, btn_TaiKhoan, btn_GiaoDich, btn_BaoCao, btn_NhanVien}, new JPanel[]{ind_1, ind_2, ind_3, ind_4, ind_5, ind_6});
        selected.setVisible(true);
        index.setOpaque(true);
        setColor(button);
    }

    //==================== CODE ====================//
    private boolean checkTien(String str) {
        try {
            Long.parseLong(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean checkSoTK(String str) {

        boolean check = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).checkSoTK(str);
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

    //==================== EVENT ====================//

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
        selectedTaskBar(taikhoan, ind_3, btn_TaiKhoan);
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
        selectedTaskBar(baocao, ind_5, btn_BaoCao);
        // LÀM CUỐI CÙNG VÌ CẦN CÀI TOOL ĐỂ CHẠY
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

    private void btn_ChuyenTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ChuyenTienActionPerformed
        GDChuyenTienService gd = new GDChuyenTienService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (!checkSoTK(tf_SoTKNhan.getText())) {
            lbl_messageGD.setText("Số tài khoản nhận không đúng!");
        } else if (!checkTien(tf_SoTienChuyen.getText())) {
            lbl_messageGD.setText("Kiểm tra lại số tiền chuyển!");
        } else {
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JPanel baocao;
    private javax.swing.JPanel btn_BaoCao;
    private javax.swing.JButton btn_ChuyenTien;
    private javax.swing.JPanel btn_GiaoDich;
    private javax.swing.JButton btn_GuiTien;
    private javax.swing.JPanel btn_Home;
    private javax.swing.JPanel btn_KhachHang;
    private javax.swing.JPanel btn_NhanVien;
    private javax.swing.JButton btn_RutTien;
    private javax.swing.JPanel btn_TaiKhoan;
    private javax.swing.JLabel btn_TimSoTK;
    private javax.swing.JLabel btn_TimSoTK1;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JPanel customer;
    private javax.swing.JPanel employee;
    private javax.swing.JPanel giaodich;
    private javax.swing.JPanel home;
    private javax.swing.JPanel ind_1;
    private javax.swing.JPanel ind_2;
    private javax.swing.JPanel ind_3;
    private javax.swing.JPanel ind_4;
    private javax.swing.JPanel ind_5;
    private javax.swing.JPanel ind_6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
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
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbl_HoTen;
    private javax.swing.JLabel lbl_HoTen1;
    private javax.swing.JLabel lbl_HoTenNV_dn;
    private javax.swing.JLabel lbl_QuyenNV_dn;
    private javax.swing.JLabel lbl_SoDu;
    private javax.swing.JLabel lbl_cmnd;
    private javax.swing.JLabel lbl_cmnd1;
    private javax.swing.JLabel lbl_hoTen;
    private javax.swing.JLabel lbl_hoTen1;
    private javax.swing.JLabel lbl_maNV;
    private javax.swing.JLabel lbl_maNV1;
    private javax.swing.JLabel lbl_maNV_dn;
    private javax.swing.JLabel lbl_messageGD;
    private javax.swing.JLabel lbl_messageGD1;
    private javax.swing.JPanel pnl_10;
    private javax.swing.JPanel pnl_11;
    private javax.swing.JPanel pnl_12;
    private javax.swing.JPanel pnl_13;
    private javax.swing.JPanel pnl_6;
    private javax.swing.JPanel pnl_7;
    private javax.swing.JPanel pnl_8;
    private javax.swing.JPanel pnl_9;
    private javax.swing.JPanel pnl_GiaoDich;
    private javax.swing.JPanel pnl_TaiKhoan;
    private javax.swing.JPanel taikhoan;
    private javax.swing.JPanel task_bar;
    private javax.swing.JTable tbl_NhanVien;
    private javax.swing.JTable tbl_khachHang;
    private javax.swing.JTable tbl_movements;
    private javax.swing.JTextField tf_SoTKNhan;
    private javax.swing.JTextField tf_SoTienChuyen;
    private javax.swing.JTextField tf_SoTienGui;
    private javax.swing.JTextField tf_SoTienRut;
    private javax.swing.JTextField tf_TimSoTK;
    private javax.swing.JTextField tf_TimSoTK1;
    // End of variables declaration//GEN-END:variables

}
