diccionario = {}

while True:
    print("Ingrese los datos, si quiere terminar ingrese '*'\n")
    control = str(input())
    if control == '*':
        print("Imprimiendo el diccionario")
        print(diccionario)
        break
    else:
        dni = int(input("Ingrese el DNI de la persona \n"))
        nombre = str(input("Ingrese el nombre de la persona \n"))
        domicilio = str(input("Ingrese el domicilio de la persona \n"))
        edad = int(input("Ingrese la edad de la persona \n"))
        diccionario[dni] = nombre, domicilio, edad

