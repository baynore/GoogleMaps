
public class MassTransit implements TravelStrategy {
    
    public void drawMap() {
        
        System.out.println("Map for travelling by mass transit");
        computeEnergySavings();

    }

    public void computeTimeEstimate() {
        
        System.out.println("Time estimate for travelling by mass transit");

    }

    public void findRoute() {
    
        System.out.println("Route for travelling by mass transit");
    
    }
    
    public void computeEnergySavings() {
        
        System.out.println("Some Savings");
    
    }
}
