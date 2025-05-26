string = "Hola como estas?"
print("Segundo caracter de un string: ", string[1])

print("caracteres entre las posiciones 2 y 5: ", string[::-1])

print("Longitud del string: ", string.__sizeof__())

print("String en mayusculas: ", string.upper())

print("String en minusculas: ", string.lower())

print("Ingrese que letra quiere reemplazar")
print(string)
auxInt = str(input())
print("Ahora ingrese que letra quiere ingresar")
auxString = str(input())

stringModificado = string.replace(auxInt, auxString)
print("Nuevo string: ", stringModificado)

print("Ingrese un nuevo string")
auxString = str(input())

if auxString in string:
    print("Su string es un 'substring'")
else:
    print("Su string no es un 'substring'")