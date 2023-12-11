

public class Oficial {
    private String employeeName;
    private Double employeeSalary;

    public Oficial(String employeeName, Double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double calculateYearlyEarnings() {
        return 12 * getEmployeeSalary();
    }

    public void showDetails() {
        System.out.println("Nome: " + getEmployeeName()
                + "\nSalário: " + getEmployeeSalary()
                + "\nGanho Anual: " + calculateYearlyEarnings());
    }
}
