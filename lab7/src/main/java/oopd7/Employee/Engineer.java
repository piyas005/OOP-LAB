package oopd7.Employee;

public class Engineer extends Employee {
    private double bonus;

    public Engineer(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBonus: " + bonus;
    }
}
