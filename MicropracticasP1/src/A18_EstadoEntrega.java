public class A18_EstadoEntrega {
    public static void main(String[] args) {
        int estadoEntrega = 1;

        switch (estadoEntrega) {
            case 0 -> System.out.println("Pendiente");
            case 1 -> System.out.println("Entregada"); //Caso que sucederia ya que coincide el estado de entrega con el caso=1
            case 2 -> System.out.println("Revisada");
            default -> System.out.println("Error"); //Caso en el que si INT no coincide con ningun otro caso, te pone en la consola "error"

        }
    }
}