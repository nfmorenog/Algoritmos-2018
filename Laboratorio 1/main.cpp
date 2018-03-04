#include <iostream>
using namespace std;

int fibbonacci (int n){
	int i = 1;
    int j = 0;
    for (int k = 0; k < n; k++) {
        j = i + j;
        i = j - i;
    }

	return j;	
	
}
unsigned long long int fibbonacciL (unsigned long long int n){
	unsigned long long int i = 1;
    unsigned long long int j = 0;
    for (int k = 0; k < n; k++) {
        j = i + j;
        i = j - i;
    }

	return j;	
	
}

int main(int argc, char** argv) {
	for(int i = 46; i < 48; i++)
		std::cout << i << " Int "<<fibbonacci(i)<<"\n";
	for(int i = 93; i < 95; i++)
		std::cout << "Termino "<<i << " de Fibonacci usando long long int es = "<<fibbonacciL(i)<<"\n";
		

}


        

