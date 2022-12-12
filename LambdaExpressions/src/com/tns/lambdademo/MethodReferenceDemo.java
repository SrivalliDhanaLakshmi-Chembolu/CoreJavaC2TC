package com.tns.lambdademo;

import java.util.function.BiFunction;

public class MethodReferenceDemo {

	public static<T> T mergeThings(T a,T b,BiFunction<T,T,T>merger) {
		
     return merger.apply(a,  b);
	}
public static String appendString(String a,String b) {
	return a+b;
}

public String appendString2(String a, String b) {
	return a+b;
}
public static void main(String[] args) {
	MethodReferenceDemo obj=new MethodReferenceDemo();
	
	//Reference to a static method
	System.out.println(MethodReferenceDemo.mergeThings("Hello","Welcome to Static method",MethodReferenceDemo::appendString));

    //Reference to a instance method
	System.out.println(MethodReferenceDemo.mergeThings("Hello","Welcome to Instance method",obj::appendString2));
	
	//Reference to an instance method of arbitrary type
	System.out.println(MethodReferenceDemo.mergeThings("Hello","Welcome to Instance of arbitrary type",String::concat));


}
}
