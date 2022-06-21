#include <iostream>
#include <string>
using namespace std;

void addFunc() {
  string str;

  for (int i = 0; i < 100; i++) {
    getline(cin, str);
    cout << str << endl;
  }
}
int main() {
  addFunc();
}
