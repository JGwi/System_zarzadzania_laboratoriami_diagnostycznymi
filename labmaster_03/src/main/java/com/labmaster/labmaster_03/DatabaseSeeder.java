package com.labmaster.labmaster_03;

import com.labmaster.labmaster_03.entities.*;
import com.labmaster.labmaster_03.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private DiagnosticMachinesRepository diagnosticMachineRepository;
    @Autowired
    private Test_typesRepository test_typesRepository;
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private ResultsRepository resultsRepository;
    @Autowired
    private SampleRepository sampleRepository;

    @Override
    public void run(String... args) throws Exception {
        if (!userRepository.existsByUsername("admin")) {
            // Dodaj użytkownika "admin" tylko jeśli nie istnieje
            User adminUser = new User();
            adminUser.setUsername("admin");
            adminUser.setPassword(passwordEncoder.encode("admin")); // Szyfrujemy hasło
            adminUser.setEnabled(true);
            adminUser.setRole("ROLE_ADMIN");
            userRepository.save(adminUser);
        }

        if (diagnosticMachineRepository.count() == 0) {
            DiagnosticMachines machine1 = new DiagnosticMachines();
            machine1.setNazwaMaszyny("Analizator Biochemiczny");
            machine1.setProducent("Roche");
            machine1.setModel("Cobas 8000");
            machine1.setRokProdukcji(2018);
            machine1.setNumerSeryjny("1234567890");
            machine1.setDataZakupu(new Date(2018-1900, 4, 10)); // 2018-05-10
            machine1.setCenaZakupu(new BigDecimal("200000.00"));
            machine1.setStanTechniczny("Sprawny");
            machine1.setUwagi("Do badań biochemicznych");

            DiagnosticMachines machine2 = new DiagnosticMachines();
            machine2.setNazwaMaszyny("Analizator Wirusologiczny");
            machine2.setProducent("Abbott");
            machine2.setModel("m2000");
            machine2.setRokProdukcji(2019);
            machine2.setNumerSeryjny("2345678901");
            machine2.setDataZakupu(new Date(2019-1900, 5, 15)); // 2019-06-15
            machine2.setCenaZakupu(new BigDecimal("150000.00"));
            machine2.setStanTechniczny("Sprawny");
            machine2.setUwagi("Do badań wirusologicznych");

            DiagnosticMachines machine3 = new DiagnosticMachines();
            machine3.setNazwaMaszyny("Sekwencer Genetyczny");
            machine3.setProducent("Illumina");
            machine3.setModel("MiSeq");
            machine3.setRokProdukcji(2020);
            machine3.setNumerSeryjny("3456789012");
            machine3.setDataZakupu(new Date(2020, 7, 20));
            machine3.setCenaZakupu(new BigDecimal("300000.00"));
            machine3.setStanTechniczny("Sprawny");
            machine3.setUwagi("Do badań genetycznych");

            DiagnosticMachines machine4 = new DiagnosticMachines();
            machine4.setNazwaMaszyny("Analizator Immunologiczny");
            machine4.setProducent("Siemens");
            machine4.setModel("Atellica IM");
            machine4.setRokProdukcji(2017);
            machine4.setNumerSeryjny("4567890123");
            machine4.setDataZakupu(new Date(2017, 4, 25));
            machine4.setCenaZakupu(new BigDecimal("180000.00"));
            machine4.setStanTechniczny("Sprawny");
            machine4.setUwagi("Do badań immunologicznych");

            DiagnosticMachines machine5 = new DiagnosticMachines();
            machine5.setNazwaMaszyny("Analizator Toksykologiczny");
            machine5.setProducent("Thermo Fisher");
            machine5.setModel("TSQ 8000");
            machine5.setRokProdukcji(2016);
            machine5.setNumerSeryjny("5678901234");
            machine5.setDataZakupu(new Date(116, 2, 30)); // 2016-03-30
            machine5.setCenaZakupu(new BigDecimal("250000.00"));
            machine5.setStanTechniczny("Sprawny");
            machine5.setUwagi("Do badań toksykologicznych");

            DiagnosticMachines machine6 = new DiagnosticMachines();
            machine6.setNazwaMaszyny("Analizator Hematologiczny");
            machine6.setProducent("Sysmex");
            machine6.setModel("XN-1000");
            machine6.setRokProdukcji(2018);
            machine6.setNumerSeryjny("6789012345");
            machine6.setDataZakupu(new Date(118, 1, 14)); // 2018-02-14
            machine6.setCenaZakupu(new BigDecimal("220000.00"));
            machine6.setStanTechniczny("Sprawny");
            machine6.setUwagi("Do badań hematologicznych");

            DiagnosticMachines machine7 = new DiagnosticMachines();
            machine7.setNazwaMaszyny("Analizator Transfuzjologiczny");
            machine7.setProducent("Bio-Rad");
            machine7.setModel("Tango Optimo");
            machine7.setRokProdukcji(2019);
            machine7.setNumerSeryjny("7890123456");
            machine7.setDataZakupu(new Date(119, 0, 19)); // 2019-01-19
            machine7.setCenaZakupu(new BigDecimal("210000.00"));
            machine7.setStanTechniczny("Sprawny");
            machine7.setUwagi("Do badań transfuzjologicznych");

            DiagnosticMachines machine8 = new DiagnosticMachines();
            machine8.setNazwaMaszyny("Analizator Parazytologiczny");
            machine8.setProducent("Beckman Coulter");
            machine8.setModel("DxH 520");
            machine8.setRokProdukcji(2021);
            machine8.setNumerSeryjny("8901234567");
            machine8.setDataZakupu(new Date(121, 7, 23)); // 2021-08-23
            machine8.setCenaZakupu(new BigDecimal("230000.00"));
            machine8.setStanTechniczny("Sprawny");
            machine8.setUwagi("Do badań parazytologicznych");


            diagnosticMachineRepository.save(machine1);
            diagnosticMachineRepository.save(machine2);
            diagnosticMachineRepository.save(machine3);
            diagnosticMachineRepository.save(machine4);
            diagnosticMachineRepository.save(machine5);
            diagnosticMachineRepository.save(machine6);
            diagnosticMachineRepository.save(machine7);
            diagnosticMachineRepository.save(machine8);
        }

        if(test_typesRepository.count() == 0){
            Test_types testType1 = new Test_types();
            testType1.setCzas_wykonania(LocalTime.parse("01:30:00"));
            testType1.setKoszt(new BigDecimal("150.00"));
            testType1.setType("Biochemia");
            test_typesRepository.save(testType1);

            Test_types testType2 = new Test_types();
            testType2.setCzas_wykonania(LocalTime.parse("02:15:00"));
            testType2.setKoszt(new BigDecimal("200.00"));
            testType2.setType("Wirusologia");
            test_typesRepository.save(testType2);

            Test_types testType3 = new Test_types();
            testType3.setCzas_wykonania(LocalTime.parse("04:00:00"));
            testType3.setKoszt(new BigDecimal("300.00"));
            testType3.setType("Genetyka");
            test_typesRepository.save(testType3);

            Test_types testType4 = new Test_types();
            testType4.setCzas_wykonania(LocalTime.parse("01:45:00"));
            testType4.setKoszt(new BigDecimal("180.00"));
            testType4.setType("Immunologia");
            test_typesRepository.save(testType4);

            Test_types testType5 = new Test_types();
            testType5.setCzas_wykonania(LocalTime.parse("03:30:00"));
            testType5.setKoszt(new BigDecimal("250.00"));
            testType5.setType("Toksykologia");
            test_typesRepository.save(testType5);

            Test_types testType6 = new Test_types();
            testType6.setCzas_wykonania(LocalTime.parse("01:00:00"));
            testType6.setKoszt(new BigDecimal("120.00"));
            testType6.setType("Hematologia");
            test_typesRepository.save(testType6);

            Test_types testType7 = new Test_types();
            testType7.setCzas_wykonania(LocalTime.parse("05:00:00"));
            testType7.setKoszt(new BigDecimal("350.00"));
            testType7.setType("Transfuzjologia");
            test_typesRepository.save(testType7);

            Test_types testType8 = new Test_types();
            testType8.setCzas_wykonania(LocalTime.parse("02:30:00"));
            testType8.setKoszt(new BigDecimal("220.00"));
            testType8.setType("Parazytologia");
            test_typesRepository.save(testType8);
        }

        if (patientRepository.count() == 0) {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            Patient patient1 = new Patient();
            patient1.setData_ur(LocalDate.parse("1990-05-15", formatter));
            patient1.setPesel(12345678901L);
            patient1.setImie("Jan");
            patient1.setNazwisko("Kowalski");
            patient1.setNr_telefonu("123-456-789");
            patientRepository.save(patient1);

            Patient patient2 = new Patient();
            patient2.setData_ur(LocalDate.parse("1985-10-25", formatter));
            patient2.setPesel(98765432109L);
            patient2.setImie("Anna");
            patient2.setNazwisko("Nowak");
            patient2.setNr_telefonu("987-654-321");
            patientRepository.save(patient2);

            Patient patient3 = new Patient();
            patient3.setData_ur(LocalDate.parse("1978-03-07", formatter));
            patient3.setPesel(11223344556L);
            patient3.setImie("Piotr");
            patient3.setNazwisko("Wiśniewski");
            patient3.setNr_telefonu("111-222-333");
            patientRepository.save(patient3);

            Patient patient4 = new Patient();
            patient4.setData_ur(LocalDate.parse("1980-04-25", formatter));
            patient4.setPesel(78901234567L);
            patient4.setImie("Agnieszka");
            patient4.setNazwisko("Kamińska");
            patient4.setNr_telefonu("234-567-890");
            patientRepository.save(patient4);

            Patient patient5 = new Patient();
            patient5.setData_ur(LocalDate.parse("1990-05-15", formatter));
            patient5.setPesel(12345678901L);
            patient5.setImie("Basia");
            patient5.setNazwisko("Kowalska");
            patient5.setNr_telefonu("123-456-789");
            patientRepository.save(patient5);

            Patient patient6 = new Patient();
            patient6.setData_ur(LocalDate.parse("1985-11-10", formatter));
            patient6.setPesel(23456789012L);
            patient6.setImie("Kamil");
            patient6.setNazwisko("Lewandowski");
            patient6.setNr_telefonu("345-678-901");
            patientRepository.save(patient6);

            Patient patient7 = new Patient();
            patient7.setData_ur(LocalDate.parse("1997-08-05", formatter));
            patient7.setPesel(45678901234L);
            patient7.setImie("Weronika");
            patient7.setNazwisko("Dąbrowska");
            patient7.setNr_telefonu("567-890-123");
            patientRepository.save(patient7);

            Patient patient8 = new Patient();
            patient8.setData_ur(LocalDate.parse("1978-03-20", formatter));
            patient8.setPesel(67890123456L);
            patient8.setImie("Marta");
            patient8.setNazwisko("Zielińska");
            patient8.setNr_telefonu("678-901-234");
            patientRepository.save(patient8);

            Patient patient9 = new Patient();
            patient9.setData_ur(LocalDate.parse("1983-01-17", formatter));
            patient9.setPesel(89012345678L);
            patient9.setImie("Tomasz");
            patient9.setNazwisko("Szymański");
            patient9.setNr_telefonu("789-012-345");
            patientRepository.save(patient9);

            Patient patient10 = new Patient();
            patient10.setData_ur(LocalDate.parse("1992-06-23", formatter));
            patient10.setPesel(32109876543L);
            patient10.setImie("Natalia");
            patient10.setNazwisko("Wójcik");
            patient10.setNr_telefonu("901-234-567");
            patientRepository.save(patient10);

            Patient patient11 = new Patient();
            patient11.setData_ur(LocalDate.parse("1976-12-10", formatter));
            patient11.setPesel(54321098765L);
            patient11.setImie("Michał");
            patient11.setNazwisko("Kaczmarek");
            patient11.setNr_telefonu("012-345-678");
            patientRepository.save(patient11);

            Patient patient12 = new Patient();
            patient12.setData_ur(LocalDate.parse("1989-04-15", formatter));
            patient12.setPesel(76543210987L);
            patient12.setImie("Karolina");
            patient12.setNazwisko("Witkowska");
            patient12.setNr_telefonu("123-456-789");
            patientRepository.save(patient12);

            Patient patient13 = new Patient();
            patient13.setData_ur(LocalDate.parse("1974-10-02", formatter));
            patient13.setPesel(98765432100L);
            patient13.setImie("Krzysztof");
            patient13.setNazwisko("Zając");
            patient13.setNr_telefonu("234-567-890");
            patientRepository.save(patient13);

            Patient patient14 = new Patient();
            patient14.setData_ur(LocalDate.parse("1995-07-19", formatter));
            patient14.setPesel(87654321098L);
            patient14.setImie("Monika");
            patient14.setNazwisko("Król");
            patient14.setNr_telefonu("345-678-901");
            patientRepository.save(patient14);

            Patient patient15 = new Patient();
            patient15.setData_ur(LocalDate.parse("1982-08-14", formatter));
            patient15.setPesel(65432109876L);
            patient15.setImie("Mariusz");
            patient15.setNazwisko("Pawlak");
            patient15.setNr_telefonu("456-789-012");
            patientRepository.save(patient15);

            Patient patient16 = new Patient();
            patient16.setData_ur(LocalDate.parse("1991-03-28", formatter));
            patient16.setPesel(43210987654L);
            patient16.setImie("Magdalena");
            patient16.setNazwisko("Michalak");
            patient16.setNr_telefonu("567-890-123");
            patientRepository.save(patient16);

            Patient patient17 = new Patient();
            patient17.setData_ur(LocalDate.parse("1977-09-05", formatter));
            patient17.setPesel(21098765432L);
            patient17.setImie("Łukasz");
            patient17.setNazwisko("Wróbel");
            patient17.setNr_telefonu("678-901-234");
            patientRepository.save(patient17);

            Patient patient18 = new Patient();
            patient18.setData_ur(LocalDate.parse("1986-05-02", formatter));
            patient18.setPesel(10987654321L);
            patient18.setImie("Aneta");
            patient18.setNazwisko("Duda");
            patient18.setNr_telefonu("789-012-345");
            patientRepository.save(patient18);

            Patient patient19 = new Patient();
            patient19.setData_ur(LocalDate.parse("2001-07-07", formatter));
            patient19.setPesel(99999999999L);
            patient19.setImie("Jowal");
            patient19.setNazwisko("Jakub");
            patient19.setNr_telefonu("735-344-444");
            patientRepository.save(patient19);

            Patient patient20 = new Patient();
            patient20.setData_ur(LocalDate.parse("2024-04-23", formatter));
            patient20.setPesel(12345678765L);
            patient20.setImie("Nowaj");
            patient20.setNazwisko("Jak");
            patient20.setNr_telefonu("123-123-123");
            patientRepository.save(patient20);
        }

        if (resultsRepository.count() == 0) {
            Results result1 = new Results();
            result1.setInne("Brak uwagi");
            result1.setInterpretacja("Dodatnie przeciwciała IgG");
            result1.setWynik("Obecność przeciwciał IgG");
            result1.setPatient(patientRepository.findById(2).orElse(null));
            resultsRepository.save(result1);

            Results result2 = new Results();
            result2.setInne("Brak uwag");
            result2.setInterpretacja("Brak nietypowych mutacji");
            result2.setWynik("Brak mutacji genetycznych");
            result2.setPatient(patientRepository.findById(3).orElse(null));
            resultsRepository.save(result2);

            Results result3 = new Results();
            result3.setInne("Brak uwag");
            result3.setInterpretacja("Wszystkie wartości w normie");
            result3.setWynik("0,6 mg/dL (norma: <1,2 mg/dL)");
            result3.setPatient(patientRepository.findById(4).orElse(null));
            resultsRepository.save(result3);

            Results result4 = new Results();
            result4.setInne("Brak uwag");
            result4.setInterpretacja("Liczba komórek w normie");
            result4.setWynik("RBC: 4,5 mln/µL, WBC: 7,2 tys./µL");
            result4.setPatient(patientRepository.findById(5).orElse(null));
            resultsRepository.save(result4);

            Results result5 = new Results();
            result5.setInne("Uwaga: Niski poziom potasu");
            result5.setInterpretacja("Niski poziom potasu");
            result5.setWynik("3,1 mmol/L (norma: 3,5-5,1 mmol/L)");
            result5.setPatient(patientRepository.findById(6).orElse(null));
            resultsRepository.save(result5);

            Results result6 = new Results();
            result6.setInne("Brak uwag");
            result6.setInterpretacja("Brak obecności toksyn");
            result6.setWynik("Nie wykryto toksyn");
            result6.setPatient(patientRepository.findById(7).orElse(null));
            resultsRepository.save(result6);

            Results result7 = new Results();
            result7.setInne("Brak uwag");
            result7.setInterpretacja("Wszystkie wartości w normie");
            result7.setWynik("Grupa krwi: A Rh+");
            result7.setPatient(patientRepository.findById(8).orElse(null));
            resultsRepository.save(result7);

            Results result8 = new Results();
            result8.setInne("Brak uwag");
            result8.setInterpretacja("Wszystkie wartości w normie");
            result8.setWynik("1.2 mg/dL (norma: <1,4 mg/dL)");
            result8.setPatient(patientRepository.findById(9).orElse(null));
            resultsRepository.save(result8);

            Results result9 = new Results();
            result9.setInne("Brak uwag");
            result9.setInterpretacja("Brak obecności pasożytów");
            result9.setWynik("Nie wykryto pasożytów");
            result9.setPatient(patientRepository.findById(10).orElse(null));
            resultsRepository.save(result9);

            Results result10 = new Results();
            result10.setInne("Brak uwag");
            result10.setInterpretacja("Wszystkie wartości w normie");
            result10.setWynik("7,8 (norma: 4,2-5,4)");
            result10.setPatient(patientRepository.findById(11).orElse(null));
            resultsRepository.save(result10);

            Results result11 = new Results();
            result11.setInne("Brak uwag");
            result11.setInterpretacja("Obecność przeciwciał IgM");
            result11.setWynik("Dodatnie przeciwciała IgM");
            result11.setPatient(patientRepository.findById(12).orElse(null));
            resultsRepository.save(result11);

            Results result12 = new Results();
            result12.setInne("Brak uwag");
            result12.setInterpretacja("Wszystkie wartości w normie");
            result12.setWynik("140/90 mmHg (norma: <120/80 mmHg)");
            result12.setPatient(patientRepository.findById(13).orElse(null));
            resultsRepository.save(result12);

            Results result13 = new Results();
            result13.setInne("Brak uwag");
            result13.setInterpretacja("Wszystkie wartości w normie");
            result13.setWynik("200 mg/dL (norma: <200 mg/dL)");
            result13.setPatient(patientRepository.findById(14).orElse(null));
            resultsRepository.save(result13);

            Results result14 = new Results();
            result14.setInne("Brak uwag");
            result14.setInterpretacja("Brak obecności wirusów");
            result14.setWynik("Nie wykryto wirusów");
            result14.setPatient(patientRepository.findById(15).orElse(null));
            resultsRepository.save(result14);

            Results result15 = new Results();
            result15.setInne("Brak uwag");
            result15.setInterpretacja("Wszystkie wartości w normie");
            result15.setWynik("15.000/µL (norma: 150.000-400.000/µL)");
            result15.setPatient(patientRepository.findById(16).orElse(null));
            resultsRepository.save(result15);

            Results result16 = new Results();
            result16.setInne("Brak uwag");
            result16.setInterpretacja("Wszystkie wartości w normie");
            result16.setWynik("12,5 g/dL (norma: 12-16 g/dL)");
            result16.setPatient(patientRepository.findById(17).orElse(null));
            resultsRepository.save(result16);

            Results result17 = new Results();
            result17.setInne("Brak uwag");
            result17.setInterpretacja("Wszystkie wartości w normie");
            result17.setWynik("35 (norma: 12-50)");
            result17.setPatient(patientRepository.findById(18).orElse(null));
            resultsRepository.save(result17);

            Results result18 = new Results();
            result18.setInne("Brak uwag");
            result18.setInterpretacja("Wszystkie wartości w normie");
            result18.setWynik("95 mg/dL (norma: 70-99 mg/dL)");
            result18.setPatient(patientRepository.findById(19).orElse(null));
            resultsRepository.save(result18);

            Results result19 = new Results();
            result19.setInne("Brak uwag");
            result19.setInterpretacja("Wszystkie wartości w normie");
            result19.setWynik("5,5 mln/µL (norma: 4,5-6 mln/µL)");
            result19.setPatient(patientRepository.findById(20).orElse(null));
            resultsRepository.save(result19);
        }


    }
}
