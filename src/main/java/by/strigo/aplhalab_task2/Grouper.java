package by.strigo.aplhalab_task2;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Grouper {

    Map<String, List<NamedObject>> groupByName(List<? extends NamedObject> objects) {

        return objects.stream()
                .collect(groupingBy(NamedObject::getName));
    }
}
