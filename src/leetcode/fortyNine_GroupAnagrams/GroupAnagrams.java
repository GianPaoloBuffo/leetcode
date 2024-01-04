package leetcode.fortyNine_GroupAnagrams;

import java.util.ArrayList;
import java.util.Arrays;
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
            var charCounts = new int[26];

            for (var c : word.toCharArray()) {
                var index = c - 'a';
                charCounts[index]++;
            }

            // need to convert array to list so that equals operation checks by value
            var charCountList = Arrays.stream(charCounts).boxed().toList();
            charCountToGroup
                    .computeIfAbsent(charCountList, k -> new ArrayList<>())
                    .add(word);
        }

        return new ArrayList<>(charCountToGroup.values());
    }
}
