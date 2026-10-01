public class A16_RepararRango {
    public static void main(String[] args) {
        int edad = 10; // definimos primer ejemplo cuando edad es 10
                if (edad >= 18 || edad <= 65) { //Al ser el operador logico "||", con que uno de los dos sea verdadero basta para que sea verdadera la sentencia. Cualquier numero entero pasa esta prueba. Ejemplo: 3,100,-1
                    System.out.println("Aceptada");
                } else {
                    System.out.println("Denegada");
                }
        //Aqui debajo remplazare el operador logico por un "y" (&&)

        int edad1 = 10; // definimos primer ejemplo cuando edad es 10
        if (edad1 >= 18 && edad1 <= 65) { //Al ser el operador logico "&&", tienen que ser ambas verdaderas para que la sentencia sea verdadera
            System.out.println("Aceptada");
        } else {
            System.out.println("Denegada");
        }
    }
}
