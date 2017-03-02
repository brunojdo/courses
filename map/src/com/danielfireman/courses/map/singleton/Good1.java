package com.danielfireman.courses.map.singleton;

/**
 * Good example of singleton design pattern. 
 */
class Good1 {
   private static Good1 singleInstance;

   // Making the constructor private. No other object could create more instances.
   private Good1() {}

   String quote() {
       return "\"Be the change that you wish to see in the world.\" - Mahatma Gandhi";
   }

   // Static method to get the singleton instance.
   public static syncronized Good1 getInstance() {
      if (singleInstance == null) {
        singleInstance = new Good1(); 
      }
      return singleInstance;
   }

   public static void main(String []args) {
       Good good = Good.getInstance();
       System.out.println(good.quote());
   }
}
