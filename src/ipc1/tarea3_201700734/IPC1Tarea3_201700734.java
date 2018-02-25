
package ipc1.tarea3_201700734;

import java.util.Scanner;
import java.util.InputMismatchException;

public class IPC1Tarea3_201700734 {
    
 public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);
            boolean salir = false;
            
            int opcion;
            
              do{   
                 System.out.println("Ingresa una de las opciones \n");
                 System.out.println("1.Ingrese Usuarios\n"
                                    + "2.Contar de digitos\n"
                                    + "3.Tres numero de mayot a menor \n"
                                    + "4.Calcular Promedio \n"+"5.salir");
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1: 
                         submenuUsuarios();
                     break;
                     case 2: 
                         submenuNumeros();
                     break;
                     case 3: 
                         submenuNumeroMayor();
                     break;
                     case 4: System.out.println("has seleccionado la opcion4");
                     break;
                     case 5: 
                         salir = true;
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){
                     System.out.println("Debes insertar un nuemro \n");
                     sn.next();
                     
                 }
                 
               } while(!salir);                 
    }
 public static void submenuUsuarios(){
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n" 
                             + "1.Ingresar usuarios \n"
                             + "2.Mostrar usuarios asendentes  \n"
                             + "3.Mostrar usuarios desendentes  \n"
                             + "4.Menu Principal");
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1:
                         ingreso();
                     break;
                     case 2: 
                         usuariosAscendentes();
                     break;
                     case 3: 
                         usuariosdescendentes();
                     break;
                     case 4: 
                         salir = true;
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){
                     System.out.println("Debes insertar un nuemro \n");
                     sn.next();
                     
                 }
                 
               } while(!salir);  
 }   
 public static void submenuNumeros(){
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n" 
                             + "1.Ingrese un numero\n"
                             + "2.Cantidad de digitos \n"
                             + "3.Menu Principal"); 
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1:
                         numero();
                     break;
                     case 2: 
                         digitos();
                     break;
                     case 3: 
                         salir = true;
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 3\n");  
                 }
                 } catch (InputMismatchException e){
                     System.out.println("Debes insertar un nuemro \n");
                     sn.next();
                     
                 }
                 
               } while(!salir);  
 }   
 public static void submenuNumeroMayor(){
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n" 
                             + "1.Ingrese numeros\n"
                             + "2.Mostrar ordenados \n"
                             + "3.Menu Principal");
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1: 
                         ingresodenumeros();
                     break;
                     case 2: numeromayor();
                     break;
                     case 3: 
                         salir = true;
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 3\n");  
                 }
                 } catch (InputMismatchException e){
                     System.out.println("Debes insertar un nuemro \n");
                     sn.next();
                     
                 }
                 
               } while(!salir);  
 } 
  public static void submenuPromedio(){
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n" 
                             + "1.Ingresar id del estudiate\n"
                             + "2.Ingrese la notas \n"
                             + "3.Calcular el promedio");
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1: System.out.println("has seleccionado la opcion1");
                     break;
                     case 2: System.out.println("has seleccionado la opcion2");
                     break;
                     case 4: 
                         salir = true;
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){
                     System.out.println("Debes insertar un nuemro \n");
                     sn.next();
                     
                 }
                 
               } while(!salir);  
 } 
  public static String [] persona;     //variable global para el submenu de usuarios.
  public static void ingreso(){
      int b=0,con=0;
     System.out.println("Ingrese la cantidad de usuarios a ingresar");
     Scanner c = new Scanner(System.in);
     b=c.nextInt();
     while (con<b)
     {
     Scanner a = new Scanner(System.in);
              persona = new String[b];
                for(int i=0; i< persona.length; i++)
                {
                    System.out.println("Ingrese el nombre de la Persona");
                    persona[i]= a.nextLine();
                     con =con +1;
                }
                
     }
}
  public static void usuariosAscendentes(){
       System.out.println("Listado de usuarios ascendentes:\n");
       for(int i=persona.length -1 ; i>=0 ; i--)
                {
                    System.out.println(persona[i]+"\n");
                     
                }
}
   public static void usuariosdescendentes(){
        System.out.println("Listado de usuarios descendentes:\n");
        for(int i=0; i< persona.length; i++)
                {
                    System.out.println(persona[i]+"\n");
                }
}
 public static int  num; 
 public static void numero(){
     
     Scanner digito = new Scanner(System.in); 
     System.out.println("Ingrese un numero"); 
      num= digito.nextInt(); 
        if (num>=0 && num<=100000){
            num=num;
        }
        else  {
           System.out.println("Numero Incorecto \n");
              }
 }
 public static void digitos(){
       int con = 0 ;
                while( num>0)
                {
                 num=(num/ 10);
                  con= con +1;   
                }
                System.out.println("La cantidad de digitos es:" + con + "\n");
  
 }
 public static int n1=0, n2=0, n3=0;
 public static void ingresodenumeros(){
    Scanner digito = new Scanner(System.in); 
     System.out.println("Ingrese un numero");
        n1= digito.nextInt();
        n2= digito.nextInt();
        n3= digito.nextInt();
        System.out.println("\n");
 }
 
 public static void numeromayor(){
       
        if (n1>n2 && n1>n3 )
                {
                    System.out.println("el mayor es "+ n1 + "\n");
                }
        else if (n2>n1 && n2>n3)
        {
            System.out.println("el mayor es "+ n2 + "\n");
            
        }
        else
        {
            System.out.println("el mayor es "+ n3 +"\n");
        } 
 }
}
   