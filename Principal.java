package proyectoC2;
import java.util.*;

public class Principal {
    static Scanner Leer = new Scanner(System.in);
    static HashSet<Alumno> conjunto = new HashSet<Alumno>();
    static String usuario;

    public static void main(String[] args) {
        if(registrarUsuario() == true ){
            int opcion, opcion1;
            do{
                System.out.flush();
                System.out.println("Elija que accion desea realizar\n");
                System.out.println("-------------------------------------");
                System.out.println("1.- Añadir Alumno");
                System.out.println("2.- Buscar Alumno");
                System.out.println("3.- Mostrar todos los Alumnos");
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
                int mat = (int)(Math.random()*200000);
                System.out.println(mat);

                System.out.println("-------------------------------------");
                System.out.println("Materias Disponibles: ");
                System.out.println("1.- Matemáticas");
                System.out.println("2.- Español");
                System.out.println("3.- Biología");
                System.out.println("4.- Física");
                System.out.println("4.- Artes");
                // System.out.println("5.- Materias Elegidas(Salir)");
                System.out.println("-------------------------------------");  

                System.out.println("Que materia quiere selccionar: ");
                String clas = Leer.next();



                Alumno alum = new Alumno(nom, ape, clas, mat);
                if(conjunto.add(alum)) 
                    System.out.println("Alumno guardado  " + conjunto.size() + " alumno(s)");
                	
                
                if(alum.getNombre().equals("x"))	
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

}
