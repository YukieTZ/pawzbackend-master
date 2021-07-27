package Pawz.practica;

import javax.persistence.*;

@Entity
public class comentarios {


    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IdComentario;
    @Column
    private Integer IdUsuario;
    @Column
    private Integer IdPublicacion;
    @Column
    private String Contenido;
    @Column
    private Integer paws;

    public Integer getIdComentario() { return IdComentario; }

    public void setIdComentario(Integer idComentario) { IdComentario = idComentario; }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.IdUsuario = idUsuario;
    }

    public Integer getIdPublicacion() {
        return IdPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        this.IdPublicacion = idPublicacion;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        this.Contenido = contenido;
    }

    public Integer getPaws() {
        return paws;
    }

    public void setPaws(Integer paws) {
        this.paws = paws;
    }
}
