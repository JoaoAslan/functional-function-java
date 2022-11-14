package aula5.application;

import aula5.entities.Product;
import aula5.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.5));
        list.add(new Product("HD Case", 80.9));

        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}