package leetcode.fortyNine_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

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
        var charCountToGroup = new HashMap<List<Integer>, List<String>>();

        for (var word : strs) {
            var charCount = Arrays.asList(new Integer[26]);
            Collections.fill(charCount, 0);

            for (var c : word.toCharArray()) {
                var index = c - 'a';
                charCount.set(index, charCount.get(index) + 1);
            }

            charCountToGroup.putIfAbsent(charCount, new ArrayList<>());
            charCountToGroup.get(charCount).add(word);
        }

        return new ArrayList<>(charCountToGroup.values());
    }
}
