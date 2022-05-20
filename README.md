# DecimalToBinaryConverter
Converting a decimal number to its binary representation.

Create a simple program that can convert a decimal number to its binary representation. Implement an elegant solution using a Stack.
Print the binary representation back at the terminal.

Examples
--------

Input | Output
------|--------
10 | 1010|
1024 | 10000000000


•	If the given number is 0, just print 0.

•	Else, while the number is greater than zero, divide it by 2 and push the reminder into the stack.
 
•	When you are done dividing, pop all reminders from the stack, which is the binary representation.
