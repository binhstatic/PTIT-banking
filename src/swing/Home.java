package swing;

import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
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

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRDesignViewer;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

public class Home extends javax.swing.JFrame {

    //==================== BIẾN TOÀN CỤC ====================//
    NguoiDung nd;
    CurrentAccount currentAccount = null;
    ArrayList<NhanVien> dsnv;
    ArrayList<KhachHang> dskh;
    ArrayList<TaiKhoan> dstk;
    SimpleDateFormat formatDay = new SimpleDateFormat("DD/mm/yyyy");

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

        } else if (nd.getTenNhom().equals("NGANHANG")) {
            btn_KhachHang.setVisible(false);
            btn_TaiKhoan.setVisible(false);
            btn_GiaoDich.setVisible(false);
            btn_NhanVien.setVisible(false);

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
        jLabel7 = new javax.swing.JLabel();
        tfCMND = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        tfHo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        tfDiaChi = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel58 = new javax.swing.JLabel();
        tfNgayCap = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        tfSDT = new javax.swing.JTextField();
        errCMND = new javax.swing.JLabel();
        errHo = new javax.swing.JLabel();
        errTen = new javax.swing.JLabel();
        errDiaChi = new javax.swing.JLabel();
        errSDT = new javax.swing.JLabel();
        errNgayCap = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        tfTimKH = new javax.swing.JTextField();
        btnTimKH = new javax.swing.JLabel();
        btn_themKH = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        lbl_maNV1 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        lbl_hoTen1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btn_suaKH = new javax.swing.JLabel();
        btn_xoaKH = new javax.swing.JLabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_TaiKhoan = new javax.swing.JTable();
        jLabel25 = new javax.swing.JLabel();
        tfSoTaiKhoantk = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        tfCMNDtk = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        tfSoDutk = new javax.swing.JTextField();
        errSoTaiKhoantk = new javax.swing.JLabel();
        errCMNDtk = new javax.swing.JLabel();
        errSoDutk = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lbl_messageGD1 = new javax.swing.JLabel();
        tf_TimSoTK1 = new javax.swing.JTextField();
        btn_TimSoTK1 = new javax.swing.JLabel();
        btn_themTK = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btn_suaTK = new javax.swing.JLabel();
        btn_xoaTK = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        txt_tuNgay = new javax.swing.JTextField();
        txt_denNgay = new javax.swing.JTextField();
        btn_reportGD = new javax.swing.JButton();
        txt_report_sotk = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
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
        jLabel46 = new javax.swing.JLabel();
        nv_tfmaNhanVien = new javax.swing.JTextField();
        labelho = new javax.swing.JLabel();
        nv_tfHo = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        nv_tfTen = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        nv_tfDiaChi = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        nv_cbGioiTinh = new javax.swing.JComboBox<>();
        labelSDT = new javax.swing.JLabel();
        nv_tfSDT = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        nv_tfLogin = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        nv_tfMatKhau = new javax.swing.JTextField();
        nv_errMaNV = new javax.swing.JLabel();
        nv_errTen = new javax.swing.JLabel();
        nv_errHo = new javax.swing.JLabel();
        nv_errDiaChi = new javax.swing.JLabel();
        nv_errSDT = new javax.swing.JLabel();
        nv_errPass = new javax.swing.JLabel();
        nv_errLogin = new javax.swing.JLabel();
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
        btn_themNV = new javax.swing.JLabel();

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
        lbl_QuyenNV_dn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_QuyenNV_dn.setText("QUYỀN");
        task_bar.add(lbl_QuyenNV_dn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 20));

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

        jLabel7.setText("CNMD");

        jLabel16.setText("Họ");

        jLabel17.setText("Tên");

        jLabel24.setText("Địa chỉ");

        tfDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiaChiActionPerformed(evt);
            }
        });

        jLabel39.setText("Giới tính");

        cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGioiTinhActionPerformed(evt);
            }
        });

        jLabel58.setText("Ngày cấp");

        jLabel59.setText("Số điện thoại");

        errCMND.setForeground(new java.awt.Color(255, 0, 0));

        errHo.setForeground(new java.awt.Color(255, 0, 0));

        errTen.setForeground(new java.awt.Color(255, 0, 0));

        errDiaChi.setForeground(new java.awt.Color(255, 0, 0));

        errSDT.setForeground(new java.awt.Color(255, 0, 0));

        errNgayCap.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnl_9Layout = new javax.swing.GroupLayout(pnl_9);
        pnl_9.setLayout(pnl_9Layout);
        pnl_9Layout.setHorizontalGroup(
            pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_9Layout.createSequentialGroup()
                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(pnl_9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnl_9Layout.createSequentialGroup()
                                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addGroup(pnl_9Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errCMND)
                                            .addGroup(pnl_9Layout.createSequentialGroup()
                                                .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(39, 39, 39)
                                                .addComponent(jLabel16)))))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_9Layout.createSequentialGroup()
                                        .addComponent(errHo)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_9Layout.createSequentialGroup()
                                        .addComponent(tfHo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errTen)
                                            .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(pnl_9Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnl_9Layout.createSequentialGroup()
                                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errDiaChi)
                                            .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel39)
                                        .addGap(11, 11, 11)
                                        .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnl_9Layout.createSequentialGroup()
                                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnl_9Layout.createSequentialGroup()
                                                .addComponent(tfNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel59))
                                            .addComponent(errNgayCap))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(errSDT)
                                            .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(43, 43, 43)))))
                        .addGap(0, 47, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_9Layout.setVerticalGroup(
            pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tfHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errCMND)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(errTen)
                            .addComponent(errHo))
                        .addGap(18, 18, 18)))
                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(3, 3, 3)
                .addComponent(errDiaChi)
                .addGap(18, 18, 18)
                .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_9Layout.createSequentialGroup()
                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNgayCap, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addComponent(errNgayCap))
                    .addGroup(pnl_9Layout.createSequentialGroup()
                        .addGroup(pnl_9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(errSDT)))
                .addContainerGap(141, Short.MAX_VALUE))
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

        tfTimKH.setBackground(new java.awt.Color(123, 156, 225));
        tfTimKH.setForeground(new java.awt.Color(255, 255, 255));
        tfTimKH.setBorder(null);
        tfTimKH.setCaretColor(new java.awt.Color(255, 255, 255));
        tfTimKH.setPreferredSize(new java.awt.Dimension(2, 20));
        customer.add(tfTimKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 141, -1));

        btnTimKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N
        btnTimKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKHMouseClicked(evt);
            }
        });
        customer.add(btnTimKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));

        btn_themKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        btn_themKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themKHMouseClicked(evt);
            }
        });
        customer.add(btn_themKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

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

        btn_suaKH.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_suaKH.setForeground(new java.awt.Color(255, 255, 255));
        btn_suaKH.setText("Sửa");
        btn_suaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaKHMouseClicked(evt);
            }
        });

        btn_xoaKH.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_xoaKH.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaKH.setText("Xóa");
        btn_xoaKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_xoaKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaKHMouseClicked(evt);
            }
        });

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
                        .addComponent(btn_suaKH))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_xoaKH)))
                .addGap(73, 73, 73))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28)
                    .addComponent(btn_suaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_xoaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        tbl_TaiKhoan.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Số Tk", "CMND", "Số dư", "Mã CN"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_TaiKhoan);
        if (tbl_TaiKhoan.getColumnModel().getColumnCount() > 0) {
            tbl_TaiKhoan.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel25.setText("Số tài khoản");

        jLabel27.setText("CMND");

        jLabel44.setText("Số dư");

        errSoTaiKhoantk.setForeground(new java.awt.Color(255, 0, 0));

        errCMNDtk.setForeground(new java.awt.Color(255, 0, 0));

        errSoDutk.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnl_TaiKhoanLayout = new javax.swing.GroupLayout(pnl_TaiKhoan);
        pnl_TaiKhoan.setLayout(pnl_TaiKhoanLayout);
        pnl_TaiKhoanLayout.setHorizontalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel44))
                .addGap(18, 18, 18)
                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                        .addComponent(errSoDutk)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                        .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfSoTaiKhoantk)
                                    .addComponent(tfSoDutk, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27))
                            .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                                .addComponent(errSoTaiKhoantk)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCMNDtk, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(errCMNDtk))
                        .addGap(46, 46, 46))))
        );
        pnl_TaiKhoanLayout.setVerticalGroup(
            pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_TaiKhoanLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(tfSoTaiKhoantk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(tfCMNDtk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(errSoTaiKhoantk)
                    .addComponent(errCMNDtk))
                .addGap(4, 4, 4)
                .addGroup(pnl_TaiKhoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(tfSoDutk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errSoDutk)
                .addGap(0, 96, Short.MAX_VALUE))
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
        btn_TimSoTK1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimSoTK1MouseClicked(evt);
            }
        });
        taikhoan.add(btn_TimSoTK1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, 20));

        btn_themTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        btn_themTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themTKMouseClicked(evt);
            }
        });
        taikhoan.add(btn_themTK, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        jPanel20.setBackground(new java.awt.Color(84, 127, 206));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Contacts_25px.png"))); // NOI18N

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Lock_25px.png"))); // NOI18N

        btn_suaTK.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_suaTK.setForeground(new java.awt.Color(255, 255, 255));
        btn_suaTK.setText("Sửa");
        btn_suaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaTKMouseClicked(evt);
            }
        });

        btn_xoaTK.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btn_xoaTK.setForeground(new java.awt.Color(255, 255, 255));
        btn_xoaTK.setText("Xóa");
        btn_xoaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_xoaTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_xoaTKMouseClicked(evt);
            }
        });

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
                        .addComponent(btn_suaTK))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_xoaTK)))
                .addGap(73, 73, 73))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(btn_suaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_xoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(btn_ChuyenTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        txt_tuNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txt_denNgay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btn_reportGD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_reportGD.setForeground(new java.awt.Color(0, 153, 255));
        btn_reportGD.setText("Sao Kê");
        btn_reportGD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportGDActionPerformed(evt);
            }
        });

        txt_report_sotk.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Nhập số tài khoản:");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel62.setText("Từ ngày:");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel63.setText("Đến ngày:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(207, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_report_sotk, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_denNgay, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_reportGD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 172, 172))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel62, jLabel63});

        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_report_sotk, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tuNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_denNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btn_reportGD)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jPanel6Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txt_denNgay, txt_report_sotk, txt_tuNgay});

        javax.swing.GroupLayout pnl_13Layout = new javax.swing.GroupLayout(pnl_13);
        pnl_13.setLayout(pnl_13Layout);
        pnl_13Layout.setHorizontalGroup(
            pnl_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnl_13Layout.setVerticalGroup(
            pnl_13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_13Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 68, Short.MAX_VALUE))
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

        jLabel46.setText("Mã Nhân viên");

        labelho.setText("Họ");

        jLabel47.setText("Tên");

        jLabel48.setText("Địa chỉ");

        jLabel49.setText("Giới tính");

        nv_cbGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        nv_cbGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nv_cbGioiTinhActionPerformed(evt);
            }
        });

        labelSDT.setText("Số điện thoại");

        jLabel60.setText("Tên đăng nhập");

        jLabel61.setText("Mật khẩu");

        nv_errMaNV.setForeground(new java.awt.Color(255, 0, 0));

        nv_errTen.setForeground(new java.awt.Color(255, 0, 0));

        nv_errHo.setForeground(new java.awt.Color(255, 0, 0));

        nv_errDiaChi.setForeground(new java.awt.Color(255, 0, 0));

        nv_errSDT.setForeground(new java.awt.Color(255, 0, 0));

        nv_errPass.setForeground(new java.awt.Color(255, 0, 0));

        nv_errLogin.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnl_7Layout = new javax.swing.GroupLayout(pnl_7);
        pnl_7.setLayout(pnl_7Layout);
        pnl_7Layout.setHorizontalGroup(
            pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_7Layout.createSequentialGroup()
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_7Layout.createSequentialGroup()
                                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nv_errMaNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnl_7Layout.createSequentialGroup()
                                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nv_errTen)
                                            .addComponent(nv_tfmaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 74, Short.MAX_VALUE))))
                            .addGroup(pnl_7Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nv_errLogin)
                                    .addComponent(nv_tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(51, 51, 51)
                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_7Layout.createSequentialGroup()
                                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelho)
                                    .addComponent(jLabel48))
                                .addGap(77, 77, 77)
                                .addComponent(nv_errHo)
                                .addGap(223, 226, Short.MAX_VALUE))
                            .addGroup(pnl_7Layout.createSequentialGroup()
                                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addGroup(pnl_7Layout.createSequentialGroup()
                                        .addComponent(labelSDT)
                                        .addGap(24, 24, 24)
                                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nv_tfHo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_errDiaChi)
                                            .addComponent(nv_tfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nv_errSDT)
                                            .addComponent(nv_errPass))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pnl_7Layout.setVerticalGroup(
            pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_7Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(nv_errMaNV))
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nv_tfHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelho)
                            .addComponent(nv_tfmaNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nv_errHo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nv_tfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel47)
                        .addComponent(nv_tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel48)))
                .addGap(6, 6, 6)
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addComponent(nv_errTen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(nv_cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addComponent(nv_errDiaChi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nv_tfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelSDT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nv_errSDT)
                        .addGap(7, 7, 7)))
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(nv_tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nv_tfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addGroup(pnl_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(nv_errPass))
                    .addGroup(pnl_7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nv_errLogin)))
                .addContainerGap(82, Short.MAX_VALUE))
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

        btn_themNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_plus_math_25px.png"))); // NOI18N
        btn_themNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themNVMouseClicked(evt);
            }
        });
        employee.add(btn_themNV, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

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

    private void displayMovementsKH() {
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
    }

    private void displayMovementsTK() {
        DefaultTableModel dtmTaiKhoan = (DefaultTableModel) tbl_TaiKhoan.getModel();
        dstk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).docToanBoTaiKhoan();
        dtmTaiKhoan.setRowCount(0);
        for (TaiKhoan tk : dstk) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(tk.getSoTK());
            vec.add(tk.getCmnd());
            vec.add(tk.getSoDu());
            vec.add(tk.getMaCN());
            dtmTaiKhoan.addRow(vec);
        }
    }

    private void displayMovementsNV() {
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

    private void setBlankTextKH() {
        tfTimKH.setText("");
        tfCMND.setText("");
        tfHo.setText("");
        tfTen.setText("");
        tfDiaChi.setText("");
        cbGioiTinh.setSelectedIndex(0);
        tfNgayCap.setText("");
        tfSDT.setText("");
    }

    private void setBlankTextKHErr() {
        errCMND.setText("");
        errHo.setText("");
        errTen.setText("");
        errDiaChi.setText("");
        errNgayCap.setText("");
        errSDT.setText("");

    }

    private void setBlankTextTK() {
        tf_TimSoTK1.setText("");
        tfSoTaiKhoantk.setText("");
        tfCMNDtk.setText("");
        tfSoDutk.setText("");
    }

    private void setBlankTextTKErr() {
        errSoTaiKhoantk.setText("");
        errCMNDtk.setText("");
        errSoDutk.setText("");

    }

    private void setBlankTextNV() {
        nv_tfmaNhanVien.setText("");
        nv_tfHo.setText("");
        nv_tfTen.setText("");
        nv_tfDiaChi.setText("");
        nv_tfSDT.setText("");
        nv_tfLogin.setText("");
        nv_tfMatKhau.setText("");

    }

    private void setBlankTextNVErr() {
        nv_errMaNV.setText("");
        nv_errTen.setText("");
        nv_errHo.setText("");
        nv_errDiaChi.setText("");
        nv_errSDT.setText("");
        nv_errPass.setText("");
        nv_errLogin.setText("");
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
        DefaultTableModel dtmTaiKhoan = (DefaultTableModel) tbl_TaiKhoan.getModel();
        dstk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).docToanBoTaiKhoan();
        dtmTaiKhoan.setRowCount(0);
        for (TaiKhoan tk : dstk) {
            Vector<Object> vec = new Vector<Object>();
            vec.add(tk.getSoTK());
            vec.add(tk.getCmnd());
            vec.add(tk.getSoDu());
            vec.add(tk.getMaCN());
            dtmTaiKhoan.addRow(vec);
        }
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
        if (tf_SoTKNhan.getText().trim().equals(currentAccount.getSoTK())) {
            lbl_messageGD.setText("Số tài khoản nhận phải KHÁC số tài khoản chuyển !");
        } else if (!checkSoTK(tf_SoTKNhan.getText())) {
            lbl_messageGD.setText("Số tài khoản nhận KHÔNG đúng!");
        } else if (!checkTien(tf_SoTienChuyen.getText())) {
            lbl_messageGD.setText("Kiểm tra lại số tiền chuyển!");
        } else {
            if (gd.chuyenTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienChuyen.getText()), tf_SoTKNhan.getText(), nd.getMaNV()) != 0) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTKNhan.setText("");
                tf_SoTienChuyen.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Số dư trong tài khoản không đủ!");
            }
        }
    }//GEN-LAST:event_btn_ChuyenTienActionPerformed

    private void btn_GuiTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuiTienActionPerformed
        GDGoiRutService gd = new GDGoiRutService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (checkTien(tf_SoTienGui.getText())) {
            if (gd.guiTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienGui.getText()), nd.getMaNV()) != 0) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTienGui.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Số tiền gửi phải từ 100,000 trở lên!");
            }
        } else {
            lbl_messageGD.setText("Kiểm tra lại số tiền gửi!");
        }
    }//GEN-LAST:event_btn_GuiTienActionPerformed

    private void btn_RutTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RutTienActionPerformed
        GDGoiRutService gd = new GDGoiRutService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (checkTien(tf_SoTienRut.getText())) {
            if (gd.rutTien(currentAccount.getSoTK(), Long.parseLong(tf_SoTienRut.getText()), nd.getMaNV()) != 0) {
                currentAccount = new CurrentAccountService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau()).currentAccount(currentAccount.getSoTK());
                tf_SoTienRut.setText("");
                updateUIGiaoDich();
            } else {
                lbl_messageGD.setText("Số tiền rút phải từ 100,000 trở lên!");
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

    private void cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGioiTinhActionPerformed

    private void btn_themKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themKHMouseClicked
        // TODO add your handling code here:

        if (tfCMND.getText().trim().matches("[0-9]+") == false || tfCMND.getText().trim().length() != 9) {
            errCMND.setText("CMND phải có 9 chữ số ");

        } else {
            errCMND.setText("");
        }

        if (!tfHo.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || tfHo.getText().trim().length() == 0) {
            errHo.setText("Họ không hợp lệ");

        } else {
            errHo.setText("");
        }

        if (!tfTen.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || tfTen.getText().trim().length() == 0) {
            errTen.setText("Ten không hợp lệ");

        } else {
            errTen.setText("");
        }
        if (tfDiaChi.getText().trim().length() == 0) {
            errDiaChi.setText("Địa chỉ không dược để trống");

        } else {
            errDiaChi.setText("");
        }
        if (!tfNgayCap.getText().trim().matches("\\d{4}-\\d{2}-\\d{2}") || tfNgayCap.getText().trim().length() == 0) {
            errNgayCap.setText("Hãy nhập đúng định dạng Vd:2021-11-26");

        } else {
            errNgayCap.setText("");
        }
        if (!tfSDT.getText().trim().matches("[0-9]+") || tfSDT.getText().trim().length() < 9 || tfSDT.getText().trim().length() == 0 || tfSDT.getText().trim().length() > 11) {
            errSDT.setText("Chỉ được nhập số và có ít nhất 9-11 kí tự");

        } else {
            errSDT.setText("");
        }
        if (!errCMND.getText().equalsIgnoreCase("") || !errHo.getText().equalsIgnoreCase("") || !errTen.getText().equalsIgnoreCase("") || !errDiaChi.getText().equalsIgnoreCase("") || !errNgayCap.getText().equalsIgnoreCase("") || !errSDT.getText().equalsIgnoreCase("")) {
            return;
        }

        KhachHangService kh = new KhachHangService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (kh.themKH(tfCMND.getText().trim(), tfHo.getText().trim(), tfTen.getText().trim(), tfDiaChi.getText().trim(), (String) cbGioiTinh.getSelectedItem(), tfNgayCap.getText().trim(), tfSDT.getText().trim()) != -1) {
            setBlankTextKH();
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsKH();
        } else {
            JOptionPane.showMessageDialog(this, "CMND đã tồn tại", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_themKHMouseClicked

    private void btnTimKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKHMouseClicked
        // TODO add your handling code here:
        setBlankTextKHErr();
        try {
            KhachHangService kh = new KhachHangService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
            KhachHang CurrentKH = new KhachHang();
            CurrentKH = kh.timKH(tfTimKH.getText());
            tfCMND.setText(CurrentKH.getCmnd());
            tfHo.setText(CurrentKH.getHo());
            tfTen.setText(CurrentKH.getTen());
            tfDiaChi.setText(CurrentKH.getDiachi());
            int index = 0;
            if (CurrentKH.getPhai().equalsIgnoreCase("Nam")) {
                index = 0;
            } else {
                index = 1;
            }
            cbGioiTinh.setSelectedIndex(index);
            tfNgayCap.setText(CurrentKH.getNgaycap());
            tfSDT.setText(CurrentKH.getSdt());
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this,e.get,"Thông báo",JOptionPane.ERROR);
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Không tìm thấy khách hàng", "Lỗi", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_btnTimKHMouseClicked

    private void btn_suaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaKHMouseClicked
        // TODO add your handling code here:
        setBlankTextKHErr();
        if (tfCMND.getText().trim().matches("[0-9]+") == false || tfCMND.getText().trim().length() != 9) {
            errCMND.setText("CMND phải có 9 chữ số ");

        } else {
            errCMND.setText("");
        }

        if (!tfHo.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || tfHo.getText().trim().length() == 0) {
            errHo.setText("Họ không hợp lệ");

        } else {
            errHo.setText("");
        }

        if (!tfTen.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || tfTen.getText().trim().length() == 0) {
            errTen.setText("Ten không hợp lệ");

        } else {
            errTen.setText("");
        }
        if (tfDiaChi.getText().trim().length() == 0) {
            errDiaChi.setText("Địa chỉ không dược để trống");

        } else {
            errDiaChi.setText("");
        }
        if (!tfNgayCap.getText().trim().matches("\\d{4}-\\d{2}-\\d{2}") || tfNgayCap.getText().trim().length() == 0) {
            errNgayCap.setText("Hãy nhập đúng định dạng Vd:2021-11-26");

        } else {
            errNgayCap.setText("");
        }
        if (!tfSDT.getText().trim().matches("[0-9]+") || tfSDT.getText().trim().length() < 9 || tfSDT.getText().trim().length() == 0 || tfSDT.getText().trim().length() > 11) {
            errSDT.setText("Chỉ được nhập số và có ít nhất 9-11 kí tự");

        } else {
            errSDT.setText("");
        }
        if (!errCMND.getText().equalsIgnoreCase("") || !errHo.getText().equalsIgnoreCase("") || !errTen.getText().equalsIgnoreCase("") || !errDiaChi.getText().equalsIgnoreCase("") || !errNgayCap.getText().equalsIgnoreCase("") || !errSDT.getText().equalsIgnoreCase("")) {
            return;
        }

        KhachHangService kh = new KhachHangService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (kh.suaKH(tfTimKH.getText(), tfCMND.getText(), tfHo.getText(), tfTen.getText(),
                tfDiaChi.getText(), (String) cbGioiTinh.getSelectedItem(), tfNgayCap.getText(), tfSDT.getText()) == 0) {
            setBlankTextKH();
            JOptionPane.showMessageDialog(this, "Đã tạo tài khoản không thể thay đổi CNMD", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsKH();
        } else if (kh.suaKH(tfTimKH.getText(), tfCMND.getText(), tfHo.getText(), tfTen.getText(),
                tfDiaChi.getText(), (String) cbGioiTinh.getSelectedItem(), tfNgayCap.getText(), tfSDT.getText()) != -1) {
            setBlankTextKH();
            JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsKH();
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi CMND không tồn tại", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaKHMouseClicked

    private void btn_xoaKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaKHMouseClicked
        // TODO add your handling code here:
        setBlankTextKHErr();
        if (tfCMND.getText().trim().matches("[0-9]+") == false || tfCMND.getText().trim().length() != 9) {
            errCMND.setText("CMND phải có 9 chữ số ");
            return;
        } else {
            errCMND.setText("");
        }
        KhachHangService kh = new KhachHangService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        if (kh.xoaKH(tfCMND.getText()) == 0) {
            setBlankTextKH();
            JOptionPane.showMessageDialog(this, "Không thể xóa Khách hàng đã tạo tài khoản", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsKH();
        } else if (kh.xoaKH(tfCMND.getText()) != -1) {
            setBlankTextKH();
            JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsKH();
        } else {
            JOptionPane.showMessageDialog(this, "CMND không tồn tại", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_xoaKHMouseClicked

    private void tfDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiaChiActionPerformed

    private void btn_themTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themTKMouseClicked
        // TODO add your handling code here:
        setBlankTextTKErr();
        if (tfSoTaiKhoantk.getText().trim().matches("[0-9]+") == false || tfSoTaiKhoantk.getText().trim().length() != 9) {
            errSoTaiKhoantk.setText("Số tài khoản phải có 9 chữ số ");

        } else {
            errSoTaiKhoantk.setText("");
        }
        if (tfCMNDtk.getText().trim().matches("[0-9]+") == false || tfCMNDtk.getText().trim().length() != 9) {
            errCMNDtk.setText("CMND phải có 9 chữ số ");

        } else {
            errCMNDtk.setText("");
        }
        if (tfSoDutk.getText().trim().matches("[0-9]+") == false || Long.parseLong(tfSoDutk.getText().trim()) < 0) {
            errSoDutk.setText("Số dư phải lớn hơn hoặc bằng không ");

        } else {
            errSoDutk.setText("");
        }
        if (!errSoTaiKhoantk.getText().equalsIgnoreCase("") || !errCMNDtk.getText().equalsIgnoreCase("") || !errSoDutk.getText().equalsIgnoreCase("")) {
            return;
        }
        TaiKhoanService tk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        int check = tk.themTK(tfSoTaiKhoantk.getText().trim(), tfCMNDtk.getText().trim(), Long.parseLong(tfSoDutk.getText().trim()));
        if (check == 0) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Không tồn tại số CMND", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (check == 2) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Số tài khoản đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (check != -1) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else {
            JOptionPane.showMessageDialog(this, "1 số CMND chỉ tạo được 1 tài khoản", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_themTKMouseClicked

    private void btn_xoaTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_xoaTKMouseClicked
        // TODO add your handling code here:
        setBlankTextTKErr();
        if (tfSoTaiKhoantk.getText().trim().matches("[0-9]+") == false || tfSoTaiKhoantk.getText().trim().length() != 9) {
            errSoTaiKhoantk.setText("Số tài khoản phải có 9 chữ số ");
            return;
        }
        TaiKhoanService tk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        int checkXoaTk = tk.xoaTK(tfSoTaiKhoantk.getText().trim());
        if (checkXoaTk == 0) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Tài khoản đã giao dịch không được xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (checkXoaTk == 2) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (checkXoaTk != -1) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Xóa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();

        } else {
            JOptionPane.showMessageDialog(this, "Tài khoản của chi nhánh khác không được xóa", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_btn_xoaTKMouseClicked

    private void btn_TimSoTK1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_TimSoTK1MouseClicked
        // TODO add your handling code here:
        setBlankTextTKErr();
        try {
            TaiKhoanService tk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
            TaiKhoan CurrentTK = new TaiKhoan();
            CurrentTK = tk.timTK(tf_TimSoTK1.getText());
            tfSoTaiKhoantk.setText(CurrentTK.getSoTK());
            tfCMNDtk.setText(CurrentTK.getCmnd());
            tfSoDutk.setText(String.valueOf(CurrentTK.getSoDu()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_btn_TimSoTK1MouseClicked

    private void btn_suaTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaTKMouseClicked
        // TODO add your handling code here:
        setBlankTextTKErr();
        if (tfSoTaiKhoantk.getText().trim().matches("[0-9]+") == false || tfSoTaiKhoantk.getText().trim().length() != 9) {
            errSoTaiKhoantk.setText("Số tài khoản phải có 9 chữ số ");

        } else {
            errSoTaiKhoantk.setText("");
        }
        if (tfCMNDtk.getText().trim().matches("[0-9]+") == false || tfCMNDtk.getText().trim().length() != 9) {
            errCMNDtk.setText("CMND phải có 9 chữ số ");

        } else {
            errCMNDtk.setText("");
        }
        if (tfSoDutk.getText().trim().matches("[0-9]+") == false || Long.parseLong(tfSoDutk.getText().trim()) < 0) {
            errSoDutk.setText("Số dư phải lớn hơn hoặc bằng không ");

        } else {
            errSoDutk.setText("");
        }
        if (!errSoTaiKhoantk.getText().equalsIgnoreCase("") || !errCMNDtk.getText().equalsIgnoreCase("") || !errSoDutk.getText().equalsIgnoreCase("")) {
            return;
        }
        TaiKhoanService tk = new TaiKhoanService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        int checkSuaTK = tk.suaTK(tf_TimSoTK1.getText().trim(), tfSoTaiKhoantk.getText().trim(), tfCMNDtk.getText().trim(), Long.parseLong(tfSoDutk.getText().trim()));
        if (checkSuaTK == 0) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Tài khoản đã giao dịch không được sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (checkSuaTK == 2) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Tài khoản của chi nhánh khác không dược sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (checkSuaTK != -1) {
            setBlankTextTK();
            JOptionPane.showMessageDialog(this, "Sửa thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else {
            JOptionPane.showMessageDialog(this, "Số tài khoản không tồn tại", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btn_suaTKMouseClicked

    private void nv_cbGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nv_cbGioiTinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nv_cbGioiTinhActionPerformed

    private void btn_themNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themNVMouseClicked
        // TODO add your handling code here:
        setBlankTextNVErr();
        if (nv_tfmaNhanVien.getText().trim().matches("[nN][vV][0-9]+") == false || nv_tfmaNhanVien.getText().trim().length() == 0) {
            nv_errMaNV.setText("Mã nhân viên sai định dạng VD:NV1");

        } else {
            nv_errMaNV.setText("");
        }

        if (!nv_tfHo.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || nv_tfHo.getText().trim().length() == 0) {
            nv_errHo.setText("Họ không hợp lệ");

        } else {
            nv_errHo.setText("");
        }

        if (!nv_tfTen.getText().trim().matches("[a-zA-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚÝàáâãèéêìíòóôõùúýĂăĐđĨĩŨũƠơƯưẠ-ỹ_ .]*") || nv_tfTen.getText().trim().length() == 0) {
            nv_errTen.setText("Tên không hợp lệ");

        } else {
            nv_errTen.setText("");
        }
        if (nv_tfDiaChi.getText().trim().length() == 0) {
            nv_errDiaChi.setText("Địa chỉ không dược để trống");

        } else {
            nv_errDiaChi.setText("");
        }

        if (!nv_tfSDT.getText().trim().matches("[0-9]+") || nv_tfSDT.getText().trim().length() < 9 || nv_tfSDT.getText().trim().length() == 0 || nv_tfSDT.getText().trim().length() > 11) {
            nv_errSDT.setText("Chỉ được nhập số và có ít nhất 9-11 kí tự");

        } else {
            nv_errSDT.setText("");
        }
        if (nv_tfLogin.getText().trim().length() == 0) {
            nv_errLogin.setText("Tên đăng nhập không dược để trống");

        } else {
            nv_errLogin.setText("");
        }
        if (nv_tfMatKhau.getText().trim().length() == 0) {
            nv_errPass.setText("Mật khẩu không dược để trống");

        } else {
            nv_errPass.setText("");
        }
        if (!nv_errMaNV.getText().equalsIgnoreCase("") || !nv_errHo.getText().equalsIgnoreCase("") || !nv_errTen.getText().equalsIgnoreCase("")
                || !nv_errDiaChi.getText().equalsIgnoreCase("") || !nv_errSDT.getText().equalsIgnoreCase("") || !nv_errLogin.getText().equalsIgnoreCase("") || !nv_errPass.getText().equalsIgnoreCase("")) {
            return;
        }
        NhanVienService nv = new NhanVienService(nd.getTenServer(), nd.getTaiKhoan(), nd.getMatKhau());
        int checkThemNV = nv.themNV(nv_tfmaNhanVien.getText().trim(), nv_tfHo.getText().trim(), nv_tfTen.getText().trim(),
                nv_tfDiaChi.getText().trim(), (String) nv_cbGioiTinh.getSelectedItem(), nv_tfSDT.getText().trim(),
                nv_tfLogin.getText().trim(), nv_tfMatKhau.getText().trim());
        if (checkThemNV == 0) {
            JOptionPane.showMessageDialog(this, "Mã nhân viên đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else if (checkThemNV == 2) {
            JOptionPane.showMessageDialog(this, "Tên đăng nhập đã tồn tại", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            displayMovementsTK();
            setBlankTextNV();
        }


    }//GEN-LAST:event_btn_themNVMouseClicked

    private void btn_reportGDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportGDActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-6RP733C;databaseName=NGANHANG";
            String user = "sa";
            String pass = "123456";
            Connection connection = DriverManager.getConnection(url, user, pass);

            JasperDesign jdesign = JRXmlLoader.load("C:\\Users\\Binh\\Desktop\\Project banking\\PTIT-banking-main\\src\\report\\SaoKe.jrxml");

            Map<String, Object> parameters = new HashMap<>();
            SimpleDateFormat ngayFormat = new SimpleDateFormat("dd/MM/yyyy");
            java.util.Date tuNgay;
            java.util.Date denNgay;
            tuNgay = ngayFormat.parse(txt_tuNgay.getText());
            denNgay = ngayFormat.parse(txt_denNgay.getText());

            parameters.put("sotk", txt_report_sotk.getText());
            parameters.put("ngaybd", tuNgay);
            parameters.put("ngaykt", denNgay);

            System.out.println(txt_report_sotk.getText());
            System.out.println(tuNgay);
            System.out.println(denNgay);

            JasperReport jreport = JasperCompileManager.compileReport(jdesign);
            JasperPrint jprint = JasperFillManager.fillReport(jreport, parameters, connection);

            JasperViewer.viewReport(jprint, false);

//            JRViewer v = new JRViewer(jprint);
//            
//            jPanel1.setLayout(new BorderLayout());
//            jPanel1.add(v);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btn_reportGDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Display;
    private javax.swing.JPanel baocao;
    private javax.swing.JLabel btnTimKH;
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
    private javax.swing.JButton btn_reportGD;
    private javax.swing.JLabel btn_suaKH;
    private javax.swing.JLabel btn_suaTK;
    private javax.swing.JLabel btn_themKH;
    private javax.swing.JLabel btn_themNV;
    private javax.swing.JLabel btn_themTK;
    private javax.swing.JLabel btn_xoaKH;
    private javax.swing.JLabel btn_xoaTK;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JPanel customer;
    private javax.swing.JPanel employee;
    private javax.swing.JLabel errCMND;
    private javax.swing.JLabel errCMNDtk;
    private javax.swing.JLabel errDiaChi;
    private javax.swing.JLabel errHo;
    private javax.swing.JLabel errNgayCap;
    private javax.swing.JLabel errSDT;
    private javax.swing.JLabel errSoDutk;
    private javax.swing.JLabel errSoTaiKhoantk;
    private javax.swing.JLabel errTen;
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
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel labelSDT;
    private javax.swing.JLabel labelho;
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
    private javax.swing.JComboBox<String> nv_cbGioiTinh;
    private javax.swing.JLabel nv_errDiaChi;
    private javax.swing.JLabel nv_errHo;
    private javax.swing.JLabel nv_errLogin;
    private javax.swing.JLabel nv_errMaNV;
    private javax.swing.JLabel nv_errPass;
    private javax.swing.JLabel nv_errSDT;
    private javax.swing.JLabel nv_errTen;
    private javax.swing.JTextField nv_tfDiaChi;
    private javax.swing.JTextField nv_tfHo;
    private javax.swing.JTextField nv_tfLogin;
    private javax.swing.JTextField nv_tfMatKhau;
    private javax.swing.JTextField nv_tfSDT;
    private javax.swing.JTextField nv_tfTen;
    private javax.swing.JTextField nv_tfmaNhanVien;
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
    private javax.swing.JTable tbl_TaiKhoan;
    private javax.swing.JTable tbl_khachHang;
    private javax.swing.JTable tbl_movements;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfCMNDtk;
    private javax.swing.JTextField tfDiaChi;
    private javax.swing.JTextField tfHo;
    private javax.swing.JTextField tfNgayCap;
    private javax.swing.JTextField tfSDT;
    private javax.swing.JTextField tfSoDutk;
    private javax.swing.JTextField tfSoTaiKhoantk;
    private javax.swing.JTextField tfTen;
    private javax.swing.JTextField tfTimKH;
    private javax.swing.JTextField tf_SoTKNhan;
    private javax.swing.JTextField tf_SoTienChuyen;
    private javax.swing.JTextField tf_SoTienGui;
    private javax.swing.JTextField tf_SoTienRut;
    private javax.swing.JTextField tf_TimSoTK;
    private javax.swing.JTextField tf_TimSoTK1;
    private javax.swing.JTextField txt_denNgay;
    private javax.swing.JTextField txt_report_sotk;
    private javax.swing.JTextField txt_tuNgay;
    // End of variables declaration//GEN-END:variables

}
