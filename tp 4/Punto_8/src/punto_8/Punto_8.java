/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package punto_8;

import java.util.Scanner;

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
        int opcionMenu, opcionCuentas, opcionClientes, opcionCuentas2;
        int n, auxInt;
        int totalClientes = 0, totalCuentas = 0;
        boolean auxControl = false;
        double auxDouble;
        float auxFloat;
        
        
        do{
        System.out.println("-----------Banco-----------");
        System.out.println("1: Clientes");
        System.out.println("2: Cuentas");
        System.out.println("3: Salir");
        opcionMenu = sc.nextInt();
       
        
            switch(opcionMenu){
                    case 1:{
                        do{             //CLIENTES
                        System.out.println("----------------- Clientes -----------------");
                        System.out.println("1: Cargar Clientes | 2: Mostrar Clientes | 3: Volver");
                        opcionClientes = sc.nextInt();
                        
                           switch(opcionClientes){
                               case 1:{             //CARGAR CLIENTES
                                   System.out.println("¿Cuantos clientes quiere cargar?");
                                   n = sc.nextInt();
                                   sc.nextLine();
                                   for(int i = 0; i < n; i++){
                                        clientes[i] = new Persona();
                                        System.out.println("Ingrese el nombre y apellido del cliente");
                                        auxString = sc.nextLine();
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
                                        sc.nextLine();
                                    }
                                   
                                   auxControl = true;
                                    break;
                                }
                               
                               case 2:{             //MOSTRAR CLIENTES
                                   int i = 0;
                                   for(Persona c : clientes){
                                       if(c != null){
                                           System.out.println("["+(i+1)+"]: " + c.getNumDocumento() + " | " + c.getNombre());
                                           i++;
                                       }
                                   }
                                   break;
                               }
                               
                               case 3:{             //SALIR
                                   break;
                               }
                               
                               default:{
                                   System.out.println("Error, ingrese nuevamente");
                                   break;
                               }
                            }
                        }while(opcionClientes != 3);
                        
                        break;
                }
            
                    
                case 2:{                    //CUENTAS
                    if(auxControl == false){
                        System.out.println("No existen un cliente");
                        break;
                    }else{
                        
                        do{
                            System.out.println("1: Crear Cuentas | 2: Mostrar Cuentas | 3: Operaciones | 4: Volver");
                            opcionCuentas = sc.nextInt();
                            switch(opcionCuentas){
                                
                                case 1:{        //CREAR CUENTAS
                                    System.out.println("1: Cuenta Ahorro | 2: Cuenta Corriente | 3: Volver");
                                    opcionCuentas2 = sc.nextInt();
                                    
                                    do{
                                        switch(opcionCuentas2){

                                            case 1:{            //CUENTA AHORRO
                                                boolean control = false;
                                                System.out.println("Escriba el DNI del cliente");
                                                for(int i = 0; i < totalClientes; i++){
                                                    System.out.println("["+(i+1)+"]: " + clientes[i].getNumDocumento() + " | " + clientes[i].getNombre());
                                                }
                                                auxInt = sc.nextInt();
                                                for(int i = 0; i < totalClientes; i++){
                                                    if(auxInt == clientes[i].getNumDocumento()){
                                                        CuentaAhorro cAhorroAux = new CuentaAhorro();
                                                        totalCuentas++;
                                                        cAhorroAux.setCliente(clientes[i]);
                                                        cAhorroAux.setNumeroCuenta(totalCuentas);


                                                        System.out.println("Ingrese el saldo minimo");
                                                        auxDouble = sc.nextDouble();
                                                        cAhorroAux.setSaldoMinimo(auxDouble);

                                                        System.out.println("Ingrese el interes");
                                                        auxFloat = sc.nextFloat();
                                                        cAhorroAux.setInteres(auxFloat);

                                                        cuentas[totalCuentas] = cAhorroAux;

                                                        System.out.println("Se creo una Cuenta Ahorro para |" + clientes[i].getNombre() + "| exitosamente");
                                                        break;
                                                    }
                                                }

                                                if(control == false)
                                                    System.out.println("No se encontro al Cliente");

                                            break;
                                            }

                                            case 2:{        //CUENTA CORRIENTE
                                                boolean control = false;
                                                System.out.println("Escriba el DNI del cliente");
                                                for(int i = 0; i < totalClientes; i++){
                                                    System.out.println("["+(i+1)+"]: " + clientes[i].getNumDocumento() + " | " + clientes[i].getNombre());
                                                }
                                                auxInt = sc.nextInt();
                                                for(int i = 0; i < totalClientes; i++){
                                                    if(auxInt == clientes[i].getNumDocumento()){
                                                        CuentaCorriente cCorriente = new CuentaCorriente();
                                                        totalCuentas++;
                                                        cCorriente.setCliente(clientes[i]);
                                                        cCorriente.setNumeroCuenta(totalCuentas);

                                                        cuentas[totalCuentas] = cCorriente;

                                                        System.out.println("Se creo una Cuenta Corriente para |" + clientes[i].getNombre() + "| exitosamente");
                                                        control = true;
                                                        break;
                                                    }
                                                }
                                                if(control == false){
                                                    System.out.println("No se encontro al Cliente");
                                                }
                                            break;
                                            }

                                            case 3:{            //VOLVER
                                                break;
                                            }

                                            default:{
                                                System.out.println("Error, ingrese nuevamente");
                                            }
                                        }
                                    
                                    }while(opcionCuentas != 3);
                                }
                                
                                case 2:{
                                    int i = 0;
                                    for(Cuenta c : cuentas){
                                       if(c != null){
                                           System.out.println("["+c.getNumeroCuenta()+"]: " + c.getCliente().getNombre() + " | " + c.tipoCuenta());
                                           i++;
                                       }
                                   }
                                   break;
                                }
                                
                                case 3:{
                                    System.out.println("Ingrese el numero de cuenta");
                                    auxInt = sc.nextInt();
                                    
                                    for(int i = 0; i < totalCuentas; i++){
                                        if(auxInt == cuentas[i].getNumeroCuenta()){
                                            do{
                                                System.out.println("1: Ingresar Dinero | 2: Retirar Dinero | 3: Actualizar Saldo | 4: Volver");
                                                opcionCuentas2 = sc.nextInt();
                                                
                                                switch(opcionCuentas2){
                                                    case 1:{
                                                        System.out.println("Ingrese la cantidad de dinero a ingresar");
                                                        auxDouble = sc.nextDouble();
                                                        cuentas[i].setSaldo(auxDouble);
                                                        System.out.println("Operacion realizada con exito");
                                                        break;
                                                    }
                                                    
                                                    case 2:{
                                                        System.out.println("Ingrese la cantidad de dinero a retirar");
                                                        System.out.print("$"); auxDouble = sc.nextDouble();
                                                        if(cuentas[i].retirar(auxDouble) == false){
                                                            System.out.println("Saldo insuficiente, menos del saldo minimo");
                                                            break;
                                                        }else{
                                                            System.out.println("Saldo retirado con exito");
                                                            break;
                                                        }
                                                    }
                                                    
                                                    case 3:{
                                                        System.out.println("Saldo anterior: $" + cuentas[i].getSaldo());
                                                        cuentas[i].actualizarSaldo();
                                                        System.out.println("Su saldo ahora es de: $" + cuentas[i].getSaldo());
                                                        break;
                                                    }
                                                    
                                                    case 4:{
                                                        break;
                                                    }
                                                }
                                                
                                            }while(opcionCuentas2 != 4);
                                        }   
                                    }
                                }
                            }
                        }while(opcionCuentas != 4);
                        
                    }
                
                    break;
                }
                
                case 3:{
                    System.out.println("Saliendo...");
                    break;
                }
                
                default:{
                    System.out.println("Error, ingrese nuevamente");
                    break;
                }
            }
        }while(opcionMenu != 3);
    }
}
   
