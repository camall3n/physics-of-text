with open("rel1names.txt") as f:
    r1names = f.read()

with open("rel3names.txt") as f:
    r2names = f.read()

r1names = r1names.split("\n")
r2names = r2names.split("\n")

print set(r1names) & set(r2names)
