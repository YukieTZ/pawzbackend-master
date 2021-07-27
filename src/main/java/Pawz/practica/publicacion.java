package Pawz.practica;

import javax.persistence.*;

@Entity
public class publicacion {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IdPublicacion;
    @Column
    private Integer IdUsuario;
    @Column
    private String Contenido;
    @Column
    private String Imagen;
    @Column
    private String hashtag;
    @Column
    private Integer Paws;

    public Integer getIdPublicacion() {
        return IdPublicacion;
    }

    public void setIdPublicacion(Integer idPublicacion) {
        IdPublicacion = idPublicacion;
    }

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        IdUsuario = idUsuario;
    }

    public String getContenido() {
        return Contenido;
    }

    public void setContenido(String contenido) {
        Contenido = contenido;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public Integer getPaws() {
        return Paws;
    }

    public void setPaws(Integer paws) {
        Paws = paws;
    }
}
