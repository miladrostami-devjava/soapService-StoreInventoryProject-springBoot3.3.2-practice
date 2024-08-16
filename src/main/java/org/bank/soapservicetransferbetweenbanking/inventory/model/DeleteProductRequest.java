package org.bank.soapservicetransferbetweenbanking.inventory.model;

public class DeleteProductRequest {
    private String productId;

    public DeleteProductRequest(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
