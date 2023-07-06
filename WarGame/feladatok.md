# OOP Gyakorló feladatok

## 0. Feladat

Készíts egy **Employee** osztályt, ami egy alkalmazottat reprezentál. Az osztálynak a következő adattagjai legyenek:

- **String** name
- **long** employeeId
- **int** salary

Az osztálynak a következő metódusai legyenek:

- **int** raise(**int** amount): Emelje meg az alkalmazott fizetését, a paraméterben kapott értékkel és térjen vissza az
  új fizetéssel.
- **int** cut(**int** amount): Csökkentse az alkalmazott fizetését, a paraméterben kapott értékkel és térjen vissza az
  új fizetéssel.
- Paraméteres konstruktor és toString()

Készíts egy Company osztályt, ami egy céget reprezentál. Az osztálynak a következő adattagjai legyenek:

- **String** name
- **Employee[]** employees

Az osztálynak a következő metódusai legyenek:

- **void** printEmployees(), ami a konzolra írja, minden alkalmazott azonosítóját és fizetését.
- **void** addRaise(long[] employeeIds, int amount), ami a paraméterben kapott alkalmazottaknak megemeli a fizetését.
- **Employee** getMaxBySalary(), ami visszatér a legtöbbet kereső alkalmazottal.
- **Employee** getEmployeeById(long employeeId), ami visszatér a paraméterben kapott azonosítójú alkalmazottal, vagy
  **null**-al, ha nincs ilyen alkalmazott.
- Paraméteres konstruktor

## 1. Feladat

Készíts egy **Book** osztályt, ami egy könyvet reprezentál. Az osztálynak legyen egy **String** title egy **String**
author és egy **int** yearOfPublication adattagja. Készíts paraméteres konstruktort az osztályhoz és implementáld a
toString() metódust is.

## 2. Feladat

Készíts egy **Circle** osztályt, ami egy kört reprezentál. Az osztálynak egyen egy **double** radius adattagja és
egy-egy metódus a terület és a kerület kiszámítására. Készíts paraméteres konstruktort az osztályhoz és implementáld a
toString() metódust is.

## 3. Feladat

Készíts egy **BankAccount** osztályt, ami egy bankszámlát reprezentál. Az osztálynak legyen egy **long** accountNumber
egy **String** accountHolderName és egy **int** balance adattagja. Implementáld a withdraw(int amount) metódust, ami
csökkenti a balance értékét a paraméterben kapot számmal, továbbá készíts egy deposit(int amount) metódust, ami növeli a
balance értékét a paraméterben kapott számmal. Készíts paraméteres konstruktort az osztályhoz és implementáld a
toString() metódust is.

## 4. Feladat

Készíts egy **Library** osztályt, ami egy könyvtárat reprezentál. Az osztálynak legyen egy **String** name és egy
**Book[]** books adattagja. Az osztálynak legyen egy searchByAuthor(String author) ami azokkal a könyvekkel tér vissza,
aminek a szerzője megegyezett a paraméterben kapott szerzővel, továbbá legyen egy containsBook(Book book) metódussal,
ami igazzal tér vissza, ha a könyv elérhető a könyvtárban és hamissal ha nem. Készíts paraméteres konstruktort az
osztályhoz és implementáld a
toString() metódust is.

## 5. Feladat

Készíts egy **Bank** osztályt, ami egy bankot reprezentál. Az osztálynak legyen egy **String** name és egy
**BankAccount[]** accounts adattagja. Készíts egy maxBalance() metódust, ami azzal a BankAccount-al tér vissza, amin a
legtöbb pénz van, továbbá készíts egy getBalanceByAccountHolderName(String name) metódust, ami a számlatulajdonos
egyenlegével tér vissza, ha szerepel a tömbben és -1-el ha nem. Készíts paraméteres konstruktort az osztályhoz és
implementáld a toString() metódust is.