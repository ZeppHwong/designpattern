package com.demo.state;

public class Test {
     public static void main(String[] args){
         Context context = new Context();
         context.setLiftState(new CloseState());
         context.open();
         context.close();
         context.run();
         context.stop();
      }
}
