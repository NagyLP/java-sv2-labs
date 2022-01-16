package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private final List<DnsEntry> dnsEntries;

    public NameServer() {
        this.dnsEntries = new ArrayList<>();
    }

    private class DnsEntry {
        private final String hostName;
        private final String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }
    }

    public void addEntry(String hostName, String hostIp) {
//        KISZERVEZÉS - egyszercsak...
//        if (hostName == null || hostIp.isBlank() || hostName == null || hostName.isBlank()) {
//            throw new IllegalArgumentException("Hostname, -IP is blank, or null. E code: " + hostName + "; " + hostIp);
//        }
        if (reservedHostName(hostName) || reservedHostIP(hostIp)) {
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName, hostIp));
    }

    public void removeEntryByName(String hostName) {
        if (reservedHostName(hostName)) {
            this.dnsEntries.remove(foundName(hostName));
        }
    }

    public void removeEntryByIp(String hostIp) {
        if (reservedHostIP(hostIp)) {
            this.dnsEntries.remove(foundIp(hostIp));
        }
    }

    public DnsEntry getIpByName(String hostName) {
        return foundName(hostName);
    }

    public DnsEntry getNameByIp(String hostIP) {
        return foundIp(hostIP);
    }

    private DnsEntry foundName(String hostName) {
        for (DnsEntry entry : dnsEntries) {
            if (entry.hostName.equals(hostName)) {
                return entry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry foundIp(String hostIp) {
        for (DnsEntry entry : dnsEntries) {
            if (entry.hostIp.equals(hostIp)) {
                return entry;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private boolean reservedHostIP(String wichIp) {
        for (DnsEntry item : dnsEntries) {
            if (item.hostIp.equals(wichIp)) {
                return true;
            }
        }
        return false;
    }

    private boolean reservedHostName(String wichName) {
        for (DnsEntry item : dnsEntries) {
            if (item.hostIp.equals(wichName))
                return true;
        }
        return false;
    }
}
