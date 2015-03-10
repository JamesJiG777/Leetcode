int fibonacci(int n){
	if(n < 0)
	return false;
	if(n <= 1)
	return n;
	else if (n > 1)
	return fibonacci(n - 1) + fibonacci(n - 2);
}
//time complexity O(n), Space complexity O(n)

int fibonacci(int n){
	int a = 0;
	int b = 1;
	int c;
	if (n < 0)
	return false;
	if (n = 0 || n = 1)
	return n;
	else if (n > 1){
	for(i=2; i < n; i++){
	a = b;
	b = c;
	c = a + b;
	}
	return c;
	}
}