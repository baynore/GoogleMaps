
public class ByCar implements TravelStrategy {
   
    public void drawMap() {
        
        System.out.println("Map for travelling by car");
        computeEnergySavings();
    
    }

    public void computeTimeEstimate() {
        
        System.out.println("Time estimate for travelling by car");

    }

    public void findRoute() {
    
        System.out.println("Route for travelling by car");
    
    }

    public void computeEnergySavings() {
        
        System.out.println("No Savings");
    
    }

}
