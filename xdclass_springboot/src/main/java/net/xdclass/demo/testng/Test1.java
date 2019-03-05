package net.xdclass.demo.testng;

import org.testng.annotations.Test;
public class Test1 {
	@Test(groups="init")
	public void f() {
		System.out.println("This is test f" );
	}
	@Test(groups="init")
	public void g() {
		System.out.println("This is test g" );
	}
	@Test(dependsOnGroups="init",groups="proccess")
	public void h() {
		System.out.println("This is test h " );
	}
	@Test(dependsOnGroups="init",groups="proccess")
	public void i() {
		System.out.println("This is test i" );
	}

}
