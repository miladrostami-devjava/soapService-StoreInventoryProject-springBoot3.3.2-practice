package org.bank.soapservicetransferbetweenbanking.inventory.service;

import org.bank.soapservicetransferbetweenbanking.inventory.model.*;
import org.bank.soapservicetransferbetweenbanking.inventory.model.request.CheckInventoryRequest;
import org.bank.soapservicetransferbetweenbanking.inventory.model.response.CheckInventoryResponse;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class InventoryServiceImpl implements InventoryService {
    private final Map<String, Product> inventory = new HashMap<>();

    @Override
    public CheckInventoryResponse checkInventory(CheckInventoryRequest request) {
        CheckInventoryResponse response = new CheckInventoryResponse();
        Product product = inventory.get(request.getProductId());
        response.setQuantity(product != null ? product.getQuantity() : 0);
        return response;
    }

    @Override
    public AddProductResponse addProduct(AddProductRequest request) {
        AddProductResponse response = new AddProductResponse();
        Product product = request.getProduct();
        if (inventory.containsKey(product.getProductId())) {
            response.setStatus("Product already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            response.setStatus("Product added successfully.");
        }
        return response;
    }

    @Override
    public UpdateInventoryResponse updateInventory(UpdateInventoryRequest request) {
        UpdateInventoryResponse response = new UpdateInventoryResponse();
        Product product = inventory.get(request.getProductId());
        if (product != null) {
            product.setQuantity(request.getQuantity());
            response.setStatus("Inventory updated successfully.");
        } else {
            response.setStatus("Product not found.");
        }
        return response;
    }

    @Override
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) {
        DeleteProductResponse response = new DeleteProductResponse();
        if (inventory.remove(request.getProductId()) != null) {
            response.setStatus("Product deleted successfully.");
        } else {
            response.setStatus("Product not found.");
        }
        return response;
    }

}
