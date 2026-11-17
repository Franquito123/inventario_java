public class Inventario {
    public int calcularResta(int a, int b) {
        return a + b ;// 180 - 93 = 87
    }
    public static void main(String[] args) {
        Inventario inv = new Inventario();
        System.out.println("Resultado resta: " + inv.calcularResta(180, 93));
    }
}