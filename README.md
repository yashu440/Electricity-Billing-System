# Electricity Billing System

This is a simple Java Swing application that calculates electricity bills based on the number of units consumed. It also stores customer details and saves the generated bills in a text file.

## Features

- Add customer name, meter number, address, and units consumed
- Calculate electricity bill automatically
- Display the bill in a popup window
- Save bill details in a text file
- Simple and easy-to-use interface

## Bill Rates

- 0 to 100 units - ₹5 per unit
- 101 to 300 units - ₹7 per unit
- Above 300 units - ₹10 per unit

## Technologies Used

- Java
- Java Swing
- Java File Handling

## Requirements

- Java JDK 8 or above

Check if Java is installed:

```bash
java -version
javac -version
```

## How to Run

Open Command Prompt and go to the project folder.

```bash
cd Electricity-Billing-System
```

Compile the program.

```bash
javac Main.java
```

Run the program.

```bash
java Main
```

You can also run it using any Java IDE like IntelliJ IDEA, Eclipse, or VS Code.

## How to Use

1. Open the application.
2. Enter the customer name.
3. Enter the meter number.
4. Enter the address.
5. Enter the units consumed.
6. Click **Calculate Bill**.
7. The bill will be displayed and saved in `electricity_bills.txt`.

## Project Structure

```
Electricity-Billing-System/

Main.java
README.md
LICENSE
Data 1.png
Screenshot 2025-07-22 111709.png
electricity_bills.txt
```

## Future Improvements

- Store customer details in a database
- Generate PDF bills
- Add payment history
- Improve the user interface

## Author

SAMPATHI YASWANTH

## License

This project is for learning purposes.
