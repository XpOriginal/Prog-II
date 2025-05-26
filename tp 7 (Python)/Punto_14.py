

palabra = str(input("Ingrese una oracion \n"))

palabrasInvertidas = [palabra[::-1] for palabra in palabra.split()]

stringInvertido = " ".join(palabrasInvertidas)

print("Texto invertido: ", stringInvertido)