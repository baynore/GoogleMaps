public class Directions {
    
    private TravelStrategy travelStrategy;

    public Directions() {

                

    }

    public void changeStrategy(TravelStrategy ts) {
    
        this.travelStrategy = ts;
    
    }
    
    public void performDrawMap() {
        
        travelStrategy.drawMap();
    
    }
    
    public void performComputeTimeEstimate() {
        
        travelStrategy.computeTimeEstimate();

    }

    public void performFindRoute() {
        
        travelStrategy.findRoute();

    }
}
