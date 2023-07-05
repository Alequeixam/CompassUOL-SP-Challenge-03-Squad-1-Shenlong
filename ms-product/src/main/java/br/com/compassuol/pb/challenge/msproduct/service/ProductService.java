package br.com.compassuol.pb.challenge.msproduct.service;

import br.com.compassuol.pb.challenge.msproduct.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductService productService;

    public ProductService(ProductService productService) {
        this.productService = productService;
    }


}
