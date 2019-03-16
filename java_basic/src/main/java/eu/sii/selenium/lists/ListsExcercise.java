package eu.sii.selenium.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListsExcercise {

  /**
   * 1. Write method to search list and return all elements thats contains 'c'
   * [aca,as,ac,c,sd,ec,qwe,acccc,sdf,rt,yh,vc,fddf,bcbc]
   * <p>
   * 2.Write method to compare two lists and return only elements that are same in both lists
   * [asd,qwe,zxc,rty,fgh,vbn,uio], [as,asd,qw,qwe,zxc,cv,df,ert,rty,uio,qwe,asd]
   */

  public static void main(String[] args) {
    getElementsContainsC();
    compareLists();
  }

  static List<String> getElementsContainsC() {
    return Arrays.asList("aca", "as", "ac", "c", "sd", "ec", "qwe", "acccc", "sdf", "rt", "yh", "vc", "fddf", "bcbc")
            .stream().filter(it -> it.contains("c")).collect(Collectors.toList());
  }

  static List<String> compareLists() {
    List<String> list1 = Arrays.asList("asd","qwe","zxc","rty","fgh","vbn","uio");
    List<String> list2 = Arrays.asList("as","asd","qw","qwe","zxc","cv","df","ert","rty","uio","qwe","asd");
    List<String> common = new ArrayList<>();
    list1.forEach(it -> {
      if(list2.contains(it)){
        common.add(it);
      }
    });
    return common;
  }


}
