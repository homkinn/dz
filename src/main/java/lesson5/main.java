package lesson5;

public class main {
    public static void main(String[] args) {
    Employee[] empCorp = new Employee[5];
    empCorp[0] = new Employee("vasa vas", "Engineer", "vasa@mail.com", "892312312",50000,51);
    empCorp[1] = new Employee("sanya sun", "Creator", "sanya@mail.com", "892312314",50000,39);
    empCorp[2] = new Employee("sidorenko sidr", "Water pot", "sidr@mail.com", "892312315",10000,41);
    empCorp[3] = new Employee("petr ivanov", "EnvelopeLicker", "ivanov@mail.com", "892312316",5000,18);
    empCorp[4] = new Employee("sergy serg", "GrinderPencil", "serg@mail.com", "892312317",3000,19);
    for (Employee employee : empCorp)
        if (employee.getAge()>40)
            System.out.println(employee);

}
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}

