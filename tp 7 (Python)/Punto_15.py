import random

numeroSecreto = random.randint(0,5)
print(numeroSecreto)
while True:
    auxInt = int(input("Ingrese un numero \n"))
    if auxInt == numeroSecreto:
        print("Su numero es igual al numero secreto")
        break
    else:
        if auxInt > numeroSecreto:
            print("Su numero es mayor al numero secreto")
        else:
            print("Su numero es menor al numero secreto")