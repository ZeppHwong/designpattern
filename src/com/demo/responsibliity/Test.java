package com.demo.responsibliity;

import java.util.ArrayList;
import java.util.Random;

public class Test {
     public static void main(String[] args){
         Random random = new Random();
         ArrayList<IWomen> list = new ArrayList<>();
         int max = 5;
         for (int i = 0; i < max; i++) {
             list.add(new Women(random.nextInt(3)," go out"));
         }

         Handler father = new FatherHandler();
         Handler husband = new HusBandHandler();
         Handler son = new SonHandler();
         father.setNext(husband);
         husband.setNext(son);

         for (IWomen women : list) {
             father.handleMessage(women);
         }
      }

}
