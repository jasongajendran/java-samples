package org.java.examples.streams;

import org.java.examples.data.TestData;
import org.java.examples.record.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class Streams1 {

  public static void main(String[] args) {

    List<Company> companies = TestData.testData();

    System.out.println("city names = " + getCityNames(companies));
    System.out.println("state names non null= " + getStateNamesNonNull(companies));
    System.out.println("getAllPerson = " + getAllPerson(companies));
    System.out.println("getCompaniesByCity = " + getCompaniesByCity(companies));
  }

  public static List<String> getCityNames(List<Company> companyList){
    return companyList.stream()
            .map(Company::address)
            .map(Address::city)
            .map(City::name)
            .toList();
  }

  public static List<String> getStateNamesNonNull(List<Company> companyList){
    return companyList.stream()
            .map(Company::address)
            .filter(Objects::nonNull)
            .map(Address::city)
            .filter(Objects::nonNull)
            .map(City::state)
            .filter(Objects::nonNull)
            .map(State::name)
            .filter(Objects::nonNull)
            .toList();
  }

  public static List<Person> getAllPerson(List<Company> companyList){
    return companyList.stream()
            .map(Company::personList) // It returns a Stream<List<Person>>
            .flatMap(List::stream)  // It returns a Stream<Person>
            .toList();
  }

  public static Map<City,List<Company>> getCompaniesByCity(List<Company> companyList){
    return companyList.stream()
            .collect(Collectors.groupingBy(company -> company.address().city()));
  }

}
