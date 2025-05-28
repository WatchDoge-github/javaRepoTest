package ru.okhapkin.vinylstore.productservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.okhapkin.vinylstore.productservice.dto.VinylDTO;
import ru.okhapkin.vinylstore.productservice.model.Vinyl;
import ru.okhapkin.vinylstore.productservice.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/vinyl/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody VinylDTO product) {
        productService.saveNewVinyl(product);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Vinyl> getAllProducts() {
        return productService.getAllVinyl();
    }
}
