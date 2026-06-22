drinks = int(input().strip()) # separate line for getting drink
print(f"{(sum(list(map(int, input().split()))) / drinks):.12f}")
