package dev.leduclinh.cdbusiness.controllers.employee;

import dev.leduclinh.cdbusiness.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@Controller
@RequestMapping("/employee/product")
public class EmployeeProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/getListProduct")
    public ResponseEntity<?> getListProduct() {
        return new ResponseEntity<>(productService.getListProduct(), HttpStatus.OK);
    }
}
