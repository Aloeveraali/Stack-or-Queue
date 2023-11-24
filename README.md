Custom Data Structure Implementation in Java

This repository contains a Java implementation of a custom data structure, either a Stack or a Queue, based on a specified condition. The implementation ensures a maximum capacity of 100 elements for the data structure.

Overview
CustomStack: A stack implementation with a maximum capacity of 100 elements. It supports basic operations like push, pop, and peek.

CustomQueue: A queue implementation with a maximum capacity of 100 elements. It supports basic operations like enqueue, dequeue, and peek.

Condition for Selection
The type of data structure (Stack or Queue) is determined by a condition involving the first letters of the user's first name and surname. If the first letter of the first name comes earlier in the alphabet than the first letter of the surname, the program uses the Stack; otherwise, it uses the Queue.

File Processing
The program reads a set of commands from either Stack.txt or Queue.txt and processes them accordingly. If an attempt is made to insert into a full data structure, the operation is ignored.

Usage
To run the program, replace the firstName and surname variables in the main class with the first letters of your first name and surname, respectively.
