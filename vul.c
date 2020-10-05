#include<stdio.h>

void main()
{
	setuid(geteuid());
	system("/bin/ls -l");
}
