package com.hacareem.utils;

import com.hacareem.enums.Size;
import com.hacareem.enums.Type;

public class Package {
	Type type;
	Size size;
	float weight;
	Address address;
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
