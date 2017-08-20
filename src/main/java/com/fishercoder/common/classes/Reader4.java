package com.fishercoder.common.classes;

public class Reader4 {
    public int read4(char[] buf) {
        if (buf.length < 4) {
            return buf.length;
        } else {
            return 4;
        }
    }
}
