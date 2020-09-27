package dev.leduclinh.cdbusiness.services;

import dev.leduclinh.cdbusiness.domain.dtos.ProductDTO;
import dev.leduclinh.cdbusiness.domain.requests.admin.ProductRequest;

import java.util.List;

public interface ProductService {
        void createProduct(ProductRequest request);
        List<ProductDTO> getListProduct();
}
