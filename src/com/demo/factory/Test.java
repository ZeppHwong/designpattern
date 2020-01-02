package com.demo.factory;

public class Test {
     public static void main(String[] args){
         AbstractFactory factory = new ProductFactory();
         Product product1 = factory.createProduct(ConcreteProduct1.class);
         product1.getColor();
         product1.talk();
         Product product2 = factory.createProduct(ConcreteProduct2.class);
         product2.getColor();
         product2.talk();
      }
}
