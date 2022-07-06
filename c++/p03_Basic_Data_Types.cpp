#include <iostream>
#include <iomanip>
#include <cstdio>
using namespace std;

int main() {
    // Complete the code.
    int A; long B; char C; float D; double E;
    
    cin >> A >> B >> C >> D >> E;
    
    cout << A << "\n" << B << "\n" << C << "\n";
    cout << fixed << setprecision(3) << D << "\n";
    cout << fixed << setprecision(9) << E << "\n";
    
    return 0;
}
