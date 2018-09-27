public class Person
{
    private String name;
    private int age;
    private int salary;

    public static void main(String[] args) 
    {
        Person a = new Person("Hoang Bao Long", 18, 1000);
        Person b = new Person(a);
        a.getInfo();
        b.getInfo();

        b.setName("longhoang08");
        b.setAge(20);
        b.setSalary(5000);
        b.increaseSalary(1000);
        b.increaseAge(true);
        a.getInfo();
        b.getInfo();
    }

    // initialize a person with name, age, salary
    public Person(String name, int age, int salary)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // initialize a person with same propeties as person a
    public Person(Person a)
    {
        this(a.name, a.age, a.salary);
    }

    // print info of this person to stdout
    public void getInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    // return name of this object
    public String getName()
    {
        String result = new String(this.name);
        return result;
    }

    // set name of this object to name.
    public void setName(String name)
    {
        this.name = new String(name);
    }

    // return age of this object
    public int getAge()
    {
        return age;
    }

    // set age of this object to age.
    public void setAge(int age)
    {
        this.age = age;
    }

    // increase age if if isNewYear = true 
    public void increaseAge(boolean isNewYear)
    {
        if (isNewYear) this.age++;
    }

    // return salary of this object;
    public int getSalary()
    {
        return this.salary;
    }

    // set salary of this object to salary
    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    // raise this's salary of a extra x
    public void increaseSalary(int x)
    {
        this.salary += x;
    }
}
