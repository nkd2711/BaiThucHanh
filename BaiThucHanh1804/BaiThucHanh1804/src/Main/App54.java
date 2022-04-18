package Main;

import Shapes.HinhChuNhat;
import Shapes.HinhTron;
import Shapes.HinhTru;
import Shapes.HinhVuong;

public class App54 {

    public static void main(String[] arStrings) {

        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDientich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDientich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDientich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }

        
        
}