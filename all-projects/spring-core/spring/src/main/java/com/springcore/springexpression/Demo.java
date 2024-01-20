package com.springcore.springexpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{2 + 11}") // #{expression} 
 	private int x;
	
	@Value("#{8 > 6 ? 8+6 : 0}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")  
	/*here to call static method we should follow the following pattern
	 *T(class).method(parameter) 
	 */
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")
	/*here to use static variables we should follow
	 * T(class).variable
	 * */
	private double a;
	
	@Value("#{new java.lang.String('Rushikesh') }") /*for objects*/
	private String name;
	
	@Value("#{8 > 3}")
	private boolean isActive;
	
	
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}
	
}
