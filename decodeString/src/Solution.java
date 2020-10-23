public class Solution {
    public String decodeString(String s) {
        // By using lastIndexOf, it handles the cases of nesting encoded strings
        int index = s.lastIndexOf('[');

        // Loop until no more encoded substrings
        while (index > -1) {
            int start;
            int multiplier = 0;

            for(start = index - 1; start >= 0; start--) {
                try {
                    multiplier = Integer.parseInt(s.substring(start, index));
                } catch (NumberFormatException exception) {
                    start++;
                    break;
                }
            }

            // start is -1 when the loop ends because the start>=0 condition is
            // false
            if (start < 0) start = 0;

            // find the end position of the string to be repeated
            int end = s.indexOf(']', index);

            // Reconstruct string by replacing the encoded string with the decoded
            // value
            s = s.substring(0, start) +
                    s.substring(index + 1, end).repeat(multiplier) +
                    s.substring(end + 1);

            // Check for more encoded substrings
            index = s.lastIndexOf('[');
        }

        return s;
    }
}