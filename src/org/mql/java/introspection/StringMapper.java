package org.mql.java.introspection;

import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Set;

public class StringMapper {
	private static Set<Object> visited = new HashSet<>();

	public static String toString(Object obj) {
		
		if(obj == null) return "null";
		
		visited.add(obj);
		
		Class<?> classe = obj.getClass() ;
		StringBuilder result = new StringBuilder(classe.getSimpleName() + "{");
		Field[] fields = classe.getDeclaredFields();
		boolean firstField = true;
		
		for(Field field : fields) {
			field.setAccessible(true);
			try {
				Object value = field.get(obj);
				if(!firstField) result.append(",");
				firstField = false;
				result.append(field.getName()).append(":");
				
				if(value == null) {
					result.append("null") ;
				} else if(isPrimitiveOrWrapper(value.getClass()) || value instanceof String){
					result.append(value);
				} else {
					result.append(toString(value));
				}
				
			} catch (Exception e) {
				result.append("Error retrieving value, ");
			}
			
			field.setAccessible(false);
		}
		
		  visited.remove(obj); 
		  result.append(" }");
	      return result.toString();
	}

    private static boolean isPrimitiveOrWrapper(Class<?> classe) {
        return classe.isPrimitive() || 
        	   classe == String.class || 
               classe == Integer.class || 
               classe == Double.class || 
               classe == Float.class || 
               classe == Long.class || 
               classe == Short.class || 
               classe == Byte.class || 
               classe == Boolean.class || 
               classe == Character.class;
    }
    
    
}
