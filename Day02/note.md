# 📘 Java Data Types and Literals – Notes from Code

## 🧱 1. Primitive Data Types

Java has 8 primitive data types. These are the most basic types of data and are not objects.

```java
int num1 = 2147483647;
byte num2 = 127;
short num3 = 32767;
long num4 = 9223372036854775807l;
float num5 = 3.14f;
double num6 = 3.141592653589793;
char letter = 'A';
boolean isTrue = true;
```

### 🔸 Explanation:

- `int`: 32-bit signed integer. Max: `2,147,483,647`
- `byte`: 8-bit signed integer. Range: `-128 to 127`
- `short`: 16-bit signed integer. Max: `32,767`
- `long`: 64-bit signed integer. Use `l` or `L` at the end
- `float`: 32-bit floating point. Use `f` or `F` at the end
- `double`: 64-bit floating point. Default for decimals
- `char`: Single 16-bit Unicode character (e.g., `'A'`)
- `boolean`: Holds `true` or `false`

**🖨️ Output examples:**
```
This is an integer: 2147483647
This is a byte: 127
This is a short: 32767
This is a long: 9223372036854775807
This is a float: 3.14
This is a double: 3.141592653589793
This is a character: A
This is a boolean: true
```

---

## 💡 2. Literals in Java

Literals are fixed values assigned to variables.

```java
int binary = 0b1010;        // Binary literal
int octal = 012;            // Octal literal
int hex = 0xA;              // Hexadecimal literal
int underScore = 1_000_000; // Underscore in numeric literals
double exp = 34e2;          // Exponential notation
```

### 🔸 Explanation:

- `0b1010`: Binary representation (10 in decimal)
- `012`: Octal (base 8) representation (10 in decimal)
- `0xA`: Hexadecimal (base 16) (10 in decimal)
- `1_000_000`: Improves readability (equivalent to 1000000)
- `34e2`: Scientific notation, means `34 × 10² = 3400.0`

**🖨️ Output examples:**
```
Binary literal: 10
Octal literal: 10
Hexadecimal literal: 10
Underscore in numeric literals: 1000000
Exponential notation: 3400.0
```

---

## 🔤 3. Character Literals and Operations

```java
char c = 'A';
c++; // Increments the character
```

### 🔸 Explanation:

- Characters in Java are actually numeric Unicode values.
- `'A'` has Unicode value 65, so `c++` results in `'B'` (66)

**🖨️ Output examples:**
```
Character before increment: A
Character after increment: B
```

---

## 🧵 4. String Literals

```java
String str1 = "Hello, World!";
String str2 = "Java Programming";
```

### 🔸 Explanation:

- String literals are sequences of characters enclosed in double quotes (`""`)
- Strings in Java are objects of class `String`

**🖨️ Output examples:**
```
String literal 1: Hello, World!
String literal 2: Java Programming
```

---

## 🔠 5. Escape Sequences

```java
String escapeSeq = "This is a string with an escape sequence: \nNew line here.\tTab here.";
```

### 🔸 Common Escape Characters:

- `\n`: New line
- `\t`: Tab
- `\\`: Backslash
- `\"`: Double quote

**🖨️ Output example:**
```
This is a string with an escape sequence: 
New line here.	Tab here.
```

---

## ➕ 6. String Concatenation

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + " " + lastName;
```

### 🔸 Explanation:

- Use `+` to concatenate (join) strings
- Automatically adds the space between first and last names

**🖨️ Output (if printed):**
```
John Doe
```

---

## ✅ Summary

| Data Type | Size     | Example Value             | Notes                      |
|-----------|----------|---------------------------|----------------------------|
| `int`     | 32-bit   | 2147483647                | Whole numbers              |
| `byte`    | 8-bit    | 127                       | Small-range integer        |
| `short`   | 16-bit   | 32767                     | Medium-range integer       |
| `long`    | 64-bit   | 9223372036854775807L      | Large numbers              |
| `float`   | 32-bit   | 3.14f                     | Decimal with `f` suffix    |
| `double`  | 64-bit   | 3.141592653589793         | High-precision decimals    |
| `char`    | 16-bit   | 'A'                       | Single characters          |
| `boolean` | 1-bit    | true / false              | Logical values             |

---

**✨ Bonus Tip:** Java is statically typed, so every variable must be declared with a type before use. Mastering the data types is the first step toward understanding Java's power and precision.
