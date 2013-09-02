package org.dp.intro;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String sound;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int newWeight) {
		if(newWeight>0){
			this.weight=newWeight;
		}else
			System.out.println("Weight of animal must be greater thatn 0");
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
}
