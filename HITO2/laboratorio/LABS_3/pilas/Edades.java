package pilas;

public class Edades {
    private String universidad;
    private String paralelo;
    private int[] edad;

    public Edades(String universidad, String paralelo, int[] edad){
        this.universidad = universidad;
        this.paralelo = paralelo;
        this.edad = edad;
    }

    public String getUniversidad(){
        return universidad;
    }

    public String getParalelo() {
        return paralelo;
    }

    public int[] getEdad() {
        return edad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }
    public void mostrar (){
        System.out.println("mostrando clase edades");
        System.out.println("universidad: "+this.getUniversidad());
        System.out.println("paralelo : "+this.getParalelo());
        for(int i=0;i<this.edad.length;i++){
            System.out.print(this.edad[i] + " ,");
        }
        System.out.println();
    }

}
