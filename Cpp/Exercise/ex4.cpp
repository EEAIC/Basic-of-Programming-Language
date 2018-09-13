#include <iostream>
using namespace std;

int n = 0;
namespace A {
	int n = 0;
	namespace B {
		void set() {
			n = 10;
		}
		int n = 0;
	}
}

namespace C {
	void set(); // 선언!! 
	int n = 0;
}
void C::set() {
	n = 20; // 정의!!
}

int main() {
	using namespace A::B;

	set();
	C::set();

	cout << ::n << endl; // 0
	cout << A::n << endl; // 10
	cout << A::B::n << endl; // 0
	cout << C::n << endl; // 20

}