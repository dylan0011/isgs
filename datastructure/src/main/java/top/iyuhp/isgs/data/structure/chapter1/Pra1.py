def getAll(number):
    if number == 1:
        return 1
    elif number % 2 == 0:
        return getAll(number / 2)
    else:
        return getAll(number/2) + 1


if __name__ == '__main__':
    print(getAll(123))
