# 📦 Inventory Management System

## Course Information
- **Course Code:** SENG 232  
- **Course Title:** Data Structures  
- **Project Type:** Course Project  
- **Programming Language:** Java  

---

## 📖 Project Overview
This project implements an **Inventory Management System** using fundamental **data structures** concepts.  
The system efficiently manages inventory items by utilizing a **Hash Table** for fast access and **Linked Lists** to handle collisions through chaining.

A **console-based interface** is provided to allow users to interact with the system and perform inventory operations.

---

## 🎯 Project Objectives
- Demonstrate practical use of **Hash Tables**
- Apply **Linked Lists** for collision handling
- Implement **sorting and searching algorithms**
- Design a simple **console-based UI**
- Build a complete, testable system using data structures

---

## 🧱 System Architecture

### 1️⃣ Item
Represents an inventory item with the following attributes:
- SKU
- Name
- Category
- Price
- Quantity

---

### 2️⃣ Node
- Represents a single node in a linked list
- Stores an `Item` object
- Contains a reference to the next node

---

### 3️⃣ LinkedList
- Used inside each hash table bucket
- Handles collisions using **chaining**
- Supports:
  - Insert
  - Search
  - Delete
  - Display

---

### 4️⃣ HashTable
- Uses SKU as the key
- Stores items in buckets (array of LinkedLists)
- Provides:
  - Insert
  - Search
  - Delete
  - Update
  - Display all items

---

### 5️⃣ SortingSearching
- Extracts all items from the hash table
- Provides:
  - Sort by price
  - Sort by quantity
  - Search by name
  - Search by category
- Does not modify original data

---

### 6️⃣ InventoryManager
- Console-based user interface
- Allows the user to:
  - Add items
  - Update items
  - Delete items
  - Search items
  - Sort items
  - Display all items

---
This design ensures efficient access while handling collisions safely.

---

## 🗂 Project Structure

InventoryManagementSystem/
├── src/
│   ├── Item.java
│   ├── Node.java
│   ├── LinkedList.java
│   ├── HashTable.java
│   ├── SortingSearching.java
│   ├── InventoryManager.java
│   └── Main.java
│
├── docs/
│   ├── UML.png
│
│
│
├── Makefile
├── README.md
└── .gitignore

## ⏱ Time Complexity Analysis

The following table summarizes the average time complexity of the main operations in the system:

| Operation                  | Average Time Complexity |
|---------------------------|-------------------------|
| Insert Item               | O(1)                    |
| Search by SKU             | O(1)                    |
| Delete Item               | O(1)                    |
| Sort Items (Price/Qty)    | O(n log n)              |
| Search by Name / Category | O(n)                    |

**Notes:**
- Insert, search, and delete operations achieve **O(1)** average time due to the use of a hash table.
- Sorting operations run in **O(n log n)** time using comparison-based sorting.
- Searching by name or category requires scanning all items, resulting in **O(n)** time complexity.

## 👥 Team Members

- **Abdullah Almutairi** – Lead Developer  
  - System architecture design  
  - HashTable implementation  
  - Sorting & Searching integration  
  - System testing and integration  

- **Muteb Alrashdan** – Data Structures Engineer  
  - LinkedList and Node implementation  
  - Collision handling using chaining  

- **Meshari Alshuqeer** – UI Developer  
  - InventoryManager (console-based user interface)  
  - User interaction and menu system  

- **Ali Aljamil** – Documentation  
  - Project documentation  
  - README and report preparation  

