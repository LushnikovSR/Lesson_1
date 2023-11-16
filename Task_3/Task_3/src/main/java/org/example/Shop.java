package org.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Shop {
    private List<Product> products;

    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public static List<Product> sortProductsByPrice(List<Product> bucket) {
        // Допишите реализацию метода самостоятельно
        Collections.sort(bucket);
        return bucket;
    }

    // Метод должен вернуть самый дорогой продукт
    public static Product getMostExpensiveProduct(List<Product> buscket) {
        // Допишите реализацию метода самостоятельно
        Product theMostExpensiveProduct = sortProductsByPrice(buscket).get(0);
        return theMostExpensiveProduct;
    }
}
