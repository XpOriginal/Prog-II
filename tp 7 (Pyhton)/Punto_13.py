def invertirString(string):
    stringInvertido = string[::-1]
    return stringInvertido

auxString = str(input("Ingrese una palabra \n"))

print("La palabra invertida es: ", invertirString(auxString))