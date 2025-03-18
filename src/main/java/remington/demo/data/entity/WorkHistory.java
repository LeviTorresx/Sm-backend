package remington.demo.data.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class WorkHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWorkHistory;

    private String company;
    private String jobTitle;
    private String workDuration;

    @OneToOne(cascade = CascadeType.ALL)
    private Risks risks;

    private boolean workAccident;
    private boolean occupationalDisease;

    public Long getIdWorkHistory() {
        return idWorkHistory;
    }

    public void setIdWorkHistory(Long idWorkHistory) {
        this.idWorkHistory = idWorkHistory;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(String workDuration) {
        this.workDuration = workDuration;
    }

    public Risks getRisks() {
        return risks;
    }

    public void setRisks(Risks risks) {
        this.risks = risks;
    }

    public boolean isWorkAccident() {
        return workAccident;
    }

    public void setWorkAccident(boolean workAccident) {
        this.workAccident = workAccident;
    }

    public boolean isOccupationalDisease() {
        return occupationalDisease;
    }

    public void setOccupationalDisease(boolean occupationalDisease) {
        this.occupationalDisease = occupationalDisease;
    }
}
