#include <iostream>
using namespace std;

int month_day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
char* str_day[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
int total_day = 0;

void getDayName(int month, int day) {
  for (int i = 1; i < month; i++) {
    total_day += month_day[i - 1];
  }
  total_day += day;
  cout << str_day[total_day % 7] << "\n";
}

int main() {
  int x, y;
  cin >> x >> y;
  getDayName(x, y);
  return 0;
}
