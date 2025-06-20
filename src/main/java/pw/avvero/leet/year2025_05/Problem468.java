package pw.avvero.leet.year2025_05;

import java.util.ArrayList;
import java.util.List;

public class Problem468 {

    public String validIPAddress(String queryIP) {
        if (isV4(queryIP)) return "IPv4";
        if (isV6(queryIP)) return "IPv6";
        return "Neither";
    }

    private boolean isV4(String value) {
        String[] parts = value.split("\\.");
        if (parts.length != 4) return false;
        for (String part : parts) {
            if (part.startsWith("0")) return false;
            if (part.length() == 0) return false;
            for (char c : part.toCharArray()) {
                if (c < '0' || c > '9') return false;
            }
            if (Integer.parseInt(part) > 255) return false;
        }
        return true;
    }

    private boolean isV6(String value) {
        String[] parts = value.split(":");
        if (parts.length != 8) return false;
        for (String part : parts) {
            if (part.length() == 0) return false;
            for (char c : part.toCharArray()) {
                if (!inchar(c)) return false;
            }
        }
        return true;
    }

    private boolean inchar(char c) {
        if (c >= '0' && c <= '9') return true;
        if (c >= 'a' && c <= 'f') return true;
        if (c >= 'A' && c <= 'F') return true;
        return false;
    }
}
