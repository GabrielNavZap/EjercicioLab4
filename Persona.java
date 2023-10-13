import java.time.LocalDate;
import java.time.Period;

public class Persona {
    String nombre;
    LocalDate fecha_nac;
    String ocupacion;

    public Persona (String n,LocalDate f_n, String o)
    {
        this.nombre = n;
        this.fecha_nac = f_n;
        this.ocupacion = o;
    }
    public Persona()
    {
        this.nombre = "";
        this.fecha_nac = LocalDate.of(2000,1,1);
        this.ocupacion = "";
    }

    public String getNombre()
    {
        return nombre;
    }

    public LocalDate getFecha_nac()
    {
        return fecha_nac;
    }

    public String getOcupacion()
    {
        return ocupacion;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setFecha_nac(LocalDate fecha_nac)
    {
        this.fecha_nac = fecha_nac;
    }

    public void setOcupacion(String ocupacion)
    {
        this.ocupacion = ocupacion;
    }

    public int calculaEdad()
    {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fecha_nac,fechaActual);
        return periodo.getYears();
    }

    public String calculaRFC()
    {
        String[] nombres = nombre.split(" ");
        String nombreInicial = nombres[0].substring(0,1);
        String apePatInicial1 = nombres[1].substring(0,2);
        String apePatInicial = apePatInicial1.toUpperCase();
        String apeMatInicial = nombres[2].substring(0,1);

        String anio1 = String.valueOf(fecha_nac.getYear());
        String mes = String.format("%02d",fecha_nac.getMonthValue());
        String dia = String.format("%02d",fecha_nac.getDayOfMonth());

        String anio = anio1.substring(2,4);


        return apePatInicial+apeMatInicial+nombreInicial+anio+mes+dia;
    }

    public String toString()
    {
        return "Nombre: "+nombre+", Fecha de Nacimiento: "+fecha_nac.toString()+"\n"
                +"Ocupacion: "+ocupacion+", Edad: "+calculaEdad()+", RFC: "+calculaRFC();
    }
}