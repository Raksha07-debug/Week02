class Device {
    private String deviceId;
    private String status;

    // Constructor to initialize Device object
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the current status of the device
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + " Status: " + status);
    }
}

class Thermostat extends Device {
    private String temperatureSetting;

    // Constructor to initialize Thermostat object
    public Thermostat(String deviceId, String status, String temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding method to display the current status and temperature setting of the thermostat
    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature setting of device is " + temperatureSetting);
    }
}

class SmartHomeDevice {
    public static void main(String[] args) {
        // Creating a Device object and displaying its status
        Device device = new Device("12345", "ON");
        device.displayStatus();
        System.out.println("------------------------------------------------");

        // Creating a Thermostat object and displaying its status and temperature setting
        Thermostat thermostat = new Thermostat("12345", "ON", "20");
        thermostat.displayStatus();
    }
}
