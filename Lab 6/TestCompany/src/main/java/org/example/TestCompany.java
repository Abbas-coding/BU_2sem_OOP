package org.example;

public class TestCompany {
    public static void main(String[] args) {
        Product p1 = new Product("TV", 4, 34000);
        Product p2 = new Product("Bicycle", 4, 5500);
        Product p3 = new Product("Fridge", 3, 70000);

        Store s1 = new Store("Makro", "Karachi");
        Store s2 = new Store("Hypermart", "Karachi");
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        Product tempProduct = s1.deleteProct("Bicycle");
        if(tempProduct != null){
            System.out.println("Product " + tempProduct.getName() + " is deleted");
        }
        s1.displayAll();

        s2.addProduct(p1);
        s2.addProduct(p2);
        s2.addProduct(p3);
        s2.displayAll();

        Company c1 = new Company("Unilever");
        c1.addStore(s1);
        c1.addStore(s2);
        c1.displayAll();
        int n = c1.searchNbofStore("TV");
        System.out.println("Number of stores have TV "+n);

    }
}