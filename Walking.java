
public class Walking implements TravelStrategy {
    
    public void drawMap() {
        
        System.out.println("Map for travelling by walking");
        computeEnergySavings();
         
    }

    public void computeTimeEstimate() {
        
        System.out.println("Time estimate for travelling by walking");

    }

    public void findRoute() {
    
        System.out.println("Route for travelling by walking");
    
    }
    
    public void computeEnergySavings() {
        
        System.out.println("Best Savings");
    
    }
}
