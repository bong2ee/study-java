package kr.co.ezenac.clazz;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Person person = new Person("Admiral Yi");
		System.out.println(person/* .toString() */);
		
		Class clazz = Class.forName("kr.co.ezenac.clazz.Person");
		Person person2 = (Person) clazz.newInstance();
		System.out.println(person2);		//초기화x => null
		
		Class[] parmeterTypes = {String.class};
		Constructor cons = clazz.getConstructor(parmeterTypes);
		System.out.println(cons);
		
		Object[] initArgs = {"이순신"};
		Person personAdmiral = (Person) cons.newInstance(initArgs);
		System.out.println(personAdmiral);
		
		
		
		
	}

}
