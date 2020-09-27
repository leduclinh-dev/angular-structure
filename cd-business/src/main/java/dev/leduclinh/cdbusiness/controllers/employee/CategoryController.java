package dev.leduclinh.cdbusiness.controllers.employee;

import dev.leduclinh.cdbusiness.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping("/employee/category")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping("/getListCategory")
    public ResponseEntity<?> getListCategory() {
        return new ResponseEntity<>(service.getListCategory(), HttpStatus.OK);
    }

}
