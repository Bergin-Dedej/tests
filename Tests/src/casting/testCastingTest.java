package casting;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;

public class testCastingTest extends TestCase{
	
	
	public void testLongInt(){
		testCasting casting = new testCasting();
		
		String hello = "Hello";
		int number = 7;
		long number2 = 7;
		Boolean face = false;
		
		String messengerHello = "s" + hello;
		String messengerNumber = "i" + Integer.toString(number);
		String messengerBoolean = "b" + Boolean.toString(face);
		
		assertNotSame(number,number2);
		assertEquals(number,number2);
	}
	
	public void testString(){
		testCasting casting = new testCasting();
		
		String hello = "Hello";
		int number = 7;
		Boolean face = false;
		
		String messengerHello = "s" + hello;
		String messengerNumber = "i" + Integer.toString(number);
		String messengerBoolean = "b" + Boolean.toString(face);
		
		String hello2 = messengerHello.substring(1);
		
		casting.catchMessenger(messengerHello);
		
		if(casting.getTranslated(messengerHello).equals("s")){
			assertEquals(hello,casting.getString());
		}else if(casting.getTranslated(messengerHello).equals("i")){
			assertEquals(hello,casting.getInt());
		}else if(casting.getTranslated(messengerBoolean).equals("b")){
			assertEquals(hello,casting.getBoolean());
		}
	}
	
	public void testInt(){
		testCasting casting = new testCasting();
		
		String hello = "Hello";
		int number = 7;
		Boolean face = false;
		
		String messengerHello = "s" + hello;
		String messengerNumber = "i" + Integer.toString(number);
		String messengerBoolean = "b" + Boolean.toString(face);
		
		casting.catchMessenger(messengerNumber);
		
		if(casting.getTranslated(messengerNumber).equals("s")){
			assertSame(number,casting.getString());
			assertEquals(number,casting.getString());
		}else if(casting.getTranslated(messengerNumber).equals("i")){
			assertSame(number,casting.getInt());
			assertEquals(number,casting.getInt());
		}else if(casting.getTranslated(messengerNumber).equals("b")){
			assertSame(number,casting.getBoolean());
			assertEquals(number,casting.getBoolean());
		}
		
		
		
	}
	
	public void testBoolean(){
		testCasting casting = new testCasting();
		
		String hello = "Hello";
		int number = 7;
		Boolean face = false;
		
		String messengerHello = "s" + hello;
		String messengerNumber = "i" + Integer.toString(number);
		String messengerBoolean = "b" + Boolean.toString(face);
		
		casting.catchMessenger(messengerBoolean);
		
		if(casting.getTranslated(messengerBoolean).equals("s")){
			assertSame(face,casting.getString());
			assertEquals(face,casting.getString());
		}else if(casting.getTranslated(messengerBoolean).equals("i")){
			assertSame(face,casting.getInt());
			assertEquals(face,casting.getInt());
		}else if(casting.getTranslated(messengerBoolean).equals("b")){
			assertSame(face,casting.getBoolean());
			assertEquals(face,casting.getBoolean());
		}
	}

}
