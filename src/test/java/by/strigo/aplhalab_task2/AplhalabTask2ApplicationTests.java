package by.strigo.aplhalab_task2;

import by.strigo.aplhalab_task2.common.TestDataBuilder;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static by.strigo.aplhalab_task2.common.TestDataBuilder.*;
import static org.junit.jupiter.api.Assertions.*;

class AplhalabTask2ApplicationTests {

    @Test
    void Verify_map_has_correct_keys_and_number_of_objects_in_values() {
//        given:
        Grouper grouper = new Grouper();
        List<TestExample> examples = TestDataBuilder.buildExamples();

//        when:
        Map<String, List<NamedObject>> map = grouper.groupByName(examples);

//        then:
        assertEquals(5, map.size());
        assertEquals(3, map.get(NAME_1).size());
        assertEquals(3, map.get(NAME_2).size());
        assertEquals(2, map.get(NAME_3).size());
        assertEquals(2, map.get(NAME_4).size());
        assertEquals(2, map.get(NAME_5).size());
    }
}
