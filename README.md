# 🏦 HDFC Bank Console Application (Java)

A simple **console-based Bank simulation** built using **Java and Object-Oriented Programming (OOP)** concepts.
This project demonstrates basic banking operations such as creating a new account, checking balance, depositing money, and withdrawing money through a command-line interface.

---

## 📌 Features

* 👤 New customer account creation
* 🔐 Auto-generated random 4-digit PIN for each new account
* 💰 View current balance
* 💸 Withdraw money (with insufficient balance check)
* 💵 Deposit money (with max deposit limit of ₹10 Lakhs)
* 📟 Interactive console menu with loop
* ❌ Exit option

---

## 🛠 Technologies Used

* Java
* OOP Concepts
* Command Line Interface (CLI)

---

## 📂 Project Structure

```
HDFC-Bank-Console-Project
│
├── src
│   └── (default package)
│       ├── BANK.java
│       ├── bankoperatingInter.java
│       ├── BankOperatingImpl.java
│       └── MainClass.java
│
└── README.md
```

---

## 📖 Concepts Practiced

This project helped in practicing the following Java concepts:

* Classes and Objects
* Interfaces
* Encapsulation (Getters & Setters)
* Method Implementation
* Conditional Statements (`if-else`, `switch`)
* Loops (`while`)
* User Input Handling with `Scanner`
* Random PIN Generation using `Math.random()`

---

## ▶️ How to Run the Project

1. Clone the repository

```
git clone https://github.com/ashishthakur113/HDFC-Bank-Console-Project.git
```

2. Navigate to the project directory

```
cd HDFC-Bank-Console-Project
```

3. Compile the Java files

```
javac src/*.java
```

4. Run the program

```
java -cp src MainClass
```

---

## 🧾 How It Works

### New Customer (Option 1)
- Enter your **Name**, **Age**, and **Aadhar Card Number**
- A **unique 4-digit PIN** is automatically generated using `Math.random()`
- Account is created and details are displayed

### Login (Option 2)
- Opens the banking menu with 4 options:
  - **View Balance** – Displays current account balance
  - **Deposit Amount** – Adds money (max ₹10,00,000)
  - **Withdraw Amount** – Deducts money (checks for sufficient balance)
  - **Exit** – Closes the application

---

## 💡 Default Starting Balance

```
Balance : ₹10,000
```

---

## 🎯 Learning Purpose

This project was created as part of learning **Java OOP fundamentals** and building small console-based applications to strengthen programming logic.

---

## 🚀 Future Improvements

Possible upgrades for this project:

* PIN-based login authentication
* Multiple user accounts support
* Transaction history
* PIN retry limit with account lock
* File-based or database storage
* GUI version using Java Swing or JavaFX

---

## 👨‍💻 Author

**Ashish Thakur**
Learning Java and building projects to improve programming skills.

GitHub Profile:
https://github.com/ashishthakur113

---
