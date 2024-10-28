# D.B.M.S-CSC-335
Database management system by Javier &amp; Alden, for our Software Engineering class

Simple DBMS System
Overview
This project implements a simple Database Management System (DBMS) in Java, designed to manage records stored in a CSV file. The system allows users to connect to a file, add, update, select, and delete records, and ensures proper handling of data through a structured approach using classes.

Features
Field Management: The Field class encapsulates data fields with name-value pairs, providing methods to get and set these values.
Database Operations: The Database class provides a framework for displaying, adding, updating, selecting, and deleting records from the database.
File Handling: The DBMS class manages the connection to a text file (Database.txt) and a CSV file (Database.csv), allowing for persistent storage of records.
Error Handling: Utilizes try-catch blocks to gracefully handle exceptions during file operations and ensure resources are properly released.
Class Structure
Field: Represents a single data entry with a name and value. It includes methods for adding records to a CSV file.
Database: Contains methods for managing records, including displaying, adding, and updating.
DBMS: Handles file connections and provides the necessary methods to interact with the data stored in files.
Usage
Connect to Database: Call the Connect() method in the DBMS class to establish a connection to the database file.
User Input: Prompt the user for input to add or manipulate records.
Perform Operations: Use methods in the Database and Field classes to manage records as needed.
Disconnect: Call the Disconnect() method to safely close the connection to the file.
Getting Started
To run this project:

Clone the repository.
Open the project in your favorite Java IDE (like IntelliJ IDEA).
Compile and run the main class.
Follow prompts to interact with the DBMS system.
Requirements
Java Development Kit (JDK) 8 or higher
