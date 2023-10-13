from datetime import date

class Persona:
    def __init__(self, nombre, fecha_nac, ocupacion):
        self.nombre = nombre
        self.fecha_nac = fecha_nac
        self.ocupacion = ocupacion

    def calcula_edad(self):
        fecha_actual = date.today()
        edad = fecha_actual.year - self.fecha_nac.year - ((fecha_actual.month, fecha_actual.day) < (self.fecha_nac.month, self.fecha_nac.day))
        return edad

    def calcula_rfc(self):
        nombres = self.nombre.split()
        nombre_inicial = nombres[0][0]
        ape_pat_inicial = nombres[1][:2].upper()
        ape_mat_inicial = nombres[2][0]

        anio = str(self.fecha_nac.year)
        mes = str(self.fecha_nac.month).zfill(2)
        dia = str(self.fecha_nac.day).zfill(2)

        anio = anio[-2:]

        rfc = ape_pat_inicial + ape_mat_inicial + nombre_inicial + anio + mes + dia
        return rfc

    def __str__(self):
        return f"Nombre: {self.nombre}, Fecha de Nacimiento:{self.fecha_nac}\n" \
               f"Ocupación: {self.ocupacion}, Edad: {self.calcula_edad()}, RFC: {self.calcula_rfc()}"
               


persona1 = Persona("Juan Pérez González", date(1990, 5, 15), "Ingeniero")
persona2 = Persona("María García López", date(1985, 8, 27), "Médico")

print(persona1)
print("\n")
print(persona2)