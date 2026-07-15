# Electricity Billing System

A Java Swing-based desktop application for managing electricity billing operations. This system allows users to calculate electricity bills based on units consumed and maintains customer records.

## 📋 Features

- **Customer Management**: Store customer details including name, meter number, and address
- **Bill Calculation**: Automatic bill calculation based on tiered pricing structure
- **Rate Slabs**:
  - 0-100 units: ₹5 per unit
  - 101-300 units: ₹7 per unit
  - Above 300 units: ₹10 per unit
- **GUI Interface**: User-friendly graphical interface built with Java Swing
- **Bill Storage**: Automatic saving of all bills to a text file for record-keeping
- **Bill Display**: Instant bill generation and display in a dialog box

## 🛠️ Technologies Used

- **Language**: Java
- **GUI Framework**: Java Swing
- **File Handling**: Java I/O (BufferedWriter, FileWriter)
- **IDE**: Any Java-supported IDE (Eclipse, IntelliJ IDEA, VS Code, etc.)

## 📦 Prerequisites

Before running this project, ensure you have:

- **Java Development Kit (JDK)** 8 or higher installed
- Command Prompt or Terminal access

### Check Java Installation:
```cmd
java -version
javac -version
```

If not installed, download JDK from:
- [Oracle JDK](https://www.oracle.com/java/technologies/downloads/)
- [OpenJDK](https://adoptium.net/)

## 🚀 How to Run the Project

### Method 1: Using Command Prompt (Windows)

1. **Navigate to project directory:**
   ```cmd
   cd C:\Users\dell\Downloads\Electricity-Billing-System
   ```

2. **Compile the Java file:**
   ```cmd
   javac Main.java
   ```

3. **Run the application:**
   ```cmd
   java Main
   ```

### Method 2: One-Line Command
```cmd
javac Main.java & java Main
```

### Method 3: Using an IDE
1. Open the project in your IDE (Eclipse, IntelliJ IDEA, VS Code)
2. Right-click on `Main.java`
3. Select "Run Java" or "Run Main"

## 📖 How to Use

1. **Launch the application** - A GUI window will appear
2. **Enter customer details:**
   - Customer Name
   - Meter Number
   - Address
   - Units Consumed
3. **Click "Calculate Bill"** - The system will:
   - Calculate the total bill based on consumption
   - Display the bill in a popup dialog
   - Save the bill details to `electricity_bills.txt`
4. **View saved bills** - Check `electricity_bills.txt` in the project folder

## 📸 Screenshots

- `Data 1.png` - Application interface
- `Screenshot 2025-07-22 111709.png` - Sample output

## 📂 Project Structure

```
Electricity-Billing-System/
│
├── Main.java                          # Main application file
├── README.md                          # Project documentation
├── LICENSE                            # License file
├── Data 1.png                         # Screenshot 1
├── Screenshot 2025-07-22 111709.png  # Screenshot 2
└── electricity_bills.txt              # Generated bills (created at runtime)
```

## 🔧 Project Components

### Classes:

1. **Main Class**
   - Entry point of the application
   - Creates and manages the GUI
   - Handles user interactions

2. **Customer Class**
   - Stores customer information
   - Attributes: name, meterNumber, address

3. **Bill Class**
   - Calculates electricity bills
   - Manages rate slabs
   - Saves bills to file

## 💡 Future Enhancements

- Database integration for persistent storage
- User authentication system
- Payment tracking and history
- PDF bill generation
- Advanced reporting and analytics
- Email bill notifications
- Multi-language support

## 📄 License

This project is licensed under the terms specified in the LICENSE file.

## 👨‍💻 Author

**SAMPATHI YASWANTH**

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

## ⭐ Show Your Support

Give a ⭐ if you like this project!

---

**Note**: This is an educational project demonstrating Java Swing GUI development and basic file handling operations.