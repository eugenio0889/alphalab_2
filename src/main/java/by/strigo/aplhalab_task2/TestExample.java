package by.strigo.aplhalab_task2;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TestExample implements NamedObject {

    String name;
    String surname;

    @Override
    public String getName() {
        return this.name;
    }
}
