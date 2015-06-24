// Version del ahorcado al 70%



import java.util.Scanner;
public class JuegoAhorcadoV2
{
    
    
    
    public static String getPalabraSecreta(String [] lasPalabras)
    {
        String palSecreta;
        int ind;
        int indiceMayor = lasPalabras.length -1;
        int indiceMenor =0;
        ind = (int) (Math.floor(Math.random() * (indiceMayor - indiceMenor 
+ 1)) + indiceMenor);
        return lasPalabras[ind];
        
    }
    
    public static void mostrarBlancos(String palabra)
    {
        for(int i=0; i< palabra.length(); i++)
            System.out.print("_ " );
        
    }
    
    
    
    public static String ingreseLetra()
    {
        String laLetra;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese letra: ");
        laLetra = sc.next();
        while(laLetra.length()!= 1)
        {
            System.out.println("Ingrese letra: ");
            laLetra = sc.next();
        }
        return laLetra;
        
    }
    
    // Este metodo debe completarlo (ok)
    public static boolean letraEnPalabraSecreta(String letra, String 
palSecreta )
    {    
        if (palSecreta.indexOf(letra) == -1)
            return false;
        else
            return true;
    }
    
    public static String mostrarBlancosActualizados(String palabra, String 
letra)
    {
        System.out.println("PROCESANDO.....");
        String inicio = palabra.substring(0,palabra.indexOf(letra));
        String fin = palabra.substring(palabra.indexOf(letra)+1);
        String a = "";
        String b = "";
        for (int i=1 ; i<=inicio.length() ; i++)
            a = a+"_ ";

        for (int j=1 ; j<=fin.length() ; j++)
            b = b+"_ ";
        String blancoNvo = a+letra+" "+b;
        return blancoNvo;
    }
    
    

    
    
    
    
    
    
    
    public static void main(String []args)
    {
    
        String ahor1 = "  +---+  \n"+
                       "  |   |  \n" +
                       "      |  \n" + 
                       "      |  \n" +
                       "      |  \n" + 
                       "      |  \n" +
                       "========= ";

        String ahor2 = "  +---+    \n"+
                       "  |   |    \n"+
                       "  O   |    \n"+
                       "      |    \n"+
                       "      |    \n"+
                       "      |    \n"+
                       "=========";
        
        String ahor3 = "  +---+    \n"+
                          "  |   |    \n"+
                       "  O   |    \n"+
                       "  |   |    \n"+
                       "      |    \n"+
                       "      |    \n"+
                       "=========";

                  
        String ahor4 = "  +---+    \n"+
                          "  |   |    \n"+
                          "  O   |    \n"+
                          " /|   |    \n"+
                          "      |    \n"+
                          "      |    \n"+
                          "=========";
        
        String ahor5 = "  +---+    \n"+
                       "  |   |    \n"+
                       "  O   |    \n"+
                       " /|\\  |    \n"+
                       "      |    \n"+
                       "      |    \n"+
                       "=========";
        
        String ahor6 = "  +---+    \n"+
                            "  |   |    \n"+
                            "  O   |    \n"+
                            " /|\\  |    \n"+
                            " /    |    \n"+
                            "      |    \n"+
                            "=========";


        
        String ahor7 = "  +---+    \n"+
                           "  |   |    \n"+
                           "  O   |    \n"+
                           " /|\\  |    \n"+
                           " / \\  |    \n"+
                           "      |    \n"+
                           "=========";

        String [] figuras ={ahor1, ahor2, ahor3,ahor4,ahor5,ahor6,ahor7};
        int contador = 1;
        String letra;
        String []palabras = {"programacion", "java", "identacion", 
"clases", "objetos","desarrollador","pruebas"};
        String palSecreta = getPalabraSecreta(palabras);
        System.out.println(palSecreta);
        System.out.println(figuras[0]);
        mostrarBlancos(palSecreta);
        System.out.println("\n");
        
        while(contador <= 6)
        {    
            letra = ingreseLetra();
            if (      letraEnPalabraSecreta(letra, palSecreta )    )
                
System.out.println(mostrarBlancosActualizados(palSecreta,letra));
            else
                System.out.println(figuras[contador]);
            
            contador = contador +1;
        }
                
        System.out.println("\n");
        
        
    }
}

