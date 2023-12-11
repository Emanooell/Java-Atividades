public class Tecnico extends Assistente {
    private double bonusValue = 300;

    public Tecnico(String name, Double salary, String registration, double bonusValue) {
        super(name, salary, registration);
        this.bonusValue = bonusValue;
    }

    public double getBonusValue() {
        return bonusValue;
    }

    public double gainYearly() {
        return 12 * (getBonusValue() + getEmployeeSalary());
    }

    @Override
    public void showDetails() {
        System.out.println("Nome: " + getEmployeeName()
                + "\nMatrícula: " + getEmployeeRegistration()
                + "\nSalário: " + getEmployeeSalary()
                + "\nSalário com Bônus: " + (getEmployeeSalary() + getBonusValue())
                + "\nGanho Anual: " + gainYearly());
    }
}
