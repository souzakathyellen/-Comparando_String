public class ComparandoString {
    public static void main(String[] args) throws Exception {
        String nome1 = "Katy";
        String nome2 = "Katy";
        String nome3S = new String("Katy");
        String res;
        res = (nome1.equals(nome3S))?"igual":"diferente";
        System.out.println(res);
    }
}
