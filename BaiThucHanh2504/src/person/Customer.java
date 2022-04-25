package person;

public class Customer extends Person {
    private String nameOfProduct;

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

public int getBill(){
    return 100000;
}

    @Override
    public void display() {
        super.display();
        System.out.println("San Pham da mua: " + nameOfProduct);
        System.out.println("Tinh tien: " + getBill());
    }
}
