package thirtySix_validSudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

    // Time Complexity: O(9^2) => O(1)
    // Space Complexity: O(9) => O(1)
    public boolean isValidSudoku(char[][] board) {
        Set<Character> nums = new HashSet<>();

        // all rows
        for (char[] row : board) {
            for (char num : row) {
                if (num != '.' && !nums.add(num))
                    return false;
            }
            nums.clear();
        }

        // all cols
        for (int col = 0; col < 9; col++) {
            for (int row = 0; row < 9; row++) {
                char num = board[row][col];
                if (num != '.' && !nums.add(num))
                    return false;
            }
            nums.clear();
        }

        // all sub-boxes
        for (int rowSubBox = 0; rowSubBox < 3; rowSubBox++) {
            for (int colSubBox = 0; colSubBox < 3; colSubBox++) {
                for (int row = 3 * rowSubBox; row < 3 * rowSubBox + 3; row++) {
                    for (int col = 3 * colSubBox; col < 3 * colSubBox + 3; col++) {
                        char num = board[row][col];
                        if (num != '.' && !nums.add(num))
                            return false;
                    }
                }
                nums.clear();
            }
        }

        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<SubGridCoord, Set<Character>> subGrids = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            cols.put(i, new HashSet<>());
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                subGrids.put(new SubGridCoord(i, j), new HashSet<>());
            }
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char c = board[row][col];

                if (c == '.')
                    continue;

                if (rows.get(row).contains(c) ||
                        cols.get(col).contains(c) ||
                        subGrids.get(new SubGridCoord(row  / 3, col / 3)).contains(c)) {
                    return false;
                }

                rows.get(row).add(c);
                cols.get(col).add(c);
                subGrids.get(new SubGridCoord(row / 3, col / 3)).add(c);
            }
        }

        return true;
    }

    private record SubGridCoord(Integer row, Integer col) {
    }
}