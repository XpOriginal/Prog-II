tuplaEnteros = (10,50,2,5,77,1,9)
indice = 0
numMayor = 0
numMenor = tuplaEnteros[0]
n1 = 0
n2 = 0

for i in tuplaEnteros:
    if numMayor < i:
        numMayor = i
        n1 = indice
        
    if numMenor > i:
        numMenor = i
        n2 = indice
        
    indice = indice + 1

print("El indice del mayor numero es: ", n1)
print("El indice del menor numero es: ", n2)
