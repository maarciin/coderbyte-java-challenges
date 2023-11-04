package Easy;

import java.util.Collection;
import java.util.List;

class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> lists = List.of(List.of(1, 2, 3), List.of(4, 5));
        List<Integer> list = lists.stream()
                .flatMap(Collection::stream)
                .toList();

        System.out.println(list);

    }
}
