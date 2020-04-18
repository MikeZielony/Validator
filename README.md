# validator

ALGORYTM NUMERU DOWODU
Numer dowodu osobistego składa się z dziewięciu elementów trzech liter i sześciu cyfr, z
których pierwsza cyfra jest tak zwaną cyfrą kontrolną. Każda litera natomiast ma przypisaną
liczbę:
A – 10
B – 11
C – 12
[…]
X – 33
Y – 34
Z – 35
W oznaczeniu literowej serii dowodu nie uczestniczą litery polskie (Ą, Ć, Ł itp).
Każdy z dziewięciu elementów numeru dowodu (3 litery i 6 cyfr) ma także przypisaną tzw.
wagę. Owe wagi zastępujące:
Litera 1 – waga 7
Litera 2 – waga 3
Litera 3 – waga 1
Cyfra 1 – waga 9
Cyfra 2 – waga 7
Cyfra 3 – waga 3
Cyfra 4 – waga 1
Cyfra 5 – waga 7
Cyfra 6 – waga 3
Uwaga! Wagami mogą też być zestawy (1 9 3 7 1 9 3 1 9), (3 7 9 1 3 7 9 3 7), (9 1 7 3 9 1 7 9
1).
By sprawdzić prawdziwość dowodu należy wymnożyć kolejne elementy przez odpowiadające
im wagi (za litery podstawiając wskazane przez nas powyżej wartości).
Otrzymane w ten sposób iloczyny należy zsumować (czyli dodać do siebie kolejne wyniki
mnożenia), a otrzymaną liczbę podzielić przez 10.
Jeśli wynik dzielenia będzie liczbą całą (bez ułamków dziesiętnych lub reszty), dowód jest
prawdziwy.
Napisz program w Javie, który wczytuje z pliku .txt numer dowodu osobistego, następnie
zaimplementuj metodę isCorrect, która sprawdza, czy ten numer dowodu jest poprawny.
Każdy numer polskiego dowodu osobistego ma przypisany numer wg powyższego
algorytmu, i wg niego należy sprawdzić poprawność wczytanego numeru. Zaimplementuj
testy jednostkowe. Skorzystaj z klas, stwórz osobną do wczytywania plików, a osobną dla
dowodu osobistego.
