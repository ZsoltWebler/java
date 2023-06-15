# Kollekciók

## Leírás:

A feladatotok a Collections package-ben található ITreeNode, IMatrix2D, IBinarySearchTreeNode és BinarySearchTree
osztályok implementálása lesz. Az interfacekben és absztrakt osztályokban előírt metódusok implementálása után, minden
metódus fölé kommenteljétek oda, hogy milyen futásidejű az algoritmusotok. Legjobb, legrosszabb és átlagos eset esetén
és néhány mondatban írjátok le, hogy miért.

Az összes osztály összes műveletét a Main metódusban prezentáljátok megfelelő logolással.

Implementáció segítség:

- [Fa](https://hu.wikipedia.org/wiki/Fa_(adatszerkezet))
- [Mátrix](https://hu.wikipedia.org/wiki/M%C3%A1trix_(matematika))
- [Bináris keresőfa](http://tamop412.elte.hu/tananyagok/algoritmusok/lecke12_lap1.html)

# Cinema

## Leírás

A feladatotok a Cinama osztály implementálása lesz, az ICinema interface-ben előírt metódusok megvalósításával.
A Cinema osztály egy mozit szimbolizál, ahol az ülőhelyek egy Map<ISeat> adatszerkezetben legyenek tárolva.
Minden <ISeat> objektum egy ülőhelyet szimbolizál, ami egy sorszámból, egy oszlopszámból és a foglalási státuszból áll.
A sorok A-Z ig vannak elnevezve, az oszlopok pedig integer értéket vehetnek fel. A getSeatNumber() metódus egy Stringel
térjen vissza, ami a sor betűjelét és a sor számot tartalmazza. A sorszám 3 helyiértéket foglaljon el minden esetben.
Például az B oszlop 7-es székének a seatNumber-re B007 legyen.

A cinema osztály konstuktor paraméterben kapja meg a sorok és oszlopok számát, ellenőrizzétek, hogy a sorok száma
maximum 26 lehessen az oszlopok száma pedig 99, ellenkező esetben térjetek vissza egy saját Exceptionnel.

A printSeat() metódus rajzolja ki a mozi térképét és rakjon '0'-t ahol szabad hely van és 'X' et, ahol foglalt. Lehessen
ülőhelyet foglalni a moziban, ha a foglalás olyan oszlopot és sort ad meg, ami foglalt, dobjatok egy saját Exception-t,
ha pedig kívül ad meg az ülőhelyek intervallumán, akkor egy IndexOutOfBoundsException exceptiont dobjatok.