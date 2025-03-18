package remington.demo.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Risks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRisks;

    private boolean physical;
    private boolean mechanical;
    private boolean ergonomic;
    private boolean psychosocial;
    private boolean biological;

    public Long getIdRisks() {
        return idRisks;
    }

    public void setIdRisks(Long idRisks) {
        this.idRisks = idRisks;
    }

    public boolean isPhysical() {
        return physical;
    }

    public void setPhysical(boolean physical) {
        this.physical = physical;
    }

    public boolean isMechanical() {
        return mechanical;
    }

    public void setMechanical(boolean mechanical) {
        this.mechanical = mechanical;
    }

    public boolean isErgonomic() {
        return ergonomic;
    }

    public void setErgonomic(boolean ergonomic) {
        this.ergonomic = ergonomic;
    }

    public boolean isPsychosocial() {
        return psychosocial;
    }

    public void setPsychosocial(boolean psychosocial) {
        this.psychosocial = psychosocial;
    }

    public boolean isBiological() {
        return biological;
    }

    public void setBiological(boolean biological) {
        this.biological = biological;
    }
}
