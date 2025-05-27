tuplaMaster = (("Agustin", "M"), ("Belen", "F"), ("Ezequiel", "M"), ("Marcos", "M"))

def votar(nombres):
    for t in nombres:
        if t[1] == "M":
            print("Estimado", t[0], "vote por mi")
        else:
            print("Estimada", t[0], "vote por mi")


votar(tuplaMaster)
