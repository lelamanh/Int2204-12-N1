class Manager extends Employee{
    private Employee assistant;
    public Manager(String name, Date d, double s, Employee e) {
        super(name, d, s);
        this.assistant = e; 
    }
    public setAssistant(Employee e) {
        this.assistant = e;
    }
 }