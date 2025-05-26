print("¿Cuantas palabras quiere ingresar?")
cantPalabras = int(input())
listaPalabras = []

if cantPalabras == 0:
    print("Error: La lista debe tener como mínimo un elemento")
else:
    for i in range(cantPalabras):
        print("Ingrese la palabra", (i + 1))
        auxString = str(input())
        listaPalabras.append(auxString)
    print("Lista de palabras:", listaPalabras)