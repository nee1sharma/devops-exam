package com.qaagility.controller;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import com.qaagility.javaee.Calcmul;

public class TestCalcmul {

 private Calcmul cm=new Calcmul();

 @Test
 public void testMul(){
  assertEquals("Result", 18, cm.mul());
 }

}
