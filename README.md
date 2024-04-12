# Baza_Danych
Projekt dla przedmiotu Bazy Danych, o temacie "System zarządzania laboratoriami diagnostycznym";
Członkowie grupy:
Jakub Gwiżdż, Justyna Jachowicz, Kamil Oles;
Link do dokumentacji w overleaf:
https://www.overleaf.com/project/65d9d43205c5f79685162a77

Link do diagramu RLD:
https://lucid.app/lucidchart/31704fdb-9254-4845-a33f-0d5774aa9fa7/edit?viewport_loc=-232%2C-52%2C2999%2C1387%2C0_0&invitationId=inv_40f1401a-2100-4545-9a29-669da100bdd3

Jak uruchomić aplikację LabMaster:
1. Pobrać noajnowszą wersję apliacji z github:
https://github.com/JGwi/System_zarzadzania_laboratoriami_diagnostycznymi.git

2. Uruchomić bazę danych mysql i utwurz nową bazę danych o nazwie labmaster2
Przy użyciu XAMPP: 
- Po uruchomieniu XAMPP Control wystarczy wciśnąć guziki 'Start' przy opcjach Apache, a nastęonie MySQL
- W opcji MySQL naćisnąć guzik 'Admin', lub wpisać w przeglądarce 'http://localhost/phpmyadmin/'
- W lewym pasku menu kliknąć na opcję 'New', następnie w wyświetlonym oknie 'DAtabase name' wpisać labmaster2, i zatwierdzić stworzenie nowej bazy danych przyciskiem 'Create'
Przy użyciu lokalnej bazy danych MySQL:
- Wejśc do forderu zawierajcego bazę danych MySQL a następnie otworzyć okno wersza poleceń (lub w otwartym oknie wiersza poleceń przekerować się do forderu C:\ (ścierzka) \mysql)
- W otwartym oknie wykonać polecenie 'bin\mysqld', 
- Otworzyć noiwe okno wiersza poleceń, upewnić się że jest się w forderze domowym i podać konęde 'mysql -u root -p -h localhost -P 3306' , i zalogować się
- Stworzyć bazę danych przy pomocy komędy ' CREATE DATABASE labmaster2;'

3. Uruchomić wybrany progran do obrubki aplicaji języka java (w moim wypadku 'IntelliJ IntelliJ IDEA Community Edition')
- W programie odnaleśc daną opcję owarcia projektów np. File>Open
- Nawigować się do forgeru git zawierającego projekt 'labmaster_03', wybrać go i uruchomić (góźik OK)
- Poczekać aż projekt się zbuduje i powierze wszystkie dependies (Może potrwać kilka minut)
- Uperwiając sie że baza danych działa, uruchomić gółwną klasę programu 'Labmaster03Application' (zielona szczałka u górnycm pasku zadań LUB strzałka przy klasie publick), znajdującą się pod labmaster_03 >src >main >java >com >labmaster >labmaster_03

4. Jeśli projekt uruchomił się poprawnę, w przeglądace nalerzy wpisać http://localhost:8080, co umorzliwi wkorzystywanie go

(Tymczasowe dane do logowania Username: user, Password: user1Pass
!!!!!!!!!!! Dane do logowania zostaną zmienione w przysłości !!!!!!!!!)
