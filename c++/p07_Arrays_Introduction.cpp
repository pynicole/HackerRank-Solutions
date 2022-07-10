#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int num;
    cin >> num;
    int arr[num];
    int m = num-1;
    
    for(int i=m; i>=0; i--) {
        int insert;
        cin >> insert;
        //cout << "Insert: " << insert << endl;
        //cout << "Index: " << i << endl;
        arr[i] = insert;
    }
    for(int j=0; j<num; j++) {
        cout << arr[j] << " ";
    }
    
    return 0;
}
