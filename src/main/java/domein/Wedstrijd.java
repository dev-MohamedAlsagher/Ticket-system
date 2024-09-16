package domein;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "wedstrijden")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wedstrijd {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sport_id")
    private Sport sport;

    
}
