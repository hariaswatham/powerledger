package com.interview.powerledger.controller;

import org.junit.Assert;
import org.junit.Test;

public class GreetingControllerTest {
  @Test
  public void shouldGreet(){
    String result = new GreetingController().greet();
    Assert.assertEquals("Hello World !!!", result);
  }

}
