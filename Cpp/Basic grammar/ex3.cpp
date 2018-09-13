// 레퍼런스 변수
#include <iostream>
#include <string>

using namespace std;


int main() {
	// r-value = 수정할 수 없는 값
	// l-value = 수정할 수 있는 값
	int a(5);
	int &r1 = a; // 실제 메로리 상에 저장되어 있는 변수만 가능
	int &&r2 = 3;  // l-value 참조
	int &&r3 = a * a; // l-value 참조 

	cout << r1 << endl;
	cout << r2 << endl;
	cout << r3 << endl;
}