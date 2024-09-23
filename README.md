# Design Patterns in Java

This project demonstrates the implementation of six different design patterns in Java. Each design pattern is separated into its own class files for better readability and adherence to best practices.

## Patterns Implemented

### Behavioral Patterns
1. **Observer Pattern** (`ObserverPattern.java`):
   - Demonstrates the publish-subscribe model where observers are notified when the subject's state changes.

2. **Strategy Pattern** (`StrategyPattern.java`):
   - Allows selecting an algorithm at runtime via strategy objects.

### Creational Patterns
1. **Singleton Pattern** (`SingletonPattern.java`):
   - Ensures that only one instance of a class is created throughout the program. Used here to manage configuration settings.

2. **Factory Pattern** (`FactoryPattern.java`):
   - Demonstrates object creation based on the type, without explicitly using `new`.

### Structural Patterns
1. **Adapter Pattern** (`AdapterPattern.java`):
   - Adapts an old interface (LegacyPaymentSystem) to the new one (NewPaymentGateway).

2. **Composite Pattern** (`CompositePattern.java`):
   - Treats individual objects (Circle, Rectangle) and compositions of objects uniformly using a composite class.

## How to Run

1. Clone or download the project.
2. Each pattern is encapsulated in its respective class files. You can run each pattern by compiling and executing the main class in each file.

### Example:
To run the **Observer Pattern**, execute:
```bash
javac ObserverPattern.java
java ObserverPattern
