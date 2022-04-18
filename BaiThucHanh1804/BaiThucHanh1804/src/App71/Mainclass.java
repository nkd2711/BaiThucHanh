package App71;

public class Mainclass {
    
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();

        hinhTron.setBanKinh(10);

        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; và dien tich: " + dienTich);
    }
}