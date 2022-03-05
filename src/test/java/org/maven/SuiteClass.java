package org.maven;

import org.junit.Assert;
import org.junit.Test;

public class SuiteClass {
	
@Test
public void tco() {
String s ="ABC";
System.out.println(s);
Assert.assertEquals("ABC",s);
System.out.println("hii");
System.out.println("hello");
System.out.println(s);
}
@Test
public void tco1() {
	System.out.println("method");
}
}
