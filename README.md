# 🥪 Legendary Deli Sandos

A Java console-based deli ordering application that allows customers to build fully customizable sandwiches, add drinks and chips, calculate pricing, and generate receipts.

---

## 📖 Project Overview

Legendary Deli Sandos simulates a real-world deli ordering experience through an interactive command-line interface.

Customers can:

- Create custom sandwiches
- Select bread types and sandwich sizes
- Add premium meats and cheeses
- Add toppings and sauces
- Add drinks and chips
- Review their order
- Generate and save itemized receipts

The application was built using Object-Oriented Programming principles and demonstrates the use of interfaces, composition, collections, streams, and file handling.

---

## ✨ Features

### 🥪 Sandwich Builder

Build fully customizable sandwiches:

#### Bread Options
- White
- Wheat
- Gluten-Free
- Lettuce Wrap

#### Sizes
- 4"
- 8"
- 12"

#### Meats
- Steak
- Ham
- Salami
- Roast Beef
- Chicken
- Bacon

#### Cheeses
- American
- Provolone
- Cheddar
- Swiss

#### Toppings
- Lettuce
- Peppers
- Onions
- Tomato
- Jalapeños
- Cucumbers
- Pickles

#### Sauces
- Mayo
- Mustard
- Ketchup
- Ranch
- Honey Butter

#### Additional Options
- Toasted or Untoasted
- Extra Meat
- Extra Cheese

---

### 🥤 Drinks

Customers can add drinks in multiple sizes.

Available drinks:

- Coke
- Sprite
- Fanta
- Jarritos
- Hi-C Orange

---

### 🍟 Chips

Available chip selections:

- Kettle Jalapeño
- BBQ
- Ruffles Hot BBQ
- Funyuns
- Hot Fries

---

## 💰 Pricing

### Sandwich Base Prices

| Size | Price |
|--------|--------|
| 4" | $5.50 |
| 8" | $7.00 |
| 12" | $8.50 |

### Premium Meat Pricing

| Size | Meat | Extra Meat |
|--------|--------|--------|
| 4" | $1.00 | +$0.50 |
| 8" | $2.00 | +$1.00 |
| 12" | $3.00 | +$1.50 |

### Premium Cheese Pricing

| Size | Cheese | Extra Cheese |
|--------|--------|--------|
| 4" | $1.00 | +$0.30 |
| 8" | $2.00 | +$0.60 |
| 12" | $3.00 | +$0.90 |

Regular toppings and sauces are included at no additional charge.

---

## 🏗 Object-Oriented Design

### Core Classes

### UserInterface
Handles:
- Menu navigation
- User input
- Order creation
- Checkout flow

### Order
Responsible for:
- Storing all menu items
- Calculating totals
- Building receipt output

### Sandwich
Responsible for:
- Ingredient management
- Price calculation
- Sandwich customization

### ReceiptWriter
Responsible for:
- Saving receipts to files

### IMenuItem Interface

Implemented by menu items such as:
- Sandwich
- Drink
- Chip

This allows the application to store all order items inside a single collection and calculate totals polymorphically.

---

## 🛠 Technologies Used

- Java
- IntelliJ IDEA
- Object-Oriented Programming
- Interfaces
- ArrayLists
- Streams API
- File I/O
- StringBuilder
- LocalDateTime

---

## 📂 Project Structure

```text
src
│
├── models
│   ├── Sandwich.java
│   ├── Order.java
│   ├── Meat.java
│   ├── Cheese.java
│   ├── Topping.java
│   ├── Sauce.java
│   ├── Drink.java
│   ├── Chip.java
│   └── IMenuItem.java
│
├── ui
│   └── UserInterface.java
│
├── util
│   └── ReceiptWriter.java
│
└── Main.java
```

---

## 🚀 How to Run

### Clone the Repository

```bash
git clone https://github.com/larryle7680/legendary-deli-sandos.git
```

### Open in IntelliJ IDEA

1. Open IntelliJ IDEA
2. Select Open Project
3. Choose the cloned repository

### Run

Run:

```java
Main.java
```

---

## 🧾 Example Order Flow

```text
Home Screen
│
├── New Order
│
├── Create Sandwich
│   ├── Choose Bread
│   ├── Choose Size
│   ├── Toast Option
│   ├── Add Meats
│   ├── Add Cheese
│   ├── Add Toppings
│   └── Add Sauces
│
├── Add Drink
│
├── Add Chips
│
└── Checkout
    ├── Review Order
    ├── Calculate Total
    └── Save Receipt
```

---

## 📚 Concepts Demonstrated

- Encapsulation
- Composition
- Interfaces
- Polymorphism
- Collections
- Streams
- File Writing
- User Input Validation
- Separation of Concerns

---

## 🔮 Future Enhancements

- JavaFX GUI version
- Customer accounts
- Database integration
- Inventory tracking
- Unit testing with JUnit
- Order history
- Online ordering system
- Promotional discounts

---

## 👨‍💻 Author

Larry Le

GitHub:
https://github.com/larryle7680

---

Built as part of my Java Software Development learning journey.
