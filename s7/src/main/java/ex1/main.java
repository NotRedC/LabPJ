package ex1;

import java.io.IOException;
import java.util.*;
import java.io.File;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class main {
    public static void main(String[] args) throws IOException {
        Map<Integer, Carti> map = new HashMap<Integer, Carti>();
        File file=new File("src/main/resources/carti.json");
        ObjectMapper mapper=new ObjectMapper();
        map = mapper.readValue(file, new TypeReference<Map<Integer, Carti>>(){});
        var entryset = map.entrySet();
        var it = entryset.iterator();
        while (it.hasNext())
        {
            var m =it.next();
            int key=m.getKey();
            Carti value=m.getValue();
            System.out.println("Cheie :"+key+" Valoare :"+value.toString());
            if (key == 3)
                it.remove();
        }
        map.putIfAbsent(7, new Carti("Dior","Pop Smoke", 2022));
        System.out.println(map);
        file = new File("src/main/resources/carti.json");
        mapper.writeValue(file, map);

        Set<Carti> setCarti = new HashSet<Carti>(map.values());
        setCarti.stream().filter((value) -> value.autorul().equals("Yuval Noah Harari")).forEach(System.out::println);

        System.out.println("\n");

        setCarti.stream().sorted((x,y) -> x.titlul().compareTo(y.titlul())).forEach(System.out::println);

        System.out.println("\n");

        Optional<Set<Carti>> opt = Optional.ofNullable(setCarti);
        setCarti.stream().min((x,y) -> x.intCompare(x.anul(),y.anul())).ifPresentOrElse(System.out::println, ()-> System.out.println("Valoare lipsa"));
    }
}
