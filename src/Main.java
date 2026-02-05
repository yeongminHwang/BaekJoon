import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner(System.in);

        int n = fs.nextInt();
        int tLen = fs.nextInt();
        if (n == Integer.MIN_VALUE || tLen == Integer.MIN_VALUE) {
            return;
        }

        Driver[] drivers = new Driver[n];
        long cumulative = 0L;
        for (int i = 0; i < n; i++) {
            String name = fs.next();
            int gap = fs.nextInt();
            if (i == 0) {
                cumulative = 0L;
            } else {
                cumulative += gap;
            }
            long mod = cumulative % tLen;
            int pos = (int) ((tLen - mod) % tLen);
            drivers[i] = new Driver(name, pos);
        }

        Arrays.sort(drivers, Comparator.comparingInt(d -> d.pos));

        ArrayList<String> canUse = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Driver curr = drivers[i];
            Driver next = drivers[(i + 1) % n];
            int dist = next.pos - curr.pos;
            if (dist <= 0) dist += tLen;
            if (dist > 0 && dist <= 1000) {
                canUse.add(curr.name);
            }
        }

        if (canUse.isEmpty()) {
            System.out.print("-1");
            return;
        }
        Collections.sort(canUse);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < canUse.size(); i++) {
            if (i > 0) sb.append(' ');
            sb.append(canUse.get(i));
        }
        System.out.print(sb);
    }

    private static class Driver {
        final String name;
        final int pos;

        Driver(String name, int pos) {
            this.name = name;
            this.pos = pos;
        }
    }

    private static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0;
        private int len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;
            while (true) {
                c = read();
                if (c == -1) return null;
                if (c > ' ') break;
            }
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c;
            while (true) {
                c = read();
                if (c == -1) return Integer.MIN_VALUE;
                if (c > ' ') break;
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = 0;
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }
    }
}
