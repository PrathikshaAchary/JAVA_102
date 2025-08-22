package com;

public class TestEmployee {
public static void main(String[] args)
{
	Employee e=new Employee();
	e.setId(102);
	System.out.println(e.getId());
	e.setName("Prathiksha");
	System.out.println(e.getName());
	e.setSal(40000);
	System.out.println(e.getSal());
	e.setDes("Java Developer");
	System.out.println(e.getDes());
}
}
