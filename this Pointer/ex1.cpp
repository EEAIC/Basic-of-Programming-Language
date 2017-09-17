// this
#include <iostream>

using namespace std;

class MyClass {
public:
	void PrintThis() {	//보이지는 않지만 매개 변수로 this라는 포인터를 받음 
		cout << "나의 주소는 " << this << endl; 
	}
};

int main() {
	MyClass a, b;

	cout << "a의 주소는 " << &a << endl;
	cout << "b의 주소는 " << &b << endl;

	a.PrintThis();
	b.PrintThis();
}