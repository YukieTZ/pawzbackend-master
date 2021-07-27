package Pawz.practica;

import javax.persistence.*;

@Entity
public class Friends {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer IdAmistad;
    @Column
    private Integer IdUsuario;
    @Column
    private Integer IdAmiwo;

    public Integer getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(Integer idUsuario2) { this.IdUsuario = idUsuario2; }

    public Integer getIdAmiwo() {
        return IdAmiwo;
    }

    public void setIdAmiwo(Integer idAmiwo) {
        this.IdAmiwo = idAmiwo;
    }
}
