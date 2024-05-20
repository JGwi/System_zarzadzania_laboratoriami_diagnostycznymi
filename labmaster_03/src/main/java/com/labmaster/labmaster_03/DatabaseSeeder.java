package com.labmaster.labmaster_03;

import com.labmaster.labmaster_03.entities.DiagnosticMachines;
import com.labmaster.labmaster_03.entities.User;
import com.labmaster.labmaster_03.repositories.DiagnosticMachinesRepository;
import com.labmaster.labmaster_03.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private DiagnosticMachinesRepository diagnosticMachineRepository;

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

//        if (MachineRepository.count() == 0){
//
//        }
    }
}
