package com.chris.Lambda;

@FunctionalInterface
public interface LambdaInterfaceGeneric<T> {
	public T execute(T str);
}