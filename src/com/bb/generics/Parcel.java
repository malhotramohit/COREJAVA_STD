package com.bb.generics;

//<T>-Type Parameter
// T -- > Object , String, Book , Phone

public class Parcel<T> {

	private T obj; //private Phone phone

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

}
