print("Ingrese una palabra")
palabra = str(input())

palabraInvertida = palabra.lower()[::-1]

if palabraInvertida == palabra.lower():
    print("Su palabra es un Palíndromo")
else:
    print("Su palabra no es un Palíndromo")