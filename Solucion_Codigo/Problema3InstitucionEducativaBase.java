    public class Problema3InstitucionEducativaBase {
        private String nombre;
        private String tipoInstitucion;
        private int numeroAlumnos;
        private int numeroDocentes;
        private int numeroSedes;
        private double gastoProyectadoPorEstudiante;
        private double presupuesto;

        // Constructor con parámetros para inicializar todos los atributos
        public Problema3InstitucionEducativaBase(String nombre, String tipoInstitucion, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastoProyectadoPorEstudiante) {
            this.nombre = nombre;
            this.tipoInstitucion = tipoInstitucion;
            this.numeroAlumnos = numeroAlumnos;
            this.numeroDocentes = numeroDocentes;
            this.numeroSedes = numeroSedes;
            this.gastoProyectadoPorEstudiante = gastoProyectadoPorEstudiante;
        }

        // Método para calcular el presupuesto
        public void calcularPresupuesto() {
            this.presupuesto = numeroAlumnos * gastoProyectadoPorEstudiante;
        }

        // Métodos getters (accesores)
        public String getNombre() {
            return this.nombre;
        }

        public String getTipoInstitucion() {
            return this.tipoInstitucion;
        }

        public int getNumeroAlumnos() {
            return this.numeroAlumnos;
        }

        public int getNumeroDocentes() {
            return this.numeroDocentes;
        }

        public int getNumeroSedes() {
            return this.numeroSedes;
        }

        public double getGastoProyectadoPorEstudiante() {
            return this.gastoProyectadoPorEstudiante;
        }

        public double getPresupuesto() {
            return this.presupuesto;
        }

        // Método toString para mostrar la información de la institución de manera legible
        @Override
        public String toString() {
            return String.format("INSTITUCIÓN EDUCATIVA:\n" +
                            "Nombre: %s\n" +
                            "Tipo: %s\n" +
                            "Número de Alumnos: %d\n" +
                            "Número de Docentes: %d\n" +
                            "Número de Sedes: %d\n" +
                            "Gasto Proyectado por Estudiante: %.2f $\n" +
                            "Presupuesto Total: %.2f $",
                    getNombre(), getTipoInstitucion(), getNumeroAlumnos(),
                    getNumeroDocentes(), getNumeroSedes(), getGastoProyectadoPorEstudiante(), getPresupuesto());
        }
    }
