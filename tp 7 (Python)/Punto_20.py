auxInt = int(input("Ingrese un entero \n"))
diccionario = {}

for i in range(auxInt + 1):
    if 0 < i and i < (auxInt + 1):
        diccionario[i] = (i*i)
print(diccionario)
