package com.qaagility.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.*;
import static org.junit.Assert.assertEquals;
//import static org.mockito.*;

public class TestHelloServlet{

 private HelloServlet hc;
 private HttpServletRequest request;
 private HttpServletResponse response;

  @Before
  public void setUp() {
    hc = new HelloServlet();
    //request =Mockito.mock(HttpServletRequest.class);
    //response =Mockito.mock(HttpServletResponse.class);
  }

 @Test(expected=Exception.class)
 public void testDoPost() throws ServletException, IOException  {
  
  hc.doPost(request, response);
  assertEquals("Result","text/html", response.getContentType());

 }

}
