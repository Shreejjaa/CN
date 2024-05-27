import java.net.InetAddress;

public class LocalIPAddress {
    public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println("Local IP Address: " + localHost.getHostAddress());
    }
}

Local IP Address: 192.168.1.5

import java.net.InetAddress;

public class RemoteIPAddress {
    public static void main(String[] args) throws Exception {
        InetAddress remoteHost = InetAddress.getByName("www.google.com");
        System.out.println("IP Address of www.google.com: " + remoteHost.getHostAddress());
    }
}

IP Address of www.google.com: 142.250.64.78
