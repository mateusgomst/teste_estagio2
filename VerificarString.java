public class VerificarString{

    public int LocalizarLetraA(String palavra){
        int contador=0;
        for (int i = 0; i < palavra.length(); i++)
        {
            if(palavra.charAt(i)=='A' || palavra.charAt(i)=='a'){
                contador++;
            }
        }
        return contador;
    }
}