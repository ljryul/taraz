#include <stdio.h>

static const char *t[] = {"%d\n", "Fizz\n", "Buzz\n", "FizzBuzz\n"};

int main(){
	unsigned int i;
	for(i = 1; i<=100; i++)
		printf(t[3&19142723>>2*i%30],i);
	return 0;
}
