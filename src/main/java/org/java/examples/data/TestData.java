package org.java.examples.data;

import org.java.examples.record.*;

import java.util.List;

public class TestData {
  public static List<Company> testData() {
    return List.of(
        new Company(
            "Jason Private Ltd",
            new Address("Kinning Park", new City("Glasgow", new State("Scotland"))),
            List.of(new Person(1L, "Jason"), new Person(2L, "Jasper"))),
        new Company(
            "Jabez Private Ltd",
            new Address("Zion Park", new City("Chennai", new State("TamilNadu"))),
            List.of(new Person(3L, "Jabez"), new Person(4L, "Grace"))),
        new Company(
            "Jeremy Private Ltd",
            new Address("Plantation Park", new City("Bangalore", new State("Karnataka"))),
            List.of(new Person(5L, "Jeremy"), new Person(6L, "Charles"))),
        new Company(
            "Jeffrey Private Ltd",
            new Address("Festival Park", new City("Hyderabad", new State("Telangana"))),
            List.of(new Person(7L, "Jeffrey"), new Person(8L, "Joel"))),
        new Company(
            "Jeffrey Private Ltd",
            new Address("Festival Park", new City("Coimbatore", null)),
            List.of(new Person(9L, "Jeffrey"), new Person(10L, "David"))));
  }
}
