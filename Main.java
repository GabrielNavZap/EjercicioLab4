import java.time.LocalDate;

public class Main {
    public static void main(String[] args)
    {
        Persona persona1 = new Persona("Gabriel Navarrete Zapotitla", LocalDate.of(2003,2,27),
                            "Estudiante");
        Persona persona2 = new Persona("Juan Mendez Sosa", LocalDate.of(2002,4,23),
                        "Mesero");

        System.out.println(persona2);
        System.out.println(persona1);


    }
}