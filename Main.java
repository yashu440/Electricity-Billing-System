import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Electricity Billing System");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text fields for input
        JTextField nameField = new JTextField(20);
        JTextField meterField = new JTextField(20);
        JTextField addressField = new JTextField(20);
        JTextField unitsField = new JTextField(20);

        // Labels for input
        JLabel nameLabel = new JLabel("Customer Name:");
        JLabel meterLabel = new JLabel("Meter Number:");
        JLabel addressLabel = new JLabel("Address:");
        JLabel unitsLabel = new JLabel("Units Consumed:");

        // Button to calculate and display the bill
        JButton calculateButton = new JButton("Calculate Bill");

        // Panel to hold components
        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(meterLabel);
        panel.add(meterField);
        panel.add(addressLabel);
        panel.add(addressField);
        panel.add(unitsLabel);
        panel.add(unitsField);
        panel.add(calculateButton);

        // Add panel to frame
        frame.add(panel);
        frame.setVisible(true);

        // Action listener for button
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get user input
                String name = nameField.getText();
                String meterNumber = meterField.getText();
                String address = addressField.getText();
                double unitsConsumed = Double.parseDouble(unitsField.getText());

                // Create customer and bill objects
                Customer customer = new Customer(name, meterNumber, address);
                Bill bill = new Bill(customer, unitsConsumed);

                // Display bill in a dialog
                JOptionPane.showMessageDialog(frame,
                        "Customer: " + name + "\n" +
                                "Meter Number: " + meterNumber + "\n" +
                                "Units Consumed: " + unitsConsumed + "\n" +
                                "Total Bill: " + bill.calculateTotalBill());

                // Save bill to file
                bill.saveBillToFile();
            }
        });
    }
}

class Customer {
    private String name;
    private String meterNumber;
    private String address;

    public Customer(String name, String meterNumber, String address) {
        this.name = name;
        this.meterNumber = meterNumber;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getMeterNumber() {
        return meterNumber;
    }

    public String getAddress() {
        return address;
    }
}

class Bill {
    private Customer customer;
    private double unitsConsumed;
    private double ratePerUnit;

    public Bill(Customer customer, double unitsConsumed) {
        this.customer = customer;
        this.unitsConsumed = unitsConsumed;
        this.ratePerUnit = calculateRate(unitsConsumed);
    }

    private double calculateRate(double units) {
        if (units <= 100) {
            return 5;  // Rate for first 100 units
        } else if (units <= 300) {
            return 7;  // Rate for next 200 units
        } else {
            return 10; // Rate for units above 300
        }
    }

    public double calculateTotalBill() {
        return unitsConsumed * ratePerUnit;
    }

    public void saveBillToFile() {
        String filename = "electricity_bills.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write("Customer Name: " + customer.getName() + "\n");
            writer.write("Meter Number: " + customer.getMeterNumber() + "\n");
            writer.write("Address: " + customer.getAddress() + "\n");
            writer.write("Units Consumed: " + unitsConsumed + "\n");
            writer.write("Total Bill: " + calculateTotalBill() + "\n");
            writer.write("----------------------------\n");
            System.out.println("Bill saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the bill.");
            e.printStackTrace();
        }
    }
}
