package com.qaagility.javaee;

import com.qaagility.javaee.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculator {

 private Calculator calc = new Calculator();

 @Test
 public void testAdd() {
  assertEquals("Result", 9, calc.add());
 }

 @Test
 public void testFailAdd() {
  assertNotEquals("Result",10 ,calc.add());
 }

}
