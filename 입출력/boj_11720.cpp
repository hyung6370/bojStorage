#include <iostream>
#include <string>
using namespace std;

void addFunc() {
  int t;
  cin >> t;

  char arr[t];

  cin >> arr;
  int sum = 0;
  
  for (int i = 0; i < t; i++) {
    sum += arr[i] - '0';
    // string으로 입력을 받아서 각 하나하나마다 문자를 -'0'을 통해
    // char형을 int형으로 변환 

  }

  cout << sum << endl;
}
int main() {
  addFunc();
  return 0;
}
