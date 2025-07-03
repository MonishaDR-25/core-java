package com.xworkz.runner;

import com.xworkz.dto.ProductDto;
import com.xworkz.repository.ProductRepository;
import com.xworkz.repository.ProductRepositoryImpl;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

public class ProductRunner {
    public static void main(String[] args) {

        ProductRepository productRepository=new ProductRepositoryImpl();
        Collection<ProductDto> collection=productRepository.findAll();

        System.out.println("1. Print all Product info");
        collection.forEach(System.out::println);

        System.out.println("Print all the names of the product");
        collection.stream().map(ProductDto::getName).forEach(System.out::println);

        System.out.println("3.Print all products where discount is greater than 10%");
        collection.stream().filter(product->product.getDiscount()>10).forEach(System.out::println);

        System.out.println("4.Collect all product if warranty less than 3");
        collection.stream().filter(productDto -> productDto.getWarranty()<3).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("5.Sort all products id(ascending)");
        collection.stream().sorted().forEach(System.out::println);

        System.out.println("6.Products with quantity > 5, sorted by id");
        collection.stream().filter(productDto -> productDto.getQuantity()>5).sorted((a, b) -> a.getId() - b.getId()).forEach(System.out::println);

        System.out.println("7. Collect only manufacturer of all products");
        collection.stream().map(ProductDto::getManufacturer).forEach(System.out::println);

        System.out.println("8.Product with minimum discount");
        Optional<ProductDto> minDiscount = collection.stream()
                .min((a, b) -> Double.compare(a.getDiscount(), b.getDiscount()));
        minDiscount.ifPresent(System.out::println);

        System.out.println("\n9. Product with latest manufacturedDate");
        Optional<ProductDto> latestDate = collection.stream()
                .max((a, b) -> a.getManufactureDate().compareTo(b.getManufactureDate()));
        latestDate.ifPresent(System.out::println);

        System.out.println("\n10. Product with max costPerItem");
        Optional<ProductDto> maxCost = collection.stream()
                .max((a, b) -> Double.compare(a.getCostPerItem(), b.getCostPerItem()));
        maxCost.ifPresent(System.out::println);


    }
}
