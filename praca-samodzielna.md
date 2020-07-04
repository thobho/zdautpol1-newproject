1. Stwórz od "nowy" projekt w maven korzystający z mavena, który będzie zawierał zależności do biblioteki JUnit.

2. Napisz klasę, która będzie posiadać metody, które przyjmują w argumencie listę liczb całkowitych i będzie zwracać
statystyki z tych liczb:
* największą wartość
* najmniejszą wartość
* średnią
* medianę

Napisz testy jednostkowe dla tych metod. Wykorzystaj testy parameteryczne.

3. (dla chętnych) Zaimplementuj i przetestuj funkcjonalność systemu zarządzającego sklepem internetowym.
* W pakiecie services znajduje się klasa Product. Skończ implementować tą klasę. Zadecyduj czy chcesz aby cena produktu
   		wyrażona była w typie BigDouble, czy może Money.  https://www.baeldung.com/java-money-and-currency
* ProduktStore reprezentuje bazę danych produktów. Zawiera ona mapę produktów, gdzie ich kluczem jest unikalna liczba całkowita
   	    Skończ implementację klasy ProductStore dopisz metody, które pozwalają na dodawanie, usuwanie, modyfikowanie produktu.
* ProductService zawiera użyteczne metody, które pozwalają na modyfikację zawartości product
   
* !!! Napisz testy jednostkowe dla klasy ProductService