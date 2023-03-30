package Pilas;

public class Pais {
    private String nombre;
    private int nrDeDepartamentos;
    private String [] Departamento;

    public Pais(String nombre,int nrDeDepartamentos,String[] Departamento){
        this.nombre = nombre;
        this.nrDeDepartamentos = nrDeDepartamentos;
        this.Departamento = Departamento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNrDeDepartamentos() {
        return nrDeDepartamentos;
    }

    public void setNrDeDepartamentos(int nrDeDepartamentos) {
        this.nrDeDepartamentos = nrDeDepartamentos;
    }

    public String[] getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String[] departamento) {
        Departamento = departamento;
    }

}
