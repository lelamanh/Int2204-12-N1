package communityuni.com.model;

public class Dog {
private String name;
private double weight;
private int age;
private String species;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public Dog()
{
	name="Cun";
	weight=15;
	age= 2;
	species=" Cho kien";
}
public Dog(String name, double weight, int age, String species)
{
	this.name=name;
	this.weight=weight;
	this.age=age;
	this.species=species;
}

}
