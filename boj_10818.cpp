#include <iostream>
using namespace std;
 
int main() {
  int num, input;
  int min = 1000000;
  int max = -1000000;
  
  cin >> num;
  int arr[num];
  
  for (int i = 1; i <= num; i++) {
    cin >> input;
    arr[i] = input;
    
    if (min > arr[i]) {
      min = arr[i];
    }
    if (max < arr[i]) {
      max = arr[i];
    }
  }
  cout << min << " " << max;
}
