package Allurereport.TestAllure;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Testcase1 {
  @Test
  public void firstTestmethod() {
  
  Assert.assertTrue(false);
  System.out.println("The testcases should be fail");
  }
}
