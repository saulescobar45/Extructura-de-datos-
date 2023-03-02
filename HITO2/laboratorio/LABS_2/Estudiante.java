public class Estudiante {
    private String fullname;
    private String lastname;
    private int age;

    public Estudiante(String fullname, String lastname, int age){
        this.fullname = fullname;
        this.lastname = lastname;
        this.age = age;
    }

//    public void student(String fullname,String lastname,int age) {
//        System.out.println(this.fullname +" "+this.lastname+" "+this.age);
//    }
    public String getFullName(){
        return this.fullname;
    }
    public void setFullname(String fullname){
        this.fullname = fullname;
    }
    public String getLastname(){
        return  this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
//        System.out.println("Mostramos el apellido");
//        lastname = "Perez";
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
