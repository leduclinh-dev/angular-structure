package dev.leduclinh.cdbusiness.services.impls;

import dev.leduclinh.cdbusiness.domain.dtos.ProductDTO;
import dev.leduclinh.cdbusiness.domain.entities.ProductEntity;
import dev.leduclinh.cdbusiness.domain.requests.admin.ProductRequest;
import dev.leduclinh.cdbusiness.repositories.ProductRepository;
import dev.leduclinh.cdbusiness.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProductImpl implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public void createProduct(ProductRequest request) {
        ProductEntity productSave = new ProductEntity(request);
        repository.save(productSave);
    }

    @Override
    public List<ProductDTO> getListProduct() {
        List<ProductEntity> list = repository.findAll();
        List<ProductDTO> productDTOS = new ArrayList<>();
        if(!CollectionUtils.isEmpty(list)){
            for (ProductEntity entity: list) {
                ProductDTO productDTO = new ProductDTO();
                productDTO.buildResponse(entity);
                productDTOS.add(productDTO);
            }
        }
        return productDTOS;
    }
}
