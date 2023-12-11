

public class Main {
    public static void main(String[] args) {
        Oficial employee = new Oficial("Robson", 1800.0);
        Assistente assistente = new Assistente("Michael", 2000.0, "76347348");
        Tecnico tecnico = new Tecnico("Samuel", 1500.0, "64748477", 400);
        Administrador administrador = new  Administrador("Mj", 4000.0, "78433321", false, 800);
        
        employee.showDetails();
        System.out.println("----------------------------------");
        assistente.showDetails();
        System.out.println("----------------------------------");
        tecnico.showDetails();
        System.out.println("----------------------------------");
        administrador.showDetails();
        System.out.println("----------------------------------");
    }
}
