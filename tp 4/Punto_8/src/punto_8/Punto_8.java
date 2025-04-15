/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;

/**
 *
 * @author agusg
 */
public class Punto_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona [] clientes = new Persona[100];
        Cuenta []cuentas = new Cuenta[100];
        Fecha auxFecha = new Fecha();
        String auxString;
        int n, auxInt;
        int totalClientes = 0, totalCuentas = 0;
        boolean auxControl = false;
        
        
        System.out.println("-----------Banco-----------");
        System.out.println("1: Cargar Clientes");
        System.out.println("2: Crear Cuentas");
        System.out.println("3: Salir");
        auxInt = sc.nextInt();
        
        do{
            switch(auxInt){
                    case 1:{
                        System.out.println("¿Cuantos clientes quiere cargar?");
                        n = sc.nextInt();
                        for(int i = 0; i < n; i++){
                            clientes[i] = new Persona();
                            System.out.println("Ingrese el nombre y apellido del cliente");
                            auxString = sc.nextLine();
                            sc.next();
                            clientes[i].setNombre(auxString);
                            
                            System.out.println("DNI");
                            auxInt = sc.nextInt();
                            clientes[i].setNumDocumento(auxInt);
                            
                            System.out.println("Estado Civil");
                            System.out.println("1: Soltero/a | 2: Casado/a | 3: Viudo/a");
                            auxInt = sc.nextInt();
                            while(1 < auxInt || auxInt > 3){
                                System.out.println("ERROR, ingrese nuevamente");
                                auxInt = sc.nextInt();
                            }
                            
                            System.out.println("Ingrese Fecha de nacimiento");
                            System.out.print("Dia: "); auxInt = sc.nextInt();
                            auxFecha.setDia(auxInt);
                            System.out.print("Mes: "); auxInt = sc.nextInt();
                            auxFecha.setMes(auxInt);
                            System.out.print("Año: "); auxInt = sc.nextInt();
                            auxFecha.setAnio(auxInt);
                            clientes[i].setFecha(auxFecha);
                            totalClientes++;
                        }
                        
                        auxControl = true;
                        break;
                }
            
                case 2:{
                    if(auxControl == false){
                        System.out.println("Falta cargar los clientes");
                        break;
                    }else{
                        
                        do{
                            System.out.println("1: Cuenta Ahorro | 2: Cuenta Corriente | 3: Volver");
                            switch(auxInt){
                                case 1:{
                                    
                                    System.out.println("Seleccione al cliente");
                                    for(int i = 0; i < totalClientes; i++){
                                        System.out.println("["+(i+1)+"]: " + clientes[i].getNumDocumento());
                                    }
                                    auxInt = sc.nextInt();
                                    for(int i = 0; i < totalClientes; i++){
                                        if(auxInt == clientes[i].getNumDocumento()){
                                            cuentas[totalCuentas].setCliente(clientes[i]);
                                            break;
                                        }
                                    }
                                    
                                    totalCuentas++;
                                    break;
                                }
                            }
                        }while(auxInt != 3);
                    }
                
                    break;
                }
            
                default:{
                    System.out.println("Error, ingrese nuevamente");
                }
            }
        }while(auxInt != 3);
    }
    }
    
}
