package Pawz.practica;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name="usuario")
public class usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IdUsuario;
    @Column
    private String nombre;
    @Column
    private String Passwd;
    @Column
    private String Correo;
    @Column
    private String ImgPerfil;
    @Column
    private String Ubicacion;

    public usuario() {}

    public usuario(String nombre, String passwd, String correo, String imgPerfil, String ubicacion) {
        this.nombre = nombre;
        this.Passwd = passwd;
        this.Correo = correo;
        this.ImgPerfil = imgPerfil;
        this.Ubicacion = ubicacion;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return Passwd;
    }

    public void setPasswd(String Passwd) {
        this.Passwd = Passwd;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getImgPerfil() {
        return ImgPerfil;
    }

    public void setImgPerfil(String ImgPerfil) {
        this.ImgPerfil = ImgPerfil;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

}
