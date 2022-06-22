def binarySearchTree(arr, l, r, x):
    if r >= l:
        mid = (l + r) // 2
        if arr[mid] == x:
            return mid
        elif arr[mid] > x:
            return binarySearchTree(arr, l, mid - 1, x)
        else:
            return binarySearchTree(arr, mid + 1, r, x)
    else:
        return -1