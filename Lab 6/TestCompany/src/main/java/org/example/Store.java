package org.example;

public class Store {
    private String name;
    private String location;
    private Product[] productList;
    private int nbProduct = 0;

    public Store(String name, String location){
        this.name = name;
        this.location = location;
        productList = new Product[100];
    }

    public String getName() {
        return name;
    }
    public void addProduct (Product product){
        if(nbProduct < 100) {
            productList[nbProduct] = product;
            nbProduct++;
        }
        else {
            System.out.println("No more products can be added");
        }
    }
    public boolean searchProduct(String pName){
        boolean exists = false;
        for(int i = 0; i < this.nbProduct; i++){
            if(productList[i].getName().equals(pName)){
                exists = true;
            }
        }
        return exists;
    }

    public Product deleteProct(String pName){
        Product p = new Product();
        boolean found = false;
        for(int i = 0; i < nbProduct; i++) {
            if(productList[i].getName().equals(pName)){
                found = true;
                p = productList[i];
            }
        }
        if (found){
            return p;
        }
        else{
            System.out.println("No Product found with the Name: "+ pName);
            return p;
        }
    }

    public void displayAll(){
        System.out.println("Products Available in the Store");
        for (int i = 0; i < nbProduct; i++){
            System.out.println("Product "+i+1 + " "+ productList[i].getName());
        }
    }

    public int getNbProduct() {
        return nbProduct;
    }

    public Product[] getProductList() {
        return productList;
    }
}
