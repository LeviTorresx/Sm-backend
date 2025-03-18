package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Habits {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHabits;

    private boolean smoking;
    private boolean exSmoker;
    private Integer cigarettesPerDay;
    private Integer yearsOfConsumption;
    private boolean alcohol;
    private String alcoholFrequency;
    private boolean substances;
    private boolean sports;
    private String sportsFrequency;

    public Long getIdHabits() {
        return idHabits;
    }

    public void setIdHabits(Long idHabits) {
        this.idHabits = idHabits;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }

    public boolean isExSmoker() {
        return exSmoker;
    }

    public void setExSmoker(boolean exSmoker) {
        this.exSmoker = exSmoker;
    }

    public Integer getCigarettesPerDay() {
        return cigarettesPerDay;
    }

    public void setCigarettesPerDay(Integer cigarettesPerDay) {
        this.cigarettesPerDay = cigarettesPerDay;
    }

    public Integer getYearsOfConsumption() {
        return yearsOfConsumption;
    }

    public void setYearsOfConsumption(Integer yearsOfConsumption) {
        this.yearsOfConsumption = yearsOfConsumption;
    }

    public boolean isAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public String getAlcoholFrequency() {
        return alcoholFrequency;
    }

    public void setAlcoholFrequency(String alcoholFrequency) {
        this.alcoholFrequency = alcoholFrequency;
    }

    public boolean isSubstances() {
        return substances;
    }

    public void setSubstances(boolean substances) {
        this.substances = substances;
    }

    public boolean isSports() {
        return sports;
    }

    public void setSports(boolean sports) {
        this.sports = sports;
    }

    public String getSportsFrequency() {
        return sportsFrequency;
    }

    public void setSportsFrequency(String sportsFrequency) {
        this.sportsFrequency = sportsFrequency;
    }
}
