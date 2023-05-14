package by.strigo.aplhalab_task2.common;

import by.strigo.aplhalab_task2.TestExample;
import lombok.experimental.UtilityClass;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;

@UtilityClass
public class TestDataBuilder {

    public static final String NAME_1 = "SERGEY";
    public static final String NAME_2 = "PAVEL";
    public static final String NAME_3 = "EGOR";
    public static final String NAME_4 = "IVEN";
    public static final String NAME_5 = "ANNA";


    public static TestExample build(String name) {
        return new TestExample(name, RandomStringUtils.randomAlphabetic(5));
    }

    public static List<TestExample> buildExamples() {
        List<TestExample> examples = new ArrayList<>();

        examples.add(build(NAME_1));
        examples.add(build(NAME_2));
        examples.add(build(NAME_3));
        examples.add(build(NAME_4));
        examples.add(build(NAME_5));

        examples.add(build(NAME_1));
        examples.add(build(NAME_2));
        examples.add(build(NAME_3));
        examples.add(build(NAME_4));
        examples.add(build(NAME_5));

        examples.add(build(NAME_1));
        examples.add(build(NAME_2));

        return examples;
    }
}
