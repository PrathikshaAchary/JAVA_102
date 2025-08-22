package com;

public class Student2 {
int id;
String name;
Student2(int id,String name)
{
	this.id=id;
	this.name=name;
}
public String toString()
{
	return this.id+" "+this.name;
}
public static void main(String[] args)
{
	Student2 s1=new Student2(19,"Prathiksha");
	Student2 s2=new Student2(20,"Acharya");
	Student2[] s=new Student2[2];
	s[0]=s1;
	s[1]=s2;
	for(int i=0;i<s.length;i++)
	{
		System.out.println(s[i].id+" "+s[i].name);
	}
	
	
}
}
