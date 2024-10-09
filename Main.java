public class Main {
    public static void main(String[] args) {
        VerificarString vs = new VerificarString();
        String palavra = "AaaAAAaAaaba"; 
        System.out.println("Quantidade de letras 'A': " + vs.LocalizarLetraA(palavra));
    }
}
