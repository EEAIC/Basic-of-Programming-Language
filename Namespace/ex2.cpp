//식별자 검색

#include <iostream>

using namespace std;

int n;
void set() {
	n = 10;
}

namespace Gcon {
	void set();
	namespace google {
		void set();
		int n;
	}
	int n;
}

int main() {
	::set();
	Gcon::set();
	Gcon::google::set();

	cout << ::n << endl;
	cout << Gcon::n << endl;
	cout << Gcon::google::n << endl;
}

void Gcon::set() {
	n = 20;
}

void Gcon::google::set() {
	n = 30;
}