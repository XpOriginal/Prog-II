lista1 = [29,48,88,7]
lista2 = [8,1,229, 65]

for num in lista2:
    while num in lista1:
        lista1.remove(num)

print("Lista: ", lista1)