// ���۷��� ����
#include <iostream>
#include <string>

using namespace std;


int main() {
	// r-value = ������ �� ���� ��
	// l-value = ������ �� �ִ� ��
	int a(5);
	int &r1 = a; // ���� �޷θ� �� ����Ǿ� �ִ� ������ ����
	int &&r2 = 3;  // l-value ����
	int &&r3 = a * a; // l-value ���� 

	cout << r1 << endl;
	cout << r2 << endl;
	cout << r3 << endl;
}