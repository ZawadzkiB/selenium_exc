package eu.sii.selenium.junit;

import java.util.List;
import java.util.stream.Collectors;

public class CrazyMethods {

  public List<String> findAllStringsThatAreHigherThan8(List<String> listToFilter) {
    return listToFilter.stream().filter(it -> Integer.valueOf(it)>8).collect(Collectors.toList());
  }

  public List<String> findAllStringsThatAreOddNumbers(List<String> listToFilter) {
    return listToFilter.stream().filter(it -> Integer.valueOf(it)%2!=0).collect(Collectors.toList());
  }

}
