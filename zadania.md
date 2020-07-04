# Testy jednostkowe

1. Zaimplementuj metody kalkulatora, który potrafi dodawać/odejmować/mnożyć,dzielić liczby całkowite. Uzupełnij go o metody odejmowania i mnożenia. Napisz testy jednostkowe dla
tych metod.
    W trakcie pisania testów wykonaj eksperymenty z adnotacjami JUnit 5 (https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations) tj.
    * @RepeatedTest
    * @DisplayName
    * @BeaforeEach/@AfterEach
    * @Disabled

2. Napisz metodę klasę, która zawiera metodę sprawdzającą, czy zadany string jest palindromem. Napisz testy dla tej metody.

3. Napisz metodę, która sprawdza czy zadany String jest poprawnie zdefiniowanym hasłem.
Hasło powinno:
* być dłuższe niż 8 znaków
* powiadać przynajmniej jedną wielką i jedną małą literę
* powiadać znak specjalny 
Napisz testy jednostkowe sprawdzające tą metodę.



# Testy parametryzowane

1. Napisz testy parametryzowane dla kalkulatora, palindromu, walidatora hasła oraz (dla chętnych) dla ProductService. Postaraj się wykorzystać wszystkie poznane możliwości
dostarczania danych do testów parametryzowanych.
    * @ValueSource
    * @MethodSource
    * @CsvSource
    * @ArgumentSource


# Testowanie wyjątków

1. Dodaj do klasy "Calculator" metodę która dzieli dwie liczby całkowite. W jakim przypadku wykoaninie metody zakończy się wyjątkiem?
   Napisz testy jednostkowe dla metody dzielenia.

2. Zastanów się, co jakie są przypadki graniczne dla klasy kalkulator. Zastanów się jak metody z klasy Math takie jak toIntExact, addExact, subtractExact
   mogą być przydatne w pisaniu klakulatora.

3. Niech metoda sprawdzająca czy podany string rzuca wyjątek, jeżeli przekazana wartość do metody jest nullem. Napisz testy dla tej wersji metody.

4.  (dla chętnych) Napisz metodę addProduct i removeProduct, tak by zamiast wartości boolean wyrzucany był wyjątek jeżeli operacja nie powiedzie się sukcesem.
   Napisz testy jednostkowe, testujące zachowanie rzucanych wyjątków.
   
   