package com.test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonWithReflection {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Singleton instance1 = Singleton.instance;
		Singleton instance2 = null;

		Constructor[] construtors = Singleton.class.getDeclaredConstructors();
		for (Constructor constructor : construtors) {
			constructor.setAccessible(true);
			instance2 = (Singleton) constructor.newInstance();
			break;
		}
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
		
		//Using enum
		
		SingletonEnum singletonEnum = SingletonEnum.INSTANCE;
		SingletonEnum singletonEnum2 = SingletonEnum.INSTANCE;

		/*System.out.println(singletonEnum);
		singletonEnum.setValue(3);
		System.out.println(singletonEnum.getValue());*/
		
		System.out.println(singletonEnum.hashCode());
		System.out.println(singletonEnum2.hashCode());
		
		
	}
}
