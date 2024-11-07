package ex1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {
        List<Angajat> angajati = new ArrayList<Angajat>();
        angajati.add(new Angajat("a1", "sef", LocalDate.of(2024, 03, 10), 40));
        angajati.add(new Angajat("a2", "secretar", LocalDate.of(2024, 04, 11), 20));
        angajati.add(new Angajat("a3", "director", LocalDate.of(2023, 04, 20), 50));
        angajati.add(new Angajat("a4", "profesor", LocalDate.of(2022, 04, 01), 30));
        angajati.add(new Angajat("a5", "portar", LocalDate.now(), 10));
        scriere(angajati);
        angajati.forEach(System.out::println);

        System.out.println("Angajati cu salariul peste 30:");
        angajati.stream().filter((s) -> s.getSalariul() >= 30).forEach(System.out::println);

        List<Angajat> angajatiNoiembrie = angajati.stream().filter((p) -> (p.getPostul().equals("director") || p.getPostul().equals("sef")) && p.getData_angajarii().getMonth() == Month.APRIL && p.getData_angajarii().getYear() == Year.of(2023).getValue()).collect(Collectors.toList());
        System.out.println("Angajatii din luna aprilie care au functie de conducere: ");
        angajatiNoiembrie.forEach(System.out::println);

        System.out.println("Angajati care nu au functie de conducere: ");
        angajati.stream().filter((a) -> !a.getPostul().equals("sef") && !a.getPostul().equals("director")).sorted((x,y) -> x.floatCompare(x.getSalariul(), y.getSalariul())).forEach(System.out::println);


    }

    public static void scriere(List<Angajat> lista) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerModule(new JavaTimeModule());
            File file = new File("src/main/resources/angajati.json");
            mapper.writeValue(file, lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
