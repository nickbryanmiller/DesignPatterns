package com.company;

public class CartPoint extends Magnitude {

    // These are the values of the x and y coordinates
    private double x = 0;
    private double y = 0;

    // This is the constructor that sets the x and y position
    public CartPoint(double xPos, double yPos) {
        this.x = xPos;
        this.y = yPos;
    }

    // We override the lessThan method
    @Override
    public boolean lessThan(Magnitude m) {
        // This is a try catch in case anyone tries to compare two different types
        try {
            // This is downcasting so we can reference the x and y position
            CartPoint cp  = ((CartPoint) m);

            double distance1 = Math.sqrt((x-0)*(x-0) + (y-0)*(y-0));
            double distance2 = Math.sqrt((cp.x-0)*(cp.x-0) + (cp.y-0)*(cp.y-0));

            if (distance1 < distance2) {
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception e) {
            System.out.println("There was an error: " + e.getLocalizedMessage());
            return false;
        }
    }
}