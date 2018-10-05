package com.junit.example.test;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.runners.MethodSorters;
import com.junit.example.StringHelper; 

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StringHelperTest {
	
	 @Before
	   public void beforetruncateAInFirst2Positions2() {
		   System.out.println("hello imm new to junit");
	   }
   
   @Test
   public void truncateAInFirst2Positions() {
	   StringHelper obj=new StringHelper();
	   obj.truncateAInFirst2Positions("ABCD");
	   System.out.println("hello");
	   assertEquals("BCD",obj.truncateAInFirst2Positions("ABCD"));
   }
  
   
   
   @Test
   public void truncateAInFirst2Positions2() {
	   StringHelper obj=new StringHelper();
	   obj.truncateAInFirst2Positions("ABCD");
	   System.out.println("h ");
	   assertEquals("BCD",obj.truncateAInFirst2Positions("ABCD"));
   }
   
  
  
}
