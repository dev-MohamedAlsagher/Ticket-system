package domein;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tickets")
@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private MyUser user;
    
    @ManyToOne
    @JoinColumn(name = "wedstrijdId")
    private Wedstrijd wedstrijd;
    
    @Column
    private double price;
    
    @Column
    private int aantal;
}
