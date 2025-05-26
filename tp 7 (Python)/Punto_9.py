lista1 = [1,2,3,4,5]
lista2 = [5,6,7,8,9]

def interseccion(lista1, lista2):
    for elemento1 in lista1:
        for elemento2 in lista2:
            if elemento1 == elemento2:
                return True
    return False


print(interseccion(lista1, lista2))