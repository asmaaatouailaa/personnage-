package com.pantxi.Perssonage;



public class Perssonage {

  public static String tourner(int x) {

      int y = (x - 1) % 4 + 1;
      if (y == 1) {
          return "EST";
      } else if ( y== 2) {
          return "SUD";
      } else if (y == 3) {
          return "ouest";
      } else if (y == 4) {

          return "nord";
      }else return null;
  }

}
