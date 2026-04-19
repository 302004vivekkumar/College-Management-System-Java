🎓 College Management System
A professional, high-performance desktop application for managing student records, built with Java 21 and Maven. This project moves beyond standard student assignments by implementing industrial-standard UI design, automated testing, and secure database handling.

🚀 Key Features
Modern UI: Integrated FlatLaf (Laf) for a clean, professional dark/light theme that bypasses the dated Java Swing look.

Full CRUD Operations: Seamlessly Add, Search, Update, and Delete student records from a MySQL database.

Automated QA: Implemented AssertJ Swing for automated GUI testing. Includes a "robot-driven" test suite that verifies navigation and component visibility.

Secure Architecture: Credentials are managed via an external .properties file (excluded from version control) to ensure security best practices.

Portable Executable: Packaged as a standalone .exe using Launch4j for easy distribution on Windows systems.

🛠️ Tech Stack
Language: Java 21 (JDK 21)

Build Tool: Maven

UI Library: FlatLaf

Database: MySQL

Testing: JUnit 4 & AssertJ Swing

Packaging: Launch4j

📂 Project Structure
Plaintext
College-App/
├── src/main/java/      # Source code (MVC-inspired architecture)
├── src/test/java/      # Automated GUI test scripts
├── target/             # Compiled binaries and Fat JAR
├── db.properties       # Local database credentials (SECURE)
└── pom.xml             # Maven dependencies & build config
⚙️ Setup & Installation
Clone the repo:

Bash
git clone https://github.com/302004vivekkumar/College-Management-System-Java.git
Database Setup:

Import the provided SQL schema into your MySQL instance.

Create a db.properties file in the root directory.

Add your credentials:

Properties
db.url=jdbc:mysql://localhost:3306/your_db_name
db.user=your_username
db.password=your_password
Build and Run:

Using NetBeans: Right-click > Clean and Build, then Run.

Using Command Line: mvn clean install then java -jar target/College-App-1.0-SNAPSHOT-jar-with-dependencies.jar

🧪 Testing
Run the automated tests using:

Bash
mvn test
Note: A GUI environment is required as the AssertJ Robot will physically interact with the application windows.
