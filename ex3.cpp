#include <iostream>
#include <string>

using namespace std;

int main() {
	string name; //일반 변수처럼 사용 가능
	cout << "이름 입력: ";
	cin >> name ;

	string messange = "안녕하세요, " + name + " 님.";
	cout << messange << endl;
}