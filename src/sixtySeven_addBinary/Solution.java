package sixtySeven_addBinary;

public class Solution {

    public static String addBinary(String a, String b) {
        StringBuilder answer = new StringBuilder();
        int carry = 0;

        int aIter = a.length() - 1;
        int bIter = b.length() - 1;

        while (aIter >= 0 || bIter >= 0) {
            int sum = carry;

            if (aIter >= 0) {
                sum += a.charAt(aIter) - '0';
                aIter--;
            }

            if (bIter >= 0) {
                sum += b.charAt(bIter) - '0';
                bIter--;
            }

            carry = sum / 2;

            answer.insert(0, sum % 2);
        }

        if (carry == 1)
            answer.insert(0, 1);

        return answer.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1111", "1111"));
    }
}
