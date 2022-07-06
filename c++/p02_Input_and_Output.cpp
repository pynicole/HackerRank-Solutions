#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int number;
    int sum = 0;
    
    while(cin >> number){
        sum = sum+number;
    }
    
    cout << sum << endl;
       
    return 0;
}
