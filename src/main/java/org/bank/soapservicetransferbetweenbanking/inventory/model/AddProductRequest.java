package org.bank.soapservicetransferbetweenbanking.inventory.model;

public class AddProductRequest {
    private Product product;

    public AddProductRequest(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
