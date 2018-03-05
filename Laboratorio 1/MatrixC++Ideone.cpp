#include <iostream>
#include <ctime> 
using namespace std;





int main() {
    // TODO code application logic here
    
    unsigned t0, t1;
    int t=0;
    while (t<=5) {
		t+=1;
		int T;
		cin >> T ;
        
        int M[T][T];
        int N[T][T];
        int R[T][T];

        for (int i = 0; i < T; i++) {
            for (int j = 0; j < T; j++) {
                M[i][j] = 1;
                N[i][j] = 2;
                R[i][j] = 0;
            }
        }
        
        t0=clock();
        for (int n = 0; n < T; n++) {
    		for (int m = 0; m < T; m++) {
        		for (int k = 0; k < T; k++) {
            		R[n][m] += M[n][k] * N[k][m];
            		
        		}
				//cout << R[n][m]<<" ";        		

    		}//cout<< endl;

		}		
         t1 = clock(); 	

		double time = (double(t1-t0)/CLOCKS_PER_SEC);
		cout << "tamaño matriz = "<< T << " Execution Time: " << time << endl;
        
        
    }

}
