package thirtySix_validSudoku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidSudokuTest {

    @Test
    void testCaseOne() {
        // given
        var board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertTrue(result);
    }

    @Test
    void testCaseTwo() {
        // given
        var board = new char[][]{
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'.', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertFalse(result);
    }

    @Test
    void testCaseThree() {
        // given
        var board = new char[][]{
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertFalse(result);
    }

    @Test
    void testCaseFour() {
        // given
        var board = new char[][]{
                {'.', '.', '.', '.', '4', '.', '9', '.', '.'},
                {'.', '.', '2', '1', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '3'},
                {'.', '.', '.', '2', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '6', '1', '.', '.', '.', '.'},
                {'.', '.', '9', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '9', '.'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertTrue(result);
    }

    @Test
    void testCaseFive() {
        // given
        var board = new char[][]{
                {'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '5', '2', '.', '.'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertFalse(result);
    }

    @Test
    void testCaseSix() {
        // given
        var board = new char[][]{
                {'.', '1', '.', '5', '2', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '6', '4', '3', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'5', '.', '.', '.', '.', '.', '9', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '5', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'9', '.', '.', '.', '.', '3', '.', '.', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
        };

        // when
        var result = new ValidSudoku().isValidSudoku(board);

        // then
        assertFalse(result);
    }
}
