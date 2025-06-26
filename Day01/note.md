# 📘 Java Class – Day 01 Notes

## ✅ Setup and Installation
- Installed **JDK (Java Development Kit)** – required to compile and run Java programs.
- Installed **VS Code** – a lightweight, beginner-friendly code editor.
- Explored **JShell** – a REPL (Read-Eval-Print Loop) tool for testing Java snippets without writing full programs.

## 🔍 How Java Code Runs
- Java source code is saved in `.java` files.
- It gets compiled by the **Java Compiler (javac)** into **bytecode** (`.class` files).
- The **JVM (Java Virtual Machine)** executes this bytecode.
- The **JRE (Java Runtime Environment)** includes the JVM and the standard libraries required to run Java applications.

## 🖥️ Java Program
```java
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("New line in Java");

        int num1 = 5;
        int num2 = 10;
        int sum = num1 + num2;

        System.out.println(sum); // Output: 15
    }
}
```

- `class Hello` defines a class named **Hello**.
- `public static void main(String[] args)` is the **entry point** of a Java application.
- `System.out.println()` prints text to the console with a newline.

---

## 🧠 Key Concepts Learned

### ☑️ Java is an Object-Oriented Programming Language
- Everything in Java revolves around **objects**.
- To create objects, you first define a **class**.
- A **class** is a blueprint for creating objects with properties and behaviors.

### ☑️ Printing Output
- Used `System.out.println()` to print messages.
- It prints the output and moves to the next line.

### ☑️ Variables and Data Types
- Learned how to **declare variables** and assign values.
- Used the `int` data type to store **whole numbers**.
- Performed **arithmetic operations** (like addition).

---

## 📝 Summary

- Java code needs to be **compiled to bytecode** before execution.
- **JVM + JRE** is essential for running Java programs.
- Java is **class-based** and **object-oriented**.
- Learned basic **syntax**, **printing**, and **variables**.