package com.demo.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeHook extends CaffeinneBeverage {
    @Override
    protected boolean wantsCondiments() {
       String answer = getUserInput();
       if(answer.toLowerCase().startsWith("y")){
           return true;
       }else{
           return false;
       }
    }

    @Override
    void brew() {
        System.out.println("dripping coffee  through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("add sugar and milk");
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("would u like add sugar and milk 4 your coffee");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e){
            System.out.println("error.....");
        }

        if(answer == null){
            return "no";
        }
        return answer;
    }
}
