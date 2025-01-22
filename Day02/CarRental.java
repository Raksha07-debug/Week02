public class CarRental {
    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;
    private double totalCost;

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
        calculateTotalCost();
    }

    // Constructor to initialize rental details with default daily rate
    public CarRental(String customerName, String carModel, int rentalDays) {
        this(customerName, carModel, rentalDays, 50.0); // Default daily rate is $50.0
    }

    // Method to calculate total cost
    private void calculateTotalCost() {
        totalCost = rentalDays * dailyRate;
    }

    // Getters for attributes
    public String getCustomerName() {
        return customerName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public double getTotalCost() {
        return totalCost;
    }

    // Main method to test the CarRental class
    public static void main(String[] args) {
        // Create instances of CarRental
        CarRental rental1 = new CarRental("John Doe", "Toyota Camry", 5, 60.0);
        CarRental rental2 = new CarRental("Jane Smith", "Honda Accord", 7);

        // Display rental details
        System.out.println("Rental 1: ");
        System.out.println("Customer Name: " + rental1.getCustomerName());
        System.out.println("Car Model: " + rental1.getCarModel());
        System.out.println("Rental Days: " + rental1.getRentalDays());
        System.out.println("Daily Rate: $" + rental1.getDailyRate());
        System.out.println("Total Cost: $" + rental1.getTotalCost());

        System.out.println();

        System.out.println("Rental 2: ");
        System.out.println("Customer Name: " + rental2.getCustomerName());
        System.out.println("Car Model: " + rental2.getCarModel());
        System.out.println("Rental Days: " + rental2.getRentalDays());
        System.out.println("Daily Rate: $" + rental2.getDailyRate());
        System.out.println("Total Cost: $" + rental2.getTotalCost());
    }
}
