package other.possibleValuesOfMissingDiceRolls;

import java.util.Arrays;

public class PossibleValuesOfMissingDiceRolls {

    public int[] possibleValuesOfMissingDiceRolls(int[] rolls, int forgottenRolls, int mean) {
        var totalSum = mean * (rolls.length + forgottenRolls);
        var existingSum = Arrays.stream(rolls).sum();
        var missingSum = totalSum - existingSum;

        if (missingSum < 0 || missingSum > 6 * forgottenRolls) {
            return new int[]{0};
        }

        // assign each missing die the minimum value
        var result = new int[forgottenRolls];
        Arrays.fill(result, 1);

        // remove this min value from the remaining sum
        var remainingSum = missingSum - forgottenRolls;

        // while-loop instead of for-loop to save on iterations
        var i = 0;
        while (remainingSum > 0 && i < forgottenRolls) {
            while (remainingSum > 0 && result[i] < 6) {
                result[i]++;
                remainingSum--;
            }
            i++;
        }

        return result;
    }
}
