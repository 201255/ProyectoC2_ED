package proyectoC2;
import java.util.*;

public class Principal {
    static Scanner Leer = new Scanner(System.in);
    static HashSet<Alumno> conjunto = new HashSet<Alumno>();
    static String usuario;
    static Random Aleatorio = new Random();
    static int mat;
    static String clas;
    static String [] Materias = new String[] {"Matematicas", "Español", "Biologia", "Fisica", "Artes"};


    public static void main(String[] args) {
        if(registrarUsuario() == true ){
            int opcion;
            do{
                System.out.flush();
                System.out.println("Elija que accion desea realizar\n");
                System.out.println("-------------------------------------");
                System.out.println("1.- Añadir Alumno");
                System.out.println("2.- Mostrar todos los Alumnos");
                System.out.println("3.- Buscar un alumno");
                System.out.println("4.- Borrar Alumno");               
                System.out.println("Otro numero para salir");
                System.out.println("-------------------------------------");
            
                switch(opcion = Leer.nextInt()){
                    case 1:
                            System.out.println("Ingresar nombre");
                            String nom = Leer.next();
                            System.out.println("Ingresar apellido");
                            String ape = Leer.next();
                            System.out.println("Su matricula es: ");
                                mat = Aleatorio.nextInt(999999);
                               
                            System.out.println(mat);
                           
                            System.out.println("Materias Disponibles:");
                           
                            for(int i=0; i<Materias.length; i++){
                                System.out.println( (i+1) + ":  " +  Materias[i]);
                            }
                        
                            System.out.println("Que materia quiere selccionar: ");
                            clas = Leer.next();
                        
                            Alumno alum = new Alumno(nom, ape, clas, mat);
                            if(conjunto.add(alum))
                                System.out.println("Alumno guardado  " + conjunto.size() + " alumno(s)");


                            if(alum.getNombre().equals("x"))
                            do {
                                System.out.println("Presione la tecla 1 para continuar...\n");
                            } while (Leer.nextInt() != 1);	
                        
                    break;
                    case 2:
                            if(conjunto.size() > 0){
                                int contador=0;
                                    int aux=0;
                                    System.out.println("Alumnos\n");
                                    System.out.println("Nombre -- Matricula -- Materia(s)");
                                    for (Alumno alum1 : conjunto) {

                                        System.out.println((aux+1) + ". " + alum1.nombre + " "+  alum1.apellido + " - "+ alum1.matricula + " - "+ alum1.materia);
                                        aux++;
                                    }
                                    do {
                                        System.out.println("Presione la tecla 1 para continuar...\n");
                                    } while (Leer.nextInt() != 1);
                                
                                
                            }
                    break;
                    case 3:

                    break;
                    case 4:

                    break;
                    default:
                    break;
                }
        }while(opcion>0 && opcion<6);
        }
    }

    public static boolean registrarUsuario(){
        
        int contra=0, intentos=0;
        while(contra != 1234 && intentos!=3){
            System.out.println("\t\t\tINICIO DE SESION");
            System.out.println("\t\t\t----------------");
            if(intentos != 0)
                System.out.println("\n¡CONTRASEÑA INCORRECTA!\n");
            System.out.println("Ingrese su usuario");
            usuario = Leer.next();
            System.out.println("Ingrese su contraseña");
            contra = Leer.nextInt();
            intentos++;
        }
        if(contra != 1234)
            return false;
        else
            return true;    
    }

    // public static boolean compare(String[] Materias, String clas)
    // {
    //     if(Materias.length != clas.length()) return false;
        
    //     for(int i = 0; i < Materias.length; i++)
    //     {
    //         if(!Materias[i].equals(clas)) return false;
    //     }
    //     return true;
    // }

}
