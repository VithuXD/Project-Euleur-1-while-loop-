////////////////////
//
// V2
// Le 18 Mars 2021
// Trouver les multiples de 3 et 5 en dessous de 1000
//
///////////////////
public class TrouverLesMultiplesDe3Et5EnDessousDe1000 {
    public static void main(String args[]) {
        int nombre=1;
        int somme=0;
        while(nombre<1000){
            if((nombre%3==0)|| (nombre%5==0)){
                somme=somme+nombre;
                
            }
            nombre++;
        }
        System.out.println(somme);
     
    }
}