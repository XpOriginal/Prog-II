l = []

for i in range(4):
    auxInt = int(input("Ingrese un numero \n"))
    l.append(auxInt)

s = []

for i in l:
    auxInt = int(input("Ingrese un numero (Lista s) \n"))
    s.append(i + auxInt)

r = []

for i in l:
    auxInt = int(input("Ingrese un numero (Lista s) \n"))
    r.append(i - auxInt)

print("Lista L: ", tuple(l))
print("Lista S: ", tuple(s))
print("Lista R: ", tuple(r))
