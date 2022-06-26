func:
    xor eax, eax
    mov eax, 10
    add eax, 5
    ret;

_start:
    call _func
    mov eax, 10
    ret;

