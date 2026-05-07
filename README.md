# 📈 TASK 2: Stock Trading Platform (Java OOP Project)

## 📌 Project Overview

This project is a **Stock Trading Simulation Platform** developed using **Java and Object-Oriented Programming (OOP)** concepts.  
It simulates a real-world trading environment where users can **buy/sell stocks, view market data, and track portfolio performance**.

The main goal is to understand **OOP design, transaction handling, and data management systems** in Java.

---

## 🚀 Features

### 📊 Market Data Display
- Show list of available stocks
- Display stock name, price, and symbol
- Simulated real-time price updates (optional)

---

### 💰 Buy / Sell Operations
- Buy stocks using available balance
- Sell owned stocks to gain profit/loss
- Validate sufficient balance and holdings
- Transaction history tracking

---

### 👤 User Portfolio Management
- Track owned stocks
- Show quantity of each stock
- Calculate total portfolio value
- Monitor profit or loss over time

---

### 📜 Transaction System
- Record every buy/sell action
- Store transaction type, stock, quantity, and price
- Maintain history log

---

## 🧠 OOP Concepts Used

### 🏗️ Classes
- `Stock` → Represents individual stock details
- `User` → Stores user balance and portfolio
- `Portfolio` → Manages owned stocks
- `Transaction` → Tracks buy/sell history
- `Market` → Handles stock listings and prices

---

### 🔄 Core OOP Principles
- **Encapsulation** → Data hiding using private variables
- **Abstraction** → Simplified stock operations
- **Inheritance (optional)** → Extend user types
- **Polymorphism (optional)** → Different transaction behaviors

---

## 🗃️ File Structure

```

StockTradingPlatform/
│
├── Main.java              # Entry point
├── Stock.java             # Stock model
├── User.java              # User details & balance
├── Portfolio.java         # Portfolio management
├── Transaction.java       # Buy/Sell history
├── Market.java            # Stock market simulation
│
├── /data                  # Optional file storage
│     portfolio.txt
│     transactions.txt
│
└── README.md              # Documentation

```id="trd8q1"

---

## ⚙️ How It Works

### 📊 Step 1: Market Initialization
- Stocks are created with:
  - Name
  - Symbol
  - Price

---

### 💰 Step 2: Buy Stocks
- User selects stock
- Enters quantity
- System checks balance
- Stock is added to portfolio

---

### 📉 Step 3: Sell Stocks
- User selects owned stock
- System checks availability
- Calculates profit/loss
- Updates balance

---

### 📈 Step 4: Portfolio Tracking
- Shows:
  - Total investment
  - Current value
  - Profit / Loss

---

### 📜 Step 5: Transaction History
- Stores all buy/sell records
- Displays full activity log

---

## 💡 Key Concepts Used

- Java OOP (Classes & Objects)
- Array / ArrayList
- Encapsulation & Data Hiding
- Conditional logic for trading rules
- Transaction processing system
- Console-based interaction

---

## 💾 Optional Enhancements (File I/O / Database)

### 📂 File Storage
- Save portfolio data to `.txt` files
- Load previous session data

### 🗄️ Database Integration
- Use MySQL / SQLite
- Store users, stocks, and transactions

---

## 🎨 UI/UX Improvements (Optional GUI)

If using Java Swing/JavaFX:
- Dashboard-style interface
- Stock list table view
- Buy/Sell buttons
- Portfolio graph view

---

## 🔮 Future Enhancements

### ⚡ Advanced Features
- Live stock price simulation
- Stock charts (graph visualization)
- Market news feed integration
- Multi-user trading system

---

### 🧠 Smart Features
- AI-based stock suggestions
- Risk analysis system
- Auto trading bot simulation

---

### 📱 UI Upgrades
- Dark mode trading dashboard
- Animated stock price updates
- Mobile-friendly JavaFX UI

---
