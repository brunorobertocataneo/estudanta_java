public class Texto {

    public static void main(String[] args) {
        String s = new String("IFC Videira"); // Forma tradicional de criar objetos
        String s2; //Declaração
        s2 = "IFC VIdeira"; //iniciação
        String s3 = "IFC Videira"; // Decalração com iniciação

        String sub1 = s.substring(4); //Videira
        System.out.println("Substring 1: " + sub1);


        String sub2 = s.substring(0,3); //IFC 
        System.out.println("Substring 2: " + sub2);

        System.out.println(s.indexOf("Videira"));
        System.out.println(sub2.indexOf("Videira"));
        System.out.println(sub1.indexOf("Videira"));

        System.out.println("Tamanho da String S" + s.length());
        System.out.println("Caracter na posição x da string S " + s.charAt(4));

        String cursosIFC = "Computação:Engenharia Elétrica:Pedagogia:Agronomia";
        String[] vetCursos = cursosIFC.split(":");

        int i = 0;
        while (i<vetCursos.length) {
            System.out.println(vetCursos[i]);
            i++;
        }
        
        for (String curso : vetCursos) {
            System.out.println(curso);
        }

        if (s.equals(s2)) {
            System.out.println("São iguais");
        } else {
            System.out.println("são diferentes");
        }

    }
}
