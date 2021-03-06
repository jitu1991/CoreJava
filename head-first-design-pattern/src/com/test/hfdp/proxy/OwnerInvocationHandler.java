package com.test.hfdp.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	PersonBean personBean;

	public OwnerInvocationHandler(PersonBean personBean) {
		this.personBean = personBean;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if (method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			} else if (method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessError();
			} else if (method.getName().startsWith("set")) {
				return method.invoke(personBean, args);
			}
		} catch (Exception e) {
		}
		return null;
	}
}
