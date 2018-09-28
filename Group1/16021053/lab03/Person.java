public class Person {
    String name;
    Date birthDay;
    public Person(String name, Date d) {
        this.name = name; birthDay = d;
    }

    /**
     * @return the birthDay
     */
    public Date getBirthDay() {
        return birthDay;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}