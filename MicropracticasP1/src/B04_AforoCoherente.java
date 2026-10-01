public class B04_AforoCoherente {
    public static void main(String[] args) {
        final int CAPACIDAD_MAX = 30;

        //Ejemplo cuando hay plazas disponibles ya que se cumple que ocupacion <= 30
        int ocupacion = 27;
        if ((ocupacion <= CAPACIDAD_MAX) && ocupacion >= 0) { //En esto contempla que se tiene que cumplir que la ocupacion sea menor o igual al maximo permitido y ademas tiene que ser mayor o  igual a 0 ya que no queremos los negativos
            System.out.println("Plazas disponibles"); //Se ejecuta esto
        } else if (ocupacion <= 0) {
            System.out.println("Dato invalido");
        } else {
            System.out.println("Aforo completo");
        }

        //Ejemplo cuando no hay plazas disponibles ya que no se cumple que ocupacion <= 30
        int ocupacion1 = 100;
        if ((ocupacion1 <= CAPACIDAD_MAX) && ocupacion1 >= 0) { //En la variable ocupacion1 no se cumple que 100 <= 30
            System.out.println("Plazas disponibles");
        } else if (ocupacion1 <= 0) {
            System.out.println("Dato invalido");
        } else {
            System.out.println("Aforo completo"); //Se ejecuta esto
        }

        //Ejemplo cuando se ha insertado un dato invalido porque este es <= 0
        int ocupacion2= -2;
        if ((ocupacion2 <= CAPACIDAD_MAX) && ocupacion2 >= 0) { //En esto contempla que se tiene que cumplir que la ocupacion sea menor o igual al maximo permitido y ademas tiene que ser mayor o  igual a 0 ya que no queremos los negativos
            System.out.println("Plazas disponibles");
        } else if (ocupacion2<= 0) {
            System.out.println("Dato invalido"); //se ejecuta esto
        } else {
            System.out.println("Aforo completo");
        }
    }
}