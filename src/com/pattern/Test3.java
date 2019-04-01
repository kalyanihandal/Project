package com.pattern;

public class Test3 implements Cloneable {
	int i=10;
	int j=20;
	public static void main(String[] args)throws CloneNotSupportedException 
	{
Test3 t=new Test3();
Test3 t2=(Test3)t.clone();
t2.i=888;
t2.j=999;
System.out.println(t.i+"   "+t2.j);

}
}