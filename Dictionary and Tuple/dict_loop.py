ages = {'Tod': 35, 'Jane': 23, 'Paul': 62}

for key in ages.keys(): # .keys()는 생략 가능합니다.
                        # .values()로 값을 받아올 수 있습니다.
    print('{}의 나이는 {}입니다.'.format(key, ages[key]))

for key, value in ages.items():
    print('{}의 나이는 {}입니다.'.format(key, value))
