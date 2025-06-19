# Multi-Threaded Banking Application

This is a simple Java-based multithreaded banking simulation. It models the interactions between a client, server, and network to process bank account transactions concurrently.

## Components

- **Accounts.java**: Represents individual bank accounts with synchronization for thread-safe access.
- **Client.java**: Sends and receives transactions through the network.
- **Server.java**: Processes transactions from the network input buffer and updates account balances.
- **Network.java**: Simulates a network with input and output buffers.
- **Transactions.java**: Holds transaction data such as account number and transaction type.
- **Driver.java**: Main driver file to start the network, client, and server threads.

## Requirements

- Java Development Kit (JDK) 8 or higher

## How to Run

1. Compile all Java files:

   ```bash
   javac *.java
   ```

2. Run the application:
   ```bash
   java Driver
   ```

## Features

- Multi-threaded execution using Java `Thread` class and Java Semaphores
- Synchronized access to shared resources
- Client-server architecture via simulated network buffers

## License

This project is for educational purposes.
