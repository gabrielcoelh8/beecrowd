package beecrowd.iniciante;

import java.util.Scanner;

/**
 *
 * @author gabrielcoelho
 * 
 */
public class bee1049 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String word3 = read.nextLine();
        String word2 = read.nextLine();
        String word1 = read.nextLine();
        String[][] dados = {
            {"aguia",                  "pomba",                "homem",               "vaca",                  "pulga",                     "lagarta",                   "sanguessuga",                   "minhoca"},
            {"carnivoro",            "onivoro",               "onivoro",               "herbivoro",          "hematofago",           "herbivoro",               "hematofago",                      "onivoro"},
            {"ave",                     "ave",                     "mamifero",             "mamifero",          "inseto",                    "inseto",                      "anelideo",                          "anelideo"},
            {"vertebrado",          "vertebrado",         "vertebrado",          "vertebrado",        "invertebrado",          "invertebrado",          "invertebrado",                    "invertebrado"} 
        };
        int columns = dados[0].length;
        String resultado;
       
        for (int i = 0; i < columns; i++) {
                if(dados[1][i].equals(word1) && dados[2][i].equals(word2) && dados[3][i].equals(word3))  {
                     resultado = dados[0][i];
                     System.out.println(resultado);
                     return;
                }
        }
        
    }
    
    public static void tester(String[][] dados){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.println("["+i+"]["+j+"]: "+"["+dados[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
}


/*
int rows = dados.length;
int columns = dados[0].length;
        
int i = 0;
        while(i<dados.length){
            if(dados[3][i].equals(word3) && dados[2][i].equals(word2) && dados[1][i].equals(word1))  {
            resultado = dados[i][0];
            return;
            }
            i++;
        }

for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("\t["+dados[i][j]+"]");
            }
            System.out.println("");
        }

*/
