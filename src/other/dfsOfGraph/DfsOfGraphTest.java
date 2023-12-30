package other.dfsOfGraph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DfsOfGraphTest {

    // Input: V = 5 , adj = [[2,3,1] , [0], [0,4], [0], [2]]

    @Test
    void shouldReturnDfs() {
        // given
        var V = 5;

        var adj = new ArrayList<List<Integer>>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).addAll(List.of(2, 3, 1));
        adj.get(1).add(0);
        adj.get(2).addAll(List.of(0, 4));
        adj.get(3).add(0);
        adj.get(4).add(2);

        // when
        var result = new DfsOfGraph().dfsOfGraph(V, adj);

        // then
        assertEquals(result, List.of(0, 2, 4, 3, 1));
    }
}
