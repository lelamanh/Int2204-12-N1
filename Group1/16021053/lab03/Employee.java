class Employee extends Person {    
    private double salary;
    public Employee(String name, Date d, double s) {
        super(name, d);
        salary = s;
    }
    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}