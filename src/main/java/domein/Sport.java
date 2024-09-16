package domein;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "sports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "sport")
    private List<Wedstrijd> wedstrijden;

    // Other properties of Sport

    // Constructors, getters, and setters
}
