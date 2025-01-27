# Java Grade Sorter

A Java program demonstrating the use of arrays, random number generation, sorting, and reversing with three distinct problems. Each problem addresses a specific array operation and outputs relevant results.

## Features

### Problem 1: Grades Array
- Generates an array of 30 random grades (0-100).
- Calculates the class average, minimum, and maximum grades.
- Displays grade distribution by letter grades (e.g., A, B, C).

### Problem 2: Sorting Random Numbers
- Generates an array of 10 random integers (0-10).
- Implements sorting functionality to arrange the array in ascending order.

### Problem 3: Reversing an Array
- Generates an array of 6 random numbers (0-10).
- Reverses the order of elements in the array.

## How to Use

### Prerequisites

- Java Development Kit (JDK) installed.
- Java IDE or text editor for code editing and execution.

### Running the Program

1. Clone the repository or download the `Hw5.java` file.
2. Compile the program:
   ```bash
   javac hw5/Hw5.java
   ```
3. Run the program:
   ```bash
   java hw5.Hw5
   ```
4. Observe the output for all three problems in the console.

## Code Structure

### Hw5.java
The main driver class containing:
- **Problem 1**:
  - Generates random grades and calculates average, min, and max grades.
  - Includes letter-grade distribution.
- **Problem 2**:
  - Generates a random array of integers and sorts it.
- **Problem 3**:
  - Reverses a randomly generated array of doubles.

### Helper Classes
1. **grades**:
   - Manages grade-related operations such as calculating average, finding min/max, and assigning letter grades.
2. **intSort**:
   - Handles sorting of integer arrays.
3. **swapElement**:
   - Reverses an array of doubles.

## Example Output

```
[76, 45, 89, 67, 90, 34, 55, 78, 88, 92, 81, 60, 71, 49, 82, 33, 40, 79, 50, 99, 94, 43, 61, 56, 47, 48, 54, 77, 83, 85]

Class average is 66.50
The min grade is:  33
The max grade is:  99
Grade distribution:
A: 3
B: 7
C: 10
D: 7
F: 3

The unsorted array is:
[3, 7, 5, 9, 2, 6, 4, 8, 0, 1]

The sorted array is:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

[5.0, 7.0, 3.0, 9.0, 2.0, 6.0]
[6.0, 2.0, 9.0, 3.0, 7.0, 5.0]
```

## Future Enhancements

- Add functionality for user input to customize array sizes and value ranges.
- Implement additional array operations like searching or multi-dimensional array processing.
- Include graphical representation of grade distribution.

## License

This project is open source and available under the [MIT License](LICENSE).

## Author

Ruben Ramirez
