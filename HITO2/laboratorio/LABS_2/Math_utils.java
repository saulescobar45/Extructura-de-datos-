public class Math_utils {
    private String nameAPP;
    private String version;
    private int year;

    public Math_utils(String nameAPP, String vresion, int year) {
        this.nameAPP = "MathUitlsWill";
        this.version = "0.1v";
        this.year = 2023;
    }

    public void printApp() {
        System.out.println(this.nameAPP + " - " + this.version + " - " + this.year);
    }

    public void generarNumerosN(int limt) {
        System.out.println("numros naturales");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public void generarNumerosPares(int limt) {
        System.out.println("numeros pares");
        for (int i = 0; i <= limt; i += 2) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public void getExtensionFromCI(String ci) {
        System.out.println("Muestra extencion de la cedula");
        String ext = "";
        //9913271LP
        ext = ci.substring(7);
        //mostrando la extencion
        System.out.println("Extencion ="+ext);
    }
}
