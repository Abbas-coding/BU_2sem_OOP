package org.example;

public class Company {
    private String name;
    private Store[] stores;
    private int nbStore = 0;

    public Company(String name){
        this.name= name;
        stores = new Store[10];
    }
    public void addStore(Store store){
        if(nbStore <10) {
            stores[nbStore] = store;
            nbStore++;
        }
        else {
            System.out.println("No more stores can be added.");
        }
    }

    public int searchNbofStore(String pName){
        int count = 0;
        for(int i = 0; i < nbStore; i++){
            for(int j = 0; j < stores[i].getNbProduct(); j++) {
                if(stores[i].getProductList()[j].getName().equals(pName)){
                    count++;
                }
            }
        }
        return count;
    }
    public void displayAll(){
        System.out.println("Stores Available in the Company");
        for (int i = 0; i < nbStore; i++){
            System.out.println("Product "+i+1 + " "+ stores[i].getName());
        }
    }
}
