package com.designmode.createMode.mode3;

public class MyClassTwo implements MyInterface {

	@Override
	public void print() {
		System.out.println(this.getClass().getName());
	}
}
