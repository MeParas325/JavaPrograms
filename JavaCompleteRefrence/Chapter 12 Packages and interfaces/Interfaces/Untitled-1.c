#include <stdio.h>

int main(){
    char n[5];
    stderr = stdin;
    fscanf(stderr, "%s", n);
    printf(n);
}