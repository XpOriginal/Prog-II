numerosImpares = []

while True{
    print("Ingrese un numero impar (O uno par si quiere terminar el programa)")
    numero = int(input())
    if(numero % 2 == 0){
        print("Se ingreso un numero par, terminando el programa")
        break
    }else{
        numerosImpares.append(numero)
    }

    print("Numeros impares ingresados: ", numerosImpares)
}