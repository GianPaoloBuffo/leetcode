package leetcode.fortyNine_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> charCountToGroup = new HashMap<>();

        for (String word : strs) {
            List<Integer> charCounts = Arrays.asList(new Integer[26]);
            Collections.fill(charCounts, 0);

            for (char c : word.toCharArray()) {
                int index = (int) c - (int) 'a';
                charCounts.set(index, charCounts.get(index) + 1);
            }

            charCountToGroup.putIfAbsent(charCounts, new ArrayList<>());
            List<String> existingGroups = charCountToGroup.get(charCounts);
            existingGroups.add(word);
        }

        return new ArrayList<>(charCountToGroup.values());
    }
}
