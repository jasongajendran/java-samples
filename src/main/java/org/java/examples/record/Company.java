package org.java.examples.record;

import java.util.List;

public record Company(
        String name,
        Address address,
        List<Person> personList

) {
}
