import javax.swing.JOptionPane;

public class Resolucao1 {
    
    public static void main(String[] args) {

        //criação de um vetor em Java
        float[] notas = new float[5];
        float soma = 0;
        float media = 0;

        for (int i = 0; i < notas.length; i++){
            String nota = JOptionPane.showInputDialog("Digite sua nota: ");
            notas[i] = Float.parseFloat(nota);
            soma += notas[i];
        }

        media = soma/notas.length;

        JOptionPane.showMessageDialog(null, "A média da turma é, " + media);

        float menor = 0;
        float maior = 0;
        for (int i = 1; i < notas.length; i++) {
            if (menor > notas[i])
                menor = notas[i];
            if (maior < notas[i])
                maior = notas[i];
        }

        JOptionPane.showMessageDialog(null, "A menor nota da turma é, " + menor + "A maior nota da turma é: " + maior);

    }

}
