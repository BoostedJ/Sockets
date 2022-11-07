import java.util.Scanner;

public class Sockets_Test {

    public static void main(String[] args) {

        // First get port for this server.
        System.out.println("Enter port for this server to listen on: ");
        int iPort = new Scanner(System.in).nextInt();

        // Get IP and port of server to connect to.
        System.out.println("Enter IP address of server to connect to: ");
        String sOtherServerIP = new Scanner(System.in).nextLine();
        System.out.println("Enter port of server to connect to: ");
        int iOtherServerPort = new Scanner(System.in).nextInt();
        System.out.println();

        // Start up server thread.
        SocketServer oServer = new SocketServer(iPort);
        Thread oServerThread = new Thread(oServer);
        oServerThread.start();

        SocketClient oClient = new SocketClient();
        while(true) {

            System.out.println("Enter a message to send: ");
            String sMessage = new Scanner(System.in).nextLine();
            String sReply = oClient.connectForOneMessage(sOtherServerIP, iOtherServerPort, sMessage);

            System.out.println("[client] Server reply: " + sReply);
        }
    }
}