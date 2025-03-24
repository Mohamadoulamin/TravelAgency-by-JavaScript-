class TravelPackage {
    // Attributes
    private String packageID;
    private String destination;
    private double price;
    private String itinerary;

    // Method
    public double getPrice() {
        return price;
    }
}

class LuxuryTravelPackage extends TravelPackage {
    @Override
    public double getPrice() {
        // Custom pricing logic for luxury packages
        return super.getPrice() * 1.5; // 50% more for luxury
    }
}
