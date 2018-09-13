// 1. �Ű������� ���ȭ (��� �Լ�)
// 2. �޼ҵ��� ���ȭ (��� �޼ҵ�)

#include <iostream>

using namespace std;

class Account {
public:
	Account() : money(0) { }
	Account(int money) : money(money) {	}

	void Deposit(const int d) {
		money += d;
		cout << d << "���� �����ߴ�!!" << endl;
	}

	void Draw(int d) {
		if (money >= d) {
			money -= d;
			cout << d << "���� �����ߴ�!!" << endl;
		}
	}

	int ViewMoney() const { //����� �޼ҵ�
		return money;
	}
private:
	int money;
};

int main() {
	Account Gcon(200);
	Gcon.Deposit(100);
	Gcon.Draw(20);

	cout << "���� �ݾ��� " <<  Gcon.ViewMoney() << "�� �Դϴ�!!" << endl;

}