package domein;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = "username")
@Table(name = "gebruikers")
public class MyUser implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String username;

  @Column(nullable = false)
  private String password;

  @Column(nullable = true)
  private String enabled;

  @Enumerated(EnumType.STRING)
  @Column(length = 20)
  private Role role;

  @OneToMany(mappedBy = "user")
  private Set<Ticket> aangekochteTickets;
}