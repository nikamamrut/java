class Temperature {
    int temp;

   public Temperature(int temp) {
       this.temp = temp;
   }

   public int getTemp() {
       return temp;
   }

   public static int maxTemp(Temperature[] temps) {
       int maxTemp = temps[0].getTemp();
       for (Temperature temp : temps) {
           if (temp.getTemp() > maxTemp) {
               maxTemp = temp.getTemp();
           }
       }
       return maxTemp;
   }
}

public class Main {
   public static void main(String[] args) {
       // create a list of Temperature objects
       Temperature[] temps = {new Temperature(10), new Temperature(20), new Temperature(30), new Temperature(40), new Temperature(50)};

       // use the maxTemp static method to find the maximum temperature
       int maxTemp = Temperature.maxTemp(temps);

       System.out.println("The maximum temperature is " + maxTemp + ".");
   }
}