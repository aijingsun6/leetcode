package org.alking.p0;

import java.util.regex.Pattern;

public class P65 {

    public boolean isNumber(String s) {

        String pattern = "[+-]?[0-9]*(\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
        return Pattern.matches(pattern, s);
    }

}
