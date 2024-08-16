package org.bank.soapservicetransferbetweenbanking.inventory.service;

import org.bank.soapservicetransferbetweenbanking.inventory.model.*;
import org.bank.soapservicetransferbetweenbanking.inventory.model.request.CheckInventoryRequest;
import org.bank.soapservicetransferbetweenbanking.inventory.model.response.CheckInventoryResponse;

public interface InventoryService {
    CheckInventoryResponse checkInventory(CheckInventoryRequest request);
    AddProductResponse addProduct(AddProductRequest request);
    UpdateInventoryResponse updateInventory(UpdateInventoryRequest request);
    DeleteProductResponse deleteProduct(DeleteProductRequest request);
}
