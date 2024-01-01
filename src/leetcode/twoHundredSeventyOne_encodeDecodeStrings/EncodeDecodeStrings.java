package leetcode.twoHundredSeventyOne_encodeDecodeStrings;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {

    private final char delimiter = '#';

    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    public String encode(List<String> strs) {
        var result = new StringBuilder();

        for (var str : strs) {
            result.append(str.length()).append(delimiter).append(str);
        }

        return result.toString();
    }

    /*
     * @param str: A string
     * @return: decodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        var result = new ArrayList<String>();
        var i = 0;

        while (i < str.length()) {
            var j = i;
            var length = 0;
            while (str.charAt(j) != delimiter) {
                j++;
                length = Integer.parseInt(str.substring(i, j));
                result.add(str.substring(j + 1, j + 1 + length));
            }
            i = j + 1 + length;
        }

        return result;
    }
}
