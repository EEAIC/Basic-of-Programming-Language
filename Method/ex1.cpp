// 1. 매개변수의 상수화 (모든 함수)
// 2. 메소드의 상수화 (멤버 메소드)

#include <iostream>

using namespace std;

class Account {
public:
	Account() : money(0) { }
	Account(int money) : money(money) {	}

	void Deposit(const int d) {
		money += d;
		cout << d << "원을 예금했다!!" << endl;
	}

	void Draw(int d) {
		if (money >= d) {
			money -= d;
			cout << d << "원을 인출했다!!" << endl;
		}
	}

	int ViewMoney() const { //상수형 메소드
		return money;
	}
private:
	int money;
};

int main() {
	Account Gcon(200);
	Gcon.Deposit(100);
	Gcon.Draw(20);

	cout << "현재 금액은 " <<  Gcon.ViewMoney() << "원 입니다!!" << endl;

}