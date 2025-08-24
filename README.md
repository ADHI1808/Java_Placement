arithmetic progression formula-- a+(num-1)*d
sum of number till 1 digit-- 1+(-1)%9


# arraylist functions
add()	Add element,
get()	Retrieve element,
set()	Update element,
remove()	Remove by index/value.
size()	Count elements,
contains()	Check existence,
isEmpty()	Check if empty.
clear()	Remove all,
indexOf()	First occurrence indexl
lastIndexOf()	Last occurrence index,
toArray()	Convert to array.


# Notes  
### String

### 1. **`equals(Object obj)`**
   - **Description**: Compares two strings for equality. Returns `true` if the strings are equal, `false` otherwise.
   - **Use Case**: Used to compare two string values.
   - **Example**: `str1.equals(str2)`

### 2. **`equalsIgnoreCase(String anotherString)`**
   - **Description**: Compares two strings, ignoring case considerations.
   - **Use Case**: Useful when you need to compare two strings without considering case sensitivity.
   - **Example**: `str1.equalsIgnoreCase(str2)`

### 3. **`compareTo(String anotherString)`**
   - **Description**: Compares two strings lexicographically. Returns a negative integer, zero, or a positive integer depending on whether the string is lexicographically less than, equal to, or greater than the specified string.
   - **Use Case**: Used to compare two strings in a specific order (e.g., alphabetical).
   - **Example**: `str1.compareTo(str2)`

### 4. **`compareToIgnoreCase(String anotherString)`**
   - **Description**: Compares two strings lexicographically, ignoring case differences.
   - **Use Case**: Useful when you need to compare strings without case sensitivity.
   - **Example**: `str1.compareToIgnoreCase(str2)`

### 5. **`startsWith(String prefix)`**
   - **Description**: Tests whether the string starts with the specified prefix.
   - **Use Case**: Used to check if a string starts with a certain substring.
   - **Example**: `str.startsWith("Hello")`

### 6. **`endsWith(String suffix)`**
   - **Description**: Tests whether the string ends with the specified suffix.
   - **Use Case**: Used to check if a string ends with a certain substring.
   - **Example**: `str.endsWith("World")`

### 7. **`contains(CharSequence sequence)`**
   - **Description**: Returns `true` if the string contains the specified sequence of characters.
   - **Use Case**: Useful to check if a string contains a certain substring.
   - **Example**: `str.contains("example")`

### 8. **`indexOf(String str)`**
   - **Description**: Returns the index of the first occurrence of the specified substring, or `-1` if the substring is not found.
   - **Use Case**: Used to find the position of a substring within a string.
   - **Example**: `str.indexOf("substring")`

### 9. **`lastIndexOf(String str)`**
   - **Description**: Returns the index of the last occurrence of the specified substring.
   - **Use Case**: Used when you want to find the last occurrence of a substring in the string.
   - **Example**: `str.lastIndexOf("substring")`

### 10. **`substring(int beginIndex)`**
   - **Description**: Returns a new string that is a substring starting from the specified index to the end of the string.
   - **Use Case**: Useful for extracting a portion of the string.
   - **Example**: `str.substring(3)`

### 11. **`substring(int beginIndex, int endIndex)`**
   - **Description**: Returns a new string that is a substring from the specified `beginIndex` to `endIndex` (excluding `endIndex`).
   - **Use Case**: Useful for extracting a specific range of characters from a string.
   - **Example**: `str.substring(2, 5)`

### 12. **`replace(char oldChar, char newChar)`**
   - **Description**: Replaces all occurrences of the specified character with a new character.
   - **Use Case**: Useful for replacing characters in a string.
   - **Example**: `str.replace('a', 'b')`

### 13. **`replaceAll(String regex, String replacement)`**
   - **Description**: Replaces each substring of the string that matches the given regular expression with the specified replacement.
   - **Use Case**: Used for replacing substrings using regular expressions.
   - **Example**: `str.replaceAll("abc", "123")`

### 14. **`replaceFirst(String regex, String replacement)`**
   - **Description**: Replaces the first substring that matches the given regular expression with the specified replacement.
   - **Use Case**: Used to replace only the first match of a regular expression.
   - **Example**: `str.replaceFirst("abc", "123")`

### 15. **`trim()`**
   - **Description**: Removes leading and trailing whitespace from the string.
   - **Use Case**: Useful for cleaning up input data where spaces at the beginning or end are unnecessary.
   - **Example**: `str.trim()`

### 16. **`toLowerCase()`**
   - **Description**: Converts the entire string to lowercase.
   - **Use Case**: Used to convert a string to lowercase, often for case-insensitive comparisons.
   - **Example**: `str.toLowerCase()`

### 17. **`toUpperCase()`**
   - **Description**: Converts the entire string to uppercase.
   - **Use Case**: Used to convert a string to uppercase, often for case-insensitive comparisons.
   - **Example**: `str.toUpperCase()`

### 18. **`split(String regex)`**
   - **Description**: Splits the string into an array of substrings based on the given regular expression.
   - **Use Case**: Used to divide a string into parts (for example, splitting a sentence into words).
   - **Example**: `str.split(" ")`

### 19. **`isEmpty()`**
   - **Description**: Returns `true` if the string is empty (i.e., has a length of 0), otherwise returns `false`.
   - **Use Case**: Useful for checking if a string has no content.
   - **Example**: `str.isEmpty()`

### 20. **`length()`**
   - **Description**: Returns the length of the string (i.e., the number of characters in the string).
   - **Use Case**: Used to determine how many characters are in a string.
   - **Example**: `str.length()`

### 21. **`valueOf(Object obj)`**
   - **Description**: Returns the string representation of the specified object.
   - **Use Case**: Converts any object into its string representation (useful for logging or printing).
   - **Example**: `String.valueOf(123)` // Converts integer 123 to "123".

---
## Array Operations  
1. Arrays are mutable, meaning their elements can be modified.  
2. Use a `for` loop to add (push) or remove (pull) elements as needed.  

---  
