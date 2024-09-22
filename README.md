Design Patterns in JAVA
This project showcases the implementation of various Design Patterns using Java. The patterns are organized across three main files, each illustrating different categories of design patterns: Creational, Structural, and Behavioral.

Implemented Patterns:
1. Singleton and Factory Patterns (Main.java)
Singleton Pattern: Guarantees that only one instance of the ScheduleManager is instantiated, serving the purpose of task management.
Factory Pattern: The TaskFactory generates tasks dynamically based on their priority levels (High, Low).
2. Observer and Command Patterns (MainCommandObserver.java)
Observer Pattern: Alerts users (observers) whenever tasks are added or removed from the system.
Command Pattern: Encapsulates operations related to tasks (addition, removal) into command objects that can be executed as needed.
3. Adapter and Decorator Patterns (MainAdapterDecorator.java)
Adapter Pattern: Facilitates the import of tasks from various formats (CSV and JSON) without altering the core functionality of the system.
Decorator Pattern: Dynamically enhances tasks with additional features (e.g., deadlines) without modifying their original structure.

How to Execute the Project:
1. Compile the Code
Navigate to the project's root directory and execute the following command to compile all the .java files:- "javac *.java"
