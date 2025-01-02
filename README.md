# Socket Communication Program

Demonstrates a basic client-server communication using sockets in Java. The server listens for incoming messages from a client, processes them, and sends a response back to the sending client, as well as the message itself to other connected clients.

## Components
1. **SocketClient**: Handles sending a message to the server and receiving the server's response
2. **SocketServer**: Listens for incoming client connections and responds with a confirmation message
3. **Sockets_Test**: The main class that runs both the client and server on separate threads. It allows you to input the server's port, IP address, and connection details

## How It Works
- The **server** listens on a specified port for incoming client connections
- The **client** connects to the server using the server's IP address and port, sends a message, and waits for a response
- The server processes the message and sends a confirmation back to the client

# Setup
## Prerequisites
- **Java** (JDK 8 or higher) should be installed on all involved computers.
- Both the server and client computers MUST be on **the same network**

## **Steps to Run the Program**
#### 1. **Compile the Program**
Make sure all the `.java` files (`SocketClient.java`, `Sockets_Test.java`, `SocketServer.java`) are in the same directory. Compile the program using the following command:
```bash
javac SocketClient.java Sockets_test.java SocketServer.java
```
#### 2. **Run the Server**
1. On the computer that will act as the **server**, run the `Sockets_test` program:
```bash
java Sockets_Test
```
2. When prompted:
   - **Enter port for the server to listen on** (e.g., 5000)
   - **Enter IP address of server to connect to** (enter 127.0.0.1 if running on the same machine, else find ip's thru ipconfig)
   - **Enter port of server to connect to** (e.g., 6000)
#### 3. **Run the Client**
1. On the computer(s) that will act as the **client(s)**, run the `Sockets_test` program:
```bash
java Sockets_Test
```
3. When prompted:
   - **Enter port for the client to listen on** (e.g., 6000)
   - **Enter IP address of server to connect to**
   - **Enter port of server to connect to** (e.g., 5000)
#### 4. **Send Messages**

# License
MIT License

Copyright (c) [2025] [Justin Pelak]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
