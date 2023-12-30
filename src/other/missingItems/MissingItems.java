package other.missingItems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingItems {

    // Time Complexity: O(M log M)
    // Space Complexity: O(M)
    public static List<Integer> missingProducts(int[] requested, int[] delivered) {
        Map<Integer, Integer> requestedCount = new HashMap<>();
        for (int product : requested) {
            requestedCount.put(product, requestedCount.getOrDefault(product, 0) + 1);
        }

        Map<Integer, Integer> deliveredCount = new HashMap<>();
        for (int product : delivered) {
            deliveredCount.put(product, deliveredCount.getOrDefault(product, 0) + 1);
        }

        List<Integer> missingProducts = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : requestedCount.entrySet()) {
            int productId = entry.getKey();
            int requestedQuantity = entry.getValue();
            int deliveredQuantity = deliveredCount.getOrDefault(productId, 0);

            if (deliveredQuantity < requestedQuantity) {
                missingProducts.add(productId);
            }
        }

        Collections.sort(missingProducts);

        return missingProducts;
    }
}
