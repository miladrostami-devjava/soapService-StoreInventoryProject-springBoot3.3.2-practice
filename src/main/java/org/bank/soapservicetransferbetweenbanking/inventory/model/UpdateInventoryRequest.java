package org.bank.soapservicetransferbetweenbanking.inventory.model;

public class UpdateInventoryRequest {
    private String productId;
    private int quantity;

    public UpdateInventoryRequest(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
