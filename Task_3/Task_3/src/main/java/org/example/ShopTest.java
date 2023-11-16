package org.example;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.*;
import static org.example.Shop.*;


public class ShopTest {
    public static void checkShopMethods(){
        List<Product> myBucket = new ArrayList<>();
        Product appleJuice = new Product(60, "Яблочный сок");
        Product orangeJuice = new Product(65, "Апельсиновый сок");
        Product carrotJuice = new Product(80, "Морковный сок");
        Product grapeJuice = new Product(70, "Виноградный сок");

        myBucket.add(appleJuice);
        myBucket.add(orangeJuice);
        myBucket.add(carrotJuice);
        myBucket.add(grapeJuice);

        // 1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов
        // (правильное количество продуктов, верное содержимое корзины).
        assertThat(myBucket).hasSize(4);
        for (Product product: myBucket) {
            assertThat(product.getTitle()).containsAnyOf("Яблочный сок", "Апельсиновый сок",
                    "Морковный сок", "Виноградный сок");
        }

        // 2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
        assertThat(getMostExpensiveProduct(myBucket).getTitle()).isEqualTo("Морковный сок");

        // 3. Напишите тесты для проверки корректности работы метода sortProductsByPrice
        // (проверьте правильность сортировки).
        assertThat(myBucket.get(1).getTitle()).isEqualTo("Виноградный сок");
        assertThat(myBucket.get(2).getTitle()).isEqualTo("Апельсиновый сок");
        assertThat(myBucket.get(3).getTitle()).isEqualTo("Яблочный сок");
    }
}
