package ru.geekbrains.spring1.hibernate1;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SessionFactoryUtils sessionFactoryUtils = new SessionFactoryUtils();
        sessionFactoryUtils.init();

        ProductDao productDao = new ProductDaoImpl(sessionFactoryUtils);

        Product p = productDao.findById(1l);
        System.out.println(p);

        productDao.saveOrUpdate(new Product(1l, "dfas", 587));

        productDao.deleteById(1l);

        List<Product> productList = productDao.findAll();
        System.out.println(productList);

        sessionFactoryUtils.shutdown();
    }
}
