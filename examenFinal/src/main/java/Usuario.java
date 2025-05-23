public class Usuario {
    private boolean usuarioCreado;
    private String nombre;
    private Password password;

    public Usuario(String nombre, Password password) {
        this.nombre = nombre;
        this.password = password;
        this.usuarioCreado = true;
    }

    public String getNombre() {
        return nombre;
    }
    public Password getPassword() {
        return password;
    }

    public boolean getUsuarioCreado() {
        return usuarioCreado;
    }

    public void setUsuarioCreado() {
        this.usuarioCreado = true;
    }

    public void setUsuarioEliminado() {
        this.usuarioCreado = false;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", password=" + password +
                '}';
    }
}
