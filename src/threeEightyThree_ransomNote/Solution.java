package threeEightyThree_ransomNote;

public class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        int[] characters = new int[26];

        for (char c : magazine.toCharArray())
            characters[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (characters[c - 'a'] == 0)
                return false;
            characters[c - 'a']--;
        }

        return true;
    }
}
