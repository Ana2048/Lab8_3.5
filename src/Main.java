public class Main {
    public static void main(String[] args) {
        try {
            // Crearea unei mașini și a unui student care deține acea mașină
            Masina masina = new Masina("Dacia", "Alb");
            Student studentOriginal = new Student("Ion", "Popescu", masina);

            // Clonarea de suprafață a studentului
            Student studentClonatShallow = (Student) studentOriginal.clone();

            // Clonarea de profunzime a studentului
            Student studentClonatDeep = studentOriginal.deepClone();

            // Revopsirea mașinii studentului original
            studentOriginal.getMasina().revopsire("Rosu");

            // Afișarea detaliilor despre ambele obiecte student
            System.out.println("Original: " + studentOriginal);
            System.out.println("Clonat Shallow: " + studentClonatShallow);
            System.out.println("Clonat Deep: " + studentClonatDeep);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }//deci clona de adancime a pastrat culoare initiala a masinii, inainte de revopsire
    }
}
