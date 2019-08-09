package com.linfix.study.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

import net.sf.json.JSONObject;

/**
 * 数据对象赋值工具，用于自动调用简单数据类型的set方法
 * @author linhu
 *
 */
public class DataModelBuildUtil {

	/**
	 * 对象构建
	 * @param source 参数信息 
	 * @param clazz 对象类型
	 * @param ignoreFildNames 被忽略的属性信息
	 * @return
	 * @throws Exception
	 */
	public static <T> T buildModel(JSONObject source,Class<T> clazz,String... ignoreFildNames)throws Exception{
		Set<Field> filds = new HashSet<Field>();
		Field[] declaredFields = clazz.getDeclaredFields();
		//获取需要设置值的字段
		for (Field field : declaredFields) {
			//判断ignoreFildNames 是否为 null
			if(ignoreFildNames==null) {
				filds.add(field);
			}else {
				for (String ignoreFildName : ignoreFildNames) {
					if (field.getName().equals(ignoreFildName)) {
						continue;
					}
					filds.add(field);
				}
			}
			//filds.add(field); 改位子
		}
		T bean = clazz.newInstance();
		//设置参数
		for (Field field : filds) {
			//JsonUtils.containsKeysAndKeyValueIsEmpty(source, field.getName());
			String fieldName = field.getName();
			String setter = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
			String fieldValue = source.getString(field.getName());
			//判断我们的字段是什么类型的
			  if (field.getType() == Integer.class || field.getType() == int.class) {
				  //Integer or int类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Integer.valueOf(fieldValue));
	            } else if (field.getType() == Long.class || field.getType() == long.class) {
	            //Long or long类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Long.valueOf(fieldValue));
	            } else if (field.getType() == Double.class || field.getType() == double.class) {
	            //Double or double 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Double.valueOf(fieldValue));
	            } else if (field.getType() == Float.class || field.getType() == float.class) {
	            //Float or float 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Float.valueOf(fieldValue));
	            } else if (field.getType() == Short.class || field.getType() == short.class) {
	            //Short or short 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Short.valueOf(fieldValue));
	            } else if (field.getType() == Byte.class || field.getType() == byte.class) {
	            //Byte or byte 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Byte.valueOf(fieldValue));
	            } else if (field.getType() == Boolean.class) {
	            //Boolean or booblean 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, Boolean.valueOf(fieldValue));
	            } else {
	            //String 类型
	                Method method = clazz.getDeclaredMethod(setter, field.getType());
	                method.invoke(bean, fieldValue);
	            }
		}
		return bean;
	}
	
}
