
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LINHA")
public class Linha implements java.io.Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private int id;
    
    @Column(name = "horario_seg_sext",length = 5, nullable = false)
    private String horario_seg_sext;
    
    @Column(name = "horario_sab",length = 5, nullable = false)
    private String horario_sab;
    
    @Column(name = "horario_dom",length = 5, nullable = false)
    private String horario_dom;
    
    @Column(name = "descricaoLinha",length = 5, nullable = false)
    private String descricaoLinha;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_onibus",nullable = false, referencedColumnName = "id")
    private Onibus onibus;
    
    @ManyToOne(cascade = CascadeType.DETACH,fetch = FetchType.EAGER)
    @JoinColumn(name = "id_itinerario",nullable = false, referencedColumnName = "id")
    private Itinerario itinerario;
}
