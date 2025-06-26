# 🏨 Hotel Management System

A Java-based Hotel Management System desktop application designed to manage hotel rooms, bookings, customers, staff, and drivers through an interactive GUI built with Java Swing. It uses JDBC for database connectivity and supports both MySQL and SQLite.

---

## ✨ Features

- 🛏️ Room Management (Add, Edit, Delete)
- 🧾 Booking and Billing System
- 👥 Customer and Staff Management
- 🚗 Driver and Vehicle Management
- 📅 Integrated Date Pickers (via JCalendar)
- 🖥️ Graphical User Interface using Java Swing
- 🗄️ MySQL/SQLite Database Connectivity

---

## 🚀 How to Run

1. Ensure you have **Java JDK (v8 or higher)** installed
2. Open the project in **NetBeans**, **IntelliJ IDEA**, or any Java IDE
3. Add the required JAR files to your project’s classpath (see below)
4. Run the main class (e.g., `Hotel.java`, `Main.java`, etc.)
5. Make sure your database (MySQL or SQLite) is properly configured

---

## 📚 Required Libraries (JARs)

Ensure the following `.jar` files are added to your classpath:

| JAR File                   | Purpose                                           |
|---------------------------|---------------------------------------------------|
| `mysql-connector-j-9.3.0.jar` | JDBC driver for MySQL database connectivity    |
| `rs2xml.jar`              | Convert `ResultSet` to `TableModel` (for JTable) |
| `sqlitejdbc-v056.jar`     | JDBC driver for SQLite database connectivity     |

> 💡 Add these by:  
> **Right-click project → Properties → Libraries → Add JAR/Folder → Select these files**

---

## 🗃️ Folder Structure

