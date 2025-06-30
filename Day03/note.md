## ➕ 1. Arithmetic Operations

### ✅ Operators:
- `+` Addition
- `-` Subtraction
- `*` Multiplication
- `/` Division
- `%` Modulus

### 🧪 Example:
```java
int a = 10;
int b = 3;

System.out.println("Addition: " + (a + b));
System.out.println("Subtraction: " + (a - b));
System.out.println("Multiplication: " + (a * b));
System.out.println("Division: " + (a / b));
System.out.println("Modulus: " + (a % b));
```
📌 Output:
```
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Modulus: 1
```

---

## 🔁 2. Post and Pre Increment

### 🧪 Example:
```java
int x = 5;

System.out.println("Original x: " + x);
System.out.println("Post-increment x++: " + (x++)); // 5, then x becomes 6
System.out.println("After post-increment x: " + x);  // 6
System.out.println("Pre-increment ++x: " + (++x));   // 7
```
📌 Output:
```
Original x: 5
Post-increment x++: 5
After post-increment x: 6
Pre-increment ++x: 7
```

---

## 🔍 3. Logical Operators with Numbers

### ✅ Operators:
- `&&` AND
- `||` OR
- `!` NOT

### 🧪 Example:
```java
int num1 = 8;
int num2 = 12;

System.out.println((num1 > 5) && (num2 < 15)); // true && true → true
System.out.println((num1 < 5) && (num2 < 15)); // false && true → false
System.out.println((num1 > 5) || (num2 > 20)); // true || false → true
System.out.println((num1 < 5) || (num2 > 20)); // false || false → false

boolean isEven = (num1 % 2 == 0);
System.out.println("num1 is even: " + isEven);
System.out.println("NOT isEven: " + (!isEven));
```
📌 Output:
```
true
false
true
false
num1 is even: true
NOT isEven: false
```

---

## 🔀 4. Conditional Statements (if-else)

### 🧪 Example:
```java
int num = 85;

if (num >= 90) {
    System.out.println("Grade: A");
} else if (num >= 75) {
    System.out.println("Grade: B");
} else if (num >= 60) {
    System.out.println("Grade: C");
} else {
    System.out.println("Grade: D");
}
```
📌 Output:
```
Grade: B
```

---

## ❔ 5. Ternary Operator

### ✅ Syntax:
```java
(condition) ? true_value : false_value;
```

### 🧪 Example:
```java
int marks = 85;
String result = (marks >= 33) ? "Pass" : "Fail";
System.out.println("Result: " + result);
```
📌 Output:
```
Result: Pass
```

---

## 🧭 6. Switch Statement (Traditional)

### 🧪 Example:
```java
int day = 3;

switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    case 4: System.out.println("Thursday"); break;
    case 5: System.out.println("Friday"); break;
    default: System.out.println("Weekend or Invalid");
}
```
📌 Output:
```
Wednesday
```

---

## 🆕 7. Enhanced Switch (Java 14+)

### 🧪 Example:
```java
String dayName = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6, 7 -> "Weekend";
    default -> "Invalid";
};
System.out.println("Day: " + dayName);
```
📌 Output:
```
Day: Wednesday
```

---

## 🔄 8. Loops

### 🧪 While Loop:
```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```
📌 Output: 1 to 5

### 🧪 Do-While Loop:
```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```
📌 Output: 1 to 5

### 🧪 Do-While with False Condition:
```java
int i = 10;
do {
    System.out.println("i is " + i);
    i++;
} while (i < 5);
```
📌 Output: `i is 10`

### 🧪 For Loop:
```java
for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```
📌 Output: 0 to 10

---

## ✅ Summary

| Concept            | Use Case                                       |
|--------------------|------------------------------------------------|
| Arithmetic         | Basic math operations                          |
| Logical Operators  | Decision making with conditions                |
| if-else            | Execute code blocks based on conditions        |
| Ternary            | One-line decision making                       |
| switch             | Multi-way branching for exact matches          |
| Enhanced switch    | Cleaner syntax with return values              |
| while loop         | Repeat while condition is true (pre-check)     |
| do-while loop      | Always runs once (post-check)                  |
| for loop           | Counted loop with clear control                |

---
