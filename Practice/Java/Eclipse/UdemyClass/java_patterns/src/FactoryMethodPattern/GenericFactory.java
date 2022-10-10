package FactoryMethodPattern;

import java.lang.reflect.InvocationTargetException;

public class GenericFactory<T, V> {
	
    Class<T> theClass = null;

    public GenericFactory(Class<T> theClass) {
        this.theClass = theClass;
    }

    @SuppressWarnings("unchecked")
	public V createInstance() throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
   		return (V) this.theClass.getDeclaredConstructor().newInstance();
    }

}
