package br.com.compassuol.pb.challenge.msproduct.service;

import br.com.compassuol.pb.challenge.msproduct.entity.Product;
import br.com.compassuol.pb.challenge.msproduct.payload.ProductDTO;
import br.com.compassuol.pb.challenge.msproduct.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO createProduct(ProductDTO productDTO) {
        Product product = mapToEntity(productDTO);
        Product createdProduct = productRepository.save(product);

        ProductDTO prodResponse = mapToDTO(createdProduct);
        return prodResponse;
    }

    private ProductDTO mapToDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();

        productDTO.setId(product.getId());
        productDTO.setDate(product.getDate());
        productDTO.setDescription(product.getDescription());
        productDTO.setName(product.getName());
        productDTO.setImgUrl(product.getImgUrl());
        productDTO.setPrice(product.getPrice());

        return productDTO;
    }
    private Product mapToEntity(ProductDTO productDTO) {
        Product product = new Product();

        product.setId(productDTO.getId());
        product.setDate(productDTO.getDate());
        product.setDescription(productDTO.getDescription());
        product.setName(productDTO.getName());
        product.setImgUrl(productDTO.getImgUrl());
        product.setPrice(productDTO.getPrice());

        return  product;
    }
}
