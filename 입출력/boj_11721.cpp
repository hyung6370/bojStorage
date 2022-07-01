#include <iostream>
#include <string>
using namespace std;

void addFunc() {
  string a;
  getline(cin, a);
  int tmp = a.length() / 10;
  int tmp2 = a.length() % 10;
  
  if (a.length() > 10) {
    int j = 0;
    for (int i = 0; i < tmp; i++) {
      cout << a.substr(j, 10) << endl;
      j += 10;
    }
    cout << a.substr(tmp * 10, tmp * 10 + tmp2) << endl;
  }
  else {
    cout << a.substr(0, tmp2) << endl;
  }
}
int main() {
  addFunc();
  return 0;
}
