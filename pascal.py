def pascal(r, c):
    """ Calculate a given row/column value in a Pascal Triangle """
    if r > c:
        return None
    if r == 0:
        return 1
    if r == c:
        return 1
    else:
        return pascal(max(r-1,0), max(c-1,0)) + pascal(max(r,0), max(c-1,0))

if __name__ == '__main__':
    print pascal(2,2)

