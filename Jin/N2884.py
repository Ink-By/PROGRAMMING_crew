H, M = map(int, input().split())

if M >= 45:
    M = M - 45
    print(H, M)
elif H - 1 < 0:
    M = 60 + M - 45
    H = 24 + (H - 1)
    print(H, M)
else:
    M = 60 + M - 45
    H = H - 1
    print(H, M)

