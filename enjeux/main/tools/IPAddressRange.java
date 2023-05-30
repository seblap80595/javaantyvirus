import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

public class IPAddressRange {

    public static void main(String[] args) {
        String startIP = "204.81.0.0";
        String endIP = "204.82.255.255";

        List<String> ipList = generateIPRange(startIP, endIP);

        exportIPListToFile(ipList, "ip_addresses.txt");
    }

    public static List<String> generateIPRange(String startIP, String endIP) {
        List<String> ipList = new ArrayList<>();

        try {
            InetAddress start = InetAddress.getByName(startIP);
            InetAddress end = InetAddress.getByName(endIP);

            byte[] startAddress = start.getAddress();
            byte[] endAddress = end.getAddress();

            BigInteger startBigInt = new BigInteger(1, startAddress);
            BigInteger endBigInt = new BigInteger(1, endAddress);

            while (startBigInt.compareTo(endBigInt) <= 0) {
                ipList.add(InetAddress.getByAddress(startBigInt.toByteArray()).getHostAddress());

                byte[] incrementedAddress = incrementIPAddress(startAddress);
                startBigInt = new BigInteger(1, incrementedAddress);
                startAddress = incrementedAddress;
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        return ipList;
    }

    private static byte[] incrementIPAddress(byte[] address) {
        for (int i = address.length - 1; i >= 0; i--) {
            if ((address[i] & 0xFF) < 255) {
                address[i]++;
                break;
            } else {
                address[i] = 0;
            }
        }
        return address;
    }

    public static void exportIPListToFile(List<String> ipList, String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\Users\SebLap80595\OneDrive - EECD EDPE\Bureau\enjeux\main\tools" + fileName))) {
            for (String ip : ipList) {
                writer.write(ip);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

