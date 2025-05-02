public class Main {
    public static void main(String[] args) 
    {
        LightBoard lb = new LightBoard(1000, 1000);
        System.out.println("On percentage: " + lb.test());
        
        LightBoard sim = new LightBoard(7, 5);
        boolean[][] testLights = 
        {
            {true, true, false, true, true},
            {true, false, false, true, false},
            {true, false, false, true, true},
            {true, false, false, false, true},
            {true, false, false, false, true},
            {true, true, false, false, true},
            {false, false, false, false, false}
        };
        sim.setLights(testLights);
        
        System.out.println(sim.evaluateLight(0, 3));  // Expected: false
        System.out.println(sim.evaluateLight(6, 0));  // Expected: true
        System.out.println(sim.evaluateLight(4, 1));   // Expected: false
        System.out.println(sim.evaluateLight(5, 4));   // Expected: true
    }
}