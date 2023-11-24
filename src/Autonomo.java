public class Autonomo extends Cliente {
    private String apellidos;
    private String dni;

    @Override
    public String getNombre() {
        return super.getNombre() + " " + this.apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
