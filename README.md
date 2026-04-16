# Shared ATM - Operating Systems Assignment

## Description

This project demonstrates the concept of **Race Condition** and **Synchronization** using Java threads.

We simulate a shared bank account with an initial balance of **$1000**, where two threads attempt to withdraw **$10 simultaneously 100 times each**.

---

## Problem (Unsynchronized)

When multiple threads access shared data without synchronization, it may lead to inconsistent results.

* Class: `UnsyncTest.java`
* Expected: Final balance = 0
* Actual: Final balance ≠ 0 (due to race condition)

---

## Solution (Synchronized)

Using synchronization ensures that only one thread accesses the critical section at a time.

* Class: `SyncTest.java`
* Method used: `synchronized`
* Result: Final balance = 0 ✔️

---

## Files

* `BankAccount.java` → Contains account logic
* `UnsyncTest.java` → Runs without synchronization
* `SyncTest.java` → Runs with synchronization

---

## How to Run

### Compile:

```bash
javac *.java
```

### Run Unsynchronized:

```bash
java UnsyncTest
```

### Run Synchronized:

```bash
java SyncTest
```

---

## Key Concept

The issue happens because:

```
balance = balance - amount;
```

is not atomic (not a single step), so threads may interfere with each other.

---

## Submission Notes

* No package declaration included
* All files are ready for submission
