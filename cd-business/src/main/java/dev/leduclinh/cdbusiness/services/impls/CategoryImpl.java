package dev.leduclinh.cdbusiness.services.impls;

import dev.leduclinh.cdbusiness.domain.dtos.CategoryDTO;
import dev.leduclinh.cdbusiness.domain.entities.CategoryEntity;
import dev.leduclinh.cdbusiness.repositories.CategoryRepository;
import dev.leduclinh.cdbusiness.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryImpl implements CategoryService {
    @Autowired
    CategoryRepository repository;

    @Override
    public List<CategoryDTO> getListCategory() {
        List<CategoryEntity> list = repository.findAll();
        List<CategoryDTO> categoryDTOS = new ArrayList<>();
        if(!CollectionUtils.isEmpty(list)){
            for (CategoryEntity entity : list){
                CategoryDTO dto = new CategoryDTO();
                dto.buildResponse(entity);
                categoryDTOS.add(dto);
            }
        }
         return categoryDTOS;
    }
}
