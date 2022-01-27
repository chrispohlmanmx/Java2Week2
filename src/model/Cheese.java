/**
 * @author Christopher Pohlman - cmpolhman
 * CIS175 - Spring 2022
 * Jan 27, 2022
 */
package model;

/**
 * 
 */
public class Cheese {
	private String name;
	private String type;
	private int age;
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	public Cheese() {
		
	}
	
	/**
	 * @param name
	 * @param type
	 * @param age
	 */
	public Cheese(String name, String type, int age) {
		super();
		this.name = name;
		this.type = type;
		this.age = age;
	}
	
	public String printCheeseInfo() {
		return this.getName() + " is a " + this.getType() + " and it was aged for " + this.getAge() + " years.";
	}
	
}
