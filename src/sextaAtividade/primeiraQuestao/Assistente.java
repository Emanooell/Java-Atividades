public class Assistente extends Oficial {
    private String employeeRegistration;

    public Assistente(String employeeName, Double employeeSalary, String employeeRegistration) {
        super(employeeName, employeeSalary);
        this.employeeRegistration = employeeRegistration;
    }

    public String getEmployeeRegistration() {
        return employeeRegistration;
    }

    public void setEmployeeRegistration(String employeeRegistration) {
        this.employeeRegistration = employeeRegistration;
    }

    @Override
    public void showDetails() {
        System.out.println("Nome: " + getEmployeeName()
                + "\nMatrícula: " + getEmployeeRegistration()
                + "\nSalário: " + getEmployeeSalary()
                + "\nGanho Anual: " + calculateYearlyEarnings());
    }
}
