package com.sportGames.config;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import domein.*;
import repository.*;

@Component
public class InitDataConfig implements CommandLineRunner {

        private PasswordEncoder encoder = new BCryptPasswordEncoder();

        @Autowired
        private UserRepository userRepository;

//        @Autowired
//        private SportRepository sportRepository;
//
//        @Autowired
//        private WedstrijdRepository wedstrijdRepository;
//
//        @Autowired
//        private StadiumRepository stadiumRepository;
//
//        @Autowired
//        private TicketRepository ticketRepository;
//
//        @Autowired
//        private DisciplineRepository disciplineRepository;
//
//        @Autowired
//        private OlympischNummerRepository olympischNummerRepository;

        @Override
        public void run(String... args) {

                // users
                MyUser user = MyUser.builder().username("user").role(Role.USER)
                                .password(encoder.encode("1234")).build();

                MyUser admin = MyUser.builder().username("admin").role(Role.ADMIN)
                                .password(encoder.encode("1234")).build();

                List<MyUser> userList = Arrays.asList(admin, user);
                userRepository.saveAll(userList);

//                // Sporten
//                Sport voetbal = Sport.builder().naam("Voetbal").icon("fas fa-futbol").build();
//                Sport basketbal = Sport.builder().naam("Basketbal").icon("fas fa-basketball-ball")
//                                .build();
//                Sport zwemmen = Sport.builder().naam("Zwemmen").icon("fas fa-swimmer").build();
//                Sport basebal = Sport.builder().naam("Basebal").icon("fas fa-baseball-ball").build();
//                Sport tafeltennis = Sport.builder().naam("Tafeltennis").icon("fas fa-table-tennis")
//                                .build();
//                List<Sport> sportList = Arrays.asList(voetbal, basketbal, zwemmen, basebal, tafeltennis);
//                sportRepository.saveAll(sportList);
//                // Stadiums
//                Stadium stadiumA = Stadium.builder().naam("Stadion A").build();
//                Stadium stadiumB = Stadium.builder().naam("Stadion B").build();
//                Stadium stadiumC = Stadium.builder().naam("Stadion C").build();
//                Stadium stadiumD = Stadium.builder().naam("Stadion D").build();
//
//                List<Stadium> stadiumList = Arrays.asList(stadiumA, stadiumB, stadiumC, stadiumD);
//                stadiumRepository.saveAll(stadiumList);
//
//                // Disciplines
//                Discipline discipline1 = Discipline.builder().naam("Mannen match").sport(voetbal).build();
//                Discipline discipline2 = Discipline.builder().naam("Vrouwen match").sport(voetbal).build();
//                Discipline discipline3 = Discipline.builder().naam("Freestyle dunking").sport(basketbal).build();
//                Discipline discipline4 = Discipline.builder().naam("Driepuntschot").sport(basketbal).build();
//                Discipline discipline5 = Discipline.builder().naam("100 meter vrije slag").sport(zwemmen).build();
//                Discipline discipline6 = Discipline.builder().naam("200 meter rugslag").sport(zwemmen).build();
//                Discipline discipline7 = Discipline.builder().naam("Home run").sport(basebal).build();
//                Discipline discipline8 = Discipline.builder().naam("Pitching").sport(basebal).build();
//                Discipline discipline9 = Discipline.builder().naam("Enkelspel").sport(tafeltennis).build();
//                Discipline discipline10 = Discipline.builder().naam("Dubbelspel").sport(tafeltennis).build();
//                List<Discipline> disciplineList = Arrays.asList(discipline1, discipline2, discipline3, discipline4,
//                                discipline5, discipline6, discipline7, discipline8, discipline9, discipline10);
//                disciplineRepository.saveAll(disciplineList);
//
//                // Wedstrijden
//                Wedstrijd voetbal1 = Wedstrijd.builder().sport(voetbal).datum(LocalDate.now())
//                                .aanvangsuur(LocalTime.now())
//                                .stadium(stadiumA).beschikbarePlaatsen(100).ticketPrijs(BigDecimal.valueOf(25.00))
//                                .build();
//                Wedstrijd voetbal2 = Wedstrijd.builder().sport(voetbal).datum(LocalDate.now().plusDays(1))
//                                .aanvangsuur(LocalTime.now().plusHours(2))
//                                .stadium(stadiumB).beschikbarePlaatsen(120).ticketPrijs(BigDecimal.valueOf(30.00))
//                                .build();
//                Wedstrijd voetbal3 = Wedstrijd.builder().sport(voetbal).datum(LocalDate.now().plusDays(2))
//                                .aanvangsuur(LocalTime.now().plusHours(3))
//                                .stadium(stadiumC).beschikbarePlaatsen(150).ticketPrijs(BigDecimal.valueOf(35.00))
//                                .build();
//                Wedstrijd voetbal4 = Wedstrijd.builder().sport(voetbal).datum(LocalDate.now().plusDays(3))
//                                .aanvangsuur(LocalTime.now().plusHours(4))
//                                .stadium(stadiumC).beschikbarePlaatsen(130).ticketPrijs(BigDecimal.valueOf(30.00))
//                                .build();
//                Wedstrijd voetbal5 = Wedstrijd.builder().sport(voetbal).datum(LocalDate.now().plusDays(4))
//                                .aanvangsuur(LocalTime.now().plusHours(5))
//                                .stadium(stadiumD).beschikbarePlaatsen(120).ticketPrijs(BigDecimal.valueOf(35.00))
//                                .build();
//                Wedstrijd basketbal1 = Wedstrijd.builder().sport(basketbal).datum(LocalDate.now())
//                                .aanvangsuur(LocalTime.now())
//                                .stadium(stadiumB).beschikbarePlaatsen(200).ticketPrijs(BigDecimal.valueOf(20.00))
//                                .build();
//                Wedstrijd basketbal2 = Wedstrijd.builder().sport(basketbal).datum(LocalDate.now().plusDays(1))
//                                .aanvangsuur(LocalTime.now().plusHours(2))
//                                .stadium(stadiumA).beschikbarePlaatsen(180).ticketPrijs(BigDecimal.valueOf(25.00))
//                                .build();
//                Wedstrijd basketbal3 = Wedstrijd.builder().sport(basketbal).datum(LocalDate.now().plusDays(2))
//                                .aanvangsuur(LocalTime.now().plusHours(3))
//                                .stadium(stadiumD).beschikbarePlaatsen(200).ticketPrijs(BigDecimal.valueOf(30.00))
//                                .build();
//                Wedstrijd basketbal4 = Wedstrijd.builder().sport(basketbal).datum(LocalDate.now().plusDays(3))
//                                .aanvangsuur(LocalTime.now().plusHours(4))
//                                .stadium(stadiumA).beschikbarePlaatsen(170).ticketPrijs(BigDecimal.valueOf(25.00))
//                                .build();
//                Wedstrijd basketbal5 = Wedstrijd.builder().sport(basketbal).datum(LocalDate.now().plusDays(4))
//                                .aanvangsuur(LocalTime.now().plusHours(5))
//                                .stadium(stadiumB).beschikbarePlaatsen(180).ticketPrijs(BigDecimal.valueOf(30.00))
//                                .build();
//                Wedstrijd zwemmen1 = Wedstrijd.builder().sport(zwemmen).datum(LocalDate.now())
//                                .aanvangsuur(LocalTime.now())
//                                .stadium(stadiumC).beschikbarePlaatsen(150).ticketPrijs(BigDecimal.valueOf(15.00))
//                                .build();
//                Wedstrijd zwemmen2 = Wedstrijd.builder().sport(zwemmen).datum(LocalDate.now().plusDays(1))
//                                .aanvangsuur(LocalTime.now().plusHours(2))
//                                .stadium(stadiumB).beschikbarePlaatsen(130).ticketPrijs(BigDecimal.valueOf(20.00))
//                                .build();
//                Wedstrijd zwemmen3 = Wedstrijd.builder().sport(zwemmen).datum(LocalDate.now().plusDays(2))
//                                .aanvangsuur(LocalTime.now().plusHours(3))
//                                .stadium(stadiumC).beschikbarePlaatsen(140).ticketPrijs(BigDecimal.valueOf(25.00))
//                                .build();
//                Wedstrijd zwemmen4 = Wedstrijd.builder().sport(zwemmen).datum(LocalDate.now().plusDays(3))
//                                .aanvangsuur(LocalTime.now().plusHours(4))
//                                .stadium(stadiumB).beschikbarePlaatsen(140).ticketPrijs(BigDecimal.valueOf(20.00))
//                                .build();
//                Wedstrijd zwemmen5 = Wedstrijd.builder().sport(zwemmen).datum(LocalDate.now().plusDays(4))
//                                .aanvangsuur(LocalTime.now().plusHours(5))
//                                .stadium(stadiumC).beschikbarePlaatsen(150).ticketPrijs(BigDecimal.valueOf(25.00))
//                                .build();
//                Wedstrijd basebal1 = Wedstrijd.builder().sport(basebal).datum(LocalDate.now())
//                                .aanvangsuur(LocalTime.now())
//                                .stadium(stadiumD).beschikbarePlaatsen(120).ticketPrijs(BigDecimal.valueOf(18.00))
//                                .build();
//                Wedstrijd basebal2 = Wedstrijd.builder().sport(basebal).datum(LocalDate.now().plusDays(1))
//                                .aanvangsuur(LocalTime.now().plusHours(2))
//                                .stadium(stadiumA).beschikbarePlaatsen(110).ticketPrijs(BigDecimal.valueOf(22.00))
//                                .build();
//                Wedstrijd basebal3 = Wedstrijd.builder().sport(basebal).datum(LocalDate.now().plusDays(2))
//                                .aanvangsuur(LocalTime.now().plusHours(3))
//                                .stadium(stadiumD).beschikbarePlaatsen(130).ticketPrijs(BigDecimal.valueOf(27.00))
//                                .build();
//                Wedstrijd basebal4 = Wedstrijd.builder().sport(basebal).datum(LocalDate.now().plusDays(3))
//                                .aanvangsuur(LocalTime.now().plusHours(4))
//                                .stadium(stadiumA).beschikbarePlaatsen(100).ticketPrijs(BigDecimal.valueOf(22.00))
//                                .build();
//                Wedstrijd basebal5 = Wedstrijd.builder().sport(basebal).datum(LocalDate.now().plusDays(4))
//                                .aanvangsuur(LocalTime.now().plusHours(5))
//                                .stadium(stadiumD).beschikbarePlaatsen(110).ticketPrijs(BigDecimal.valueOf(27.00))
//                                .build();
//                Wedstrijd tafeltennis1 = Wedstrijd.builder().sport(tafeltennis).datum(LocalDate.now())
//                                .aanvangsuur(LocalTime.now())
//                                .stadium(stadiumA).beschikbarePlaatsen(180).ticketPrijs(BigDecimal.valueOf(12.00))
//                                .build();
//                Wedstrijd tafeltennis2 = Wedstrijd.builder().sport(tafeltennis).datum(LocalDate.now().plusDays(1))
//                                .aanvangsuur(LocalTime.now().plusHours(2))
//                                .stadium(stadiumB).beschikbarePlaatsen(160).ticketPrijs(BigDecimal.valueOf(18.00))
//                                .build();
//                Wedstrijd tafeltennis3 = Wedstrijd.builder().sport(tafeltennis).datum(LocalDate.now().plusDays(2))
//                                .aanvangsuur(LocalTime.now().plusHours(3))
//                                .stadium(stadiumC).beschikbarePlaatsen(170).ticketPrijs(BigDecimal.valueOf(23.00))
//                                .build();
//                Wedstrijd tafeltennis4 = Wedstrijd.builder().sport(tafeltennis).datum(LocalDate.now().plusDays(3))
//                                .aanvangsuur(LocalTime.now().plusHours(4))
//                                .stadium(stadiumB).beschikbarePlaatsen(160).ticketPrijs(BigDecimal.valueOf(18.00))
//                                .build();
//                Wedstrijd tafeltennis5 = Wedstrijd.builder().sport(tafeltennis).datum(LocalDate.now().plusDays(4))
//                                .aanvangsuur(LocalTime.now().plusHours(5))
//                                .stadium(stadiumC).beschikbarePlaatsen(170).ticketPrijs(BigDecimal.valueOf(23.00))
//                                .build();
//
//                voetbal1.setDisciplines(Arrays.asList(discipline1, discipline2));
//                voetbal2.setDisciplines(Arrays.asList(discipline1, discipline2));
//                voetbal3.setDisciplines(Arrays.asList(discipline1, discipline2));
//                voetbal4.setDisciplines(Arrays.asList(discipline1, discipline2));
//                voetbal5.setDisciplines(Arrays.asList(discipline1, discipline2));
//
//                basketbal1.setDisciplines(Arrays.asList(discipline3, discipline4));
//                basketbal2.setDisciplines(Arrays.asList(discipline3, discipline4));
//                basketbal3.setDisciplines(Arrays.asList(discipline3, discipline4));
//                basketbal4.setDisciplines(Arrays.asList(discipline3, discipline4));
//                basketbal5.setDisciplines(Arrays.asList(discipline3, discipline4));
//
//                zwemmen1.setDisciplines(Arrays.asList(discipline5, discipline6));
//                zwemmen2.setDisciplines(Arrays.asList(discipline5, discipline6));
//                zwemmen3.setDisciplines(Arrays.asList(discipline5, discipline6));
//                zwemmen4.setDisciplines(Arrays.asList(discipline5, discipline6));
//                zwemmen5.setDisciplines(Arrays.asList(discipline5, discipline6));
//
//                basebal1.setDisciplines(Arrays.asList(discipline7, discipline8));
//                basebal2.setDisciplines(Arrays.asList(discipline7, discipline8));
//                basebal3.setDisciplines(Arrays.asList(discipline7, discipline8));
//                basebal4.setDisciplines(Arrays.asList(discipline7, discipline8));
//                basebal5.setDisciplines(Arrays.asList(discipline7, discipline8));
//
//                tafeltennis1.setDisciplines(Arrays.asList(discipline9, discipline10));
//                tafeltennis2.setDisciplines(Arrays.asList(discipline9, discipline10));
//                tafeltennis3.setDisciplines(Arrays.asList(discipline9, discipline10));
//                tafeltennis4.setDisciplines(Arrays.asList(discipline9, discipline10));
//                tafeltennis5.setDisciplines(Arrays.asList(discipline9, discipline10));
//
//                List<Wedstrijd> wedstrijdList = Arrays.asList(voetbal1, basketbal1, zwemmen1, basebal1, tafeltennis1,
//                                voetbal2, voetbal3, basketbal2, basketbal3, zwemmen2, zwemmen3, basebal2, basebal3,
//                                tafeltennis2, tafeltennis3, voetbal4, voetbal5, basketbal4, basketbal5,
//                                zwemmen4, zwemmen5, basebal4, basebal5, tafeltennis4, tafeltennis5);
//                wedstrijdRepository.saveAll(wedstrijdList);
//
//                // Tickets
//                Ticket ticket1 = Ticket.builder().wedstrijd(voetbal1).user(user).aantal(50).build();
//                Ticket ticket2 = Ticket.builder().wedstrijd(basketbal1).user(admin).aantal(15).build();
//                Ticket ticket3 = Ticket.builder().wedstrijd(zwemmen1).user(user).aantal(30).build();
//                Ticket ticket4 = Ticket.builder().wedstrijd(basebal1).user(admin).aantal(10).build();
//                Ticket ticket5 = Ticket.builder().wedstrijd(tafeltennis1).user(user).aantal(25).build();
//
//                List<Ticket> ticketList = Arrays.asList(ticket1, ticket2, ticket3, ticket4, ticket5);
//                ticketRepository.saveAll(ticketList);
//
//                // Olympische Nummers
//                OlympischNummer nummer1 = OlympischNummer.builder().nummer("12345").build();
//                OlympischNummer nummer2 = OlympischNummer.builder().nummer("23456").build();
//                OlympischNummer nummer3 = OlympischNummer.builder().nummer("34567").build();
//                OlympischNummer nummer4 = OlympischNummer.builder().nummer("45678").build();
//
//                List<OlympischNummer> nummerList = Arrays.asList(nummer1, nummer2, nummer3, nummer4);
//                olympischNummerRepository.saveAll(nummerList);
        }

}
