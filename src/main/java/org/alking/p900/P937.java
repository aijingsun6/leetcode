package org.alking.p900;

import java.util.Arrays;
import java.util.Comparator;

public class P937 {

    public static final String TYPE_NUMBER = "2-number";

    public static final String TYPE_LETTER = "1-letter";

    private String[] split(String log) {
        char[] array = log.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ') {
                String prefix = String.valueOf(array, 0, i - 1);
                String last = String.valueOf(array, i + 1, array.length - i - 1);
                String type = TYPE_LETTER;

                for (int j = i + 1; j < array.length; j++) {
                    char c = array[j];
                    if ('0' <= c && c <= '9') {
                        type = TYPE_NUMBER;
                        break;
                    }
                }
                return new String[]{prefix, last, type};
            }
        }

        return null;
    }


    public String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] split1 = split(o1);
                String[] split2 = split(o2);
                int comp = split1[2].compareTo(split2[2]);
                if (comp == 0) {

                    if (split1[2].equals(TYPE_LETTER)) {
                        comp = split1[1].compareTo(split2[1]);
                        if (comp == 0) {
                            return split1[0].compareTo(split2[0]);
                        }
                        return comp;
                    }
                    return 0;
                }
                return comp;
            }
        });
        return logs;
    }

}
