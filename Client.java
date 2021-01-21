/*

   This is the Google Maps program.
   
   Author: Erica Baynor
   
   Date: 8/21/20

*/

public class Client {

    public static void main(String[] args) {

        Directions d1 = new Directions();
        Directions d2 = new Directions();
        Directions d3 = new Directions();
        
        d1.changeStrategy(new ByCar());
        d2.changeStrategy(new ByCar());
        d3.changeStrategy(new ByCar()); 

        d1.performDrawMap();
        d2.performDrawMap();
        d3.performDrawMap();

        d2.changeStrategy(new Walking());
        d3.changeStrategy(new MassTransit());

        d1.performDrawMap();
        d2.performDrawMap();
        d3.performDrawMap();

    }
}
