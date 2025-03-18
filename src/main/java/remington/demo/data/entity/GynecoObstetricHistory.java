package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class GynecoObstetricHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGynecoObstetricHistory;

    private String menarche;
    private String cycles;
    private Integer g;
    private Integer p;
    private Integer a;
    private Integer v;
    private String lastMenstrualPeriod;
    private boolean usesContraception;
    private String contraceptionMethod;
    private String papSmear;


    public String getLastMenstrualPeriod() {
        return lastMenstrualPeriod;
    }

    public void setLastMenstrualPeriod(String lastMenstrualPeriod) {
        this.lastMenstrualPeriod = lastMenstrualPeriod;
    }

    public Long getIdGynecoObstetricHistory() {
        return idGynecoObstetricHistory;
    }

    public void setIdGynecoObstetricHistory(Long idGynecoObstetricHistory) {
        this.idGynecoObstetricHistory = idGynecoObstetricHistory;
    }

    public String getMenarche() {
        return menarche;
    }

    public void setMenarche(String menarche) {
        this.menarche = menarche;
    }

    public String getCycles() {
        return cycles;
    }

    public void setCycles(String cycles) {
        this.cycles = cycles;
    }

    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    public Integer getP() {
        return p;
    }

    public void setP(Integer p) {
        this.p = p;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getV() {
        return v;
    }

    public void setV(Integer v) {
        this.v = v;
    }



    public boolean isUsesContraception() {
        return usesContraception;
    }

    public void setUsesContraception(boolean usesContraception) {
        this.usesContraception = usesContraception;
    }

    public String getContraceptionMethod() {
        return contraceptionMethod;
    }

    public void setContraceptionMethod(String contraceptionMethod) {
        this.contraceptionMethod = contraceptionMethod;
    }

    public String getPapSmear() {
        return papSmear;
    }

    public void setPapSmear(String papSmear) {
        this.papSmear = papSmear;
    }
}
