
package ipc1.tarea3_201700734;

import java.util.Scanner;
import java.util.InputMismatchException;

public class IPC1Tarea3_201700734 {
    
 public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);  //utilizamos escaner para leer varibles de distinto tipo.
            boolean salir = false;                // se utuliza un bollean para salir del programa.
            
            int opcion;                           //varible que se utilizara en el switch. 
            
              do{                                 //se utiliza para crear un ciclo de n repeticiones.
                 System.out.println("Ingresa una de las opciones \n");  // ingreso de datos a la consola.
                 System.out.println("1.Ingrese Usuarios\n"
                                    + "2.Contar de digitos\n"
                                    + "3.Tres numero de mayot a menor \n"
                                    + "4.Calcular Promedio \n"+"5.salir");
               
                 try {                             // validamos con un try que solo se ingresen unicamente numeros.
            
                 opcion= sn.nextInt();             // agregamos un entrada a la varible.
                 switch (opcion){                  // creamos una serie de opciones para que eliga el usuario.
                     case 1: 
                         submenuUsuarios();        //llamamos a un metodo.
                     break;
                     case 2: 
                         submenuNumeros();
                     break;
                     case 3: 
                         submenuNumeroMayor();
                     break;
                     case 4:
                         matri();
                     break;
                     case 5: 
                         salir = true;       // si el boleean es verdadero termina el programa.
                     break;
                     default:
                         System.out.println("Solo seleciones de 1 a 5\n");  
                 }
                 } catch (InputMismatchException e){    //
                     System.out.println("Debes insertar un nuemro \n"); //si se insertan letras muestra el contido
                     sn.next();                         //regresa al menu principal, donde opcion no tiene valor.
                     
                 }
                 
               } while(!salir);       //permite correr n veces el ciclo hasta que se cumpla la condicion.          
    }
 public static void submenuUsuarios(){   //creamos metodos para subdividir el trabajo y hacerlo por partes.
     Scanner sn = new Scanner(System.in);  //leemos una varible de cualquier tipo
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
                         ingreso();    //llamaos al metodo
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
 public static void submenuNumeros(){  //creamos un metodo 
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n"  //muestra en cosola el texto
                             + "1.Ingrese un numero\n"
                             + "2.Cantidad de digitos \n"
                             + "3.Menu Principal"); 
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1:
                         numero();  //llamamos al metodo
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
 public static void submenuNumeroMayor(){ // creamos un metodo
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n" 
                             + "1.Ingrese numeros\n"
                             + "2.Mostrar numeros ordenados \n"
                             + "3.Menu Principal");
               
                 try {
            
                 opcion= sn.nextInt();
                 switch (opcion){
                     case 1: 
                         ingresodenumeros(); //llamamos al metodo
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
  public static void submenuPromedio(){ //creamos metodo
     Scanner sn = new Scanner(System.in);
            boolean salir = false;
            int opcion;
            
              do{   
                  System.out.println("Elegia una opcion \n"  //mostramos en consola
                             + "1.Ingresar id del estudiate\n"
                             + "2.Ingrese la notas \n"
                             + "3.Calcular el promedio");
               
                 try {
            
                 opcion= sn.nextInt();     //creamos opciones para que el usuario pueda eleguir
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
  public static String [] persona;       //variable global para el submenu de usuarios.
  public static void ingreso(){          //creamos metodo con el programa que queremos realizar.
      int b=0,con=0;
     System.out.println("Ingrese la cantidad de usuarios a ingresar");  //mostramos en pantalla
     Scanner c = new Scanner(System.in);
     b=c.nextInt();                      //almacenamos en una variable de la entrada
     while (con<b)                       //realizamos un ciclo para que no acepete mas ingresos de los previstos.
     {
     Scanner a = new Scanner(System.in);
              persona = new String[b];     //almacenamos en una variable la entrada
                for(int i=0; i< persona.length; i++) //creamos un ciclo para poder ingresar los nombres
                {
                    System.out.println("Ingrese el nombre de la Persona"); //Mostramos en pantalla
                    persona[i]= a.nextLine();  //guardamos los nombre en un areglo, segun el orden de entrada
                     con =con +1;          //aumentamos el contador del ciclo while.
                }
                
     }
}
  public static void usuariosAscendentes(){     //creamos metodo para ordenar los usuarios 
       System.out.println("Listado de usuarios ascendentes:\n");
       for(int i=persona.length -1 ; i>=0 ; i--)        //cremaos ciclo que nos devuelve de forma inversa los nombres
                {
                    System.out.println(persona[i]+"\n"); //mostramos en pantalla los usuarios
                     
                }
}
   public static void usuariosdescendentes(){ //creamos metodo para ordenar los usuarios
        System.out.println("Listado de usuarios descendentes:\n");
        for(int i=0; i< persona.length; i++)  //cremaos ciclo que nos ddevuelve la forma como entreron los usuarios
                {
                    System.out.println(persona[i]+"\n"); //mostramos en pantalla
                }
}
 public static int  num;  //creamos una variable gobal 
 public static void numero(){ // creamos metodo para el contador de digitos
     
     Scanner digito = new Scanner(System.in); 
     System.out.println("Ingrese un numero"); 
      num= digito.nextInt();   //asignamos el valor de entrada.
        if (num>=0 && num<=100000){ //validamos para que solo acepte un rango de nuemros.
            num=num;
        }
        else  {
           System.out.println("Numero Incorecto \n");
              }
 }
 public static void digitos(){  //creamos metodo para mostrar la cantidad de digitos
       int con = 0 ;            
                while( num>0)   //creamos un ciclo para mostrar la cantidad de digitos
                {
                 num=(num/ 10); 
                  con= con +1;   
                }
                System.out.println("La cantidad de digitos es:" + con + "\n"); //mostramos en pantalla
  
 }
 public static int n1=0, n2=0, n3=0; //creamos variables globales
 public static void ingresodenumeros(){ //creamos un metodo para ingreso de 3 numeros
    Scanner digito = new Scanner(System.in); 
     System.out.println("Ingrese un numero");
        n1= digito.nextInt();
        n2= digito.nextInt();        //entrada de datos
        n3= digito.nextInt();
        System.out.println("\n");
 }
 
 public static void numeromayor(){ //creamos un metodo para el ordenamiento de 3 numero
       
        if (n1>n2 && n2>n3 )  //vereficamos dependiendo de cual sea el valor de los numero
                {
                    System.out.println("el orden es: "+ n1 +", "+ +n2+" ,"+n3 +" "+ "\n"); //muestra los numero de mayor a menor
                }
        else if (n1>n3 && n3>n2)
        {
            System.out.println(" el orden es: "+ n1 +", "+n3+" ,"+n2 +" "+ "\n");
            
        }
        else if (n2>n1 && n1>n3)
        {
            System.out.println("el orden es:  "+ n2+", "+n1+", "+n3 +" "+"\n");
        } 
         else if (n2>n3 && n3>n1)
        {
            System.out.println("el orden es:  "+ n2+", "+n3+", "+n1 +" "+"\n");
        } 
         else if (n3>n1 && n1>n2)
        {
            System.out.println("el orden es:  "+ n3+", "+n1+", "+n2 +" "+"\n");
        }
         else if (n3>n2 && n2>n1)
        {
            System.out.println("el orden es:  "+ n3+", "+n2+", "+n1 +" "+"\n");
        }
 }
 public static int matriz [][]; //creamos un metodo para el promedio de alumnos
 public static void matri(){    //creamos una variable global
     matriz  = new int [6][6];  //definida las los parametros de la variable bidimensional
        int fila;
        int dato=0,nota=0;
        
        int columna;
        int contador = 1;
        for(fila = 0; fila<matriz.length; fila++){  //creamos un ciclo para que recora filas
            for(columna = 0; columna<matriz.length-1; columna++){ //creamos un ciclo para que recora columnas
                 
                 if(columna == 0){     //creamos un condicion dentro del ciclo para asignar valores
                     Scanner numero = new Scanner(System.in); 
                     System.out.println("Ingrese el ID de usuario"); 
                     dato = numero.nextInt();
                     matriz[fila][columna]=dato; //asigna el valor ingresado por el usuario por columnas
                 }
                 else 
                         {          
                         Scanner numero = new Scanner(System.in); 
                         System.out.println("Ingrese la nota"); 
                         nota = numero.nextInt();
                         matriz[fila][columna]=nota; //asigana el valor a la siguente fila

                         
                         }
            }
            
        }
       promedio(); //llamamos al metodo para que ingrese en la culumna 6 el promedio de los estudiantes
         
 }
 public static void promedio(){ //creamos un metodo para el promedio
     int fila;
     int columna;
     int promedio;
     int registros = matriz.length; //asignamos el tamoño de arreglo a la variable
     
     for(fila = 0; fila<matriz.length; fila++){  //creamos un ciclo para que nos nuestre en pantalla las filas de una matriz
             promedio = 0;
            for(columna = 0; columna<matriz.length; columna++){ //creamos otro ciclo para que muestre las columnas de la matriz
                
                if (columna >= 1 ){  //ponemos una condicion para qie el promedio no cuente la columna de ID
                 promedio = promedio + matriz[fila][columna]; //asiganamos el valor a la varible
                
                }
                
                if (columna == registros -1){   //condicona la columna 6 para el promedio
                   promedio = promedio / (registros -2);
                    matriz[fila][registros -1]= promedio; //asinga el valor en la columna 6
              
                }
               
                
                
                System.out.print("\t"+matriz[fila][columna] +" "); //muestra en pantalla la matriz
                
            }
             System.out.println("");
        }
 }
}
   