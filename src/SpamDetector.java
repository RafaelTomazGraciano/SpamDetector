public class SpamDetector {
    TermoPeso vetor[];

    public SpamDetector() {
        vetor = new TermoPeso[10];
        vetor[0] = new TermoPeso("abra agora", 1);
        vetor[1] = new TermoPeso("compre agora", 2);
        vetor[2] = new TermoPeso("leia agora", 3);
        vetor[3] = new TermoPeso("grátis", 4);
        vetor[4] = new TermoPeso("tentativa de entrega frustrada", 5);
        vetor[5] = new TermoPeso("faça dinheiro", 6);
        vetor[6] = new TermoPeso("você ganhou", 7);
        vetor[7] = new TermoPeso("dinehiro de graça", 8);
        vetor[8] = new TermoPeso("empréstimos para negativado", 9);
        vetor[9] = new TermoPeso("isso não é spam", 10);
    }

    public static String contaSpamDetector(){
        SpamDetector spamDetector = new SpamDetector();
        LerArquivo arquivo = new LerArquivo();
        String texto = arquivo.lerArquivo("C:\\Users\\texto.txt"); // Colocar o local do arquivo de texto
        int contador = 0;
        texto = texto.toLowerCase();
        for(int i = 0; i < spamDetector.vetor.length; i++){
            if(texto.contains(spamDetector.vetor[i].termo))
                contador += spamDetector.vetor[i].peso;

        }
        if(contador >= 5 && contador <= 30){
            return "Fracamente suspeito " + contador;
        }
        else if(contador >= 31 && contador <= 70){
            return "Potencialmente suspeito " + contador;
        }
        else if(contador >= 70 && contador <= 100){
            return "Spam " + contador;
        }
        return "";
    }

}
