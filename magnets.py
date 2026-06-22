size = int(input())
magnets = []

while size > 0:
    magnets.append(input().strip())
    size -= 1

if not magnets:
    groups = 0
else:
    groups = 1

for i in range(len(magnets) - 1):
    if magnets[i] != magnets[i + 1]:
        groups += 1
 
print(groups)
