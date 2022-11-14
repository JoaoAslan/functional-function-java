package aula5.util;

import aula5.entities.Product;

import java.util.function.Function;

// https://docs.oracle.com/javase/10/docs/api/java/util/function/Function.html
public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        return p.getName().toUpperCase();
    }
}
