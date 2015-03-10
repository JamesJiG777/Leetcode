int toLower(int c){
	if(toUpper(c) != c)
	return c;
	else 
	return c - 'A' + 'a';
}