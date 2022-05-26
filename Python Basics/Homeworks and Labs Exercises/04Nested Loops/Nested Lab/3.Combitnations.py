n = int(input())
solutions = 0
for i in range(0, n + 1):
    for z in range(0, n + 1):
        for x in range(0, n + 1):
            if i + z + x == n:
                solutions += 1
print(solutions)