

public class Administrador extends Assistente {

    private boolean nightShift;
    private double bonusValue = 200;

    public Administrador(String employeeName, Double employeeSalary, String employeeRegistration, boolean nightShift, double bonusValue) {
        super(employeeName, employeeSalary, employeeRegistration);
        this.nightShift = nightShift;
        this.bonusValue = bonusValue;
    }

    public boolean isNightShift() {
        return nightShift;
    }

    public double getBonusValue() {
        return bonusValue;
    }

    public String showNightShift() {
        return isNightShift() ? "Sim" : "Não";
    }

    public double calculateYearlyEarnings() {
        if (nightShift) {
            return 12 * (getBonusValue() + getEmployeeSalary());
        } else {
            return 12 * getEmployeeSalary();
        }
    }

    public void showDetails() {
        System.out.println("Nome: " + getEmployeeName()
                + "\nMatrícula: " + getEmployeeRegistration()
                + "\nSalário: " + getEmployeeSalary()
                + "\nTurno Noturno: " + showNightShift()
                + "\nSalário com Bônus: " + (getEmployeeSalary() + getBonusValue())
                + "\nGanho Anual: " + calculateYearlyEarnings());
    }
}
