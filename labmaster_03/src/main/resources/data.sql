INSERT IGNORE INTO `patients` (`id`, `data_ur`, `pesel`, `imie`, `nazwisko`, `nr_telefonu`)
VALUES
(1, '1988-07-21', 34567890123, 'Marek', 'Nowak', '456-789-012'),
(2, '1993-02-12', 98765432109, 'Ewa', 'Kowalczyk', '789-012-345'),
(3, '1975-09-30', 56789012345, 'Piotr', 'Wiśniewski', '012-345-678'),
(4, '1980-04-25', 78901234567, 'Agnieszka', 'Kamińska', '234-567-890'),
(5, '1990-05-15', 12345678901, 'Basia', 'Kowalska', '123-456-789'),
(6, '1985-11-10', 23456789012, 'Kamil', 'Lewandowski', '345-678-901'),
(7, '1997-08-05', 45678901234, 'Weronika', 'Dąbrowska', '567-890-123'),
(8, '1978-03-20', 67890123456, 'Marta', 'Zielińska', '678-901-234'),
(9, '1983-01-17', 89012345678, 'Tomasz', 'Szymański', '789-012-345'),
(10, '1992-06-23', 32109876543, 'Natalia', 'Wójcik', '901-234-567'),
(11, '1976-12-10', 54321098765, 'Michał', 'Kaczmarek', '012-345-678'),
(12, '1989-04-15', 76543210987, 'Karolina', 'Witkowska', '123-456-789'),
(13, '1974-10-02', 98765432100, 'Krzysztof', 'Zając', '234-567-890'),
(14, '1995-07-19', 87654321098, 'Monika', 'Król', '345-678-901'),
(15, '1982-08-14', 65432109876, 'Mariusz', 'Pawlak', '456-789-012'),
(16, '1991-03-28', 43210987654, 'Magdalena', 'Michalak', '567-890-123'),
(17, '1977-09-05', 21098765432, 'Łukasz', 'Wróbel', '678-901-234'),
(18, '1986-05-02', 10987654321, 'Aneta', 'Duda', '789-012-345'),
(19, '1998-11-13', 98765432101, 'Damian', 'Mazurek', '890-123-456'),
(20, '1979-01-08', 76543210987, 'Aleksandra', 'Kwiatkowska', '901-234-567');




INSERT IGNORE INTO `med_results` (`id`, `test_type`, `result`, `date_time`)
VALUES
    (1, 'Badanie krwi', 'Normalny', '2024-04-22 08:00:00'),
    (2, 'Badanie moczu', 'Wysoki poziom białka', '2024-04-21 10:30:00'),
    (3, 'USG', 'Bez odchyleń', '2024-04-20 14:15:00'),
    (4, 'Tomografia komputerowa', 'Podejrzenie złamania', '2024-04-19 16:45:00'),
    (5, 'Badanie krwi', 'Niski poziom żelaza', '2024-04-18 09:20:00'),
    (6, 'Badanie EKG', 'Regularny rytm serca', '2024-04-17 11:10:00'),
    (7, 'RTG klatki piersiowej', 'Brak zmian patologicznych', '2024-04-16 13:00:00'),
    (8, 'Badanie krwi', 'Wysoki poziom cholesterolu', '2024-04-15 15:50:00'),
    (9, 'Badanie moczu', 'Norma', '2024-04-14 17:40:00'),
    (10, 'USG', 'Podejrzenie kamicy nerkowej', '2024-04-13 19:30:00'),
    (11, 'Badanie krwi', 'Wysoki poziom glukozy', '2024-04-12 08:30:00'),
    (12, 'Badanie moczu', 'Obecność bakterii', '2024-04-11 10:20:00'),
    (13, 'Badanie EKG', 'Nieprawidłowy wynik', '2024-04-10 12:10:00'),
    (14, 'USG', 'Cienkie ścianki pęcherzyka żółciowego', '2024-04-09 14:00:00'),
    (15, 'Badanie krwi', 'Niski poziom leukocytów', '2024-04-08 15:50:00'),
    (16, 'Badanie krwi', 'Normalny', '2024-04-07 08:00:00'),
    (17, 'Badanie moczu', 'Normalny', '2024-04-06 10:30:00'),
    (18, 'Badanie EKG', 'Regularny rytm serca', '2024-04-05 11:10:00'),
    (19, 'USG', 'Bez odchyleń', '2024-04-04 14:15:00'),
    (20, 'Tomografia komputerowa', 'Brak odchyleń', '2024-04-03 16:45:00');