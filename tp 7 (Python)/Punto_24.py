def funcion(lista):
    contador = 0
    aux = 0

    listaAux = list(lista)
    for i in range(len(lista)):
        if contador <= len(lista[i]):
            contador = len(lista[i])
            aux = i
    return aux

listaPalabras = ["Hola", "Como estas!", "TODO BIEN Y VOS"]

i = funcion(listaPalabras)
print("La palabra mas larga esta en la posicion ", i)
print(listaPalabras[i])
